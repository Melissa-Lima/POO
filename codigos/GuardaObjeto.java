public class GuardaObjeto<T extends IDivide> {
	private T objeto;
	
	public void guarda(T objeto) {
		this.objeto = objeto;
	}
	
	public T get() {
		return this.objeto;
	}
}