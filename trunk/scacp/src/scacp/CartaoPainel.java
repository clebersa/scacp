/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

/**
 *
 * @author cleber
 */
public class CartaoPainel extends javax.swing.JPanel {
    private int numeroInscricao, quantidadeQuestoes;
    private QuestoesPainel questoesBloco1, questoesBloco2;
    private Cartao cartao;
    /**
     * Creates new form CartaoPainel
     */
    public CartaoPainel(int numeroInscricao, int quantidadeQuestoes, TipoProva tipoProva) {
        this.numeroInscricao = numeroInscricao;
        this.quantidadeQuestoes = quantidadeQuestoes;
        questoesBloco1 = new QuestoesPainel(numeroInscricao, 01, quantidadeQuestoes/2, tipoProva);
        questoesBloco2 = new QuestoesPainel(numeroInscricao, (quantidadeQuestoes/2)+1, quantidadeQuestoes, tipoProva);
        initComponents();
        
        add(questoesBloco1);
        add(questoesBloco2);
    }

    public int getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(int numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }
    
    public String getMarcacao(){
        String marcacao;
        marcacao = questoesBloco1.getMarcacao();
        marcacao +=questoesBloco2.getMarcacao();
        return marcacao;
    }
    
    public void setMarcacao(String marcacao){
        String marcacaoBloco1, marcacaoBloco2;
        marcacaoBloco1 = marcacao.substring(0, quantidadeQuestoes/2);
        marcacaoBloco2 = marcacao.substring(quantidadeQuestoes/2, quantidadeQuestoes);
        System.out.println(marcacaoBloco1);
        System.out.println(marcacaoBloco2);
        questoesBloco1.setMarcacao(marcacaoBloco1);
        questoesBloco2.setMarcacao(marcacaoBloco2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
