package app10;

public class Cielo implements Operadora{

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		
		return cartao.getNomeTitular().startsWith("123");
	}

}
