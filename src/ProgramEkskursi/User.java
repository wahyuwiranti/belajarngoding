/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramEkskursi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus pc
 */
public class User {
    Scanner input=new Scanner(System.in);
    String username;
    String password;
    static Connection konek;
    
    public static Connection getConnection(){
        try{
            konek = DriverManager.getConnection("jdbc:mysql://localhost/ekskursi","root","");
        }catch(SQLException e){
            System.out.println("Tidak dapat meyambungkan ke database");
        }
        return konek;
    }
    
    public void close(Connection Connect){
        try{
            Connect.close();
        }catch(SQLException e){
            Logger.getLogger(KumpulanMahasiswa.class.getName()).log(Level.SEVERE,null,e);
        }
    }
}
