public class CPD {
	
	private static CPD instance;
	
	private CPD() {		
	}
	
	public static CPD getInstance() {
		if (instance == null)
			instance = new CPD();
		return instance;
	}
	
	public void imprimir() {
		System.out.println("CPD");
	}
}