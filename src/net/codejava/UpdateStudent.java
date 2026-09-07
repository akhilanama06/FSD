package net.codejava;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateStudent {

    public static void main(String[] args) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "UPDATE student SET marks = ? WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            // New marks
            ps.setInt(1, 95);

            // Student ID
            ps.setInt(2, 101);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student not found!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}