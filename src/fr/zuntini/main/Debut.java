package fr.zuntini.main;


import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

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
	private static BufferedReader br;
	private static AGList agList = new AGList();
	
	public static void main(String[] args)
	{
		boolean test = true;
		
		if (test)
		{
			try 
			{
				params = new File("params.txt");
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
		/*agList.add(new SteamPlat("Steam", new WindowsRegistry().testKey2("Steam")));
		agList.add(new EpicStorePlat("EpicStore", new WindowsRegistry().testKey2("Steam")));
		*/
		//System.out.println(agList.getPlatList());

		
	}
	
}

