package fr.zuntini.traitement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import fr.external.code.WindowsRegistry;
import fr.zuntini.platform.*;

public class Loading 
{
	
	private void loading(File params)
	{
		Scanner sc;
		try
		{
			sc = new Scanner (params);
	
			while(sc.hasNextLine())
			{
				String a = sc.nextLine();	
				String n;
				AGList ag;
				n = new WindowsRegistry().testKey2(a);
				if (n.equals(null))
					{
					//dosomeshit	
					}
				else
				{
					if (a.equals("Steam"))
						ag.add(new SteamPlat(n));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		//AGList.add("toto");
		}

