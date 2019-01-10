public class GoleiroComputador extends Jogador implements Goleiro{

	public GoleiroComputador(){
		super("Computador");
	}
	
	@Override
	public int defender(){
		int min=1;
		int max=3;
		int defesa = (int) Math.random()*(max-min)+min;
	}
	
}
