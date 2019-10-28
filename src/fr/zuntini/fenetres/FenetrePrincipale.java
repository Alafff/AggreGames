package fr.zuntini.fenetres;


import fr.zuntini.factory.ButtonFactory;
import fr.zuntini.listmaking.MakeList;
import fr.zuntini.platform.AGList;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import java.awt.GridLayout;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;



public class FenetrePrincipale extends JFrame implements DropTargetListener {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtSearchbar;
	
	
	//private Browser br = new Browser();
	private JLabel lblNewLabel = new JLabel("");
	private File f = AGList.getParams();
	private MakeList list = new MakeList();
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
	private void initialize() 
	{
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
				System.out.println(lblNewLabel.getWidth());
			}
		});
		
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
		int numCol = 1;
		Scanner sc;
		try {
			sc = new Scanner (f);
			while (sc.hasNextLine())
			{
				numLines++;
				sc.nextLine();
			}
			numCol  += numLines / 5;
			if (numLines > 5)
				numLines = 5;
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}	
		UpPanel.setLayout(new GridLayout(numCol, numLines, 0, 0));
		
		// Options button , always visible
		UpPanel.add(ButtonFactory.getButton("Options",numLines, toolBar.getSize()));

		// Button under all dynamic
		
		try {
			sc = new Scanner (f);
			while (sc.hasNextLine())
				UpPanel.add(ButtonFactory.getButton(sc.nextLine(), numLines, toolBar.getSize()));
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	
		
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
				if (txtSearchbar.getText().equals("Search Bar"))
					txtSearchbar.setText("");
			}
			public void keyReleased(KeyEvent arg0)
			{
				if (txtSearchbar.getText().equals("Search Bar"))
					txtSearchbar.setText("");
			}
		});
		LeftPanel.setLayout(new BorderLayout(0, 0));
		
		txtSearchbar.setText("Search Bar");
		txtSearchbar.setToolTipText("");
		LeftPanel.add(txtSearchbar, BorderLayout.NORTH);
		txtSearchbar.setColumns(10);
	
		
		
		list.setPreferredSize(new Dimension(315, 200));
		list.setMaximumSize(new Dimension(315, 200));
		list.setSize(new Dimension(315, 200));
		LeftPanel.add(list, BorderLayout.CENTER);
		
		JPanel BottomPanel = new JPanel();
		this.getContentPane().add(BottomPanel, BorderLayout.SOUTH);
		
		JPanel CentralPanel = new JPanel();
		CentralPanel.setSize(new Dimension(899, 493));
		
		this.getContentPane().add(CentralPanel, BorderLayout.CENTER);
		
	
		
		CentralPanel.setBackground(Color.LIGHT_GRAY);

	}

	@Override
	public void dragEnter(DropTargetDragEvent dtde) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dragOver(DropTargetDragEvent dtde) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropActionChanged(DropTargetDragEvent dtde) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dragExit(DropTargetEvent dte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drop(DropTargetDropEvent dtde) {
		// TODO Auto-generated method stub
		
	}

}
