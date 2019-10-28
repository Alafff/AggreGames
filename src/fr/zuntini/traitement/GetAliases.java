package fr.zuntini.traitement;

import fr.zuntini.platform.AGList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.sql.ResultSet;

public class GetAliases {


    public static void dumpintofile(ResultSet rs)
    {
        try (PrintWriter pw = new PrintWriter(AGList.getAliases(), "UTF-8"))
        {
         pw.println(rs.getString(2)+";"+rs.getString(4));
        } catch (Exception e)
        {e.printStackTrace();}
    }

    public static String check(String s) {
        try (BufferedReader br = new BufferedReader(new FileReader(AGList.getAliases()))) {
            String str = br.readLine();
             if (str.contains(s))
            {
                String[] result = str.split(";");
                return result[1];
            }
        } catch (Exception e)
        {e.printStackTrace();}
        return null;
    }
}
