package br.com.lambda.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import br.com.lambda.modelo.Produto;

public class Teste02ListaTradicionalEConsumerELambdaENovoFor {
	
	public static void main(String[] args) {
		
		
		Produto produto1 =  new Produto();
		produto1.setNome("detergente");
		
		Produto produto2 =  new Produto();
		produto2.setNome("sabao");
		
		Produto produto3 =  new Produto();
		produto3.setNome("agua");
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		
		/*
		AQUI ESTOU CHAMANDO A INTERFACE CONSUMER , CRIANDO UMA VARIAVEL DE REFERENCIA A MESMA E DESCREVENDO A LAMBDA.
		DESSA FORMA IMPLICITAMENTE A INTERFACE CONSUMER ESTA USANDO O METODO ACCEPT PARA IMPRIMIR O NOME DO PRODUTO NA 
		CONSOLE EM TEMPO DE EXECUÇÃO*/
		Consumer<Produto> mostrador = p -> System.out.println(p.getNome());
		
		//AQUI ESTOU USANDO O FORESCH DA LISTA QUE ESTA RECEBENDO UMA VARIAVEL DE REFERENCIA DA INTERFACE CONSUMIDORA
		produtos.forEach(mostrador);

	}

}
