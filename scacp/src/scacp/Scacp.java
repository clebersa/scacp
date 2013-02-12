/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.sql.Connection;
import java.sql.SQLException;
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
            System.out.println(conexao.getCatalog());
        } catch (SQLException ex) {
            Logger.getLogger(Scacp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
