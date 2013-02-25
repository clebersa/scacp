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
public abstract class QuestaoFormulario extends javax.swing.JPanel {
    public int numeroQuestao, numeroInscricao;
    public List<JRadioButton> alternativas;
    public String alternativa;
    public ButtonGroup rbtgAlternativas;
    
    /**
     * Creates new form QuestaoFormulario
     */
    
    public QuestaoFormulario(int numeroQuestao, int numeroInscricao) {
        this.numeroQuestao = numeroQuestao;
        this.numeroInscricao = numeroInscricao;
        alternativas = new ArrayList<>();
        alternativa = "0";
        rbtgAlternativas = new ButtonGroup();
    }

    public String getAlternativa(){
        return alternativa;
    }
    
    public void setAlternativa(String alternativa){
        this.alternativa = alternativa;
        for(JRadioButton rbtAlternativa: alternativas){
            if(rbtAlternativa.getActionCommand().equalsIgnoreCase(alternativa)){
                rbtAlternativa.setSelected(true);
                break;
            }
        }
    }

    public int getNumeroQuestao() {
        return numeroQuestao;
    }

    public void setNumeroQuestao(int numeroQuestao) {
        this.numeroQuestao = numeroQuestao;
    }
}
