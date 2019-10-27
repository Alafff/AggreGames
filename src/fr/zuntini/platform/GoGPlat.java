package fr.zuntini.platform;

import java.io.File;
import java.util.ArrayList;

import fr.zuntini.game.Game;

public class GoGPlat extends Platform 
{

	public GoGPlat(String path) {
		super("Gog Galaxy", path);
		
	}

	@Override
	public ArrayList<Game> makelist() {
		
		return null;
	}

	@Override
	public ArrayList<fr.zuntini.game.Game> ftmakelist(File rep) {
		
		return null;
	}

	@Override
	public String getinstallerlink() {
		
		return null;
	}

}