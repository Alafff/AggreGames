package fr.zuntini.platform;

import java.util.ArrayList;
import java.util.List;

public class AGList 
{
	private static ArrayList<Platform> pl;
	
	public AGList ()
	{
		pl = new ArrayList<Platform>();
	}
	public void add(Platform p)
	{
		pl.add(p);
		
	}
	public ArrayList<String> getPlatList()
	{
		ArrayList<String> a = new ArrayList<String>();
		pl.stream().forEach(Platform -> a.add(Platform.toString()));
	
			return a;
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
}
