package fr.zuntini.game;

import java.io.File;
import java.util.ArrayList;

import javax.swing.tree.DefaultMutableTreeNode;

public class Game extends DefaultMutableTreeNode {

	private int appid; // Id of game
	 
	private String name; // Name of game
	private String locgame; // path of game
	private String comrun; // command to run it
	private String platform; // platform of the game
	private boolean installed; // is installed
	
	public Game(String[] game)
	{
		super(game[1]);
		
		
		this.appid = Integer.parseInt(game[0]);
		this.name = Bettername(game[1]);
		this.locgame = game[2];
		this.comrun = game[3];
		this.platform = game[4];
	}
	
	private String Bettername(String s)
	{
		String result = "";
		for (int i = 0; i< s.length();i++)
		{	
			Character c = s.charAt(i);
			if(i!= 0 && (c.toString().matches("[A-Z]") || c.toString().matches("[0-9]")))
				result += ' ';
			result += c;
		}

		return result;
	}
	
	
	public int getAppid() {
		return appid;
	}

	public void setAppid(int appid) {
		this.appid = appid;
	}

	public String getLocgame() {
		return locgame;
	}

	public void setLocgame(String locgame) {
		this.locgame = locgame;
	}

	public String getComrun() {
		return comrun;
	}

	public void setComrun(String comrun) {
		this.comrun = comrun;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isInstalled() {
		return installed;
	}

	public void setInstalled(boolean installed) {
		this.installed = installed;
	}




	@Override
	public String toString() {
		return "Name =" +name + " Plateforme : " + platform + " Comrun = "+ comrun + " Appid = "+ appid;
	}
	
}
