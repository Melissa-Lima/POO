public class Treino {

	public static void main(String[] args) {
		
		ICobrador cobrador;
		IGoleiro goleiro;

		if (args[0].equals("P"))
			cobrador = new CobradorPessoa("Saul");
		else
			cobrador = new CobradorComputador();

		if (args[1].equals("P"))
			goleiro = new GoleiroPessoa("Paulo");
		else
			goleiro = new GoleiroComputador();

		Penalty p = new Penalty(goleiro, cobrador);
		
		int acertosCobrador = 0;
		int defesas = 0;
		
		for (int i = 0; i < 3; i++)
			if (p.cobrar())
				acertosCobrador++;
			else
				defesas++;
			
		System.out.println("[" + ((Jogador) cobrador).getNome() + "] Gols = " + acertosCobrador 
						+ "  [" + ((Jogador) goleiro).getNome() + "] Defesas = " + defesas);
	}

}
