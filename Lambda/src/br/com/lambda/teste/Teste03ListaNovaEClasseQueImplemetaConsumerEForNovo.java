package br.com.lambda.teste;

import java.util.Arrays;
import java.util.List;

import br.com.lambda.impl.Mostrador;
import br.com.lambda.modelo.Produto;


public class Teste03ListaNovaEClasseQueImplemetaConsumerEForNovo {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setNome("detergente");

		Produto produto2 = new Produto();
		produto2.setNome("sabao");

		Produto produto3 = new Produto();
		produto3.setNome("agua");

		
		// AQUI USANDO A NOVA LISTA
		List<Produto> produtos =  Arrays.asList(produto1,produto2,produto3);
		
		// AQUI ESTOU INSTANCIANDO A CLASSE QUE IMPLEMENTA A INTERFACE CONSUMER QUE TEM O METODO ACCEPT
		Mostrador mostrador = new Mostrador();
		
		// USANDO O NOVO FOREACH
		produtos.forEach(mostrador);


		
	}

}
