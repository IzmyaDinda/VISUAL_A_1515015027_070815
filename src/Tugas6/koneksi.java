/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;

/**
 *
 * @author Dinda Izmya
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksi {
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/praktikum_visual","root","");
            JOptionPane.showMessageDialog(null,"Ciee berhasil cieee");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Maaf ya untuk saat ini belum :("+e.getMessage());
        }
        return con;
    }
}
