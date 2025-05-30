/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.Connector;

/**
 *
 * @author ASUS
 */
public class UserDAO {
    public void insert(ModelUser user) {
       try {
            String query = "INSERT INTO user (nama_user, username, password) VALUES (?, ?, ?);";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, user.getNama());
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPassword());
            statement.executeUpdate();
            statement.close();
       }
       catch (SQLException e) {
            System.out.println("Input Failed: " + e.getLocalizedMessage());
           
       }
    }
     public void update(ModelUser user) {
       try {
            String query = "UPDATE user SET nama=?, username=?, password=? WHERE id=?;";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, user.getNama());
            statement.executeUpdate();
            statement.close();
       }
       catch (SQLException e) {
            System.out.println("Input Failed: " + e.getLocalizedMessage());
           
       }
    }
    public void delete(int id) {
       try {
            String query = "DELETE FROM user WHERE id=?;";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
       }
       catch (SQLException e) {
            System.out.println("Input Failed: " + e.getLocalizedMessage());
           
       }
    }
    
    public boolean cekAkun(String username, String password){
        boolean status = false;
        try {
            String query = "SELECT * FROM user WHERE username=? AND password = ?;";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultset = statement.executeQuery();
            if (resultset.next()){
                status = true;
            }
            resultset.close();
            statement.close();
       }
       catch (SQLException e) {
            System.out.println("Input Failed: " + e.getLocalizedMessage());
           
       }
        return status;
    }
    
    public boolean cekBuatAkun(String username){
        boolean status = false;
        try {
            String query = "SELECT * FROM user WHERE username=?";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, username);
            ResultSet resultset = statement.executeQuery();
            if (resultset.next()){
                status = true;
            }
            resultset.close();
            statement.close();
       }
       catch (SQLException e) {
            System.out.println("Input Failed: " + e.getLocalizedMessage());
           
       }
        return status;
    }
    
       public List <ModelUser> getAkun(String username){
        List<ModelUser> dataAkun = null;
        try{
             String query = "SELECT nama,username, password FROM mahasiswa WHERE username = ?";
             PreparedStatement statement ;
             statement = Connector.Connect().prepareStatement(query);
             statement.setString(1,username);
             ResultSet resultSet = statement.executeQuery(query);
             while(resultSet.next()){
                 ModelUser user = new ModelUser();
                 user.setId(resultSet.getInt("id_user"));
                 user.setNama(resultSet.getString("nama"));
                 user.setUsername(resultSet.getString("username"));
                 user.setUsername(resultSet.getString("password"));
                 dataAkun.add(user);
             }
             statement.close();
        }catch(SQLException e){
           System.out.println("Input Failed : " + e.getLocalizedMessage());
       }
        return dataAkun;
       }
    }
