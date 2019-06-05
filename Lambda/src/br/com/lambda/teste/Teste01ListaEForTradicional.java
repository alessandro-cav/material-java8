package br.com.lambda.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.lambda.modelo.Produto;

public class Teste01ListaEForTradicional {
	
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
		
		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}
		
	}

}
