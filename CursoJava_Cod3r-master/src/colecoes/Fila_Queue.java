package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila_Queue {

	public static void main(String[] args) {
	
	
		Queue<String> fila = new LinkedList<>();
		
	   // add e offer adicionam elementos na fila 
	// diferença é o comportamento quanto a fila está cheia !		
	//fila.add("Ana");  // essa vc usa tratamento de erro
  //  fila.offer("Bia"); // add p fila com restricao de tamanho retorna ver ou false
		
	 fila.add("Ana");
	 fila.add("Bia");	
	 fila.add("Carlos");	
	 fila.add("Daniel");	
	 fila.add("Rafaela");
	 fila.add("Gui");	
		
	// Peek e element -> obter o prox  elemento na fila (sem remover)
	 //diferença é o comportamento ocorre 
	 //quanto a fila está vazia !	
	 
	 System.out.println(fila.peek());  //retorna false
	 System.out.println(fila.peek());	
	 System.out.println(fila.element());	// lança uma excecao 
	 System.out.println(fila.element());		
		
	
		
	// Pool e Remove -> obter o prox  elemento da fila e remove
    //diferença é o comportamento ocorre 
    //quanto a fila está vazia !	
	 
	 // poll remove elemento da fila 
	 System.out.println(fila.poll()); // retorna false
	 System.out.println(fila.remove()); // lança uma exeção 
	
	 // outros metodos p manipular a fila 
	// fila.size.
	// fila.isEmpty();
	// fila.clear();
	// fila.contains();
	 
	 
	 

	}

}
