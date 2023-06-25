import java.sql.*;

public class Main {
    public static void main(String[] args) {
//        CREATE A DATABASE FIRST
        String url = "jdbc:mysql://localhost:3306/yourdatabasename";
//        database username
        String username = "root";
//        database password
        String password = "root";

        try{
//            download java mysql connector in chrome and put in your as a jar folder libraries
           Class.forName("com.mysql.cj.jdbc.Driver");

           Connection connection = DriverManager.getConnection(url, username, password);

           Statement statement = connection.createStatement();

           ResultSet resultSet = statement.executeQuery("SELECT * FROM yourdatabasetablename");

           while(resultSet.next()){
               System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
           }

           connection.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}