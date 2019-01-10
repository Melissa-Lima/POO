public class CobradorComputador extends Jogador implements ICobrador {

	public CobradorComputador() {
		super("Computador");
	}

	public int chutar() {
		double aleatorio = Math.random();
		return aleatorio < 0.33 ? 1 : aleatorio < 0.66 ? 2 : 3;
	}

}
