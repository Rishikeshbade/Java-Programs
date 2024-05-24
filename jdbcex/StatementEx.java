package jdbcex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementEx {
	
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	
	public StatementEx() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("connection");
	}
	
	public void getCustomer() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from Customer ");
		while(resultSet.next()) {
			System.out.print(resultSet.getInt("custId")+"\t");
			System.out.print(resultSet.getString("custName")+"\t");
			System.out.print(resultSet.getString("custAdd")+"\t");
			System.out.print(resultSet.getString("phone_No")+"\t");
			System.out.println();
		}
	}  
	
	public void getCustomerById(int id) throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from Customer WHERE custId = "+id );
		while(resultSet.next()) {
			System.out.print(resultSet.getInt("custId")+"\t");
			System.out.print(resultSet.getString("custName")+"\t");
			System.out.print(resultSet.getString("custAdd")+"\t");
			System.out.print(resultSet.getString("phone_No")+"\t");
			System.out.println();
		}
	}
	
	
	
	public void close() throws SQLException {
		connection.close();
	}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StatementEx obj = new StatementEx();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		obj.getCustomer();
		obj.getCustomerById(i);
		obj.close();
		

	}

}
