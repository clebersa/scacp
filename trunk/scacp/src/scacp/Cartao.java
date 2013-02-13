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
    private int tipoProva;
    private int idProva;
    private String marcacao;
    private double nota;

    public Cartao(int numeroInscricao, int tipoProva, String marcacao, double nota) {
        this.numeroInscricao = numeroInscricao;
        this.tipoProva = tipoProva;
        this.marcacao = marcacao;
        this.nota = nota;
    }

    public int getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(int numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public int getTipoProva() {
        return tipoProva;
    }

    public void setTipoProva(int tipoProva) {
        this.tipoProva = tipoProva;
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
    
}
