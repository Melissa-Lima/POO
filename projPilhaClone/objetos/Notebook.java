package objetos;

public class Notebook extends Eletronico{

	private int qtdUSB;
	
	public Notebook(String serial, int qtdUSB){
		super(serial);
		this.qtdUSB=qtdUSB;
	}
	
	public int getQtdUSB(){
		return (this.qtdUSB);
	}
	
	@Override
	public String toString(){
		return("Notebook-"+ this.getSerial() + "-" + this.getQtdUSB());
	}
}
