package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class connection {
	Connection con=null;
	public static Connection dbConnector() {
		try {
			String url="jdbc:sqlite:item.db";
			Class.forName("org.sqlite.JDBC");
			Connection con= DriverManager.getConnection(url);
		return con;
	}catch(Exception e) {
		JOptionPane.showMessageDialog(null, e);
	}
		return null;
}
	public static PreparedStatement prepareStatement(String query) {
		// TODO Auto-generated method stub
		return null;
	}
}
