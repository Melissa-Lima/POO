package objetos;

public class NotebookGrande extends Notebook{
	
	public NotebookGrande(String serial){
		super(serial, 25);
	}
	
	@Override
	public String toString(){
		return("Notebook Grande-"+ this.getSerial() + "-" + 25);
	}
}
