package fr.zuntini.database;
import java.sql.*;

public class DTOSendAlias {

    public DTOSendAlias (String name , String alias){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/AggreGames","root","root");
                Statement stmt=con.createStatement();
                stmt.executeQuery("INSERT INTO Aliases (GameName, GameAlias, Point) VALUES("+name+","+alias+","+"1000);");

                con.close();
            } catch(Exception e){ System.out.println(e);}
        }
    }

