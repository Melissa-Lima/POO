public class Monitor implements Cloneable {

	private String texto;
	
	public void imprimir() {
		System.out.println("[[" + texto + "]]");
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	@Override
	public Monitor clone() throws CloneNotSupportedException {
		return (Monitor) super.clone();
	}

}