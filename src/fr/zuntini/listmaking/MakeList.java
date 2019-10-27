package fr.zuntini.listmaking;

//import fr.zuntini.game.Game;

import java.awt.Dimension;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import fr.zuntini.game.Game;
import fr.zuntini.platform.AGList;
import fr.zuntini.platform.Platform;



public class MakeList extends JTree {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DefaultMutableTreeNode root;
	private DefaultMutableTreeNode others;
	private Map<String, DefaultMutableTreeNode> platform = new HashMap<>();

	public void addGame(Game game)
	{
		others.add(game);
	}

	public MakeList()
	{
		super();
		createNodes();
		
		this.setRootVisible(false);
		this.setPreferredSize(new Dimension(315, 200));
		this.setMaximumSize(new Dimension(315, 200));
		this.setSize(new Dimension(315, 200));
		this.setRootVisible(false);
		this.getSelectionModel().setSelectionMode
        (TreeSelectionModel.SINGLE_TREE_SELECTION);
		this.putClientProperty("JTree.lineStyle", "None");
		
	
	}
	// Cherche chaque jeu dans chaque plateforme pour l'ajouter a la liste
	private void createNodes() 
	{

			root = new DefaultMutableTreeNode("root") {
		
			private static final long serialVersionUID = 1L;

			{
				
				ArrayList<Platform> list = AGList.getAllplatform();
				for (Platform p : list)
				{
					DefaultMutableTreeNode node = new DefaultMutableTreeNode(p.getName());
					this.add(node);
					for (Game g : p.getGlist())
						node.add(g);
				}
				others = new DefaultMutableTreeNode("Others");
				this.add(others);
			}
		};
		this.setModel(new DefaultTreeModel(root));
	}

	private TreePath find(DefaultMutableTreeNode rot, String s) {
	    @SuppressWarnings("unchecked")
	    Enumeration<TreeNode> e = rot.depthFirstEnumeration();
	    while (e.hasMoreElements()) {
	        TreeNode node = e.nextElement();
	        if (node.toString().equalsIgnoreCase(s)) {
	            return new TreePath(node.getParent());
	        }
	    }
	    return null;
	}
	
	
}

