package POO.desafio_heranca;

public interface ILuxo {

	void ligarAr();
	void desligarAR();
	
	//implementação padrão  não é obrigado implementar
	default int nivelDoAR() {
		return 1;
	}
	
	
	
}
