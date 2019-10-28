package fr.zuntini.main;


import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

import fr.zuntini.database.DAOAliases;
import fr.zuntini.fenetres.FenetrePrincipale;
import fr.zuntini.fenetres.LaunchWindow;
import fr.zuntini.platform.AGList;
import fr.zuntini.traitement.GetAliases;

class Debut
{
	private static AGList agList = new AGList();
	
	
	public static void main(String[] args)
	{
		boolean debug = false;

		File params = AGList.getParams();
		DAOAliases Daoa = new DAOAliases();
		GetAliases.dumpintofile(Daoa.getResultSet());
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

