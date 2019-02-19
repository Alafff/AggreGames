package fr.zuntini.factory;

import java.awt.Dimension;

import javax.swing.JCheckBox;

import fr.external.code.WindowsRegistry;

public class CbFactory extends JCheckBox {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String redcolor = "<html><font color=\"red\">";
	private String greencolor = "<html><font color=\"green\">";
	private String endcolor = "</font></html>";
	private boolean here = false; 
	
	public CbFactory(String name, Dimension size)
	{
		super(name);
		this.setSize(size);
		this.setPreferredSize(size);
		this.setMaximumSize(size);
		this.setMinimumSize(size);
		this.setName(name);
		if (WindowsRegistry.testKey2(name) != null)
		{
			here = true;
			this.setText(greencolor+name+endcolor);
		}
		else
			this.setText(redcolor+name+endcolor);
	}
	
	public boolean ishere()
	{
		return here;
	}
}
