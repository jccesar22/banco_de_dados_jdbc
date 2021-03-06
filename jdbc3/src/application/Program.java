package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			/*
			st = conn.prepareStatement(
					"INSERT INTO SELLER"
				   +"(Name, Email, BirthDate, BaseSalary, DepartmentId) "
				   +"VALUES "
				   +"(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			st.setString(1, "Call  Purpple");
			st.setString(2, "Call@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1955").getTime()));
			st.setDouble(4, 3000.00);
			st.setInt(5, 4);
			//para saber quantas linhas foram editadas
			 * */
			st = conn.prepareStatement("insert into department (Name) values ('D1'),('D2')", Statement.RETURN_GENERATED_KEYS);
			
			int rowsAffected = st.executeUpdate();
			
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done Id = "+ id);
				}
			}
			else {
				System.out.println("no rown affected");
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		finally {
			DB.closlStatement(st);
			DB.closeConnection();
			
		}
		
	}

}
