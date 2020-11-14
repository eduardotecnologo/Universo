/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edudeveloper
 */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Funcionario {

	private String nome;
	private String email;
	private java.sql.Date dataNascimento;
	private String cargo;
	private double salarioBase;

	// Método construtor Funcionario
	public Funcionario(String nome, String email, String dataNascimento, String cargo, double salarioBase) throws ParseException {
		this.nome = nome;
		this.email = email;
		this.dataNascimento = converttoData(dataNascimento);
		this.cargo = cargo;
		this.salarioBase = salarioBase;
	}
	
	//Get e Set de Funcionario
	public String getNome() {
		return nome;}

	public void setNome(String nome) {
		this.nome = nome;}

	public String getEmail() {
		return email;}

	public void setEmail(String email) {
		this.email = email;}

	public java.sql.Date getDataNascimento() {
		return dataNascimento;}

	public void setDataNascimento(java.sql.Date dataNascimento) {
		this.dataNascimento = dataNascimento;}

	public String getCargo() {
		return cargo;}

	public void setCargo(String cargo) {
		this.cargo = cargo;}

	public double getSalarioBase() {
		return salarioBase;}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;}
	
	// Convertendo String para Data
	public java.sql.Date converttoData(String dataNascimento) throws ParseException {
    	DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy"); 
    	java.sql.Date data = new java.sql.Date(fmt.parse(dataNascimento).getTime());
    	return data;
	}
	
}

