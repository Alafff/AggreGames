package fr.zuntini.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOAliases {

    private ResultSet rs;

    public DAOAliases (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/AggreGames","root","root");
            Statement stmt=con.createStatement();
            rs=stmt.executeQuery("SELECT * From Game");
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }

    public ResultSet getResultSet()
    {
        return rs;
    }
}
