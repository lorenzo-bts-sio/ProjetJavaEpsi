import java.sql.SQLException;

public class App 
{
	public static void main(String[] args) throws SQLException 
	{
		ConnectionSGBD connection = new ConnectionSGBD(); 
		for (Client client : connection.connect())
		{
			if (client.getId() == 2)
				System.out.println(client.getPrenom());
			
		}
		
		
		
		
		
		 
		
	}

}
