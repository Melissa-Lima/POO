package estrutura;

import objetos.Eletronico;

public class PilhaE implements Cloneable {

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
	
	public PilhaE clone() throws CloneNotSupportedException {
		//v1 return (PilhaAprimorada) super.clone();
		
		//v2
		PilhaE novaPilha = (PilhaE) super.clone();
		novaPilha.itens = this.itens.clone();
		for (int i = 0; i < novaPilha.itens.length; i++)
			if (novaPilha.itens[i] != null)
				novaPilha.itens[i] = this.itens[i].clone();
		return novaPilha;
		
	}
}
