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
	
	public void initialize()
	{
		
	}
}
