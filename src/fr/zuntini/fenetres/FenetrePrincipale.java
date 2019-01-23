package fr.zuntini.fenetres;



import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;


import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;



import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.List;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class FenetrePrincipale {

	private JFrame frame;
	private JTextField txtSearchbar;
	private List firstList = new List();
	private List list = new List();
	private Browser br = new Browser();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public FenetrePrincipale() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
				br.stop();
				br.dispose();
			}
		});
		
		frame.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
			//	System.out.println("width =" + frame.getWidth() + " height = " + frame.getHeight() );
			}
		});
		//frame.setUndecorated(true);
		frame.setSize(1230, 700);
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\CDI16\\Desktop\\ProjetJava\\AggreGames\\ressources\\Logo.png"));
		toolBar.add(lblNewLabel);
		
		// Icons + Menu Button
		JPanel UpPanel = new JPanel();
		UpPanel.setBackground(Color.GRAY);
		UpPanel.setFocusable(false);
		toolBar.add(UpPanel);
		UpPanel.setLayout(new GridLayout(0, 5, 0, 0));
		
		// Options button , always visible
		JButton btnOptions = new JButton("Options");
		btnOptions.setForeground(Color.WHITE);
		btnOptions.setFont(new Font("Impact", Font.BOLD, 32));
		btnOptions.setBackground(Color.LIGHT_GRAY);
		UpPanel.add(btnOptions);
		
		// Add a game Button
		JButton btnAddGames = new JButton("Add Games");
		btnAddGames.setForeground(Color.WHITE);
		btnAddGames.setFont(new Font("Impact", Font.BOLD, 32));
		btnAddGames.setBackground(Color.LIGHT_GRAY);
		
		
		// Button under all dynamic
		JButton btnSteam = new JButton("Steam");
		btnSteam.setBackground(Color.LIGHT_GRAY);
		btnSteam.setForeground(Color.WHITE);
		btnSteam.setFont(new Font("Impact", Font.BOLD, 32));
		UpPanel.add(btnSteam);
		
		
		JButton btnDiscord = new JButton("Discord");
		btnDiscord.setBackground(Color.LIGHT_GRAY);
		btnDiscord.setForeground(Color.WHITE);
		btnDiscord.setFont(new Font("Impact", Font.BOLD, 32));
		UpPanel.add(btnDiscord);
		
		JButton btnOrigin = new JButton("Origin");
		btnOrigin.setBackground(Color.LIGHT_GRAY);
		btnOrigin.setForeground(Color.WHITE);
		btnOrigin.setFont(new Font("Impact", Font.BOLD, 32));
		UpPanel.add(btnOrigin);
		
		
		UpPanel.add(btnAddGames);
		
		JPanel LeftPanel = new JPanel();
		LeftPanel.setPreferredSize(new Dimension(315, 1000));
		LeftPanel.setMaximumSize(new Dimension(700, 10000));
		frame.getContentPane().add(LeftPanel, BorderLayout.WEST);
		
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
			
				list.removeAll();
				if (!(txtSearchbar.getText().equals("Search Bar")))
				{	
					for (int j = 0;firstList.getItemCount() > j;j++)
					{
						if (firstList.getItem(j).contains(txtSearchbar.getText()))
							list.add(firstList.getItem(j));
					}
				}
			}
			public void keyReleased(KeyEvent arg0)
			{
				if (txtSearchbar.getText().equals("Search Bar"))
					txtSearchbar.setText("");
			
				list.removeAll();
				if (!(txtSearchbar.getText().equals("Search Bar")))
				{	
					for (int j = 0;firstList.getItemCount() > j;j++)
					{
						if (firstList.getItem(j).contains(txtSearchbar.getText()))
							list.add(firstList.getItem(j));
					}
				}
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
		for (Integer i = 0;i < 100;i++)
		{
			list.add(i.toString());
			firstList.add(i.toString());
		}
		JPanel BottomPanel = new JPanel();
		frame.getContentPane().add(BottomPanel, BorderLayout.SOUTH);
		
		JPanel CentralPanel = new JPanel();
		CentralPanel.setSize(new Dimension(899, 493));
		
		frame.getContentPane().add(CentralPanel, BorderLayout.CENTER);
		
		Browser br = new Browser();
		BrowserView view = new BrowserView(br);
		
		
		CentralPanel.add(view);
		br.setSize(CentralPanel.getWidth(), CentralPanel.getHeight());
		br.loadURL("https://www.google.com");
		
		CentralPanel.setBackground(Color.cyan);
	System.out.println(br.isLoading());
	System.out.println(br.getURL());
	}

}
