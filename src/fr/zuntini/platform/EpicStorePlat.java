package fr.zuntini.platform;

import java.io.File;
import java.util.ArrayList;

import fr.zuntini.game.Game;

public class EpicStorePlat extends Platform 
{

	public EpicStorePlat(String path) {
		super("Epic Store", path);
		
	}

	@Override
	public ArrayList<Game> makelist() {
		
		return null;
	}


	@Override
	public ArrayList<Game> ftmakelist(File rep) {
		
		return null;
	}

	@Override
	public String getinstallerlink() {
		
		return null;
	}
}