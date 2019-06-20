package fr.zuntini.factory;

import java.awt.Dimension;

import javax.swing.JCheckBox;

import fr.external.code.WindowsRegistry;

public class CbFactory {

	private static String redcolor = "<html><font color=\"red\">";
	private static String greencolor = "<html><font color=\"green\">";
	private static String endcolor = "</font></html>";
	
	public static JCheckBox getcheckbox(String name , Dimension size)
	{
		JCheckBox cb = new JCheckBox();
		cb.setSize(size);
		cb.setPreferredSize(size);
		cb.setMaximumSize(size);
		cb.setMinimumSize(size);
		if (WindowsRegistry.testKey2(name) != null)
			cb.setText(greencolor+name+endcolor);
		else
			cb.setText(redcolor+name+endcolor);
		
		
		return cb;
	}
	
}
