public class GoleiroComputador extends Jogador implements IGoleiro {

	public GoleiroComputador() {
		super("Computador");
	}

	@Override
	public int defender() {
		double aleatorio = Math.random();
		return aleatorio < 0.33 ? 1 : aleatorio < 0.66 ? 2 : 3;
	}
}
