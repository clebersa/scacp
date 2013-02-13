/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cleber
 */
public class Prova {
    int idProva;
    int tipoProva;
    int quantidadeQuestoes;
    double pontuacaoMinima;
    double pontuacaoMaxima;
    int precisaoPontuacao;
    int incidenciaPenalizacao;
    int proporcaoPenalizacao;
    List<Cartao> cartoes = new ArrayList<>();
    String gabarito;

    public Prova() {
    }

    public int getIdProva() {
        return idProva;
    }

    public void setIdProva(int idProva) {
        this.idProva = idProva;
    }

    public int getTipoProva() {
        return tipoProva;
    }

    public void setTipoProva(int tipoProva) {
        this.tipoProva = tipoProva;
    }

    public int getQuantidadeQuestoes() {
        return quantidadeQuestoes;
    }

    public void setQuantidadeQuestoes(int quantidadeQuestoes) {
        this.quantidadeQuestoes = quantidadeQuestoes;
    }

    public double getPontuacaoMinima() {
        return pontuacaoMinima;
    }

    public void setPontuacaoMinima(double pontuacaoMinima) {
        this.pontuacaoMinima = pontuacaoMinima;
    }

    public double getPontuacaoMaxima() {
        return pontuacaoMaxima;
    }

    public void setPontuacaoMaxima(double pontuacaoMaxima) {
        this.pontuacaoMaxima = pontuacaoMaxima;
    }

    public int getPrecisaoPontuacao() {
        return precisaoPontuacao;
    }

    public void setPrecisaoPontuacao(int precisaoPontuacao) {
        this.precisaoPontuacao = precisaoPontuacao;
    }

    public int getIncidenciaPenalizacao() {
        return incidenciaPenalizacao;
    }

    public void setIncidenciaPenalizacao(int incidenciaPenalizacao) {
        this.incidenciaPenalizacao = incidenciaPenalizacao;
    }

    public int getProporcaoPenalizacao() {
        return proporcaoPenalizacao;
    }

    public void setProporcaoPenalizacao(int proporcaoPenalizacao) {
        this.proporcaoPenalizacao = proporcaoPenalizacao;
    }

    public List<Cartao> getCartoes() {
        return cartoes;
    }

    public void setCartoes(List<Cartao> cartoes) {
        this.cartoes = cartoes;
    }

    public String getGabarito() {
        return gabarito;
    }

    public void setGabarito(String gabarito) {
        this.gabarito = gabarito;
    }
    
    
}
