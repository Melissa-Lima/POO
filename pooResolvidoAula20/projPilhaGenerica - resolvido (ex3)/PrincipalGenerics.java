import estrutura.PilhaGenericaEletronicos;
import estrutura.PilhaCheiaException;
import estrutura.PilhaVaziaException;
import objetos.*;

public class PrincipalGenerics {

	public static void main(String[] args) {
	
		try {
			Eletronico tablet = new Tablet("1234");
			Eletronico notebook1 = new Notebook("5678", 2);
			Eletronico notebook2 = new Notebook("0000", 25);
			
			PilhaGenericaEletronicos<Eletronico> p1 = new PilhaGenericaEletronicos<Eletronico>(10); // Esta pilha armazena somente eletronicos
			p1.empilha(tablet);
			p1.empilha(notebook1);
			p1.empilha(notebook2);
			
			/* // Esta parte nao compila mais, pois String nao eh subclasse de Eletronico
			PilhaGenericaEletronicos<String> p2 = new PilhaGenericaEletronicos<String>(12); // Esta pilha armazena somente strings
			p2.empilha("ABC");
			p2.empilha("DEF");
			p2.empilha("GHI");*/ //
			
			for (int i = 0; i < 3; i++)
				System.out.println("Item P1: " + p1.desempilha());
			
			/*System.out.println();
			for (int i = 0; i < 6; i++)
				System.out.println("Item P2: " + p2.desempilha());*/
			
		} catch (PilhaCheiaException e) {
			System.out.println("Pilha esta cheia!");
		} catch (PilhaVaziaException e) {
			System.out.println("Pilha esta vazia!");
		} catch (Exception e) {
			System.out.println("Outro erro: " + e);
		}
	}

}