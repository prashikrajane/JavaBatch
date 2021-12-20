package jdbcD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java14oct","root1","password");
            Statement statement = connection.createStatement();
            String update = "update employee set name = 'Rakesh' where id=1";
            String delete = "delete from employee where id = 1";
            int i = statement.executeUpdate(update);
            System.out.println("record inserted->" + i);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
