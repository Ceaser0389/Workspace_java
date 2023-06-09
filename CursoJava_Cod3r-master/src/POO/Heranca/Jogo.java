package POO.Heranca;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Heroi heroi = new Heroi(10,10);

	
	
	Monstro monstro= new Monstro();
	monstro.x = 10;
	monstro.y = 11;
	
	
	
	System.out.println("Heroi tem =>" + heroi.vida);
	System.out.println("Monstro tem =>" + monstro.vida);	
			
			
	monstro.atacar(heroi);
	heroi.atacar(monstro);
			
	monstro.atacar(heroi);
	heroi.atacar(monstro);
	
	monstro.andar(Direcao.NORTE);
	monstro.atacar(heroi);
	heroi.atacar(monstro);
			
	
	
	
	
	
	
	

	}
}
