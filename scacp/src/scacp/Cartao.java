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
    
    
    
    public static int validarInscricao(int numeroInscricao){
        int tamanhoVetor = 7 ;
        int contador, somador = 0, digitoVerificador;
        int  vetorNumeroInscricao[] = new int[tamanhoVetor];
        
        //laço para guardar o número de inscrição em um vetor
        for(contador=tamanhoVetor-1; contador>=0; contador--){ 
               vetorNumeroInscricao[contador] = numeroInscricao%10;
               numeroInscricao = numeroInscricao/10;
            }
        
        for(contador=0; contador<tamanhoVetor-1; contador++){
                somador += vetorNumeroInscricao[contador]*(tamanhoVetor-contador);
            }

	if((somador%11==0)||(somador%11==10)){
	        digitoVerificador=0;
            }
        else {
                digitoVerificador = 11 - somador%11;
            }
        
        return digitoVerificador;
    }

    public static int corrigirCartao(String marcacao, String gabarito ){
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
   

    public static void main(String[] args) {

    }
    }

