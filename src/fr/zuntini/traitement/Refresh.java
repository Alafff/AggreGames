package fr.zuntini.traitement;

import java.io.File;

public class Refresh 
{
	public Refresh()
	{
		int i = 0;
		while(true)
		{
			System.out.println(i++);
			if (i >= 50)
			{
			i = 0;
			Loading.loading(new File ("params.txt"));
			}
		}
	}
	
}
