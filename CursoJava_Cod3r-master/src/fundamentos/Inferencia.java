package fundamentos;

public class Inferencia {

	
	public static void main(String[] args) {
	
	 double a = 4.5;
	 System.out.println(a);
		
	 var b = 4.5;   // java infere o tipo  p valor que vc colocou 
	 System.out.println(b);
		
	  // as variaveis em java sempre s�o do mesmo tipo .. vc n�o pode mudar 
	 //(exemplo de um int para double)
	 
	 var c = "Texto";
	 System.out.println(c);
	 c = "outro texto";
	 System.out.println(c);
		
	 // c = 4.5   n�o pode mudar um tipo string p double
		
	 double d;  // variavel fo declarada 
	 d = 123.65;  // variavel foi inicializada
	 System.out.println(d); // usada !
		
	 var e = 123.45; // obrigado inicializar 
	
	}

}
