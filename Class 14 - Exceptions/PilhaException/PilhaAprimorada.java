public class PilhaAprimorada extends PilhaSimples{
		
	private int tamanho;
	
	public PilhaAprimorada(int tamanho){
		super(tamanho);
	}
		
	@Override
	public void empilha(Object novoItem) throws PilhaCheiaException {
		if (getTopo()==super.getTamanhoMax()-1)
			throw new PilhaCheiaException(this.getTamanhoMax(),novoItem);
		else
			super.empilha(novoItem);
	}
	
	@Override
	public Object desempilha() throws PilhaCheiaException {
		if (super.getTopo()==-1){
			throw new PilhaCheiaException(super.getTopo());
		}
		else{
			return(super.desempilha());
			
		}
	}
}

