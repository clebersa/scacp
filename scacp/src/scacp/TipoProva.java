/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

/**
 *
 * @author Cleber
 */
public enum TipoProva {
    MULTIPLA_ESCOLHA("Múltipla Escolha"),
    VERDADEIRO_FALSO("Verdadeiro ou Falso");
    
    private String tipo;

    private TipoProva(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
    
}
