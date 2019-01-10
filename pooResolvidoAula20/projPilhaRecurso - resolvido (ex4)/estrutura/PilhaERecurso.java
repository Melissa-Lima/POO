package estrutura;

public class PilhaERecurso extends PilhaE implements AutoCloseable {

	public PilhaERecurso(int tamanhoMax) {
		super(tamanhoMax);
	}

	@Override
	public void close() {
		int qtd = 0;
		try {
			while (desempilha() != null)
				qtd++;
		} catch (PilhaVaziaException e) {
			System.out.println("Pilha foi esvaziada! Tinha " + qtd + " itens.");
		}
	}

}