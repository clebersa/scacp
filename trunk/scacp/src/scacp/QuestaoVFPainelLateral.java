/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

/**
 *
 * @author cleber
 */
public class QuestaoVFPainelLateral extends javax.swing.JPanel {
    private int numeroInscricao;
    /**
     * Creates new form QuestaoVFPainelLateral
     */
    public QuestaoVFPainelLateral() {
        int numeroInscricao = 00;
        this.numeroInscricao = numeroInscricao;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRespostas = new javax.swing.JLabel();
        lblV = new javax.swing.JLabel();
        lblF = new javax.swing.JLabel();
        lblMultipla = new javax.swing.JLabel();
        lblBranco = new javax.swing.JLabel();

        lblRespostas.setText("Respostas");

        lblV.setText("(V)");

        lblF.setText("(F)");

        lblMultipla.setText("(#)");

        lblBranco.setText("(*)");
        if(numeroInscricao == 9999990){
            lblBranco.setVisible(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRespostas)
            .addComponent(lblV)
            .addComponent(lblF)
            .addComponent(lblMultipla)
            .addComponent(lblBranco)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblRespostas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMultipla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBranco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBranco;
    private javax.swing.JLabel lblF;
    private javax.swing.JLabel lblMultipla;
    private javax.swing.JLabel lblRespostas;
    private javax.swing.JLabel lblV;
    // End of variables declaration//GEN-END:variables
}
