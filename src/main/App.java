package main;

import java.sql.SQLException;

import dao.*;

public class App 
{
	public static void main(String[] args) throws SQLException 
	{
		for (Client client : ClientDAO.CLientAll())
		{
			System.out.println(client.getId());
		}
		
		 
		
	}

}
