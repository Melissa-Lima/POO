package estrutura;

public class PilhaRecurso extends PilhaAprimorada implements AutoCloseable{

	public PilhaRecurso(int tamanhoMax){
		super(tamanhoMax);
	}
	
	@Override
	public void close(){
		for (int i=this.getTamanhoMax(); i>=0; i++){
			desempilha();
		}
	}
}
