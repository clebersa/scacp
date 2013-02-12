/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cleber
 */
public class Scacp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conexao = Conexao.getConexao();
        
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery("select * from provas");
            System.out.println("Resultado:");
            while(rs.next()){
                System.out.println("Tabela: " + rs.getString(0));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Scacp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
