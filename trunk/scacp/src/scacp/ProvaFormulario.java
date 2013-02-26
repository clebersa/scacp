/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import javax.swing.JOptionPane;


/**
 *
 * @author Cleber
 */
public class ProvaFormulario extends javax.swing.JDialog {

    Prova prova;

    /**
     * Creates new form ProvaFormulario
     */
    public ProvaFormulario(java.awt.Frame parent, boolean modal, Prova prova) {
        super(parent, modal);
        this.prova = prova;
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

        lblNome = new javax.swing.JLabel();
        txtfNome = new javax.swing.JTextField();
        lblTipoProva = new javax.swing.JLabel();
        cmbbTipoProva = new javax.swing.JComboBox();
        lblQntQuestoes = new javax.swing.JLabel();
        spnQntQuestoes = new javax.swing.JSpinner();
        pnlEscalaPontuacao = new javax.swing.JPanel();
        lblPontucaoMinima = new javax.swing.JLabel();
        lblPontucaoMaxima = new javax.swing.JLabel();
        lblPrecisaoPontucao = new javax.swing.JLabel();
        spnPrecisaoPontucao = new javax.swing.JSpinner();
        spnPontuacaoMaxima = new javax.swing.JSpinner();
        spnPontuacaoMinima = new javax.swing.JSpinner();
        pnlSistemaPenalizacao = new javax.swing.JPanel();
        lblIncidencia = new javax.swing.JLabel();
        chkbIncidencia = new javax.swing.JCheckBox();
        lblProporcao = new javax.swing.JLabel();
        spnProporcao = new javax.swing.JSpinner();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblNome.setText("Nome:");

        txtfNome.setText(prova.getNome());

        lblTipoProva.setText("Tipode de Prova:");

        cmbbTipoProva.addItem(TipoProva.MULTIPLA_ESCOLHA.getTipo());
        cmbbTipoProva.addItem(TipoProva.VERDADEIRO_FALSO.getTipo());
        try{
            if(prova.getTipoProva().equals(TipoProva.MULTIPLA_ESCOLHA)){
                cmbbTipoProva.setSelectedItem(TipoProva.MULTIPLA_ESCOLHA.getTipo());
            }else{
                cmbbTipoProva.setSelectedItem(TipoProva.VERDADEIRO_FALSO.getTipo());
            }

        }catch(NullPointerException excecao){

        }
        cmbbTipoProva.setToolTipText("<html>Tipo de Prova a ser corrigida.<br />\nProvas de múltipla escolha podem apresentar <br />respostas como sendo 'a', 'b', 'd' ou 'e'.<br/>\nProvas de verdadeiro ou falso podem apresentar <br />respostas como sendo 'v' ou 'f'.<br/></html>\n");

        lblQntQuestoes.setText("Quantidade de Questões:");

        spnQntQuestoes.setModel(new javax.swing.SpinnerNumberModel(50, 10, 100, 10));
        spnQntQuestoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spnQntQuestoes.setEditor(new javax.swing.JSpinner.NumberEditor(spnQntQuestoes, ""));
        if(!(prova.getQuantidadeQuestoes() < 10) && !(prova.getQuantidadeQuestoes()>100) && prova.getQuantidadeQuestoes()%10 == 0){
            spnQntQuestoes.setValue(prova.getQuantidadeQuestoes());
        }

        pnlEscalaPontuacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Escala de Pontuação"));

        lblPontucaoMinima.setText("Pontuação Mínima:");

        lblPontucaoMaxima.setText("Pontuação Máxima:");

        lblPrecisaoPontucao.setText("Precisão da pontuação:");

        spnPrecisaoPontucao.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2, 1));
        spnPrecisaoPontucao.setValue(prova.getPrecisaoPontuacao());

        spnPontuacaoMaxima.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(100.0d), null, Double.valueOf(100.0d), Double.valueOf(1.0d)));
        spnPontuacaoMaxima.setValue(prova.getPontuacaoMaxima());

        spnPontuacaoMinima.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 1.0d));
        spnPontuacaoMinima.setValue(prova.getPontuacaoMinima());

        javax.swing.GroupLayout pnlEscalaPontuacaoLayout = new javax.swing.GroupLayout(pnlEscalaPontuacao);
        pnlEscalaPontuacao.setLayout(pnlEscalaPontuacaoLayout);
        pnlEscalaPontuacaoLayout.setHorizontalGroup(
            pnlEscalaPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEscalaPontuacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEscalaPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEscalaPontuacaoLayout.createSequentialGroup()
                        .addComponent(lblPrecisaoPontucao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnPrecisaoPontucao, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEscalaPontuacaoLayout.createSequentialGroup()
                        .addGroup(pnlEscalaPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEscalaPontuacaoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblPontucaoMinima))
                            .addGroup(pnlEscalaPontuacaoLayout.createSequentialGroup()
                                .addComponent(lblPontucaoMaxima)
                                .addGap(14, 14, 14)))
                        .addGap(24, 24, 24)
                        .addGroup(pnlEscalaPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnPontuacaoMaxima, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(spnPontuacaoMinima))))
                .addContainerGap())
        );
        pnlEscalaPontuacaoLayout.setVerticalGroup(
            pnlEscalaPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEscalaPontuacaoLayout.createSequentialGroup()
                .addGroup(pnlEscalaPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPontucaoMinima)
                    .addComponent(spnPontuacaoMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEscalaPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPontucaoMaxima)
                    .addComponent(spnPontuacaoMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEscalaPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecisaoPontucao)
                    .addComponent(spnPrecisaoPontucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlSistemaPenalizacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Sistema de Penalização"));

        lblIncidencia.setText("Incidência: ");

        chkbIncidencia.setText("Sim");
        chkbIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbIncidenciaActionPerformed(evt);
            }
        });
        if(prova.getIncidenciaPenalizacao()){
            chkbIncidencia.setSelected(true);
            spnProporcao.setEnabled(true);
        }else{
            chkbIncidencia.setSelected(false);
            spnProporcao.setEnabled(false);
        }

        lblProporcao.setText("Proporção: ");

        spnProporcao.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        spnProporcao.setEditor(new javax.swing.JSpinner.NumberEditor(spnProporcao, ""));
        if(chkbIncidencia.isSelected()){
            spnProporcao.setEnabled(true);
            spnProporcao.setValue(prova.getProporcaoPenalizacao());
        }else{
            spnProporcao.setEnabled(false);
        }

        javax.swing.GroupLayout pnlSistemaPenalizacaoLayout = new javax.swing.GroupLayout(pnlSistemaPenalizacao);
        pnlSistemaPenalizacao.setLayout(pnlSistemaPenalizacaoLayout);
        pnlSistemaPenalizacaoLayout.setHorizontalGroup(
            pnlSistemaPenalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSistemaPenalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIncidencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkbIncidencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(lblProporcao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnProporcao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlSistemaPenalizacaoLayout.setVerticalGroup(
            pnlSistemaPenalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSistemaPenalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblIncidencia)
                .addComponent(chkbIncidencia)
                .addComponent(spnProporcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblProporcao))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQntQuestoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnQntQuestoes))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipoProva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbbTipoProva, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlSistemaPenalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar))
                            .addComponent(pnlEscalaPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfNome)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoProva)
                    .addComponent(cmbbTipoProva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQntQuestoes)
                    .addComponent(spnQntQuestoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlEscalaPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSistemaPenalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        boolean validacaoOK = true;
        if(txtfNome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Informe um nome de prova válido!", "Nome inválido!", JOptionPane.ERROR_MESSAGE);
            validacaoOK = false;
        }else{
            String nomeProva = txtfNome.getText();
            int contador;
            validacaoOK = false;
            for(contador = 0; contador < nomeProva.length(); contador++){
                if(nomeProva.charAt(contador) != ' '){
                    validacaoOK = true;
                    break;
                }
            }
            if(validacaoOK == false){
                JOptionPane.showMessageDialog(rootPane, "Informe um nome de prova válido!", "Nome Inválido!", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(((int)spnQntQuestoes.getValue() < 10) || ((int)spnQntQuestoes.getValue() > 100) || ((int)spnQntQuestoes.getValue()%10 != 0)){
            JOptionPane.showMessageDialog(rootPane, "Informe uma quantidade de questões válida!", "Quantidade Inválida!", JOptionPane.ERROR_MESSAGE);
            validacaoOK = false;
        }
        if((double) spnPontuacaoMinima.getValue() > (double) spnPontuacaoMaxima.getValue()){
            JOptionPane.showMessageDialog(rootPane, "O valor da pontuação mínima deve ser menor \ndo que o valor da pontuação máxima!", "Valor de pontuação incorreto!", JOptionPane.ERROR_MESSAGE);
            validacaoOK = false;
        }
        if(chkbIncidencia.isSelected()){
            if((int) spnProporcao.getValue() > (int) spnQntQuestoes.getValue()){
                JOptionPane.showMessageDialog(rootPane, "O valor da proporção da penalização deve ser menor \ndo que a quantidade de questões!", "Valor de pontuação incorreto!", JOptionPane.ERROR_MESSAGE);
                validacaoOK = false;
            }
        }
        if(validacaoOK){
            prova.setProvaSalva(false);
            //Nome da prova
            prova.setNome(txtfNome.getText());
            if(prova.getNome().equals("")){

            }
            //Tipo da prova
            if (cmbbTipoProva.getSelectedItem().equals(TipoProva.MULTIPLA_ESCOLHA.getTipo())) {
                prova.setTipoProva(TipoProva.MULTIPLA_ESCOLHA);
            } else {
                prova.setTipoProva(TipoProva.VERDADEIRO_FALSO);
            }
            //Quantidade de questões
            prova.setQuantidadeQuestoes((int)spnQntQuestoes.getValue());
            //Pontuação mínima
            prova.setPontuacaoMinima((double)spnPontuacaoMinima.getValue());
            //Pontuação máxima
            prova.setPontuacaoMaxima((double)spnPontuacaoMaxima.getValue());
            //Precisão da pontuação
            prova.setPrecisaoPontuacao((int)spnPrecisaoPontucao.getValue());
            //Penalização
            if(chkbIncidencia.isSelected()){
                prova.setIncidenciaPenalizacao(true);
                prova.setProporcaoPenalizacao((int)spnProporcao.getValue());
            }else{
                prova.setIncidenciaPenalizacao(false);
            }

            dispose();
        }else{
            prova.setProvaSalva(true);
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void chkbIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbIncidenciaActionPerformed
        if (chkbIncidencia.isSelected()) {
            spnProporcao.setEnabled(true);
        } else {
            spnProporcao.setEnabled(false);
        }
    }//GEN-LAST:event_chkbIncidenciaActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkbIncidencia;
    private javax.swing.JComboBox cmbbTipoProva;
    private javax.swing.JLabel lblIncidencia;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPontucaoMaxima;
    private javax.swing.JLabel lblPontucaoMinima;
    private javax.swing.JLabel lblPrecisaoPontucao;
    private javax.swing.JLabel lblProporcao;
    private javax.swing.JLabel lblQntQuestoes;
    private javax.swing.JLabel lblTipoProva;
    private javax.swing.JPanel pnlEscalaPontuacao;
    private javax.swing.JPanel pnlSistemaPenalizacao;
    private javax.swing.JSpinner spnPontuacaoMaxima;
    private javax.swing.JSpinner spnPontuacaoMinima;
    private javax.swing.JSpinner spnPrecisaoPontucao;
    private javax.swing.JSpinner spnProporcao;
    private javax.swing.JSpinner spnQntQuestoes;
    private javax.swing.JTextField txtfNome;
    // End of variables declaration//GEN-END:variables
}
