package fr.zuntini.platform;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class  AGList 
{
	private static File params ;
	private static File platlist;
	private static File aliases;
	private static ArrayList<String> platname;
	private static ArrayList<Platform> pl;

	
	public AGList ()
	{
		pl = new ArrayList<>();
		platname = new ArrayList<>();
		params = new File("./ressources/params.txt");
		platlist = new File("./ressources/Platlist");
		aliases = new File("./ressources/Aliases");
		
	}
	public static void add(Platform p)
	{
		pl.add(p);
		
	}
	public static Platform getPlat(String name)
	{
		for (Platform platform : pl) {
			if (platform.toString().equals(name))
				return platform;

		}
		return null;
	}
	public void launchGame (String name , String Pl)
	{
		for (Platform platform : pl) {
			if (platform.getName().equals(Pl))
				platform.LaunchGame(name);
		}
			 
	}

	public static File getParams() {
		return params;
	}
	public static ArrayList<Platform> getAllplatform() {return pl;}
	public static File getAliases() {return aliases;}

	public static ArrayList<String> getAllplatformName()
	{
		try (BufferedReader br = new BufferedReader(new FileReader(platlist)))
		{
			String st;
			while ((st = br.readLine()) != null)
			{
				{
					String[] key = st.split(";");
					System.out.print(key[0] + " = Key 0 ");
				platname.add(key[0]);
				}
			}
			return platname;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getkey(String name)
	{	
		try (BufferedReader br = new BufferedReader(new FileReader(platlist)))
		{
			  String st; 
			  while ((st = br.readLine()) != null) 
			  {
				  if (st.contains(name))
				  {
					  String[] key = st.split(";");
					  return (key[1]);
				  }
					  
			  }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String getdownloadlink(String name)
	{
		try (BufferedReader br = new BufferedReader(new FileReader(platlist)))
		{
			  String st; 
			  while ((st = br.readLine()) != null) 
			  {
				  if (st.contains(name))
				  {
					  String[] link = st.split(";");
					  return (link[2]);
				  }
					  
			  }

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
