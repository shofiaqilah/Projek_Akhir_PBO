/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.User.*;
import Model.User.*;
import java.util.List;
import javax.swing.*;
/**
 *
 * @author ASUS
 */
public class ControllerUser {
    LogIn halamanLogin;
    SignUp halamanSignup;
    ViewAkun halamanView;
    UserDAO daoUser ;
    
    public ControllerUser (LogIn halamanLogin){
        this.halamanLogin = halamanLogin;
        daoUser = new UserDAO();
    }
    public ControllerUser (SignUp halamanSignup){
        this.halamanSignup = halamanSignup;
        daoUser = new UserDAO();
    }
    
    
    public boolean loginUser(String usn, String pass){
        boolean status =  false;
        try{
            String username = halamanLogin.getUsernameInput();
            String password = halamanLogin.getPasswordInput();

            if (username.isEmpty() || password.isEmpty()) {
                throw new Exception("Data tidak boleh kosong!");
            }
            else{
                status = daoUser.cekAkun(usn, pass);
                if (status == true){
                    JOptionPane.showMessageDialog(null,"Berhasil Login");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Password atau username salah");
                }
            }
            
        }
        catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return status;
    }
    
    /*public void DataAkun(){
        daoUser.getAkun();
    }*/
    
    public void insertUser(){
        try {
            ModelUser userBaru = new ModelUser();
            
            String nama = halamanSignup.getNamaInput();
            String username = halamanSignup.getUsernameInput();
            String password = halamanSignup.getPasswordInput();

            if ("".equals(nama) || "".equals(username) || "".equals(password)) {
                throw new Exception("Data tidak boleh kosong!");
            } 
            else{
                userBaru.setNama(nama);
                userBaru.setUsername(username);
                userBaru.setPassword(password);
                daoUser.insert(userBaru);
                JOptionPane.showMessageDialog(null, "Akun berhasil dibuat :D");
                halamanSignup.dispose();
                new LogIn().setVisible(true);
            }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    public void UpdateUser(){
        try {
            ModelUser userBaru = new ModelUser();
            
            String nama = halamanView.getNamaInput();
            String username = halamanView.getUsernameInput();
            String password = halamanView.getPasswordInput();

            if ("".equals(nama) || "".equals(username) || "".equals(password)) {
                throw new Exception("Data tidak boleh kosong!");
            }
            userBaru.setNama(nama);
            userBaru.setUsername(username);
            userBaru.setPassword(password);
            daoUser.insert(userBaru);
            JOptionPane.showMessageDialog(null, "Akun berhasil dibuat :D");
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
