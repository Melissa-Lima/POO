package estrutura;

public class PilhaCheiaException extends PilhaException{
	
	int limite;
	Object item; 

	public PilhaCheiaException(Object item, int limite){
		this.limite=limite;
		this.item=item;
		//System.out.println("Pilha Cheia! O limite é:" + this.getLimite() + " Objeto não empilhado: " + this.getItemNaoEmpilhado());	
	}

	public int getLimite(){
		return (this.limite);	
	}

	public Object getItem(){
		return (this.item);
	}

	@Override
	public String getMessage(){
		return ("Pilha Cheia!");
	}
	
}
