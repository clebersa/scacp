/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

/**
 *
 * @author cleber
 */
public class Cartao {

    private int numeroInscricao;
    private String marcacao;
    private double nota;
    private boolean cartaoSalvo;

    public Cartao(int numeroInscricao, String marcacao, double nota, boolean cartaoSalvo) {
        this.numeroInscricao = numeroInscricao;
        this.marcacao = marcacao;
        this.nota = nota;
        this.cartaoSalvo = cartaoSalvo;
    }

    public Cartao(int numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public Cartao() {
    }

    public int getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(int numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }


    public String getMarcacao() {
        return marcacao;
    }

    public void setMarcacao(String marcacao) {
        this.marcacao = marcacao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isCartaoSalvo() {
        return cartaoSalvo;
    }

    public void setCartaoSalvo(boolean cartaoSalvo) {
        this.cartaoSalvo = cartaoSalvo;
    }

    @Override
    public String toString() {
        return "Cartao{" + "numeroInscricao=" + numeroInscricao + ", marcacao=" + marcacao + ", nota=" + nota + ", cartaoSalvo=" + cartaoSalvo + '}';
    }
    
    
    public static boolean validarNumeroInscricao(int numeroInscricao){
        int contador, verificadorOriginal, verificadorReal, numeros[];
        numeros = new int[6];
        verificadorReal = 0;
        verificadorOriginal = numeroInscricao % 10;
        numeroInscricao = (numeroInscricao-verificadorOriginal)/10;
        for(contador = 0; contador < 6; contador ++){
            numeros[contador] = numeroInscricao % 10;
            numeroInscricao = (numeroInscricao-numeros[contador])/10;
            //Multiplicadores:      10  9   8   7   6   5   4   3   2
            //numeros[contador]:                5   4   3   2   1   0 (posições)
            verificadorReal += numeros[contador] * (contador+2);
        }
        if(verificadorReal%11 < 2){
            verificadorReal = 0;
        }else{
            verificadorReal = 11 - verificadorReal % 11;
        }
        return verificadorOriginal == verificadorReal;
    }

    public void calcularNota(Prova prova) {
        String stringMarcacao = getMarcacao();
        String stringGabarito = prova.getGabarito();

        int contador, questoesIncorretas = 0, questoesCorretas = 0, questoesBranco = 0;
     //   double notaFinal;
        //Contagem de questoes corretas, incorretas e em branco
        for (contador = 0; contador < stringMarcacao.length(); contador++) {
            if (stringGabarito.charAt(contador) == '#') {
                questoesCorretas++;
            } else if (stringMarcacao.charAt(contador) == '*') {
                questoesBranco++;
            } else if (stringMarcacao.charAt(contador) != stringGabarito.charAt(contador) || stringMarcacao.charAt(contador) == '#') {
                questoesIncorretas++;
            } else if (stringMarcacao.charAt(contador) == stringGabarito.charAt(contador)) {
                questoesCorretas++;
            } else {
            }
        }

        // cálculo da nota
        if (prova.getIncidenciaPenalizacao()) {
            double fator;
            fator = (prova.getProporcaoPenalizacao() * questoesCorretas - questoesIncorretas) / prova.getProporcaoPenalizacao();

            if (fator < 0) {
                fator = 0;
            }

            nota = prova.getPontuacaoMinima() + ((prova.getPontuacaoMaxima() - prova.getPontuacaoMinima()) / prova.getQuantidadeQuestoes()) * fator;
        } else {
            nota = prova.getPontuacaoMinima() + ((prova.getPontuacaoMaxima() - prova.getPontuacaoMinima()) / prova.getQuantidadeQuestoes()) * questoesCorretas;
        }

    }
}


