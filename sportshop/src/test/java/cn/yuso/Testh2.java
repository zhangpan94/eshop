package cn.yuso;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Testh2 {
    @Test
    public void tes(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // add application code here
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
