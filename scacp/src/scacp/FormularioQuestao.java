/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author cleber
 */
public abstract class FormularioQuestao extends javax.swing.JPanel {
    public int numeroQuestao, numeroInscricao;
    public List<JRadioButton> alternativas;
    public String alternativa;
    public ButtonGroup gbtnAlternativas;
    
    /**
     * Creates new form FormularioQuestao
     */
    
    public FormularioQuestao(int numeroQuestao, int numeroInscricao) {
        this.numeroQuestao = numeroQuestao;
        this.numeroInscricao = numeroInscricao;
        alternativas = new ArrayList<>();
        alternativa = null;
        gbtnAlternativas = new ButtonGroup();
    }

    public String getAlternativa(){
        return alternativa;
    }
    
    public void setAlternativa(String alternativa){
        this.alternativa = alternativa;
    }

    public int getNumeroQuestao() {
        return numeroQuestao;
    }

    public void setNumeroQuestao(int numeroQuestao) {
        this.numeroQuestao = numeroQuestao;
    }
}
