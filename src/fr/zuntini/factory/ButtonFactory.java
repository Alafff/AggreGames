package fr.zuntini.factory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import fr.external.code.WindowsRegistry;
import fr.zuntini.platform.AGList;
import fr.zuntini.platform.EpicStorePlat;
import fr.zuntini.platform.SteamPlat;

public class ButtonFactory {

	
	public static JButton getButton (String name, int number , Dimension size)
	{
		int calc = (int) ((size.getWidth() - 302) / number);
		JButton jb = new JButton(name);
		jb.setForeground(Color.WHITE);
		jb.setFont(new Font("Impact", Font.BOLD, 20));
		jb.setBackground(Color.RED);
		jb.setMinimumSize(new Dimension(calc, 700 ));
		
		jb.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{	
					AGList.getPlat(name).execplat();
			}
		});
	
		return jb;
	}
}
