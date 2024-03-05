package aula16;

public class Aula016 {
	public static void main(String[] args) { // Arvore binária

		Arvore<Integer> arvore = new Arvore<Integer>();
		arvore.adicionar(10);
		arvore.adicionar(8);
		arvore.adicionar(5);
		arvore.adicionar(9);
		arvore.adicionar(7);
		arvore.adicionar(18);
		arvore.adicionar(13);
		arvore.adicionar(20);

		System.out.println("\n\nEm-Ordem");
		arvore.emOrdem(arvore.getRaiz());

		System.out.println("\n\nPré-Ordem");
		arvore.preOrdem(arvore.getRaiz());

		System.out.println("\n\nPós-Ordem");
		arvore.posOrdem(arvore.getRaiz());
		 

		/*
		 * arvore.remover(20); System.out.println("\n\nEm-Ordem");
		 * arvore.emOrdem(arvore.getRaiz());
		 * 
		 * arvore.remover(5); System.out.println("\n\nEm-Ordem");
		 * arvore.emOrdem(arvore.getRaiz());
		 * 
		 * arvore.remover(8); System.out.println("\n\nEm-Ordem");
		 * arvore.emOrdem(arvore.getRaiz());
		 * 
		 * arvore.remover(9); System.out.println("\n\nEm-Ordem");
		 * arvore.emOrdem(arvore.getRaiz());
		 * 
		 * arvore.remover(13); System.out.println("\n\nEm-Ordem");
		 * arvore.emOrdem(arvore.getRaiz());
		 * 
		 * arvore.remover(7); arvore.remover(18);
		 * System.out.println("\n\nEm-Ordem"); arvore.emOrdem(arvore.getRaiz());
		 * 
		 * arvore.remover(10); System.out.println("\n\nEm-Ordem");
		 * arvore.emOrdem(arvore.getRaiz());
		 */

	}
}
