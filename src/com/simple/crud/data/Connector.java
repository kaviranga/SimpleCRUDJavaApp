/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.crud.data;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Duminda Gunawardhana
 */

public class Connector {
    
    public Connector(){
    }
    
    static String url = "jdbc:postgresql://localhost:5432/simpledb";
    static String username = "postgres" ;
    static String password = "root@123";
    static String jdbc_driver = "org.postgresql.Driver";
    
    public static void insertData(Integer id,String firstName,String lastName,String emailAddress) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO workers(workerid,firstname,lastname,emailaddress) VALUES('"+id+"','"+firstName+"','"+lastName+"','"+emailAddress+"')";
        Class.forName(jdbc_driver);
        Connection con = DriverManager.getConnection(url,username,password);
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        stmt.executeUpdate(sql);
    }
    
    public static ArrayList viewData1(Integer id) throws ClassNotFoundException{
        ArrayList al1=new ArrayList();
           try{
            String sql="SELECT firstname FROM workers WHERE workerid='"+id+"'";
            Class.forName(jdbc_driver);
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            
                while(rs.next()){
                    al1.add(rs.getString("firstname"));
                }
            }catch(SQLException e){
              e.printStackTrace();
            }
        return al1;
    }
    
    public static ArrayList viewData2(Integer id) throws ClassNotFoundException{
        ArrayList al2=new ArrayList();
           try{
            String sql="SELECT lastname FROM workers WHERE workerid='"+id+"'";
            Class.forName(jdbc_driver);
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            
                while(rs.next()){
                    al2.add(rs.getString("lastname"));
                }
            }catch(SQLException e){
              e.printStackTrace();
            }
        return al2;
    }
    
    public static ArrayList viewData3(Integer id) throws ClassNotFoundException{
        ArrayList al3=new ArrayList();
           try{
                String sql="SELECT emailaddress FROM workers WHERE workerid='"+id+"'";
                Class.forName(jdbc_driver);
                Connection con = DriverManager.getConnection(url,username,password);
                Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery(sql);
            
                    while(rs.next()){ 
                        al3.add(rs.getString("emailaddress"));
                    }
            }catch(SQLException e){
              e.printStackTrace();
            }
        return al3;
    }
    
    public static void editData(Integer id,String firstname,String lastname,String emailaddress) throws ClassNotFoundException,SQLException,Exception{
        String sql = "UPDATE workers SET firstname='"+firstname+"',lastname ='"+lastname+"',emailaddress = '"+emailaddress+"' WHERE workerid='"+id+"'";
        Class.forName(jdbc_driver);
        Connection con = DriverManager.getConnection(url,username,password);
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        stmt.executeUpdate(sql);
    }
    
    public static void deleteData(Integer id) throws ClassNotFoundException,SQLException,Exception{
        String sql ="DELETE FROM workers WHERE workerid ='"+id+"'";
        Class.forName(jdbc_driver);
        Connection con = DriverManager.getConnection(url,username,password);
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        stmt.executeUpdate(sql);
    }
       
}