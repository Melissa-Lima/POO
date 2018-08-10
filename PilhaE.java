package estrutura;

import objetos.Eletronico;

public class PilhaE implements Cloneable{

	private int topo;
	private Eletronico[] itens;
	
	public PilhaE(int tamanhoMax) {
		this.itens = new Eletronico[tamanhoMax];
		this.topo = -1;
	}
	
	public void empilha(Eletronico novoItem) {
		if (getTopo() == getTamanhoMax() - 1)
			throw new PilhaCheiaException(getTamanhoMax(), novoItem);
		
		itens[++topo] = novoItem;
	}
	
	public Eletronico desempilha() {
		// verificar pilha vazia
		if (getTopo() == -1)
			throw new PilhaVaziaException();
		
		Eletronico item = itens[topo];
		itens[topo--] = null;
		return item;
	}
	
	int getTopo() {
		return this.topo;
	}
	
	int getTamanhoMax() {
		if (itens != null)
			return this.itens.length;
		else
			return -1;
	}

	@Override
	public PilhaE clone() throws CloneNotSupportedException{ //Copia profunda
		PilhaE pilhaClonada = (PilhaE) super.clone(); //Copia o objeto inteiro
		pilhaClonada.itens=this.itens.clone();  //Copia o vetor
		for (int i=0; i<this.getTamanhoMax(); i++){ //Usa-se o for para copiar CADA ELEMENTO do vetor
			if (this.itens[i]!=null){
				pilhaClonada.itens[i]=this.itens[i].clone();
			}
		}
		return (pilhaClonada);
	}


	/* public PilhaE clone() throws CloneNotSupportedException{ //Copia profunda
		PilhaE pilhaClonada = (PilhaE) super.clone();
		return (pilhaClonada);
	}*/
	
}
