public class ManhoFilo{
	public static void main(String[] args){
		Fila fila1 = new Fila(3);
		fila1.enfileira("Comeco ");
		fila1.enfileira("do ");
		fila1.enfileira("teste.");
		fila1.enfileira("teste.");
		System.out.println(""+fila1.desenfileira()+fila1.desenfileira()+fila1.desenfileira()+fila1.desenfileira()+fila1.desenfileira());
	}
}
