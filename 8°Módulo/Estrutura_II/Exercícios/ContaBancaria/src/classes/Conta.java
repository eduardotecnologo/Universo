package classes;

public class Conta {
	protected Cliente titular;
	protected double saldo;

	public Conta(Cliente titular) {
		this.titular = titular;
		this.saldo = 0;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	//Other Method
	public void depositar(double valor) {
		this.saldo += valor;
	}
	public void sacar(double valor) {
		if(valor <= this.saldo)
			this.saldo -= valor;
		else
			System.out.println("Saldo insuficiente");
	}
	
	@Override
	public String toString() {
		return "Conta:\n\t [Titular=" + titular + ", \n\t saldo=" + saldo + "]";
	}

}
