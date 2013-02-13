/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

/**
 *
 * @author Larissa
 */
public class Sacap extends javax.swing.JFrame {

    /**
     * Creates new form Sacap
     */
    public Sacap() {
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

        barraMenuPrincipal = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itmNovo = new javax.swing.JMenuItem();
        itmAbrir = new javax.swing.JMenuItem();
        itmSalvar = new javax.swing.JMenuItem();
        itmSalvarComo = new javax.swing.JMenuItem();
        itmImprimir = new javax.swing.JMenuItem();
        itmFechar = new javax.swing.JMenuItem();
        itmSair = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        itmInserirCartao = new javax.swing.JMenuItem();
        itmAlterarCartao = new javax.swing.JMenuItem();
        itmExcluir = new javax.swing.JMenuItem();
        itmLocalizar = new javax.swing.JMenuItem();
        menuCorrigir = new javax.swing.JMenu();
        menuConfigurar = new javax.swing.JMenu();
        menuTipoProva = new javax.swing.JMenu();
        itmrbMultiplaEscolha = new javax.swing.JRadioButtonMenuItem();
        itmrbVerdadeiroFalso = new javax.swing.JRadioButtonMenuItem();
        itmQuantidadeQuestoes = new javax.swing.JMenuItem();
        menuEscalaPontuacao = new javax.swing.JMenu();
        itmPontuacaoMinima = new javax.swing.JMenuItem();
        itmPontuacaoMaximo = new javax.swing.JMenuItem();
        itmPrecisaoPontuacao = new javax.swing.JMenuItem();
        menuSistemaPenalizacao = new javax.swing.JMenu();
        itmIncidenciaPenalizacao = new javax.swing.JMenuItem();
        itmProporcaoPenalizacao = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itmAjuda = new javax.swing.JMenuItem();
        itmSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCACP - Sistema de Correção Automática de Cartões de Provas");
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(800, 600));

        menuArquivo.setText("Arquivo");

        itmNovo.setText("Novo");
        menuArquivo.add(itmNovo);

        itmAbrir.setText("Abrir");
        menuArquivo.add(itmAbrir);

        itmSalvar.setText("Salvar");
        menuArquivo.add(itmSalvar);

        itmSalvarComo.setText("Salvar como...");
        menuArquivo.add(itmSalvarComo);

        itmImprimir.setText("Imprimir");
        menuArquivo.add(itmImprimir);

        itmFechar.setText("Fechar");
        menuArquivo.add(itmFechar);

        itmSair.setText("Sair");
        menuArquivo.add(itmSair);

        barraMenuPrincipal.add(menuArquivo);

        menuEditar.setText("Editar");

        itmInserirCartao.setText("Inserir cartão");
        menuEditar.add(itmInserirCartao);

        itmAlterarCartao.setText("Alterar cartão");
        menuEditar.add(itmAlterarCartao);

        itmExcluir.setText("Excluir cartão");
        menuEditar.add(itmExcluir);

        itmLocalizar.setText("Localizar cartão");
        menuEditar.add(itmLocalizar);

        barraMenuPrincipal.add(menuEditar);

        menuCorrigir.setText("Corrigir");
        barraMenuPrincipal.add(menuCorrigir);

        menuConfigurar.setText("Configurar");

        menuTipoProva.setText("Tipo de Prova");

        itmrbMultiplaEscolha.setSelected(true);
        itmrbMultiplaEscolha.setText("Múltipla Escolha");
        menuTipoProva.add(itmrbMultiplaEscolha);

        itmrbVerdadeiroFalso.setSelected(true);
        itmrbVerdadeiroFalso.setText("Verdadeiro ou Falso");
        menuTipoProva.add(itmrbVerdadeiroFalso);

        menuConfigurar.add(menuTipoProva);

        itmQuantidadeQuestoes.setText("Quantidade de Questões");
        menuConfigurar.add(itmQuantidadeQuestoes);

        menuEscalaPontuacao.setText("Escala de Pontuação");

        itmPontuacaoMinima.setText("Pontuação Mínima");
        menuEscalaPontuacao.add(itmPontuacaoMinima);

        itmPontuacaoMaximo.setText("Pontuação Máximo");
        menuEscalaPontuacao.add(itmPontuacaoMaximo);

        itmPrecisaoPontuacao.setText("Precisão da Pontuação");
        menuEscalaPontuacao.add(itmPrecisaoPontuacao);

        menuConfigurar.add(menuEscalaPontuacao);

        menuSistemaPenalizacao.setText("Sistema de Penalização");

        itmIncidenciaPenalizacao.setText("Incidência de Penalização");
        menuSistemaPenalizacao.add(itmIncidenciaPenalizacao);

        itmProporcaoPenalizacao.setText("Proporção da Penalização");
        menuSistemaPenalizacao.add(itmProporcaoPenalizacao);

        menuConfigurar.add(menuSistemaPenalizacao);

        barraMenuPrincipal.add(menuConfigurar);

        menuAjuda.setText("Ajuda");

        itmAjuda.setText("Ajuda");
        menuAjuda.add(itmAjuda);

        itmSobre.setText("Sobre...");
        menuAjuda.add(itmSobre);

        barraMenuPrincipal.add(menuAjuda);

        setJMenuBar(barraMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sacap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sacap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sacap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sacap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sacap().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenuPrincipal;
    private javax.swing.JMenuItem itmAbrir;
    private javax.swing.JMenuItem itmAjuda;
    private javax.swing.JMenuItem itmAlterarCartao;
    private javax.swing.JMenuItem itmExcluir;
    private javax.swing.JMenuItem itmFechar;
    private javax.swing.JMenuItem itmImprimir;
    private javax.swing.JMenuItem itmIncidenciaPenalizacao;
    private javax.swing.JMenuItem itmInserirCartao;
    private javax.swing.JMenuItem itmLocalizar;
    private javax.swing.JMenuItem itmNovo;
    private javax.swing.JMenuItem itmPontuacaoMaximo;
    private javax.swing.JMenuItem itmPontuacaoMinima;
    private javax.swing.JMenuItem itmPrecisaoPontuacao;
    private javax.swing.JMenuItem itmProporcaoPenalizacao;
    private javax.swing.JMenuItem itmQuantidadeQuestoes;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JMenuItem itmSalvar;
    private javax.swing.JMenuItem itmSalvarComo;
    private javax.swing.JMenuItem itmSobre;
    private javax.swing.JRadioButtonMenuItem itmrbMultiplaEscolha;
    private javax.swing.JRadioButtonMenuItem itmrbVerdadeiroFalso;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuConfigurar;
    private javax.swing.JMenu menuCorrigir;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuEscalaPontuacao;
    private javax.swing.JMenu menuSistemaPenalizacao;
    private javax.swing.JMenu menuTipoProva;
    // End of variables declaration//GEN-END:variables
}
