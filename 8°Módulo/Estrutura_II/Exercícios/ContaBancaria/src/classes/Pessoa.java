package classes;

	public abstract class Pessoa{
		protected String cpf;
		protected String nome;
		protected Endereco endereco;
		
		public Pessoa(String cpf, String nome, Endereco end) {
			this.cpf = cpf;
			this.nome = nome;
			this.endereco = end;
	}
		public String getCpf() {
			return cpf;
		}
		public void setCpg(String cpf) {
			this.cpf = cpf;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Endereco getEndereco() {
			return endereco;
		}
		public void setEndereco(Endereco end) {
			this.endereco = end;
		}
		
		@Override
		public String toString() {
			return "cpf:" + cpf + ", nome: "+ nome + ", endereco:" + endereco + "]";
		}

}
