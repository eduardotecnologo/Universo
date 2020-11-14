/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edudeveloper
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {

	public Connection conexao;
	
	public FuncionarioDAO() throws SQLException {		
		// Conexão com Banco de Dados
		String usuario = "root";
		String senha = "root";
		String linkbanco = "jdbc:mysql://localhost:3306/empresa";
		
		conexao = DriverManager.getConnection(linkbanco, usuario, senha);
		System.out.println("Success Conect");	
	}
	
	// Salvando dados de Funcionário no Banco
	public boolean salvar(Funcionario funcionario) throws SQLException {
		
		String sql = "INSERT INTO funcionario (nome, email, dataNascimento, cargo, salarioBase) VALUES (?,?,?,?,?)";
		PreparedStatement pr = null;

		try {
			pr = conexao.prepareStatement(sql);
			pr.setString(1, funcionario.getNome());
			pr.setString(2, funcionario.getEmail());
			pr.setDate(3, funcionario.getDataNascimento());
			pr.setString(4, funcionario.getCargo());
			pr.setDouble(5, funcionario.getSalarioBase());
			pr.executeUpdate(); 
			return true;
			
		}catch(SQLException erro) {
			// Mostrar error
			System.err.println("Erro: "+ erro);
			
			return false;
			
		}finally{
			// Fim da Conexão
			conexao.close();
		}
		
	}
}

