package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOCity {

    private final String mySqlLogin = "root";
    private final String mySqlPass = "user";
    //embedded mysql db has "world" db, i am connecting to this db by adding it's name in url of db.
    private final String mySqlURL = "jdbc:mysql://localhost:3306/world";

    private final String GET_ALL_CITIES = "SELECT Name FROM city";
    private final String GET_BY_NAME = "SELECT * FROM city WHERE name = ?";

    //connection method to avoid repeating in every statement method
    private Connection getConnection() {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(mySqlURL, mySqlLogin, mySqlPass);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }


    //returning a list of city names from city db
    public List<String> getList(){
        List<String> cityList = new ArrayList<>();

        try(Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_CITIES)){
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                cityList.add(resultSet.getString("Name"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return cityList;
    }

    //returning id, name, country code, district name and population number for a certain name;
    public String getByName(String name){
        String returnStr = null;
        try(Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_NAME)){
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();

            //while(rs.next()){
                rs.next();
                returnStr = rs.getString("ID");
                returnStr += "\n";
                returnStr += rs.getString("Name");
                returnStr += "\n";
                returnStr += rs.getString("CountryCode");
                returnStr += "\n";
                returnStr += rs.getString("District");
                returnStr += "\n";
                returnStr += rs.getString("Population");
            //}
        } catch (SQLException ex) {
            // handle any database errors
            ex.printStackTrace();
            System.out.println("Error when loading username");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return returnStr;
    }


}
