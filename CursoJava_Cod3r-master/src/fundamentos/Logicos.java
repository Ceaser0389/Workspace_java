package fundamentos;

public class Logicos {

	public static void main(String[] args) {
		
	boolean condicao1 = true;
	boolean condicao2 = 3>7;
	
	System.out.println(condicao1 && condicao2);
	System.out.println(condicao1 || condicao2);  
	System.out.println(condicao1 ^ condicao2);	
	System.out.println( !condicao1 );
	System.out.println( !condicao2 );
		
	System.out.println("Tabela verdade do E (AND)");
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println( false && false);
	
	System.out.println("\n Tabela verdade do OU (OR)");
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println( false || false);
	
	System.out.println("\n Tabela verdade do OU Exclusivo (XOR)");
	System.out.println(true ^ true);
	System.out.println(true ^ false);
	System.out.println(false ^ true);
	System.out.println( false ^ false);
	
	System.out.println("\n Tabela verdade NOT");
	System.out.println(!true );
	System.out.println(!true );
	System.out.println(!false );
	System.out.println(!false);
	
	}

}
