package objetos;

public class Eletronico implements Cloneable{

	private String serial;
	
	public Eletronico(String serial){
		this.serial=serial;
	}
	
	public void setSerial(String novoSerial){
		this.serial=novoSerial;
	}
	
	public String getSerial(){
		return (this.serial);
	}
	
	@Override
	public Eletronico clone() throws CloneNotSupportedException{
		Eletronico eletronicoClonado = (Eletronico) super.clone();
		//eletronicoClonado.serial=this.serial.super.clone();
		
		return (eletronicoClonado);
	}
	
	
}
