

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author erianda
 */
public class Koneksi {

    public static Connection con;
    public static Statement stm;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        try {
            // TODO code application logic here
            String url = "jdbc:mysql://127.0.0.1/latihanDBjava";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            //stm = con.createStatement();
            System.out.println("koneksi berhasil;");
            /*
            String query1 = "INSERT INTO nasabah (norekening, nama, gender, layanan,alamat) "
                    + "VALUES (11231233, 'Mario', 'L','Tabungan','Jalan Buntu no 5 Padang')";
            stm.executeUpdate(query1); 
            */
            
            /*
            String sql = "INSERT INTO nasabah (norekening, nama, gender, layanan,alamat) VALUES (?, ?, ?, ?,?)";

            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            statement.setInt(1, 11231234);
            statement.setString(2, "Luigi");
            statement.setString(3, "L");
            statement.setString(4, "Saham");
            statement.setString(5, "Jalan Besar no 1, Padang");
            int rowsInserted = statement.executeUpdate();
            */
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("koneksi Gagal; " + ex);
        }
    }

    

}
