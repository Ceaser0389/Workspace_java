package tratamentoErros;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
	
		
		try {
			geraErro1();
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		
		
		try {
			geraErro2();
		} catch (Throwable e) {
		 System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("Fim !");
		
		
		
		
		
		
		
		
		
		

	}
	
	// não checada ou não verifica 
	public static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal  #01!");
	}
	
	//uma exeção checada ou verificada
	public static void geraErro2() throws Exception{
		  new Exception("Ocorreu um erro bem legal  #02!");
	}
	
	
	
	
	
	
	
	
	
	

}
