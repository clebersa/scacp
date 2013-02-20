/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
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
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o statement!");
        }
    }
    
    public void alterarCartaoMarcacao(Cartao cartao){
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("update cartoes set marcacao='?' where  numero_inscricao = ? and fk_id_prova = ?");
            st.setString (1, cartao.getMarcacao());
            st.setInt (2, cartao.getNumeroInscricao());
            st.setInt(3, cartao.getIdProva());
            st.execute();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar a marcação.");
        }
    }
    
    public void alterarCartaoNota(Cartao cartao){
        Connection conexao = Conexao.getConexao();
        try {
            // Aqui vc vai alterar conforme a id do cartão e da prova!!!!!!!!!!
            PreparedStatement st = conexao.prepareStatement("update cartoes set nota='?' where  numero_inscricao = ?");
            st.setDouble (1, cartao.getNota());
            st.setInt (2, cartao.getNumeroInscricao());
            st.execute();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar a nota.");
        }
        // Passos para alteração de cartão
    }
    /*public Cartao buscarCartao(int numeroInscricao, int idProva){
        Connection conexao = Conexao.getConexao();
        Prova prova = new Prova();
        Cartao cartao = new Cartao();
        try {
            PreparedStatement st = conexao.prepareStatement("select from cartoes where numero_inscricao = ? and id_prova = ?");
            st.setInt(1, numeroInscricao);
            st.setInt(2, idProva);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                cartao.setIdProva(rs.getInt("id_prova"));
                System.out.println("Identificação da prova:" + rs.getInt("id_prova"));
                prova.setIdProva(rs.getInt("nome"));
                System.out.println("Nome da prova:" + rs.getString("nome"));
                prova.setIdProva(rs.getInt("tipo"));
                System.out.println("Tipo de prova:" + rs.getInt ("tipo"));
                prova.setIdProva(rs.getInt("quantidade_questoes"));
                System.out.println("Quantidade de questões:" + rs.getInt ("quantidade_questoes"));
                prova.setIdProva(rs.getInt("pontuacao_minima"));
                System.out.println("Pontuação mínima:" + rs.getDouble("pontuacao_minima"));
                prova.setIdProva(rs.getInt("pontuacao_maxima"));
                System.out.println("Pontuação máxima:" + rs.getDouble("pontuacao_maxima"));
                prova.setIdProva(rs.getInt("precisao_pontuacao"));
                System.out.println("Precisão da pontuação:" + rs.getBoolean("precisao_pontuacao"));
                prova.setIdProva(rs.getInt("incidencia_penalizacao"));
                System.out.println("Incidência da penalização:" + rs.getBoolean("incidencia_penalizacao"));
                prova.setIdProva(rs.getInt("proporcao_penalizacao"));
                System.out.println("Proporção da penalização:" + rs.getInt("proporcao_penalizacao"));
                prova.setIdProva(rs.getInt("gabarito"));
                System.out.println("Gabarito:" + rs.getString("gabarito"));
                
                
            }
            
            st.execute();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar realizar busca");
        }
        // Passos para localização de cartão
    }
    
    public List<Cartao> buscarCartoes(){
        // Busca por todos os cartões de uma determinada prova
        
    }*/
    
    public void excluirCartao(int numeroInscricao) {
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
}
