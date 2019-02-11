package fr.zuntini.main;


import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

import fr.external.code.WindowsRegistry;
import fr.zuntini.fenetres.FenetrePrincipale;
import fr.zuntini.fenetres.LaunchWindow;
import fr.zuntini.platform.AGList;
import fr.zuntini.platform.EpicStorePlat;
import fr.zuntini.platform.SteamPlat;
import fr.zuntini.traitement.Loading;

public class Debut 
{
	private static File params ;
	private static AGList agList = new AGList();
	
	public static void main(String[] args)
	{
		boolean normal = true;
		
		params = new File("params.txt");
		
		if (normal)
		{
			try 
			{
				
				if (!params.exists())
					params.createNewFile();
				BufferedReader br;	
				br = new BufferedReader(new FileReader(params));
				
				if ( br.readLine() != null)
				{
				
					Loading.loading(params);
					new FenetrePrincipale();
				}
				else
					/* LaunchWindow lw =*/  new LaunchWindow(params);
				br.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();	
			}
		}
		else
			new LaunchWindow(params);
		//AGList.add(new SteamPlat(WindowsRegistry.testKey2("Steam")));
		//AGList.add(new EpicStorePlat(WindowsRegistry.testKey2("Steam")));
		
		//System.out.println(agList.getPlatList());

		
	}
	
}

