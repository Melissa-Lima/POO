package autenticacao;

import java.util.Scanner;

public class AutenticacaoPorSenha implements IMetodoAutenticacao {

	@Override	
	public UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException {
			Scanner leitor = new Scanner(System.in);

			System.out.println("Digite o codigo:");
			int codigo = leitor.nextInt();
			System.out.println("Digite o nome:");
			String nome = leitor.next();
			System.out.println("Digite a SENHA:");
			String senha = leitor.next();

			if (!senha.equals("1234"))
				throw new UsuarioNaoAutenticadoException();

			return new UsuarioAutenticado(codigo, nome);
		
	}

}
