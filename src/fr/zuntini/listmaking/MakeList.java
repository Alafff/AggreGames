package fr.zuntini.listmaking;

import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class MakeList extends JTree {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File fcat; //Categories / Platformes
	private File flist; // List de jeux
	private Map<String, DefaultMutableTreeNode> platform = new HashMap<>();
	private Map<String, Game> game = new HashMap<>();
	

	public MakeList(File cat, File listgame)
	{
		super();
		this.fcat = cat;
		this.flist = listgame;
		
		createNodes();
		
		this.setRootVisible(false);
		this.setPreferredSize(new Dimension(315, 200));
		this.setMaximumSize(new Dimension(315, 200));
		this.setSize(new Dimension(315, 200));
		this.setRootVisible(false);
	
	
	}
	
	private void createNodes() 
	{
	/*	String str[] = new String[2];
		str[0] = game[0];
		str[1] = checkgame(game[4]);
*/
		this.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("root") {
			{
				DefaultMutableTreeNode node_1;
				node_1 = new DefaultMutableTreeNode("Steam");
				node_1.add(new DefaultMutableTreeNode("Game1"));
				node_1.add(new DefaultMutableTreeNode("Game2"));

				add(node_1);
				node_1 = new DefaultMutableTreeNode("Discord");
				node_1.add(new DefaultMutableTreeNode("Game 1"));
				node_1.add(new DefaultMutableTreeNode("Game2"));
				node_1.add(new DefaultMutableTreeNode("Game3"));
				add(node_1);
				node_1 = new DefaultMutableTreeNode("Epic ");
				node_1.add(new DefaultMutableTreeNode("Game 1"));
				node_1.add(new DefaultMutableTreeNode("Game 2"));
				node_1.add(new DefaultMutableTreeNode("Game 3"));
				add(node_1);
			}
		}));
	}

	private String  checkgame(String platform)
			{

				if (platform.equals("Steam"))
					return ("ressources/icon_steam_vr.png");
				return(null);
			}
			/*
			
		    DefaultMutableTreeNode category = null;
		    DefaultMutableTreeNode game = null;
		    String temp;
		    
		    category = new DefaultMutableTreeNode("Books for Java Programmers");
		    top.add(category);
		    
		   try 
		   { 
			   Scanner scancat = new Scanner (fcat);
			   while (scancat.hasNextLine())
			   {
				   temp = scancat.nextLine();
				   platform.put(scancat.nextLine(), new DefaultMutableTreeNode(temp));
			   }
		   } catch (FileNotFoundException e) {
			   e.printStackTrace();
		   }
		   
		    
		    //original Tutorial
		   // game = new DefaultMutableTreeNode(new Game(new ArrayList <String>));
		    category.add(game);
		    */
		
			
		
		
		
}

