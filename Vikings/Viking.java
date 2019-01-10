import estrutura.*;

public abstract class Viking{

	private int posicao;
	private String tipoViking;
	
	public Viking(){
	}

	public int getPosicao(){
		return(posicao);
	}
	
	public void setTipoViking(String tipoViking){
		this.tipoViking=tipoViking;
	}
	
	public String getTipoViking(){
		return (this.tipoViking);
	}
}
