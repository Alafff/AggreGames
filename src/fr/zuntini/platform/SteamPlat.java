package fr.zuntini.platform;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;

import fr.zuntini.listmaking.Game;

public class SteamPlat extends Platform {
	
	
	private ArrayList <Game> g;
	
	public SteamPlat(String name, String path) {
		super(name, path);
	
	}

	@Override
	public ArrayList<Game> makelist() 
	{
		g = new ArrayList <Game>();
		
		this.path = "D:\\Program Files (x86)\\Steam\\steam.exe";
		String[] a = this.path.split("steam.exe");
		File p = new File(a[0]);
		a = null;
		File[] f = p.listFiles();
		System.out.println(p.isDirectory());
			
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LaunchGame() {
		// TODO Auto-generated method stub
		
	}
	
}
