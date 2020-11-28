/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edudeveloper
 */
import java.sql.SQLException;
import java.text.ParseException;

public class Teste {

	public static void main(String[] args) throws SQLException, ParseException {
		// Criando Funcionario
		Funcionario funcionario = new Funcionario("Eduardo Alexandre", "edudeveloperctk@gmail.com", "24/12/1984", "Developer" ,2000);

		// Funcionario DAO
		FuncionarioDAO dao = new FuncionarioDAO();
		dao.salvar(funcionario);
	}
}
