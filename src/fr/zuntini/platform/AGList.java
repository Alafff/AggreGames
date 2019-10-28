package fr.zuntini.platform;

import fr.zuntini.game.Game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;


public class  AGList 
{
	private static File params ;
	private static File platlist;
	private static ArrayList<String> platname;
	private static ArrayList<Platform> pl;

	
	public AGList ()
	{
		pl = new ArrayList<Platform>();
		platname = new ArrayList<String>();
		params = new File("./ressources/params.txt");
		platlist = new File("./ressources/Platlist");
		
	}
	public static void add(Platform p)
	{
		pl.add(p);
		
	}
	public static Platform getPlat(String name)
	{
		for (int i = 0;i < pl.size();i++)
		{
			if (pl.get(i).toString().equals(name))
					return pl.get(i);
			
		}
		return null;
	}
	public void launchGame (String name , String Pl)
	{
		 for (int i = 0;i < pl.size(); i++)
		 {
			 if(pl.get(i).getName().equals(Pl))
				 pl.get(i).LaunchGame(name);
		 }
			 
	}
	public void initialize()
	{
		
	}
	public static File getParams() {
		return params;
	}
	public static ArrayList<Platform> getAllplatform() {return pl;}
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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}
}
