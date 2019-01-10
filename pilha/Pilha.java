public class Pilha{

	private Object[] pilha;
	private int tamanho;
	private int topo=-1;
	
	public Pilha(int tamanho){
		this.pilha=new Object[tamanho];
		this.tamanho=tamanho;
	}	
	
	public int getTamanho(){
		return (this.tamanho);
	}


	public int getTopo(){
		return (this.topo);
	}
	
	public void empilha(Object objeto) throws ExcecaoPilhaCheia{
		if (getTopo()<getTamanho()-1){
			pilha[topo+1]=objeto;
			topo=topo+1;
		}
		
		else{
			throw new ExcecaoPilhaCheia();
		}
	}
	
	public Object desempilha() throws ExcecaoPilhaVazia{
		if (topo!=-1){
				Object objeto=pilha[topo];
				pilha[topo]=null;
				topo=topo-1;
				return(objeto);
		}
		else{
			throw new ExcecaoPilhaVazia();
		}
	}
}
