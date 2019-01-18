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
    
    static String url="jdbc:mysql://localhost:3306/user_info";
    static String username="root" ;
    static String password ="";
    
    public static void insertData(String personName) {
        
    }
}