package org.example.dao;
import java.sql.*;
import java.sql.SQLException;

public class loginDao {

    public boolean validate(LoginBean loginBean) throws  ClassNotFoundException{

        boolean status = false;
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerRelationshipManager", "root", "Nomar1964!");

             PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM login WHERE username = ? and password = ? ")) {
            preparedStatement.setString(1, loginBean.getUsername());
            preparedStatement.setString(2, loginBean.getPassword());
            System.out.println(preparedStatement);
            ResultSet result = preparedStatement.executeQuery();
            status= result.next();
        } catch (SQLException e){
//            printSQLException(e);
        }
        return status;
    }



}
