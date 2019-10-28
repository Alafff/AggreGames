package fr.zuntini.fenetres;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

import fr.zuntini.factory.PlatFindFactory;
import fr.zuntini.platform.AGList;
import fr.zuntini.traitement.Loading;

public class InstallPlatform extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JProgressBar pb = new JProgressBar();
	
	public InstallPlatform (ArrayList<JCheckBox> cbList)
	{
		super("Resolving issue");
		
		boolean visible = false;
		int lines = 0;
		for (JCheckBox jcb : cbList)
		{
			if (jcb.getText().contains("red") && jcb.isSelected())
			{
				
				visible = true;
				
				this.add(new PlatFindFactory(jcb.getName()));
				lines++;
			}

		}	
		pb.setMaximum(lines);
		pb.setSize(313, 30);
		pb.setVisible(false);
		this.setVisible(true);
		
		this.setSize((lines*200),(lines*300) );
		this.add(pb);
		this.setLayout(new GridLayout(lines, 0, 0, 0));
		this.setVisible(visible);
		JButton launchbutton = new JButton("Launch");
		launchbutton.setSize(174, 100);
		launchbutton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{	
				boolean all =Loading.loading();
				if (all = true)
					new FenetrePrincipale();
			}
		});
		this.add(launchbutton);
		
	}
	
}
