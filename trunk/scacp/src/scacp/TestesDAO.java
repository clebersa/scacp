/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

/**
 *
 * @author cleber
 */
public class TestesDAO {

    public static void main(String args[]) {
        Prova prova = new Prova();
        ProvaDAO provaDAO = new ProvaDAO();
        CartaoDAO cartaoDAO = new CartaoDAO();
        prova.setNome("vestibular 2");
        prova.setGabarito("abcdeabcdeabcdeabcde");
        prova.setPontuacaoMinima(0);
        prova.setPontuacaoMaxima(20);
        prova.setQuantidadeQuestoes(20);
        prova.setIdProva(1);
        prova.setIncidenciaPenalizacao(false);
        prova.setTipoProva(TipoProva.MULTIPLA_ESCOLHA);
        prova.setPrecisaoPontuacao(1);
        prova.setProporcaoPenalizacao(1);
        prova.setProvaSalva(true);

        Cartao cartao = new Cartao();
        cartao.setMarcacao("abcdeabcdeabcdeabcde");
        cartao.calcularNota(prova);
        cartao.setNumeroInscricao(2615339);
        Cartao cartao2 = new Cartao();
        cartao2.setMarcacao("qwrqrwqrwrqwr");
        cartao2.calcularNota(prova);
        cartao2.setNumeroInscricao(2615334);
        prova.getCartoes().put(cartao.getNumeroInscricao(), cartao);
        prova.getCartoes().put(cartao2.getNumeroInscricao(), cartao2);
        provaDAO.inserirProva(prova);
        System.out.println("ID gerada: " + prova.getIdProva());

    }
}
