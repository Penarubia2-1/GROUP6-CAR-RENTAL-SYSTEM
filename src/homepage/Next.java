/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepage;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author 639319165346
 */
public class Next {
    private JFrame frame = new JFrame("Login/Register");
   private JButton btnLogin,btnRegister;
   Next(){
       
   
     frame.setSize(350,280);
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   btnLogin = new JButton("LOGIN");
   btnLogin.setBounds(50,80,250, 25);
   btnLogin.setFont(new Font("Arial", Font.PLAIN,15));
   
   btnRegister = new JButton("REGISTER/CREATE ACCOUNT");
   btnRegister.setBounds(50, 130,250,25);
   btnRegister.setFont(new Font("Arial", Font.PLAIN,15));
   
   frame.add(btnLogin);
   frame.add(btnRegister);
   frame.setVisible(true);
   frame.setResizable(false);


   }
}
