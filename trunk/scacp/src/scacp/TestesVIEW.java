/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

/**
 *
 * @author cleber
 */
public class TestesVIEW {
    public static void main(String args[]){
        JFrame janela = new JFrame("Teste formulário!");
        /*PainelGerencimentoCartao ger = new PainelGerencimentoCartao(TipoProva.MULTIPLA_ESCOLHA, 40, 999999);
        JPanel scroll = (JPanel) ((JViewport)((JScrollPane) ger.getComponent(0)).getViewport()).getComponent(1);
        
        scroll.add(new PainelQuestoes(9999999, 20, TipoProva.MULTIPLA_ESCOLHA));
        janela.add(ger);*/
        PainelQuestoes pnl = new PainelQuestoes(9999990, 11, 20, TipoProva.MULTIPLA_ESCOLHA);
        pnl.setMarcacao("abdebc*#dc");
        janela.add(pnl);
        //janela.add(new PainelQuestoes(9999990, 20, TipoProva.VERDADEIRO_FALSO));
        try {
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
        }
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    
}
