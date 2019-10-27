package fr.zuntini.fenetres;

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
		
		this.setVisible(true);
		
		this.setSize(500, lines*200);
		this.add(pb);
		this.setLayout(new GridLayout(lines, 0, 0, 0));
		this.setVisible(visible);
		JButton launchbutton = new JButton("Launch");
		launchbutton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{	
				Loading.loading();
			}
		});
		this.add(launchbutton);
		if (pb.getValue() == pb.getMaximum())
			new FenetrePrincipale();

	}
	public boolean getProgress()
	{
		if (pb.getValue() != pb.getMaximum())
			return false;
		return true;
	}
}
