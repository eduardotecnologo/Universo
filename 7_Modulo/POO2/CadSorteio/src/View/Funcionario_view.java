package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Controller.Funcionario_controller;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Funcionario_view extends JFrame {

	private JPanel contentPane;
	private JTextField NameTextField;
	private JTextField MatriculaTextField;

//Launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario_view frame = new Funcionario_view();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//Create the frame.
	public Funcionario_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		NameTextField = new JTextField();
		NameTextField.setBounds(151, 43, 143, 20);
		contentPane.add(NameTextField);
		NameTextField.setColumns(10);

		MatriculaTextField = new JTextField();
		MatriculaTextField.setBounds(151, 92, 143, 20);
		contentPane.add(MatriculaTextField);
		MatriculaTextField.setColumns(10);

		JLabel Nome = new JLabel("Nome:");
		Nome.setBounds(83, 46, 46, 14);
		contentPane.add(Nome);

		JLabel lblNewLabel = new JLabel("Matricula:");
		lblNewLabel.setBounds(83, 95, 58, 14);
		contentPane.add(lblNewLabel);

		JButton btnExibir = new JButton("Exibir");
		btnExibir.setBounds(47, 186, 89, 23);
		contentPane.add(btnExibir);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(168, 186, 89, 23);
		contentPane.add(btnLimpar);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(294, 186, 96, 23);
		contentPane.add(btnCadastrar);

		JButton btnSorteio = new JButton("Sorteio");
		btnSorteio.setBounds(168, 227, 89, 23);
		contentPane.add(btnSorteio);

		Funcionario_controller handler = new Funcionario_controller(NameTextField, MatriculaTextField);
		btnCadastrar.addActionListener(handler);
		btnLimpar.addActionListener(handler);
		btnExibir.addActionListener(handler);
		btnSorteio.addActionListener(handler);
	}
}
