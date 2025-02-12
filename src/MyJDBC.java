import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/classroom",
                    "root",
                    "Aditya@2709090"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

            while (resultSet.next()){
                System.out.println(resultSet.getString("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("age"));
            }

        }catch(SQLException e){
            e.printStackTrace();

        }



    }
}