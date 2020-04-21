package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Model.Funcionario_model;

public class Funcionario_controller implements ActionListener{

	public JTextField textNome;
	public JTextField textMatricula;
	public Funcionario_model funcionario;

	public Funcionario_controller(JTextField textNome, JTextField textMatricula){
		this.textNome = textNome;
		this.textMatricula = textMatricula;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		switch(event.getActionCommand()) {
			case "Cadastrar": this.cadastrarFuncionario();
				break;
			case "Exibir": this.exibirFuncionario();
				break;
			case "Limpar": this.limparFuncionario();
				break;
			case "Sorteio": this.sorteio();
				break;
		}
	}

	private void cadastrarFuncionario() {
		System.out.println("Cadastrar!");
		funcionario = new Funcionario_model(textNome.getText(), Integer.parseInt(textMatricula.getText()));
		List lista = new ArrayList();
		lista.add(funcionario);
	}

	private void limparFuncionario() {
		System.out.println("Limpar!");
		textNome.setText("");
		textMatricula.setText("");
	}

	private void exibirFuncionario() {
		try {
			System.out.println("Exibir");
			this.textNome.setText(funcionario.getNome());
			this.textMatricula.setText(funcionario.getMatricula());
		}catch(NullPointerException exception) {
			JOptionPane.showMessageDialog(null, "Erro ao exibir funcionário Vazio, precisa de um funcionário!!");
		}
	}

	private void sorteio() {
		System.out.println("Sorteio");
	}
}
