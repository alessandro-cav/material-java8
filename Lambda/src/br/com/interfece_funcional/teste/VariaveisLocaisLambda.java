package br.com.interfece_funcional.teste;

public class VariaveisLocaisLambda {

	public static void main(String[] args) {

		final int numero = 5;

		new Thread(() -> {

			System.out.println(numero);
		}).start();
		
		System.out.println("=====================================================================================");

		
		/*Como pode ver nao estou declarando o final para variavel abaixo, mas apesar de não precisar declarar as variaveis
		 * locais como final, voce nao pode altera-las se estiver usando dentro do lambda. */
		
		 int valor = 4;

		new Thread(() -> {

			System.out.println(valor);
		}).start();
		
		System.out.println("=====================================================================================");
		
	/*	int number = 5;

		new Thread(() -> {

			System.out.println(number); // nao compila
		}).start();
	
		number = 10; // por causa dessa linha que esta mudando o valor da variavel  number dentro do lambda
		*/
		
	}
}
