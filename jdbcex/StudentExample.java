package jdbcex;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentExample {
	
	Connection connection;
	PreparedStatement preparedStatement;
	Statement statement;
	ResultSet resultSet;
	
	public StudentExample() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("Connection get open");
	}
	
	public void RetriveByRange(float minPercentage, float maxPercentage) throws SQLException {
		preparedStatement = connection.prepareStatement("select * from student where percentage between ? and ?");
		preparedStatement.setFloat(1, minPercentage);
		preparedStatement.setFloat(2, maxPercentage);
		resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.print(resultSet.getInt("id")+"\t");
			System.out.print(resultSet.getString("name")+"\t");
			System.out.print(resultSet.getString("phone_no")+"\t");
			System.out.print(resultSet.getDate("dob")+"\t");
			System.out.print(resultSet.getString("city")+"\t");
			System.out.print(resultSet.getFloat("percentage")+"\t");
			System.out.println();
		}
	}
	
	public void insertStudent(int id, String name, String phoneNo, String dob, String city, float percentage) throws SQLException {
		preparedStatement = connection.prepareStatement("insert into student values(?,?,?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, phoneNo);
		preparedStatement.setString(4, dob );
		preparedStatement.setString(5, city);
		preparedStatement.setFloat(6, percentage);
		
		
		int n = preparedStatement.executeUpdate();
		System.out.println(n+" record is inserted");
	}
	
	public void UpdtaeById(int id, String name, String phoneNo, String dob, String city, float percentage) throws SQLException {
		preparedStatement = connection.prepareStatement("update student set name=?, phone_No=?, dob=?, city=?, percentage=? where id =?");
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, phoneNo);
		preparedStatement.setDate(3,Date.valueOf(dob));
		preparedStatement.setString(4, city);
		preparedStatement.setFloat(5, percentage);
		preparedStatement.setInt(6, id);
		
		
		int n = preparedStatement.executeUpdate();
		System.out.println(n+" record is updated");
	}
	
	public void deleteRecordById(int id) throws SQLException {
		preparedStatement = connection.prepareStatement("delete from student where id = ?");
		preparedStatement.setInt(1, id);
		
		int n = preparedStatement.executeUpdate();
		System.out.println(n+" record is deleted");
	}
	
	public void SortByAscOrder() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from student order by percentage Asc");
		while(resultSet.next()) {
			System.out.print(resultSet.getInt("id")+"\t");
			System.out.print(resultSet.getString("name")+"\t");
			System.out.print(resultSet.getString("phone_no")+"\t");
			System.out.print(resultSet.getDate("dob")+"\t");
			System.out.print(resultSet.getString("city")+"\t");
			System.out.print(resultSet.getFloat("percentage")+"\t");
			System.out.println();
		}
		
	}
	
	public void close() throws SQLException {
		connection.close();
	}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentExample obj = new StudentExample();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("Choose an Option");
			System.out.println("1. Retrive by Range");
			System.out.println("2. Insert Student");
			System.out.println("3. Update by Id");
			System.out.println("4. Delete Record by Id");
			System.out.println("5. Sort by Ascending Order");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter Minimum Percentage: ");
				float minPercentage = sc.nextFloat();
				System.out.println("Enter maximum Percentage: ");
				float maxPercentage = sc.nextFloat();
				obj.RetriveByRange(minPercentage, maxPercentage);
				break;
			case 2:
				System.out.println("Enter Student Details.....");
				System.out.println("Enter Student ID: ");
				int id = sc.nextInt();
				System.out.println("Enter Student Name: ");
				String name = sc.next();
				System.out.println("Enter Student Phone Number: ");
				String phoneNo = sc.next();
				System.out.println("Enter Student Date of Birth: ");
				String dob = sc.next();
				System.out.println("Enter Student city: ");
				String city = sc.next();
				System.out.println("Enter Student Percentage: ");
				float percent = sc.nextFloat();
				obj.insertStudent(id, name, phoneNo, dob, city, percent);
				break;
			case 3:
				System.out.println("Enter Student Details.....");
				System.out.println("Enter Student ID: ");
				int id1 = sc.nextInt();
				System.out.println("Enter Student Name: ");
				String name1 = sc.next();
				System.out.println("Enter Student Phone Number: ");
				String phoneNo1 = sc.next();
				System.out.println("Enter Student Date of Birth: ");
				String dob1 = sc.next();
				System.out.println("Enter Student city: ");
				String city1= sc.next();
				System.out.println("Enter Student Percentage: ");
				float percent1 = sc.nextFloat();
				obj.UpdtaeById(id1, name1, phoneNo1, dob1, city1, percent1);
				break;
			case 4:
				System.out.println("Enter Student ID: ");
				int id2 = sc.nextInt();
				obj.deleteRecordById(105);
				break;
			case 5:
				obj.SortByAscOrder();
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}while (choice != 6);
		
		}
				
}
