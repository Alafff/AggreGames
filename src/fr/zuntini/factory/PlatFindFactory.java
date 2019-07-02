package fr.zuntini.factory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlatFindFactory extends JPanel {

	
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
	public PlatFindFactory(String name) {
		super();
		this.name = name;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(100, 100, 364, 156);
		
		
		fc = new JFileChooser();
		setLayout(null);
		
		JLabel title = new JLabel(this.name);
		title.setBounds(0, 0, 0, 0);
		this.add(title);
		JButton btOpen = new JButton("Link the path");
		btOpen.setBounds(43, 92, 95, 23);
		btOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				fc.showOpenDialog(new JFrame());
			}
			
		});
		this.add(btOpen);
		
		JLabel lbl_or = new JLabel("OR");
		lbl_or.setBounds(148, 96, 15, 14);
		this.add(lbl_or);
		
		
		
		JButton btDownload = new JButton("Download");
		btDownload.setBounds(174, 92, 79, 23);
		this.add(btDownload);
		
		JLabel lblNewLabel = new JLabel(name);
		lblNewLabel.setBounds(118, 27, 46, 14);
		add(lblNewLabel);
		
		
	}

		
	public File getFile()
	{
		return fc.getSelectedFile();
	}
}
