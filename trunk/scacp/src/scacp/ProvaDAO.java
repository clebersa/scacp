/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Larissa
 */
public class ProvaDAO {

    public void inserirProva(Prova prova) {
        int idGerada = 0;
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("insert into provas (id_prova, tipo, quantidade_questoes, pontuacao_minima, pontuacao_maxima,"
                    + " precisao_pontuacao, incidencia_penalizacao, proporcao_penalizacao, gabarito, nome) values (null,?,?,?,?,?,?,?,?,?)");
            if (prova.getTipoProva() == TipoProva.MULTIPLA_ESCOLHA) {
                st.setInt(1, 0);
            } else {
                st.setInt(1, 1);
            }

            st.setInt(2, prova.getQuantidadeQuestoes());
            st.setDouble(3, prova.getPontuacaoMinima());
            st.setDouble(4, prova.getPontuacaoMaxima());
            st.setInt(5, prova.getPrecisaoPontuacao());
            st.setBoolean(6, prova.getIncidenciaPenalizacao());
            st.setInt(7, prova.getProporcaoPenalizacao());
            st.setString(8, prova.getGabarito());
            st.setString(9, prova.getNome());
            if (st.executeUpdate() == 1) {
                st.executeQuery("SELECT LAST_INSERT_ID() INTO @ID");
                ResultSet rs = st.executeQuery("select @ID as id_prova");
                while (rs.next()) {
                    idGerada = rs.getInt("id_prova");
                }
                rs.close();
            }
            
            CartaoDAO cartaoDAO = new CartaoDAO();
            for(Cartao cartao: prova.getCartoes().values()){
                cartaoDAO.inserirCartao(cartao, idGerada);
            }
            
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir a prova no banco de dados!\nErro:" + excecao.getMessage());
        }
        prova.setIdProva(idGerada);
    }

    public Prova buscarProva(int idProva) {
        Connection conexao = Conexao.getConexao();
        Prova prova = new Prova();

        try {
            PreparedStatement st;
            st = conexao.prepareStatement("select * from provas where id_prova = ?");
            st.setInt(1, idProva);
            
            ResultSet rs = st.executeQuery();
            rs.next();
            prova.setIdProva(rs.getInt("id_prova"));
            prova.setNome(rs.getString("nome"));
            if(rs.getInt("tipo") == 0){
                prova.setTipoProva(TipoProva.MULTIPLA_ESCOLHA);
            }else{
                prova.setTipoProva(TipoProva.VERDADEIRO_FALSO);
            }
            prova.setQuantidadeQuestoes(rs.getInt("quantidade_questoes"));
            prova.setPontuacaoMinima(rs.getDouble("pontuacao_minima"));
            prova.setPontuacaoMaxima(rs.getDouble("pontuacao_maxima"));
            prova.setPrecisaoPontuacao(rs.getInt("precisao_pontuacao"));
            prova.setIncidenciaPenalizacao(rs.getBoolean("incidencia_penalizacao"));
            prova.setProporcaoPenalizacao(rs.getInt("proporcao_penalizacao"));
            prova.setGabarito(rs.getString("gabarito"));
            
            CartaoDAO cartaoDao = new CartaoDAO();
            prova.setCartoes(cartaoDao.buscarCartoes(idProva));

            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar realizar busca!\nErro: " + excecao.getMessage());
        }
        return prova;
    }

    public List<Prova> buscarProvas() {
        List<Prova> provas = new ArrayList<>();
        Prova prova;
        Connection conexao = Conexao.getConexao();

        try {
            PreparedStatement st = conexao.prepareStatement("select id_prova, nome from provas order by nome");

            ResultSet rs = st.executeQuery();
            while (rs.next()){
                prova = new Prova();
                prova.setIdProva(rs.getInt("id_prova"));
                prova.setNome(rs.getString("nome"));
                provas.add(prova);
            }
            
            rs.close();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar realizar busca");
        }
        
        return provas;
    }

    public void excluirProva(int idProva) {
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("delete from provas where id_prova = ?");
            st.setInt(1, idProva);
            st.execute();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar deletar");
        }
    }
}
