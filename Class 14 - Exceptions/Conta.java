public class Conta{
	private String nome;
	private int saldo;
	private int limite;
	
	public Conta(String nome){
		this.nome=nome;
		this.saldo=0;
	}
	
	public void depositar(int valorDeposito){
		this.saldo=saldo+valorDeposito;
	}
	
	public void setLimite(int limite){
		this.limite=limite;
	}
	
	public void sacar(int valorSaque) throws SaldoInsuficienteException {
		if (this.limite+this.saldo<valorSaque){
			throw new SaldoInsuficienteException(saldo+limite) ;
		}
			this.saldo=saldo-valorSaque;
	}
	
	@Override
	public String toString(){
		return(this.nome+": "+this.saldo);
	}
	
}
