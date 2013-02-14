/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Larissa
 */
public class CartaoDAO {
    public void inserirCartao(Cartao cartao) {
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("insert into cartoes (numero_inscricao, fk_id_prova, marcacao, nota) values (?,?,?,?)");
            st.setInt(1, cartao.getNumeroInscricao());
            st.setInt(2, cartao.getIdProva());
            st.setString(3, cartao.getMarcacao());
            st.setDouble(4, cartao.getNota());
            st.execute();
            st.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o statement!");
        }
    }
    
    public void alterarCartao(Cartao cartao){
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("update cartoes set marcacao='?' where  numero_inscricao = ?");
            st.setInt (1,);
            st.setInt (2,);
            st.execute();
            st.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar modificar.");
        }
        // Passos para alteração de cartão
    }
    
    public void buscarCartao(int numeroInscricao){
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("select from cartoes where numero_inscricao = ?");
            st.setInt(1, numeroInscricao);
            st.execute();
            st.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar realizar busca");
        }
        // Passos para localização de cartão
    }
    
    public void excluirCartao(int numeroInscricao) {
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("delete from cartoes where numero_inscricao = ?");
            st.setInt(1, numeroInscricao);
            st.execute();
            st.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar deletar");
        }
    }
}
