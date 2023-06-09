package classe;

public class ValorXReferencia {

	public static void main(String[] args) {
	
	double a = 2;   // atr p valor (tPrimitivo)
	double b = a; 
	
	a++;
	b--;
	
	System.out.println(a + "   " + b);
	
	Data d1 = new Data(03,11,1989);
	Data d2 = d1;      // atrb p ref (objeto)
	
	d1.dia =31;
	d2.mes =12;
	
	d1.ano = 2025;
	
	System.out.println(d1.obterDataFormatada());
	System.out.println(d1.obterDataFormatada());

	voltarDataparaValorPadrao(d1);
	
	System.out.println(d1.obterDataFormatada());
	System.out.println(d2.obterDataFormatada());
	
	int c = 5;
	alterarPrimitivo(c);
	System.out.println(c);
	
	
	}
	
	static void voltarDataparaValorPadrao(Data d) {
		d.dia =1;
		d.mes =1;
		d.ano =1970;
	}
	
	
	
	static void alterarPrimitivo(int a) {
		a++;
	}
	
	

}
