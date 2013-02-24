/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author cleber
 */
public class Cartao {

    private int numeroInscricao;
    private int idProva;
    private String marcacao;
    private double nota;

    public Cartao(int numeroInscricao, int tipoProva, String marcacao, double nota) {
        this.numeroInscricao = numeroInscricao;
        this.marcacao = marcacao;
        this.nota = nota;
    }

    public Cartao() {
    }

    public int getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(int numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public int getIdProva() {
        return idProva;
    }

    public void setIdProva(int idProva) {
        this.idProva = idProva;
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

    public static boolean validarInscricao(int numeroInscricao) {
        String stringNumeroInscricao = String.format("%d", numeroInscricao);
        if (stringNumeroInscricao.length() > 7) {
            JOptionPane.showMessageDialog(null, "O número de inscrição não é válido");
            return false;
        }
        if (stringNumeroInscricao.length() < 7) {
            switch (7 - stringNumeroInscricao.length()) {
                case 1:
                    stringNumeroInscricao = String.format("%01d", numeroInscricao);
                case 2:
                    stringNumeroInscricao = String.format("%02d", numeroInscricao);
                case 3:
                    stringNumeroInscricao = String.format("%03d", numeroInscricao);
                case 4:
                    stringNumeroInscricao = String.format("%04d", numeroInscricao);
                case 5:
                    stringNumeroInscricao = String.format("%05d", numeroInscricao);
                case 6:
                    stringNumeroInscricao = String.format("%06d", numeroInscricao);

            }
        }
        System.out.println(stringNumeroInscricao);

        int tamanhoDaInscricao = 7;
        int contador, somador = 0, numero, digitoVerificador;
        char cDigito;
        for (contador = 0; contador < tamanhoDaInscricao - 2; contador++) {

            cDigito = stringNumeroInscricao.charAt(contador);
            numero = Character.getNumericValue(cDigito);
            
            somador += numero * (tamanhoDaInscricao - contador);
        }

        if ((somador % 11 == 0) || (somador % 11 == 10)) {
            digitoVerificador = 0;
        } 
        else {
            digitoVerificador = 11 - somador % 11;
        }
        cDigito = stringNumeroInscricao.charAt(contador);
        numero = Character.getNumericValue(cDigito);
        
        if (digitoVerificador == numero) {
            return true;
        } else {
            return false;
        }
    }
    

    



    public void calcularNota(Prova prova) {
        String stringMarcacao = getMarcacao();
        String stringGabarito = prova.getGabarito();

        int contador, questoesIncorretas = 0, questoesCorretas = 0, questoesBranco = 0;
        double notaFinal;
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

            notaFinal = prova.getPontuacaoMinima() + ((prova.getPontuacaoMaxima() - prova.getPontuacaoMinima()) / prova.getQuantidadeQuestoes()) * fator;
        } else {
            notaFinal = prova.getPontuacaoMinima() + ((prova.getPontuacaoMaxima() - prova.getPontuacaoMinima()) / prova.getQuantidadeQuestoes()) * questoesCorretas;
        }

    }
}


