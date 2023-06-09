package classe;

public class Data {
   
	int dia;
	int mes;
	int ano;
	
	public Data() {
		dia =1;
		mes =11;
		ano =1970;
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;  // p ref obj atual 
		this.mes = mes;
		this.ano = ano;
	}

	
	String obterDataFormatada() {
		String formato = "%d %d %d";
		return String.format( formato,this.dia,mes,ano);
	}
	
	void imprimirDataFormatada() {
		System.out.printf(obterDataFormatada()); // esse tipo de metod n func em web ,desktop
	}
	
	
	// const é obri vc inicializar ... el n~ tem valor padrao
	
	
	
}
