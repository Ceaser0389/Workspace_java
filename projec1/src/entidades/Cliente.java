package entidades;



public class Cliente {

	public enum Status { ATIVO, EM_ANALISE,CANCELADO,BLOQUEADO}
	
	private Status status;

	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	

	
	
	
	
	
	
}
