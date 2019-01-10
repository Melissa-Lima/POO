package estrutura;

public class PilhaVaziaException extends PilhaException{
	
	public PilhaVaziaException(){
		//System.out.println("Todos os itens ja foram desempilhados.");
	}

	@Override
	public String getMessage(){
		return("Todos os itens ja foram desempilhados.");
	}
}
