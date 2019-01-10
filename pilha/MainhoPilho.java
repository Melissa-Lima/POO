
public class MainhoPilho{
	public static void main(String[] args){
		try{
			Pilha pilhoni = new Pilha(5);
			try{
				
				pilhoni.empilha("!");
				pilhoni.empilha("desu ");
				pilhoni.empilha("roxinho ");
				pilhoni.empilha("pilhoni ");
				pilhoni.empilha("Disk ");
				System.out.println(""+pilhoni.desempilha()+pilhoni.desempilha()+pilhoni.desempilha()+pilhoni.desempilha()+pilhoni.desempilha());
				pilhoni.empilha("!");
				pilhoni.empilha("desu ");
				pilhoni.empilha("roxinho ");
				pilhoni.empilha("pilhoni ");
				pilhoni.empilha("Disk ");
				pilhoni.empilha("ihhhh...");
				}finally{
					System.out.println(""+pilhoni.desempilha()+pilhoni.desempilha()+pilhoni.desempilha()+pilhoni.desempilha()
					+pilhoni.desempilha()+pilhoni.desempilha()+pilhoni.desempilha()+pilhoni.desempilha()+pilhoni.desempilha());
				}
		}catch (ExcecaoPilhaCheia e){
			System.out.println("" + e.toString());
		}catch (ExcecaoPilhaVazia e){
			System.out.println("" + e.toString());
		}
	}
}
