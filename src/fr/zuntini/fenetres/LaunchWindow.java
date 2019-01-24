package fr.zuntini.fenetres;

import java.awt.EventQueue;


import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LaunchWindow extends JFrame{

	private int width = 609;
	private int height = 239;

	private PrintWriter pw; 

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
	public LaunchWindow(File f) {
		super();
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
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(610, 269);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		JPanel UpPanel = new JPanel();
		UpPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
		UpPanel.setPreferredSize(new Dimension(609, 40));
		UpPanel.setMinimumSize(new Dimension(width, 50));
		this.getContentPane().add(UpPanel, BorderLayout.NORTH);
		GridBagLayout gbl_UpPanel = new GridBagLayout();
		gbl_UpPanel.columnWidths = new int[]{161, 81, 0, 0};
		gbl_UpPanel.rowHeights = new int[]{14, 0, 0};
		gbl_UpPanel.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_UpPanel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		UpPanel.setLayout(gbl_UpPanel);
		
		JLabel lblPltfmUsd = new JLabel("Prefered Platforms used : (The ones you wanna see in your top window)");
		GridBagConstraints gbc_lblPltfmUsd = new GridBagConstraints();
		gbc_lblPltfmUsd.gridwidth = 2;
		gbc_lblPltfmUsd.insets = new Insets(0, 0, 0, 5);
		gbc_lblPltfmUsd.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblPltfmUsd.gridx = 0;
		gbc_lblPltfmUsd.gridy = 0;
		UpPanel.add(lblPltfmUsd, gbc_lblPltfmUsd);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator.setBackground(Color.CYAN);
		separator.setOpaque(true);
		separator.setRequestFocusEnabled(false);
		separator.setSize(new Dimension(width, 5));
		separator.setMinimumSize(new Dimension(409, 5));
		separator.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridwidth = 3;
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 1;
		UpPanel.add(separator, gbc_separator);
		
		JPanel MainPanel = new JPanel();
		this.getContentPane().add(MainPanel, BorderLayout.CENTER);
		MainPanel.setLayout(null);
		
		JCheckBox cbSteam = new JCheckBox("Steam");
		cbSteam.setBounds(30, 60, 117, 23);
		MainPanel.add(cbSteam);
		
		JCheckBox cbGoG = new JCheckBox("GoG Galaxy");
		cbGoG.setBounds(184, 34, 89, 23);
		MainPanel.add(cbGoG);
		
		JCheckBox cbOrigin = new JCheckBox("Origin");
		cbOrigin.setBounds(342, 34, 77, 23);
		MainPanel.add(cbOrigin);
		
		JCheckBox cbDiscord = new JCheckBox("Discord Store");
		cbDiscord.setBounds(30, 88, 117, 23);
		MainPanel.add(cbDiscord);
		
		JCheckBox cbTwitch = new JCheckBox("Twitch");
		cbTwitch.setBounds(184, 60, 89, 23);
		MainPanel.add(cbTwitch);
		
		JCheckBox cbOthers = new JCheckBox("Others");
		cbOthers.setBounds(342, 60, 77, 23);
		MainPanel.add(cbOthers);
		
		JCheckBox cbEpicStore = new JCheckBox("Epic Store");
		cbEpicStore.setBounds(30, 34, 117, 23);
		MainPanel.add(cbEpicStore);
		
		JButton btnLaunch = new JButton("Launch");
		btnLaunch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (cbEpicStore.isSelected())
					pw.println(cbEpicStore.getText());
				if (cbSteam.isSelected())
					pw.println(cbSteam.getText());
				if (cbGoG.isSelected())
					pw.println(cbGoG.getText());
				if (cbOrigin.isSelected())
					pw.println(cbOrigin.getText());
				if (cbDiscord.isSelected())
					pw.println(cbDiscord.getText());
				if (cbTwitch.isSelected())
					pw.println(cbTwitch.getText());
				if (cbOthers.isSelected())
					pw.println(cbOthers.getText());
				 pw.close();
				 System.exit(0);
			
			
			
			
			
			}
		});
		btnLaunch.setBounds(86, 140, 89, 23);
		MainPanel.add(btnLaunch);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuitter.setBounds(259, 140, 89, 23);
		MainPanel.add(btnQuitter);
	}
}
