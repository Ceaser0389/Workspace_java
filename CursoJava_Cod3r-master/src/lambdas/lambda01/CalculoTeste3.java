package lambdas.lambda01;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
	
		
	/// vc não cosnegue coverter um int primitivo p um double class	
		//não   int ->  double
		// double -> double
		
		// tipo generico só aceita  classes
	BinaryOperator<Double> calc = (x,y) ->{ return x + y; };	
	System.out.println(calc.apply(2.0, 3.0));
	    
		
	calc = (x,y) ->  x * y;
	System.out.println(calc.apply(5.0, 2.0));
		
	
		
		
		// BinaryOperaration recebe dois parm do mesmo tipo e
	    //retorna outro parm do mesmo tipo 
		
		
		
		
		
		
		
		
		
		

	}

}
