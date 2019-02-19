package fr.zuntini.fenetres;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import fr.zuntini.factory.CbFactory;
import fr.zuntini.factory.Pfactory;

public class Resolve_issue extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Resolve_issue (ArrayList<CbFactory> cbList)
	{
		super("Resolving issue");
		
		boolean visible = false;
		int lines = 0;;
		for (CbFactory jcb : cbList)
		{
			if (!jcb.ishere() && jcb.isSelected())
			{
				visible = true;
				System.out.println(jcb.getName());
				this.add(new Pfactory(jcb.getName()));
				lines++;
			}

		}	
		this.setSize(500, lines*200);
		this.setLayout(new GridLayout(lines, 0, 0, 0));
		this.setVisible(visible);
	}
}
