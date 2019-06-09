package br.com.interfece_funcional.interfaces;

@FunctionalInterface
public interface Validador<T> {

	/* Criando minha propria interface funcional */

	// criando o metodo abstrato
	public abstract boolean valida(T t);

/*	 criando outro metodo que dará erro , pois aqui somente pode ter um metodo
	 abstrato lembrando que nao é necessario declarar public abstract no metodo para ele
	 ser abstrato aqui na interface*/
	
/*	Esse erro abaixo é o que aparece qdo tem mais de um metodo abstrato na interface funcional
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		The target type of this expression must be a functional interface*/
	
	// boolean outroMetodo();
}
