/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Larissa
 */
public class CartaoDAO {

    public void inserirCartao(Cartao cartao, int IdProva) {
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("insert into cartoes (numero_inscricao, fk_id_prova, marcacao, nota) values (?,?,?,?)");
            st.setInt(1, cartao.getNumeroInscricao());
            st.setInt(2, IdProva);
            st.setString(3, cartao.getMarcacao());
            st.setDouble(4, cartao.getNota());
            st.execute();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o statement!");
        }
    }

    public void alterarCartaoMarcacao(Cartao cartao, int IdProva) {
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("update cartoes set marcacao=? where  numero_inscricao = ? and fk_id_prova = ?");
            st.setString(1, cartao.getMarcacao());
            st.setInt(2, cartao.getNumeroInscricao());
            st.setInt(3, IdProva);
            st.execute();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar a marcação.");
        }
        alterarCartaoNota(cartao, IdProva);
    }

    public void alterarCartaoNota(Cartao cartao, int IdProva) {
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("update cartoes set nota= ? where  numero_inscricao = ?");
            st.setDouble(1, cartao.getNota());
            st.setInt(2, cartao.getNumeroInscricao());
            st.execute();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar a nota.");
        }
    }

    public Cartao buscarCartao(int numeroInscricao, int idProva) {
        Connection conexao = Conexao.getConexao();
        Cartao cartao = new Cartao();
        
        try {
            PreparedStatement st = conexao.prepareStatement("select * from cartoes where numero_inscricao = ? and fk_id_prova = ?");
            st.setInt(1, numeroInscricao);
            st.setInt(2, idProva);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                cartao.setNumeroInscricao(rs.getInt("numero_inscricao"));
                cartao.setMarcacao(rs.getString("marcacao"));
                cartao.setNota(rs.getDouble("nota"));
            }
            st.execute();
            rs.close();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar realizar busca");
        } finally{
        
        }
        return cartao;
    }

    public HashMap<Integer,Cartao> buscarCartoes(int idProva) {
        HashMap<Integer,Cartao> cartoes = new HashMap<Integer,Cartao>();
        Cartao cartao = new Cartao();
        Connection conexao = Conexao.getConexao();

        try {
            PreparedStatement st = conexao.prepareStatement("select * from cartoes where fk_id_prova = ?");
            st.setInt(1, idProva);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                cartao.setNumeroInscricao(rs.getInt("numero_inscricao"));
                cartao.setMarcacao(rs.getString("marcacao"));
                cartao.setNota(rs.getDouble("nota"));
                cartoes.put(idProva, cartao);
            }
            st.execute();
            rs.close();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar realizar busca");
        }
        return cartoes;
    }

    public void excluirCartao(int numeroInscricao, int IdProva) {
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("delete from cartoes where numero_inscricao = ?");
            st.setInt(1, numeroInscricao);
            st.execute();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar deletar");
        }
    }
    
    public boolean cartaoJaExiste(int numeroInscricao, int idProva){
        boolean jaExiste = false;
        Connection conexao = Conexao.getConexao();

        try {
            PreparedStatement st;
            st = conexao.prepareStatement("select * from cartoes where numero_inscricao = ? and fk_id_prova = ?");
            st.setInt(1, numeroInscricao);
            st.setInt(2, idProva);
            ResultSet rs = st.executeQuery();
            if(rs.getFetchSize() == 0){
                jaExiste = false;
            }else{
                jaExiste = true;
            }
            System.out.println("existe: "+jaExiste);
            rs.close();
            st.close();
            conexao.close();
        }catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar realizar busca!\nErro: " + excecao.getMessage());
        }
        return jaExiste;
    }
}
