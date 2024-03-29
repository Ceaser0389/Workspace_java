package aula005;

public class ListaLigada <T> {

	private Elemento<T> primeiro;
	private Elemento<T>ultimo;
	private int tamanho;
	
	
	public ListaLigada() {
		this.tamanho = 0;
	}
	
	public Elemento getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Elemento<T> primeiro) {
		this.primeiro = primeiro;
	}
	public Elemento<T> getUltimo() {
		return ultimo;
	}
	public void setUltimo(Elemento<T> ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	public void adcionar(T novoValor) {
		      Elemento<T> novoElemento = new Elemento<T>(novoValor);
		      if (this.primeiro == null && this.ultimo == null) {
				   this.primeiro = novoElemento;
				   this.ultimo = novoElemento;   
			}
		      else {
		    	  this.ultimo.setProximo(novoElemento);
		    	  this.ultimo = novoElemento;
		      }
		      this.tamanho++;
		}
	
	
	public void remover(T valorProcurado) {
		Elemento<T> anterior = null;
		Elemento<T> atual = this.primeiro;
		for (int i = 0; i < this.getTamanho(); i++) {
			if (atual.getValor().equals(valorProcurado)) {
				
				if (tamanho == 1) {
					this.primeiro = null;
					this.ultimo = null;
				}
				else if(atual == primeiro) {
					this.primeiro = atual.getProximo();
					atual.setProximo(null);
				}else if( atual == ultimo) {
					this.ultimo = anterior; 
					anterior.setProximo(null);
				}
				else {
					anterior.setProximo(atual.getProximo());
					atual = null;	
				}
				this.tamanho--;
				break;
			}
			anterior = atual;
			atual = atual.getProximo();
		}
	}
	
	
	public Elemento get(int posicao) {
			Elemento atual = this.primeiro;
				for (int i = 0; i < posicao; i++) {
					if (atual.getProximo() != null) {
						atual = atual.getProximo();
					}
				}
		return atual;
	}
	
	public IteratorListaLigada<T>  getIterator(){
		return new IteratorListaLigada<T>(this.primeiro);
	}
	
	
	
}
