/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author johns
 */
public class DataBase {

    public static Connection connectDatabase(String database_name) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {

        FileReader reader = new FileReader("portNumbers.properties");
        Properties p = new Properties();
        p.load(reader);
//
//        final String DB_URL=p.getProperty("MS_SQL_URL");
//        //  Database credentials
//        final String USER = "root";
//        final String PASS = "root";

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        Connection connection = DriverManager.getConnection(p.getProperty("MS_SQL_URL"), p.getProperty("MS_SQL_userName"), p.getProperty("MS_SQL_passWord"));

        return connection;
    }

    public static Statement createStatement(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        return statement;
    }

    public static ResultSet createResultSet(Connection connection, Statement statement, String sql) throws ClassNotFoundException, SQLException {
        ResultSet result = statement.executeQuery(sql);
        return result;
    }

    public static List createMultipleResultSet(String sql) throws SQLException, ClassNotFoundException, IOException {

        List<ArrayList<String>> wholeList = new ArrayList<>();
        ArrayList<String> columnName = new ArrayList<String>();

        Connection connection = DataBase.connectDatabase("Archi");
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);
        ResultSetMetaData rsmd = result.getMetaData();
        int numberOfColumns = rsmd.getColumnCount();
        for (int i = 1; i <= numberOfColumns; i++) {
            String colName = rsmd.getColumnName(i);
            columnName.add(colName);
        }
        wholeList.add(columnName);
        while (result.next()) {

            ArrayList<String> individualRecord = new ArrayList<String>();
            for (int j = 0; j < numberOfColumns; j++) {

                individualRecord.add(result.getString(columnName.get(j)));

            }
            wholeList.add(individualRecord);

        }
        DataBase.closeConnectionAfterGET(connection, statement, result);
        for (ArrayList obj : wholeList) {
            ArrayList<String> temp = obj;
            for (String string : temp) {
                System.out.print(string + "\t|\t");
            }
            System.out.println();
        }
        return wholeList;
    }

    public static String createSingleResultSet(String sql) throws SQLException, ClassNotFoundException, IOException {
        String password = " ";
        Connection connection = DataBase.connectDatabase("Archi");
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);

        while (result.next()) {
            password = result.getString("e_pass");
        }

        DataBase.closeConnectionAfterGET(connection, statement, result);

        return password;
    }

    public static String createSingleResultSet_2(String sql) throws SQLException, ClassNotFoundException, IOException {
        String email = " ";
        Connection connection = DataBase.connectDatabase("Archi");
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);

        while (result.next()) {
            email = result.getString("e_email");
        }

        DataBase.closeConnectionAfterGET(connection, statement, result);

        return email;
    }

    public static void postintoDB(List newForm) throws ClassNotFoundException, SQLException, IOException {
        Connection connection = DataBase.connectDatabase("master");
        Statement statement = connection.createStatement();
        String name = newForm.get(0).toString();
        String pass = newForm.get(1).toString();
        String company = newForm.get(2).toString();
        String designation = newForm.get(3).toString();
        System.out.println(name + pass + company + designation);
        // String sql = "insert into users values('"+name+"',"+pass+",'"+company+"',"+"'"+designation+"')";
        String sql = "insert into users values('" + name + "','" + pass + "','" + company + "','" + designation + "')";
        statement.executeUpdate(sql);
        System.out.println("Created a new User -" + name);
        DataBase.closeConnectionAfterPOST(connection, statement);
    }

    public static void closeConnectionAfterGET(Connection connection, Statement statement, ResultSet resultset) throws SQLException {
        connection.close();
        statement.close();
        resultset.close();
    }

    public static void closeConnectionAfterPOST(Connection connection, Statement statement) throws SQLException {
        connection.close();
        statement.close();
    }

}
