package fr.zuntini.traitement;

import java.io.FileNotFoundException;
import java.util.Scanner;

import fr.external.code.WindowsRegistry;
import fr.zuntini.platform.AGList;
import fr.zuntini.platform.EpicStorePlat;
import fr.zuntini.platform.OriginPlat;
import fr.zuntini.platform.SteamPlat;

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
			
			e.printStackTrace();
		}
	}
	
		//AGList.add("toto");
		}

