import java.sql.*;

public class mysqlcon {
	// TODO Auto-generated method stub
	public static void main(String[] args) throws Throwable  {

		{
			{
				Class.forName("com.mysql.jdbc.Driver");
				String user = "root";
				String pass = "";
				String url = "jdbc:mysql://localhost:3306";
				String database = "test";
				Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "");

				try {
				
					PreparedStatement pst = (PreparedStatement) con.prepareStatement("Select * from alumnos");
					ResultSet rs = (ResultSet) pst.executeQuery();
					if (rs.next()) {
						System.out.println("Si se logro la conexcion");

					}

					else {

						System.out.println("No se logro la conexion");
					}
				}

				catch (Exception e) {
					System.out.println(e);

				}
				String query="Insert into alumnos values ('Carlos Sandez','e009678',18)";
				try {
					PreparedStatement statement= con.prepareStatement(query);
					statement.execute();
					System.out.println("Insercion con exito");
					
				}catch(SQLException e) {
					e.printStackTrace();
				}
				
				
			}
		}
	}
}
