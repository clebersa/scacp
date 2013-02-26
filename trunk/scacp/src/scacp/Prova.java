/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.util.HashMap;

/**
 *
 * @author Cleber
 */
public class Prova {

    private int idProva;
    private String nome;
    private TipoProva tipoProva;
    private int quantidadeQuestoes;
    private double pontuacaoMinima;
    private double pontuacaoMaxima;
    private int precisaoPontuacao;
    private boolean incidenciaPenalizacao;
    private int proporcaoPenalizacao;
    private HashMap<Integer, Cartao> cartoes = new HashMap<>();
    private String gabarito;
    private boolean provaSalva; // Atributo que não vai para o BD

    public Prova() {
        provaSalva = true;
        proporcaoPenalizacao = 1;
        gabarito = "";
    }

    public int getIdProva() {
        return idProva;
    }

    public void setIdProva(int idProva) {
        this.idProva = idProva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoProva getTipoProva() {
        return tipoProva;
    }

    public void setTipoProva(TipoProva tipoProva) {
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

    public boolean getIncidenciaPenalizacao() {
        return incidenciaPenalizacao;
    }

    public void setIncidenciaPenalizacao(boolean incidenciaPenalizacao) {
        this.incidenciaPenalizacao = incidenciaPenalizacao;
    }

    public int getProporcaoPenalizacao() {
        return proporcaoPenalizacao;
    }

    public void setProporcaoPenalizacao(int proporcaoPenalizacao) {
        this.proporcaoPenalizacao = proporcaoPenalizacao;
    }

    public HashMap<Integer, Cartao> getCartoes() {
        return cartoes;
    }

    public void setCartoes(HashMap<Integer, Cartao> cartoes) {
        this.cartoes = cartoes;
    }

    public String getGabarito() {
        return gabarito;
    }

    public void setGabarito(String gabarito) {
        this.gabarito = gabarito;
    }

    public boolean isProvaSalva() {
        return provaSalva;
    }

    public void setProvaSalva(boolean precisaSalvar) {
        this.provaSalva = precisaSalvar;
    }

    @Override
    public String toString() {
        return "Prova{" + "idProva=" + idProva + ", nome=" + nome + ", tipoProva=" + tipoProva + ", quantidadeQuestoes=" + quantidadeQuestoes + ", pontuacaoMinima=" + pontuacaoMinima + ", pontuacaoMaxima=" + pontuacaoMaxima + ", precisaoPontuacao=" + precisaoPontuacao + ", incidenciaPenalizacao=" + incidenciaPenalizacao + ", proporcaoPenalizacao=" + proporcaoPenalizacao + ", cartoes=" + cartoes + ", gabarito=" + gabarito + ", provaSalva=" + provaSalva + '}';
    }

    
    public void corrigirCartoes() {
        for(Cartao cartao: cartoes.values()){
            cartao.calcularNota(this);
        }
    }
}
