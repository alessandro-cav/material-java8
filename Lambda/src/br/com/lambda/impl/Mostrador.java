package br.com.lambda.impl;

import java.util.function.Consumer;

import br.com.lambda.modelo.Produto;

public class Mostrador implements Consumer<Produto> {

	@Override
	public void accept(Produto produto) {
		System.out.println(produto.getNome());

	}

}
