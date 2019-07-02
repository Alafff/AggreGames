package fr.zuntini.platform;

import java.io.File;
import java.util.ArrayList;

import fr.zuntini.game.*;;

public class OriginPlat extends Platform 
{

	public OriginPlat(String path) 
	{
		super("Origin", path);
		
	}

	@Override
	public ArrayList<Game> makelist() 
	{
		return glist;
		
	}

	
	public void LaunchGame() {
		
		
	}

	

	@Override
	public ArrayList<Game> ftmakelist(File rep) 
	{
		
		return null;
	}

	@Override
	public String getinstallerlink() {
		
		return null;
	}

}
