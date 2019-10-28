package fr.zuntini.traitement;

import java.io.FileNotFoundException;
import java.util.Scanner;

import fr.external.code.WindowsRegistry;
import fr.zuntini.platform.AGList;
import fr.zuntini.platform.EpicStorePlat;
import fr.zuntini.platform.GoGPlat;
import fr.zuntini.platform.OriginPlat;
import fr.zuntini.platform.SteamPlat;

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

