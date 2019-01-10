package autenticacao;
import java.util.Scanner;

public class AutenticacaoPorSenha implements IMetodoAutenticacao{

	private int codigo;
	private String nome;
	private String senha;	
	Scanner leitor = new Scanner(System.in);
	
	@Override
	public UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException{
		System.out.println("Digite o Codigo");
		this.codigo=leitor.nextInt();
		System.out.println("Digite o nome");
		this.nome=leitor.next();
		System.out.println("Digite a senha");
		this.senha=leitor.next();
		if (!senha.equals("1234")){
			throw new UsuarioNaoAutenticadoException();
		}
		return new UsuarioAutenticado(codigo, nome);
	}
}
