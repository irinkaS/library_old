import java.sql.*;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
//            System.out.println("Connection succesfull!");
//        } catch (ClassNotFoundException ex) {
//            System.out.println("Connection failed...");
//
//            System.out.println(ex);
//        } catch (Exception ex) {
//            System.out.println("Other exeption");
//        }
        dbConnection();


    }

    public static void dbConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = getConnection()){
                System.out.println("Connection to Store DB succesfull!");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }

    public static Connection getConnection() throws SQLException, IOException{

//        Properties props = new Properties();
//        try(InputStream in = Files.newInputStream(Paths.get("database.properties"))){
//            props.load(in);
//        }
//        String url = props.getProperty("url");
//        String username = props.getProperty("username");
//        String password = props.getProperty("password");

        String url = "jdbc:mysql://localhost/?serverTimezone=Europe/Moscow&useSSL=false";;
        String username = "root";
        String password = "library";

        return DriverManager.getConnection(url, username, password);
    }



}
//java -classpath c:\Java\mysql-connector-java-8.0.11.jar;c:\Java Program