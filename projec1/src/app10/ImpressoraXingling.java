package app10;

public class ImpressoraXingling implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("-=-=-=-=-=-=-=-=-=-");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println("===================");
		System.out.println("**Xingling Printer**");
	}

}
