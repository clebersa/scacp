/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Larissa
 */
public class ProvaDAO {

    public void inserirProva(Prova prova) {
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("insert into provas (tipo, quantidade_questoes, pontuacao_minima, pontuacao_maxima,"
                    + " precisao_pontuacao, incidencia_penalizacao, proporcao_penalizacao, gabarito,nome) values (?,?,?,?,?,?,?,?,?)");
            st.setInt(1, prova.getIdProva());
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
            st.execute();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o statement!");

        }
    }
    
    public Prova buscarProva(int idProva) {
        Connection conexao = Conexao.getConexao();
        Prova prova = new Prova();

        try {
            PreparedStatement st;
            st = conexao.prepareStatement("Select *from provas where id_prova=?");
            st.setInt(1, idProva);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                // exclua estes system.out.println depois. você não precisa deles
                prova.setIdProva(rs.getInt("id_prova"));
               // System.out.println("Identificação da prova:" + rs.getInt("id_prova"));
                prova.setNome(rs.getString("nome"));
                //System.out.println("Nome da prova:" + rs.getString("nome"));
                prova.setIdProva(rs.getInt("tipo"));
                //System.out.println("Tipo de prova:" + rs.getInt("tipo"));
                prova.setQuantidadeQuestoes(rs.getInt("quantidade_questoes"));
                //System.out.println("Quantidade de questões:" + rs.getInt("quantidade_questoes"));
                prova.setPontuacaoMinima(rs.getDouble("pontuacao_minima"));
                //System.out.println("Pontuação mínima:" + rs.getDouble("pontuacao_minima"));
                prova.setPontuacaoMaxima(rs.getDouble("pontuacao_maxima"));
                //System.out.println("Pontuação máxima:" + rs.getDouble("pontuacao_maxima"));
                prova.setPrecisaoPontuacao(rs.getInt("precisao_pontuacao"));
                //System.out.println("Precisão da pontuação:" + rs.getBoolean("precisao_pontuacao"));
                prova.setIncidenciaPenalizacao(rs.getBoolean("incidencia_penalizacao"));
                //System.out.println("Incidência da penalização:" + rs.getBoolean("incidencia_penalizacao"));
                prova.setProporcaoPenalizacao(rs.getInt("proporcao_penalizacao"));
                //System.out.println("Proporção da penalização:" + rs.getInt("proporcao_penalizacao"));
                prova.setGabarito(rs.getString("gabarito"));
               // System.out.println("Gabarito:" + rs.getString("gabarito"));
                
            }

            CartaoDAO cartaoDao = new CartaoDAO();
            prova.setCartoes(cartaoDao.buscarCartoes(idProva));

            st.execute();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar realizar busca");
        }
        return prova;
    }
    
 
   
     public HashMap<Integer,Prova> buscarProvas(int idProva) {
        HashMap<Integer,Prova> provas = new HashMap<Integer,Prova>();
        Prova prova = new Prova();
        Connection conexao = Conexao.getConexao();

        try {
            PreparedStatement st = conexao.prepareStatement("select * from provas");
            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                prova.setIdProva(rs.getInt("id_prova"));
                prova.setNome(rs.getString("nome"));
                provas.put(idProva, prova);
            }
            st.execute();
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
        //Passos para excluir uma prova
    }
}
