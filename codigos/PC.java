public class PC implements Cloneable {

	private Monitor m = new Monitor();
	
	public void mostraTela() {
		m.imprimir();
	}
	
	public void setTexto(String texto) {
		m.setTexto(texto);
	}
	
	@Override
	public PC clone() throws CloneNotSupportedException {
		PC novoPC = (PC) super.clone();
		novoPC.m = this.m.clone();
		return novoPC;
	}

}