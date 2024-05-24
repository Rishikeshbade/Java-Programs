package jdbcex;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentManagementSystem {

	Connection connection;
	PreparedStatement preparedStatement;
	Statement statement;
	ResultSet resultSet;

	public StudentManagementSystem() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("Connection get open");
	}

	public void insertStudentRecord(int rollNo, String name, String dob, String city, String email_id, String phoneNo,
			float percentage) throws SQLException {
		preparedStatement = connection.prepareStatement("insert into studentManageMent values(?,?,?,?,?,?,?)");
		preparedStatement.setInt(1, rollNo);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, dob);
		preparedStatement.setString(4, city);
		preparedStatement.setString(5, email_id);
		preparedStatement.setString(6, phoneNo);
		preparedStatement.setFloat(7, percentage);

		int n = preparedStatement.executeUpdate();
		System.out.println(n + " record is updated");
	}

	public void StudentDetails() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from studentManageMent ");
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("rollNo") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("dob") + "\t");
			System.out.print(resultSet.getString("city") + "\t");
			System.out.print(resultSet.getString("email_id") + "\t");
			System.out.print(resultSet.getString("phone_No") + "\t");
			System.out.print(resultSet.getFloat("percentage") + "\t");
			System.out.println();
		}
	}

	public void getStudentByCity(String city) throws SQLException {
		preparedStatement = connection.prepareStatement("select * from studentManageMent where city = ? ");
		preparedStatement.setString(1, city);

		resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("rollNo") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("dob") + "\t");
			System.out.print(resultSet.getString("city") + "\t");
			System.out.print(resultSet.getString("email_id") + "\t");
			System.out.print(resultSet.getString("phone_No") + "\t");
			System.out.print(resultSet.getFloat("percentage") + "\t");
			System.out.println();
		}
	}

	public void UpdateStudentByRollNo(int rollNo, String name, String dob, String city, String email_id, String phoneNo,
			float percentage) throws SQLException {
		preparedStatement = connection.prepareStatement("update studentManageMent  set name=?, dob=?, city=?, email_id=?, phone_No=?, percentage=? where rollNo =?");
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, dob);
		preparedStatement.setString(3, city);
		preparedStatement.setString(4, email_id);
		preparedStatement.setString(5, phoneNo);
		preparedStatement.setFloat(6, percentage);
		preparedStatement.setInt(7, rollNo);

		int n = preparedStatement.executeUpdate();
		System.out.println(n + " Record is updated");

	}

	public void deleteStudentByRollNo(int rollNo) throws SQLException {
		preparedStatement = connection.prepareStatement("delete from studentManageMent where rollno = ?");
		preparedStatement.setInt(1, rollNo);

		int n = preparedStatement.executeUpdate();
		System.out.println(n + " Record is deleted");
	}

	public void SearchStudentByPercentage(float minPercentage, float maxPercentage) throws SQLException {
		preparedStatement = connection.prepareStatement("select * from studentManageMent  where percentage between ? and ?");
		preparedStatement.setFloat(1, minPercentage);
		preparedStatement.setFloat(2, maxPercentage);
		resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("rollNo") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("dob") + "\t");
			System.out.print(resultSet.getString("city") + "\t");
			System.out.print(resultSet.getString("email_id") + "\t");
			System.out.print(resultSet.getString("phone_No") + "\t");
			System.out.print(resultSet.getFloat("percentage") + "\t");
			System.out.println();
		}

	}
	
	public void DetailsofFirstRank() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from  studentManageMent order by percentage desc limit 1  ");
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("rollNo") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("dob") + "\t");
			System.out.print(resultSet.getString("city") + "\t");
			System.out.print(resultSet.getString("email_id") + "\t");
			System.out.print(resultSet.getString("phone_No") + "\t");
			System.out.print(resultSet.getFloat("percentage") + "\t");
			System.out.println();
		}
	}
	
	
	
	public void searchStudentByRollNo(int rollNo) throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from studentManageMent WHERE rollNo = "+rollNo );
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("rollNo") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("dob") + "\t");
			System.out.print(resultSet.getString("city") + "\t");
			System.out.print(resultSet.getString("email_id") + "\t");
			System.out.print(resultSet.getString("phone_No") + "\t");
			System.out.print(resultSet.getFloat("percentage") + "\t");
			System.out.println();
		}
		
	}
	
	public void SortStudentByAsc() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from studentManageMent order by percentage Asc");
		while(resultSet.next()) {
			System.out.print(resultSet.getInt("rollNo") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("dob") + "\t");
			System.out.print(resultSet.getString("city") + "\t");
			System.out.print(resultSet.getString("email_id") + "\t");
			System.out.print(resultSet.getString("phone_No") + "\t");
			System.out.print(resultSet.getFloat("percentage") + "\t");
			System.out.println();
		}
		
	}
	
	public void DisplaySameCity() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from studentManageMent s1, studentManageMent s2 where s1.city = s2.city and s1.rollNo != s2.rollNo");
		while(resultSet.next()) {
			System.out.print(resultSet.getInt("rollNo") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("dob") + "\t");
			System.out.print(resultSet.getString("city") + "\t");
			System.out.print(resultSet.getString("email_id") + "\t");
			System.out.print(resultSet.getString("phone_No") + "\t");
			System.out.print(resultSet.getFloat("percentage") + "\t");
			System.out.println();
		}
	}
	
	
	

	public void close() throws SQLException {
		connection.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentManagementSystem obj = new StudentManagementSystem();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("Choose an Option");
			System.out.println("1. Insert Student Record");
			System.out.println("2. Display Student Details");
			System.out.println("3. Get Student By City");
			System.out.println("4. Update Student By RollNo");
			System.out.println("5. Delete Student By RollNo");
			System.out.println("6. Student Retrive By Range");
			System.out.println("7. Details of First Rank");
			System.out.println("8. Search Student By RollNo");
			System.out.println("9. Sort Student By Ascending Order");
			System.out.println("10. Display Same City");
			System.out.println("11. Exit");
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();
			
			
			switch (choice) {
			case 1:
				System.out.println("Enter Roll Number : ");
				int rollNo = sc.nextInt();
				System.out.println("Enter Student Name : ");
				String name = sc.next();
				System.out.println("Enter Date of Birth : ");
				String dob = sc.next();
				System.out.println("Enter Student City  : ");
				String city = sc.next();
				System.out.println("Enter Email Id : ");
				String email = sc.next();
				System.out.println("Enter Phone Number : ");
				String phone = sc.next();
				System.out.println("Enter Student Percentage : ");
				float percentage = sc.nextFloat();
				obj.insertStudentRecord(rollNo, name, dob, city, email, phone, percentage);
				break;
			case 2:
				obj.StudentDetails();
				break;
			case 3:
				System.out.println("Enter Student City : ");
				String city1 = sc.next();
				obj.getStudentByCity(city1);
				break;
			case 4:
				System.out.println("Enter Roll Number : ");
				int rollNo1 = sc.nextInt();
				System.out.println("Enter Student Name : ");
				String name1 = sc.next();
				System.out.println("Enter Date of Birth : ");
				String dob1 = sc.next();
				System.out.println("Enter Student City  : ");
				String city2 = sc.next();
				System.out.println("Enter Email Id : ");
				String email1 = sc.next();
				System.out.println("Enter Phone Number : ");
				String phone1 = sc.next();
				System.out.println("Enter Student Percentage : ");
				float percentage1 = sc.nextFloat();
				obj.UpdateStudentByRollNo(rollNo1, name1, dob1, city2, email1, phone1, percentage1);
				break;
			case 5:
				System.out.println("Enter Student Roll Numner : ");
				int rollNumber = sc.nextInt();
				obj.deleteStudentByRollNo(rollNumber);
				break;
			case 6:
				System.out.println("Enter Minimum Percentage : ");
				float minpercent = sc.nextFloat();
				System.out.println("Enter Maximum Percentage : ");
				float maxpercent = sc.nextFloat();
				obj.SearchStudentByPercentage(minpercent, maxpercent);
				break;
			case 7:
				obj.DetailsofFirstRank();
				break;
			case 8:
				System.out.println("Enter Student Roll Number : ");
				int roll = sc.nextInt();
				obj.searchStudentByRollNo(roll);
				break;
			case 9:
				obj.SortStudentByAsc();
				break;
			case 10:
				obj.DisplaySameCity();
				break;
			case 11:
				System.out.println("Exiting....");
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}while (choice != 11);
			
			obj.close();
		}
	
	}


