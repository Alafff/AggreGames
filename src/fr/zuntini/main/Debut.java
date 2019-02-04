package fr.zuntini.main;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import fr.external.code.WindowsRegistry;
import fr.zuntini.fenetres.FenetrePrincipale;
import fr.zuntini.fenetres.LaunchWindow;
import fr.zuntini.platform.SteamPlat;

public class Debut 
{
	private static File f ;
	private static BufferedReader br;
	
	public static void main(String[] args)
	{
		
		try 
		{
			f = new File("params.txt");
			if (!f.exists())
				f.createNewFile();
			BufferedReader br;

			br = new BufferedReader(new FileReader(f));

			if ( br.readLine() != null)
				new FenetrePrincipale();
			else
				/* LaunchWindow lw =*/  new LaunchWindow(f);
			br.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();	
		}
		//SteamPlat a = new SteamPlat("Steam", new WindowsRegistry().testKey2("Steam"));
		//SteamPlat a = new SteamPlat("Steam","D:\\Program Files (x86)\\Steam\\steam.exe" );
		//a.execplat();;
		
	}
	
}

