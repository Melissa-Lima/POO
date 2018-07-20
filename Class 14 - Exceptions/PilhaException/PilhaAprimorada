public class PilhaAprimorada extends PilhaSimples{
		
	private int tamanho;
	
	public PilhaAprimorada(int tamanho){
		super(tamanho);
	}
		
	@Override
	public void empilha(Object novoItem) throws PilhaException {
		if (getTopo()==super.getTamanhoMax() -1)
			throw new PilhaCheiaException(getTamanhoMax(),novoItem());
	}
	
	@Override
	public Object desempilha() throws PilhaException {
		Object item = itens[topo];
		itens[topo--] = null;
		return item;
}
