package estrutura;

public class FilaAprimorada extends FilaSimples{
	
	public FilaAprimorada(int tamanhoMax){
		super(tamanhoMax);
	}
	
	@Override
	public void enfileira(Object novoItem){
		if ((getFim()+1)%getTamanhoMax()==getInicio()){
			throw new FilaCheiaException();
		}
		else{
			super.enfileira(novoItem);
		}
	}
	
	@Override
	public Object desenfileira(){
		if (getInicio()==getFim()){
			throw new FilaVaziaException();
		}
		else{
			return (super.desenfileira());
		}
	}
}
