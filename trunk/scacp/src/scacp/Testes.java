/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import javax.swing.JFrame;

/**
 *
 * @author cleber
 */
public class Testes {
    public static void main(String args[]){
        JFrame janela = new JFrame("Teste formulário!");
        janela.add(new FormularioQuestoes(9999990, 20, TipoProva.MULTIPLA_ESCOLHA));
        //janela.add(new FormularioQuestoes(9999990, 20, TipoProva.VERDADEIRO_FALSO));
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Scacp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scacp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scacp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scacp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    
}
