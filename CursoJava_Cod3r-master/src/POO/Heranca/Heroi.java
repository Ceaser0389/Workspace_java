package POO.Heranca;

public class Heroi extends Jogador{
            /// heroi é um jogador 
	
	Heroi(int x , int y){
		super(x,y);
	}
	
	
	
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		
		return ataque1 || ataque2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
