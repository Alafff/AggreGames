package fr.zuntini.main;


import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

import fr.zuntini.fenetres.FenetrePrincipale;
import fr.zuntini.fenetres.LaunchWindow;
import fr.zuntini.platform.AGList;
import fr.zuntini.traitement.Loading;

public class Debut 
{
	private static File params ;
	private static AGList agList = new AGList();
	
	
	public static void main(String[] args)
	{
		boolean debug = false;
		
		params = AGList.getParams();
		if (!debug)
		{
			try 
			{
				
				if (!params.exists())
				{	
					params.createNewFile();
				}
					BufferedReader br;	
				br = new BufferedReader(new FileReader(params));
				
				if ( br.readLine() != null)
				{
				
					new FenetrePrincipale();
				}
				else
				
					   new LaunchWindow();
					 
				br.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();	
			}
		}
		else
			new LaunchWindow();
	}
	
}

