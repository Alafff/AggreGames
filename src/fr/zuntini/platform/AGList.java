package fr.zuntini.platform;

import java.io.File;
import java.util.ArrayList;


public class  AGList 
{
	private static File params ;
	
	private static ArrayList<Platform> pl;
	
	
	public AGList ()
	{
		pl = new ArrayList<Platform>();
		params = new File("/ressources/params.txt");
		
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
	
}
