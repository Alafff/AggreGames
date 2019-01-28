package fr.zuntini.listmaking;

import java.io.File;

public class Game {

	private int appid;
	
	private String name;
	private String locgame;
	private String comrun;
	private String platform;
	
	public Game(int appid ,String name , String locgame, String comrun, String platform)
	{
		this.name = name;
		this.appid = appid;
		this.locgame = locgame;
		this.comrun = comrun;
		this.platform = platform;
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
}
