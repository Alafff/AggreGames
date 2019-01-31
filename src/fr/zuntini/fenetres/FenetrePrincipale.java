package fr.zuntini.fenetres;








import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import fr.zuntini.factory.ButtonFactory;
import fr.zuntini.listmaking.MakeList;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.List;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class FenetrePrincipale extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtSearchbar;
	
	
	//private Browser br = new Browser();
	private JLabel lblNewLabel = new JLabel("");
	private File f = new File ("params.txt");
	private MakeList firstList = new MakeList(f, f);
	private MakeList list = new MakeList(f , f);
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public FenetrePrincipale() {
		super();
		
		initialize();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
	//			br.stop();
	//			br.dispose();
			}
		});
		
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
			//	System.out.println("width =" + this.getWidth() + " height = " + this.getHeight() );
				System.out.println(lblNewLabel.getWidth());
			}
		});
		//this.setUndecorated(true);
		this.setSize(1230, 700);
		JToolBar toolBar = new JToolBar();
		toolBar.setSize(this.getSize());
		this.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		lblNewLabel.setIcon(new ImageIcon("ressources\\Logo.png"));
		toolBar.add(lblNewLabel);
	
		// Icons + Menu Button
		JPanel UpPanel = new JPanel();
		UpPanel.setBackground(Color.GRAY);
		UpPanel.setFocusable(false);
		toolBar.add(UpPanel);
		
		int numLines = 2;
		Scanner sc;
		try {
			sc = new Scanner (f);
			while (sc.hasNextLine())
			{
				numLines++;
				sc.nextLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		UpPanel.setLayout(new GridLayout(0, numLines, 0, 0));
		
		// Options button , always visible
		UpPanel.add(ButtonFactory.getButton("Options",numLines, toolBar.getSize()));

		// Button under all dynamic
		
		try {
			sc = new Scanner (f);
			while (sc.hasNextLine())
				UpPanel.add(ButtonFactory.getButton(sc.nextLine(), numLines, toolBar.getSize()));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Add a game Button
		UpPanel.add(ButtonFactory.getButton("Add Games",numLines, toolBar.getSize()));
	
		
		JPanel LeftPanel = new JPanel();
		LeftPanel.setPreferredSize(new Dimension(315, 1000));
		LeftPanel.setMaximumSize(new Dimension(700, 10000));
		this.getContentPane().add(LeftPanel, BorderLayout.WEST);
		
		txtSearchbar = new JTextField();
		txtSearchbar.setMinimumSize(new Dimension(315, 10));
		txtSearchbar.setSize(new Dimension(315, 20));
		txtSearchbar.setMaximumSize(new Dimension(315, 10));
		txtSearchbar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (txtSearchbar.getText().trim().equals(""))
					txtSearchbar.setText("Search Bar");
			}
		});
		txtSearchbar.addKeyListener(new KeyAdapter() 
		{
			public void keyPressed(KeyEvent arg0)
			{
		/*		if (txtSearchbar.getText().equals("Search Bar"))
					txtSearchbar.setText("");
			
				list.removeAll();
				if (!(txtSearchbar.getText().equals("Search Bar")))
				{	
					for (int j = 0;firstList.getRowCount() > j;j++)
					{
						if (firstList.getItem(j).contains(txtSearchbar.getText()))
							list.add(firstList.getItem(j));
					}
				}
			*/}
			public void keyReleased(KeyEvent arg0)
			{
		/*		if (txtSearchbar.getText().equals("Search Bar"))
					txtSearchbar.setText("");
			
				list.removeAll();
				if (!(txtSearchbar.getText().equals("Search Bar")))
				{	
					for (int j = 0;firstList.getRowCount() > j;j++)
					{
						if (firstList.getItem(j).contains(txtSearchbar.getText()))
							list.add(firstList.getItem(j));
					}
				}
			*/}
		});
		LeftPanel.setLayout(new BorderLayout(0, 0));
		
		txtSearchbar.setText("Search Bar");
		txtSearchbar.setToolTipText("");
		LeftPanel.add(txtSearchbar, BorderLayout.NORTH);
		txtSearchbar.setColumns(10);
		/*list.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("root") {
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
					node_1 = new DefaultMutableTreeNode("Epic FDP");
						node_1.add(new DefaultMutableTreeNode("Game 1"));
						node_1.add(new DefaultMutableTreeNode("Game 2"));
						node_1.add(new DefaultMutableTreeNode("Game 3"));
					add(node_1);
				}
			}
		));*/
		
		
		list.setPreferredSize(new Dimension(315, 200));
		list.setMaximumSize(new Dimension(315, 200));
		list.setSize(new Dimension(315, 200));
		LeftPanel.add(list, BorderLayout.CENTER);
		/*for (Integer i = 0;i < 100;i++)
		{
			list.add(i.toString());
			firstList.add(i.toString());
		}*/
		JPanel BottomPanel = new JPanel();
		this.getContentPane().add(BottomPanel, BorderLayout.SOUTH);
		
		JPanel CentralPanel = new JPanel();
		CentralPanel.setSize(new Dimension(899, 493));
		
		this.getContentPane().add(CentralPanel, BorderLayout.CENTER);
		
		//BrowserView view = new BrowserView(br);
		
		
	//	CentralPanel.add(view);
		//br.setSize(CentralPanel.getWidth(), CentralPanel.getHeight());
		//br.loadURL("https://www.google.com");
		
		CentralPanel.setBackground(Color.cyan);
//	System.out.println(br.isLoading());
//	System.out.println(br.getURL());
	}

}
