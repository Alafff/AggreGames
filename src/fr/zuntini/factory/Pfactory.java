package fr.zuntini.factory;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Pfactory extends JPanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFileChooser fc;
	private String name;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Pfactory(String name) {
		super();
		this.name = name;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(100, 100, 450, 300);
		
		
		fc = new JFileChooser();
		
		GridBagLayout gbl_panel = new GridBagLayout();
		this.setLayout(gbl_panel);
		
		JLabel title = new JLabel(this.name);
		GridBagConstraints gbc_pan_platchoose = new GridBagConstraints();
		gbc_pan_platchoose.gridwidth = 3;
		gbc_pan_platchoose.insets = new Insets(0, 0, 0, 5);
		gbc_pan_platchoose.anchor = GridBagConstraints.CENTER;
		gbc_pan_platchoose.gridx = 1;
		gbc_pan_platchoose.gridy = 0;
		this.add(title, gbc_pan_platchoose);
		
		
		
		GridBagConstraints gbc_bto = new GridBagConstraints();
		JButton btOpen = new JButton("Link the path");
		btOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				fc.showOpenDialog(new JFrame());
			}
			
		});
		gbc_bto.gridx = 0;
		gbc_bto.gridy = 2;
		this.add(btOpen, gbc_bto);
		
		JLabel lbl_or = new JLabel("OR");
		GridBagConstraints gbc_lbl_or = new GridBagConstraints();
		gbc_lbl_or.gridx = 1;
		gbc_lbl_or.gridy = 2;
		this.add(lbl_or, gbc_lbl_or);
		
		
		
		JButton btDownload = new JButton("Download");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 2;
		this.add(btDownload, gbc_btnNewButton);
		
	}

		
	public File getFile()
	{
		return fc.getSelectedFile();
	}
	

}
