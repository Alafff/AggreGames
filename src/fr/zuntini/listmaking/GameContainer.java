package fr.zuntini.listmaking;

import javax.swing.tree.DefaultMutableTreeNode;

public class GameContainer {

	private Game g;
	private DefaultMutableTreeNode t;
	
	public GameContainer(Game g ,DefaultMutableTreeNode t) 
	{
		this.g = g;
		this.t = t;
	}

	public Game getG() {
		return g;
	}

	public DefaultMutableTreeNode getT() {
		return t;
	}
	
	
	
}
