public class DivPorZero extends Exception {//Exception => checked ; RuntimeException => unchecked
	private double dividendo;
	
	public DivPorZero(double dividendo) {
		super("Divisor eh zero!!!");
		this.dividendo = dividendo;
	}
	
	public double getDividendo() {
		return this.dividendo;
	}
}