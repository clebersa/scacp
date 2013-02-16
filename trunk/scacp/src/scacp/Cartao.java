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
    
    
    
    public int validarInscricao(int numeroInscricao){
        int contador, somador = 0,resto, digitoVerificador;
        int  vetorNumeroInscricao[] = new int[7];
        
        //laço para guardar o número de inscrição em um vetor
        for(contador=6;contador>-1;contador--)
            {
               vetorNumeroInscricao[contador] = numeroInscricao%10;
            }
        
        for(contador=0;contador<7;contador++)
            {
                somador += vetorNumeroInscricao[contador]*(8-contador);
            }
        
	resto=somador%11;

	if((resto==0)||(resto==10))
	    {
	        digitoVerificador=0;
            }
        else 
            {
                digitoVerificador = resto;
            }
        
        return digitoVerificador;
    }
    
    
    
    public int corrigirCartao(String marcacao, String gabarito ){
      char vetorMarcacao[] = marcacao.toCharArray();
      char vetorGabarito[] = gabarito.toCharArray();
      int contador, questoesIncorretas = 0;
      
      for (contador = 0; contador < marcacao.length(); contador ++){
        if(vetorMarcacao[contador] != vetorGabarito[contador]){
        questoesIncorretas ++;
        }
      }
    
      return questoesIncorretas;
    }
    
    
}
