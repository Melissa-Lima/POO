package objetos;

public class Notebook extends Eletronico{

	private String serial;
	private int usb;
	
	public Notebook(String serial, int usb){
		super(serial);
		this.usb=usb;
		setNome("Notebook");
	}
	
	
	
}

