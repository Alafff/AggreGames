package fr.zuntini.main;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import fr.zuntini.fenetres.FenetrePrincipale;
import fr.zuntini.fenetres.LaunchWindow;

public class Debut 
{
	private static File f = new File("params.txt");
	
	public static void main(String[] args)
	{
		

		/*if (f.exists())
		{
			
		} else*/
			
				new LaunchWindow(f);
				new FenetrePrincipale();
		
		/*
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{	
					FenetrePrincipale window = new FenetrePrincipale();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});*/
	}
}
