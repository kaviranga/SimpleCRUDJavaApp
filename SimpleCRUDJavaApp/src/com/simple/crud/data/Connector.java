/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.crud.data;

import java.io.IOException;
import java.util.ArrayList;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author kaviranga
 */
public class Connector {
    
    public Connector(){
        
    }

    /**
     * @param args the command line arguments
     */
    
    static String url="jdbc:mysql://localhost:3306/simpleDB";
    static String username="root" ;
    static String password ="";
    
    public static void insertData(String firstName,String lastName,String emailAddress) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO workers VALUES('"+firstName+"','"+lastName+"','"+emailAddress+"')";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        stmt.executeUpdate(sql);
    }
    
    public static ArrayList viewData1(String firstName) throws ClassNotFoundException{
        ArrayList al1=new ArrayList();
           try{
            String sql="SELECT firstName, lastName FROM workers WHERE firstName='"+firstName+"'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            
                while(rs.next()){
                    al1.add(rs.getString("firstName"));
                }
            }catch(SQLException e){
              e.printStackTrace();
            }
        return al1;
    }
    
    public static ArrayList viewData2(String firstName) throws ClassNotFoundException{
        ArrayList al2=new ArrayList();
           try
           {
            String sql="SELECT firstName, emailAddress FROM workers WHERE firstName='"+firstName+"'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            
                while(rs.next()){ 
                    al2.add(rs.getString("firstName"));
                }
            }catch(SQLException e){
              e.printStackTrace();
            }
        return al2;
    }
}