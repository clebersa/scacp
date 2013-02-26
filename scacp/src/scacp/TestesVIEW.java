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
        
        scroll.add(new QuestoesPainel(9999999, 20, TipoProva.MULTIPLA_ESCOLHA));
        janela.add(ger);*/
        
        // Teste de QuestoesPainel
        /*QuestoesPainel pnl = new QuestoesPainel(9999999, 11, 20, TipoProva.MULTIPLA_ESCOLHA);
        pnl.setMarcacao("abdebc*#dc");
        janela.add(pnl);*/
        
        
        // Teste de CartaoPainel
        /*Cartao cartao = new Cartao();
        cartao.setNumeroInscricao(9999990);
        cartao.setMarcacao("ac*dbdc*ab#eddc#aeecbed#cba*#e");
        CartaoPainel cartaoPainel = new CartaoPainel(cartao, 80, TipoProva.VERDADEIRO_FALSO);
        janela.add(cartaoPainel);
        janela.pack();*/
        
        // Teste CartaoPainelGereciamento
        Prova prova = new Prova();
        prova.setNome("Vestibular 2013");
        prova.setTipoProva(TipoProva.MULTIPLA_ESCOLHA);
        prova.setQuantidadeQuestoes(2);
        Cartao cartao = new Cartao();
        //cartao.setMarcacao("ac*dbdc*ab#eddc#aeec");
        cartao.setMarcacao("ac*dbdc*ab");
        cartao.setNumeroInscricao(123456789);
        cartao.setNota(12.5);
        cartao.setCartaoSalvo(true);
        prova.getCartoes().put(cartao.getNumeroInscricao(), cartao);
        cartao.setMarcacao("dd*dbdc*ab");
        cartao.setNumeroInscricao(6967817);
        cartao.setNota(5);
        cartao.setCartaoSalvo(true);
        prova.getCartoes().put(cartao.getNumeroInscricao(), cartao);
        CartaoPainelGerencimento cpg = new CartaoPainelGerencimento(prova);
        janela.add(cpg);
        
        
        
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
