package jdbcD;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java14oct","root1","password");
            String select = " select * from employee";
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(select);

            while (rs.next()){
                System.out.println(rs.getInt("id") + " " + rs.getString(2) + " " + rs.getString(3));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
