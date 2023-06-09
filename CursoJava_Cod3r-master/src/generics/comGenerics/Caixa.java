package generics.comGenerics;

public class Caixa<T> {

	
public T coisa;
	
	
	public void aguardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
	
	
	
	
	
	
	
	
	
}
