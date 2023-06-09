package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		// java analisa tipo não valores 
		
		double a = 1;    // conversao explicita 
		System.out.println(a);
		
		float b = (float) 1.0;  // conversao explicita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;      // explicita (CAST)
		System.out.println(b);
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
		
		
		
		
		
	}

}
