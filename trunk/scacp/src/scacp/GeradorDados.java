/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

/**
 *
 * @author cleber
 */
public class GeradorDados {
    public GeradorDados() {
    }
    
    public static int gerarNumeroInscricao(){
        int contador, verificador, numeroInscricao, numeros[];
        numeroInscricao = 0;
        numeros = new int[6];
        // Gera os dígitos não verificadores da direita para a esquerda
        // e calcula a soma para calcular o dígito verificador
        verificador = 0;
        for(contador = 0; contador < 6; contador ++){
            numeros[contador] = (int) (Math.random() * 10);
            if(numeros[contador] == 10){
                numeros[contador] = 0;
            }
            //Multiplicadores:      10  9   8   7   6   5   4   3   2
            //numeros[contador]:                5   4   3   2   1   0 (posições)
            verificador += numeros[contador] * (contador+2);
            numeroInscricao += Math.pow(10, contador) * numeros[contador];
        }
        
        if(verificador%11 < 2){
            verificador = 0;
        }else{
            verificador = 11 - verificador % 11;
        }
        
        numeroInscricao = numeroInscricao * 10 + verificador;
        
        return numeroInscricao;
    }
    

    
}

