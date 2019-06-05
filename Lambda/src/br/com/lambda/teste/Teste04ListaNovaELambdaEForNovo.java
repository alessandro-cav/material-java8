package br.com.lambda.teste;

import java.util.Arrays;
import java.util.List;

import br.com.lambda.modelo.Produto;

public class Teste04ListaNovaELambdaEForNovo {

	public static void main(String[] args) {

		// BOA PRATICAS

		Produto produto1 = new Produto();
		produto1.setNome("detergente");

		Produto produto2 = new Produto();
		produto2.setNome("sabao");

		Produto produto3 = new Produto();
		produto3.setNome("agua");

		// AQUI USANDO A NOVA LISTA
		List<Produto> produtos = Arrays.asList(produto1, produto2, produto3);

		// USANDO O NOVO FOREACH DA LISTA QUE RECEBE UMA LAMBDA
		produtos.forEach(p -> System.out.println(p.getNome() + "\n" + p.toString()));
		
		

	}

}
