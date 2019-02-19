package fr.zuntini.platform;

import java.io.File;
import java.util.ArrayList;

import fr.zuntini.game.*;;

public class OriginPlat extends Platform 
{

	public OriginPlat(String path) 
	{
		super("Origin", path);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Game> makelist() 
	{
		return glist;
		
	}

	
	public void LaunchGame() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public ArrayList<Game> ftmakelist(File rep) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getinstallerlink() {
		// TODO Auto-generated method stub
		return null;
	}

}
