package objetos;

public class Notebook extends Eletronico{

	int usb;

	public Notebook(String serial, int usb){
		super(serial);
		this.usb=usb;
	}

	@Override
	public String toString(){
		return("Notebook - " + this.getSerial());
	}
}
