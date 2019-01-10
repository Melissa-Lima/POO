package objetos;

public class Eletronico implements Cloneable{
	
	private String serial;
	private String nome;
	
	public Eletronico(String serial){
		this.serial=serial;
	}
	
	@Override
	public Eletronico clone() throws CloneNotSupportedException{
		Eletronico eletronicoClonado = (Eletronico) super.clone();
		return (eletronicoClonado);
	}
	
	public void setSerial(String serial){
		this.serial=serial;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}

	public String toString(){
		return (""+this.nome+ "-" + this.serial);
	}
}
