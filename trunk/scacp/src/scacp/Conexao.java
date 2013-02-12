/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cleber
 */
public class Conexao {
    private static Connection conexao; // Objeto que será utilizado para a conexão com o banco de dados
    private static final String JDBC_DRIVER = "org.hsqldb.jdbcDriver"; // Driver do banco de dados utilizado, permitindo conectar-se a ele
    private static final String URL = "jdbc:hsqldb:file://home/cleber/Dropbox/NetbeansProjects/scacp/src/scacp/SCACP_DB"; // Endereço do banco de dados ao qual você vai se conectar
    private static final String USUARIO = "SA";// Usuário que vai conectar-se ao banco
    private static final String SENHA = "";// Senha do usuário para se conectar ao banco
    
    public static Connection getConexao(){
        try {
            Class.forName(JDBC_DRIVER);
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            return conexao;
        } catch (SQLException excecao) {
            System.out.println("Problemas de conexão com URL, usuário e/ou senha!");
        } catch (ClassNotFoundException excecao) {
            System.out.println("Driver não encontrado!");
        }
        return null;
    }
}
