package com.thamiris.ApiRestTest.conecta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conecta {
	
	static final String URL = "jdbc:postgresql://localhost:5432//postgres";
	static final String USER = "postgres";
	static final String PASS = "010913";
	
	public static Connection criarConexao()throws ClassCastException, SQLException, ClassNotFoundException{
		Class.forName("orgpostgresql.Driver");
		Connection conecta = DriverManager.getConnection(URL, USER, PASS);
		if (conecta != null) {
			System.out.print("Conexão efetuada com sucesso");
			return conecta;
		}
	return null;}

	public static Connection criarConexao1() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
