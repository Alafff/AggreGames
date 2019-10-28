package fr.zuntini.traitement;

import java.io.FileNotFoundException;
import java.util.Scanner;

import fr.external.code.WindowsRegistry;
import fr.zuntini.platform.AGList;

public class Loading 
{
	
	public static boolean loading()
	{
		
		try (Scanner sc = new Scanner (AGList.getParams()))
		{
			while(sc.hasNextLine())
			{
				String a = sc.nextLine();	
				String n = WindowsRegistry.testKey2(a);
				if (n.equals(null))
					return false;
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return true;
	}
	
	
		}

