package estrutura;
import objetos.*;

public class PilhaGenericaEletronicos<T extends Eletronico> extends PilhaGenerica<T>{
	
	public PilhaGenericaEletronicos(int tamanhoMax){
		super(tamanhoMax);
	}
}
