package com.thamiris.ApiRestTest.conecta;

import java .sql.Connection;
import java.sql.SQLException;

public class teste {
	
	public static void main(String[]args) {
		
		try {
			Connection com = conecta.criarConexao();
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
