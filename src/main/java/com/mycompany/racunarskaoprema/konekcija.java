package com.mycompany.racunarskaoprema;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class konekcija {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/racunarska_oprema";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Konekcija uspešno uspostavljena!");
        } catch (SQLException e) {
            System.out.println("Greška prilikom povezivanja sa bazom:");
            e.printStackTrace();
        }
    }
    
}
