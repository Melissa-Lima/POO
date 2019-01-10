public class Fila{
	
	private Object[] fila;
	private int comeco;
	private int fim;
	private int tamanho;
	
	public Fila(int tamanho){
		this.fila=new Object[tamanho];
		this.tamanho=tamanho;
		this.fim=0;
		this.comeco=0;
	}
	
	public void enfileira(Object objeto){
		if (fila[fim]==null){
			fila[fim]=objeto;
			fim=(fim+1)%getTamanho();
		}
		else{
			System.out.println("erro 1");
		}
	}
	
	public Object desenfileira(){
		if (fila[comeco]!=null){
			Object objeto=fila[comeco];
			fila[comeco]=null;
			comeco=(comeco+1)%getTamanho();
			return (objeto);
		}
		else{
			return ("erro ");
		}
	}
	
	public int getInicio(){
		return (this.comeco);
	}
	
	public int getFim(){
		return (this.fim);
	}
	
	public int getTamanho(){
		return (this.tamanho);
	}
}
