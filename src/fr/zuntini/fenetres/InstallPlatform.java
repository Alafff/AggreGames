package fr.zuntini.fenetres;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

import fr.zuntini.factory.PlatFindFactory;

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
	}
	public int getProgress()
	{
		return pb.getValue();
	}
}
