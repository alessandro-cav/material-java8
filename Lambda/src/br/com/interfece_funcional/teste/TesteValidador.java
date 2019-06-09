package br.com.interfece_funcional.teste;

import br.com.interfece_funcional.interfaces.Validador;

public class TesteValidador {

	public static void main(String[] args) {
		
		/*Existe tres forma que usar a minha interface */
		
		// Primeira forma com uma classe aninma
		
/*		Validador<String> validadorCEP = new Validador<String>() {

			@Override
			public boolean valida(String valor) {
				
				return valor.matches("[0-9]{5}-[0-9]{3}");
			}
		};
		*/
		
		// Segunda forma usando lambda  e uma classe anionima
		/*Validador<String> validadorCEP =  valor -> {
			return  valor.matches("[0-9]{5}-[0-9]{3}");
		};*/
		
		
		// Executando o teste das duas forma acima
	//	System.out.println(validadorCEP.valida("04101-300"));
		
		
		//Terceira forma usando somente o labda, essa é a melhor forma  com uma linha
		Validador<String>  validadorCEP =  valor -> valor.matches("[0-9]{5}-[0-9]{3}");
		
		System.out.println(validadorCEP.valida("04101-300"));
	}
}
