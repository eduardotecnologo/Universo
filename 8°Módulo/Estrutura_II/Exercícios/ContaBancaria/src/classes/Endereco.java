package classes;

public class Endereco {
	private String logradouro;
	private String nome;
	private String complemento;
	private int numero;

	public Endereco(String logradouro, String nome, int numero,String complemento) {
		this.logradouro = logradouro;
		this.nome = nome;
		this.complemento = complemento;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "[" + logradouro + " " + nome + " #" + numero + ", omplemento: " + complemento + "]";
	}

}
