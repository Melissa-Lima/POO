package estrutura;

public class PilhaAprimorada extends PilhaSimples{
	
	public PilhaAprimorada(int tamanhoMax){
		super(tamanhoMax);
	}
	
	@Override
	public void empilha(Object item){
		if (this.getTopo()==getTamanhoMax()-1){
			throw new PilhaCheiaException(item, getTamanhoMax());
		} 
		
		else{
			super.empilha(item);
		}
	}

	@Override
	public Object desempilha(){
		if(this.getTopo()==-1){
			throw new PilhaVaziaException();
		}
		else{
			return(super.desempilha());
		}
	}
}
