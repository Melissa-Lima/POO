package objetos;
import estrutura.PilhaE;

public abstract class Eletronico implements Cloneable{

	String serial;
	
	public Eletronico(String serial){
		this.serial=serial;
	}

	public void setSerial(String serial){
		this.serial=serial;
	}

	public String getSerial(){
		return(this.serial);
	}

	@Override
	public Eletronico clone() throws CloneNotSupportedException{
		Eletronico novoEletronico = (Eletronico) super.clone();
		//novoEletronico.serial=this.getSerial().clone();
		return (novoEletronico);
	}
}
