package net.codejava;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteStudent {

    public static void main(String[] args) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM student WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 101);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Student deleted successfully!");
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