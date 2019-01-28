package fr.zuntini.listmaking;

import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class MakeJList extends JTree {

	private File fcat; //Categories / Platformes
	private File flist; // List de jeux

	public MakeJList(File cat, File listgame)
	{
		super();
		this.fcat = cat;
		this.flist = listgame;
		this.setPreferredSize(new Dimension(315, 200));
		this.setMaximumSize(new Dimension(315, 200));
		this.setSize(new Dimension(315, 200));
	}

	private JList MakeCategories() 
	{
		JList cat = new JList();
		String actual;
		Scanner sc;
		try {
			sc = new Scanner(fcat);
			while (sc.hasNextLine())
				cat.add(new JList());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cat;
	}
		private void createNodes(DefaultMutableTreeNode top) {
		    DefaultMutableTreeNode category = null;
		    DefaultMutableTreeNode book = null;
		    
		    category = new DefaultMutableTreeNode("Books for Java Programmers");
		    top.add(category);
		    
		    //original Tutorial
		    book = new DefaultMutableTreeNode(new BookInfo
		        ("The Java Tutorial: A Short Course on the Basics",
		        "tutorial.html"));
		    category.add(book);
		    
		    //Tutorial Continued
		    book = new DefaultMutableTreeNode(new BookInfo
		        ("The Java Tutorial Continued: The Rest of the JDK",
		        "tutorialcont.html"));
		    category.add(book);
		    
		    //Swing Tutorial
		    book = new DefaultMutableTreeNode(new BookInfo
		        ("The Swing Tutorial: A Guide to Constructing GUIs",
		        "swingtutorial.html"));
		    category.add(book);

		    //...add more books for programmers...

		    category = new DefaultMutableTreeNode("Books for Java Implementers");
		    top.add(category);

		    //VM
		    book = new DefaultMutableTreeNode(new BookInfo
		        ("The Java Virtual Machine Specification",
		         "vm.html"));
		    category.add(book);

		    //Language Spec
		    book = new DefaultMutableTreeNode(new BookInfo
		        ("The Java Language Specification",
		         "jls.html"));
		    category.add(book);
		}
			
		
		
		
}

