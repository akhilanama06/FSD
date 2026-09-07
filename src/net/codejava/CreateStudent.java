package net.codejava;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateStudent {

    public static void main(String[] args) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO student (id, name, branch, marks) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 101);
            ps.setString(2, "Akhi");
            ps.setString(3, "CSE");
            ps.setInt(4, 85);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Student inserted successfully!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}