package fr.zuntini.platform;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import fr.zuntini.listmaking.Game;

//Initialize and Stock All Platforms used in the list of params
public abstract class Platform 
{
	
	protected String name;
	protected String path;
	protected ArrayList<Game> glist;
	
	public Platform (String name , String path)
	{
		this.name = name;
		this.path = path;
	}
	
	public abstract ArrayList<Game> makelist(); // Get a list of all the games of the platform and send it back
	public abstract  void LaunchGame();
	
	public void execplat()
	{
		try {
			Desktop.getDesktop().open( new File(this.path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addgame(Game g)
	{
		glist.add(g);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public ArrayList<Game> getGlist() {
		return glist;
	}

	public void setGlist(ArrayList<Game> glist) {
		this.glist = glist;
	}
}
