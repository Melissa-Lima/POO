public class SaldoInsuficienteException extends Exception{
	private int saldoTotal;
	
	public SaldoInsuficienteException(int saldoTotal){
		//super("Saldo indisponivel para saque");
		this.saldoTotal=saldoTotal;
	}
	
	public int getSaldo(){
		return(this.saldoTotal);
	}
	
	@Override
	public String getMessage(){
		return("Voce nao tem saldo o suficiente para realizar esta operacao.");
	}
}
