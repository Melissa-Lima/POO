package autenticacao;

import java.util.Scanner;

public class AutenticacaoPorSwipe implements IMetodoAutenticacao {

	@Override	
	public UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException {
			Scanner leitor = new Scanner(System.in);

			System.out.println("Digite o codigo:");
			int codigo = leitor.nextInt();
			System.out.println("Digite o nome:");
			String nome = leitor.next();

			System.out.println("  1  2  3\n");
			System.out.println("1 o  o  o\n");
			System.out.println("2 o  o  o\n");
			System.out.println("3 o  o  o\n");

			System.out.println("Digite a sequencia de swipe(xy):");
			String sequencia = leitor.next();
			if (!sequencia.equals("112233"))
				throw new UsuarioNaoAutenticadoException();

			return new UsuarioAutenticado(codigo, nome);
		
	}

}
