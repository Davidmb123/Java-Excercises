import java.sql.*;
public class mysqlcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			String user="root";
			String pass="";
			String url="jdbc:mysql://localhost:3306";
			String database="alumnos";
			Connection con=DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/test","root","");
		PreparedStatement pst=(PreparedStatement) con.prepareStatement("Select * from alumnos");
			ResultSet rs=(ResultSet) pst.executeQuery();
		if(rs.next()) {  
		System.out.println("Si se logro la conexcion");
		}
		
		else {
			
			System.out.println("No se logro la conexion");
		}}
			
	catch(Exception e)
			{
				System.out.println(e);
				
			}  
			  
		}
	}