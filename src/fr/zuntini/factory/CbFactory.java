package fr.zuntini.factory;

import java.awt.Dimension;

import javax.swing.JCheckBox;

import fr.external.code.WindowsRegistry;

public class CbFactory extends JCheckBox {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CbFactory(String name, Dimension size)
	{


		super(name);

		String redcolor = "<html><font color=\"red\">";
		String greencolor = "<html><font color=\"green\">";
		String endcolor = "</font></html>";
		this.setSize(size);
		this.setPreferredSize(size);
		this.setMaximumSize(size);
		this.setMinimumSize(size);
		this.setName(name);

		if (WindowsRegistry.testKey2(name) != null)
		{
			this.setText(greencolor+name+endcolor);
		}
		else
			this.setText(redcolor +name+endcolor);
	}

}
