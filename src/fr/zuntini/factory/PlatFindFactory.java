package fr.zuntini.factory;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.zuntini.platform.AGList;

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
	
		
		
		JButton btDownload = new JButton("Download");
		btDownload.setBounds(174, 92, 79, 23);
		btDownload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.print(AGList.getdownloadlink(name));
				  try {
				        Desktop.getDesktop().browse(new URL(AGList.getdownloadlink(name)).toURI());
				    } catch (Exception e) {
				        e.printStackTrace();
				    }
			}
		});
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
