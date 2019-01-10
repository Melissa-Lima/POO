package autenticacao;
import java.util.Scanner;

public class AutenticacaoPorSwipe implements IMetodoAutenticacao{
	
	private int codigo;
	private String nome;
	private String swipe;
	private String sequencia;
	
	Scanner leitor = new Scanner(System.in);
	
	@Override
	public UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException{
		System.out.println("Digite o codigo");
		this.codigo=leitor.nextInt();
		System.out.println("Digite o nome");
		this.nome=leitor.next();
		
		System.out.println("Digite a sequencia de swipe (xy)");
		System.out.println("  1  2  3\n");
		System.out.println("1 o  o  o\n");
		System.out.println("2 o  o  o\n");
		System.out.println("3 o  o  o\n");
		
		this.sequencia=leitor.next();
		if(!sequencia.equals("112233")){
			throw new UsuarioNaoAutenticadoException();
		}
		return new UsuarioAutenticado(codigo, nome);
	}
}
