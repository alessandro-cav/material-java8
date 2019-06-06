package br.com.interfece_funcional.teste;

public class TestePag3 {
	public static void main(String[] args) {

		/*Runnable r = () -> {

			for (int i = 0; i < 1000; i++) {
				System.out.println(i);
			}

		};
		new Thread(r).start();*/

		// outra forma de fazer esse lambda

		new Thread(() -> {

			for (int j = 0; j < 1000; j++) {

				System.out.println(j);
			}

		}).start(); 

	}
}
