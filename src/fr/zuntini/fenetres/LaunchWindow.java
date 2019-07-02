package fr.zuntini.fenetres;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import fr.zuntini.factory.CbFactory;
import fr.zuntini.platform.AGList;
import fr.zuntini.traitement.Loading;

public class LaunchWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width = 479;
	private int height = 390;
	private File f;
	private PrintWriter pw;
	private String[] al = new String []{"Battle.net","Bethesda","Discord Store","Epic Store", "GoG Galaxy", "Origin","Others","Steam","Twitch","Uplay"		
	};
	private ArrayList<JCheckBox> cbList = new ArrayList<JCheckBox>();
	
	
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LaunchWindow window = new LaunchWindow();
					window.this.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LaunchWindow() {
		super();
		this.f = AGList.getParams();
		System.out.println(f);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				try {
					BufferedReader br = new BufferedReader(new FileReader(f));
					if (br.readLine() == null)
						f.delete();
					else
						new FenetrePrincipale();
					br.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				} 
			}
		});
		try {
			pw = new PrintWriter(f, "UTF-8");
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		initialize();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the this.
	 */
	private void initialize() {
		
		this.setTitle("AggreGames First time");
		this.setBounds(100, 100, 500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(width, height);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		JPanel upPanel = new JPanel();
		upPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
		upPanel.setPreferredSize(new Dimension(609, 40));
		upPanel.setMinimumSize(new Dimension(width, 50));
		this.getContentPane().add(upPanel, BorderLayout.NORTH);
		GridBagLayout gbl_UpPanel = new GridBagLayout();
		gbl_UpPanel.columnWidths = new int[]{161, 81, 0, 0};
		gbl_UpPanel.rowHeights = new int[]{14, 0, 0};
		gbl_UpPanel.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_UpPanel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		upPanel.setLayout(gbl_UpPanel);
		
		JLabel lblPltfmUsd = new JLabel("    Which platforms do you want to use :   (Red mean Platform is not detected)");
		lblPltfmUsd.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblPltfmUsd = new GridBagConstraints();
		gbc_lblPltfmUsd.gridwidth = 3;
		gbc_lblPltfmUsd.insets = new Insets(0, 0, 0, 5);
		gbc_lblPltfmUsd.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblPltfmUsd.gridx = 0;
		gbc_lblPltfmUsd.gridy = 0;
		upPanel.add(lblPltfmUsd, gbc_lblPltfmUsd);
		
	
		
		
		
		JPanel mainPanel = new JPanel();
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		
	
		GridBagLayout gbl_MainPanel = new GridBagLayout();
		mainPanel.setLayout(gbl_MainPanel);
		
		
		
		
		Dimension d = new Dimension(117,23);
		int i = 0;
		int x = 0;
		int y = 0;
		for (String c : al)
		{
			
			
			cbList.add(CbFactory.getcheckbox(c, d));
			GridBagConstraints gbs = new GridBagConstraints();
			gbs.gridx = x++;
			gbs.gridy = y;
			
			if (x > 2)
			{
				//gbs.insets = new Insets(10,0,5,5);
				gbs.weighty = 0.1;
				x = 0;
				y += 1;
			}
			mainPanel.add(cbList.get(i), gbs);
			
			i++;
		}
		
	
		
		JPanel downpanel = new JPanel();
		downpanel.setSize(new Dimension(width, 50));
		downpanel.setBorder(BorderFactory.createEmptyBorder(25, 0, 0, 0));

		downpanel.setBounds(new Rectangle(0, 0, width, 50));
		getContentPane().add(downpanel, BorderLayout.SOUTH);
		
	
		JButton btnLaunch = new JButton("Launch");
		downpanel.add(btnLaunch);
		btnLaunch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				for (JCheckBox a : cbList)
				{
					if (a.isSelected())
						for (String s : al) //Suppress HTML Color
						{
							if (a.getText().contains(s))
								pw.println(s);
						}
						
				}
				pw.close();
				try {
					BufferedReader br = new BufferedReader(new FileReader(f));
					if (br.readLine() == null)
					{
						f.delete();
						br.close();
						System.exit(0);
					}
					else
					{
					
								
						
						new InstallPlatform(cbList);
				    
					
				
						setVisible(false);
						Loading.loading();
						new FenetrePrincipale();
						
					}
					br.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		});
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		downpanel.add(btnQuitter);
	}
	
	
}
