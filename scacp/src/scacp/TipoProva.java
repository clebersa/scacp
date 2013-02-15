/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

/**
 *
 * @author cleber
 */
public enum TipoProva {
    MULTIPLA_ESCOLHA("Múltipla Escolha"),
    VERDADEIRO_FALSO("Verdadeiro ou Falso");
    
    String tipo;

    private TipoProva(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
}
