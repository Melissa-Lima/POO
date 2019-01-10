public class Principal {

	public static void main(String[] args) {
		
		// clone
		try {
			PC p1 = new PC();
			p1.setTexto("UFABC");
			PC p2 = p1.clone();
			p2.setTexto("123");
			p1.mostraTela();
			p2.mostraTela();
		} catch (CloneNotSupportedException e) {
			System.out.println("Erro: " + e);
		}
		
		// Strategy
		IDivide pc1 = new ComputadorBom();
		IDivide pc2 = new ComputadorRuim();
		
		System.out.println(pc1.divide(4,2));
		System.out.println(pc2.divide(4,2));
		pc1 = new ComputadorRuim();
		System.out.println(pc1.divide(4,2));

		// Singleton
		CPD.getInstance().imprimir();
		
		// Generics
		GuardaObjeto<IDivide> g = new GuardaObjeto<IDivide>();
		g.guarda(pc1);
	}
	

}