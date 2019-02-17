package fr.zuntini.traitement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import fr.external.code.WindowsRegistry;
import fr.zuntini.platform.*;

public class Loading 
{
	
	public static void loading()
	{
		Scanner sc;
		try
		{
			sc = new Scanner (AGList.getParams());
	
			while(sc.hasNextLine())
			{
				String a = sc.nextLine();	
				String n = null;
				n = WindowsRegistry.testKey2(a);
				if (n == null)
					{
					//dosomeshit	
					}
				else
				{
					if (a.equals("Steam"))
						AGList.add(new SteamPlat(n));
					if (a.equals("Epic Store"))
						AGList.add(new EpicStorePlat(n));
					if (a.equals("Origin"))
						AGList.add(new OriginPlat(n));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		//AGList.add("toto");
		}
