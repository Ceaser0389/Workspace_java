package desafios;

public class temperatura {

	public static void main(String[] args) {
		
		// (F -32) x 5/9 = C
      final double  X  = 5.0/9.0;
	  final double  Y  = 32;
      
	  double fahren =86;
      double celsius = (fahren - Y) * X ;
      System.out.println("O resultado é :" + celsius);
		
      fahren =86;
      celsius = (fahren - Y) * X ;
      System.out.println("O resultado é :" + celsius);
		
	}

}
