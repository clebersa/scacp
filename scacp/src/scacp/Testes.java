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
        janela.add(new FormularioRespostas(1234567, 50, TipoProva.VERDADEIRO_FALSO));
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    
}
