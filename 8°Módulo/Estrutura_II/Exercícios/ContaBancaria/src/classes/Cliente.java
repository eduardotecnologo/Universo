package classes;

public class Cliente extends Pessoa{
	private String tipoEmprego;
	private double renda;
	
	public Cliente(String cpf, String nome, Endereco end, String tipoEmprego, double renda) {
		super(cpf, nome, end);
		this.tipoEmprego = tipoEmprego;
		this.renda = renda;
	}
	
	@Override
	public String toString() {
		return "Cliente:"+super.toString()+" [tipoEmprego=" + tipoEmprego + ", renda=" + renda + "]";
	}
}
