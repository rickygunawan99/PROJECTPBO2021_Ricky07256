package Helper07256;

import javax.swing.*;
import java.sql.*;

public final class KoneksiDB_07256 {

    public static Connection getConnection_07256(){
        Connection conn_07256 = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/tugasasistensi";
        String user = "root";
        String pass = "";
        try {
            Class.forName(driver);
            conn_07256 = DriverManager.getConnection(url,user,pass);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"GAGAL KONEKSI");
        }
        return conn_07256;
    }
}