/*
 * To change this license header, cho               ose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Log implements ActionListener{ 
    private JFrame frame = new JFrame("LogIn");
    private JLabel lblEmail,lblPassword,lblResult;
    private JTextField txtfldEmail = new JTextField();
    private JPasswordField psswrdfldPassword = new JPasswordField();
    private JButton btnLogin,btnExit;
    
    Log(){
     frame.setSize(400,300);
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     lblEmail = new JLabel("Email:");
     lblEmail.setBounds(30 ,60 ,90 , 30 );
     lblEmail.setFont(new Font("Arial", Font.BOLD, 20));
     
     lblPassword = new JLabel("Password:");
     lblPassword.setBounds(30 ,90 ,120 , 30 );
     lblPassword.setFont(new Font("Arial", Font.BOLD, 20));
     
     txtfldEmail.setBounds(140, 60, 150 ,30);
     txtfldEmail.setFont(new Font("Arial", Font.BOLD, 20));
     
     psswrdfldPassword.setBounds(140, 90, 150 ,30);
     psswrdfldPassword.setFont(new Font("Arial", Font.BOLD, 20));
     
     btnLogin = new JButton("Login");
     btnLogin.setBounds(20,160,120,30);
     btnLogin.setFont(new Font("Arial", Font.BOLD, 20));
     
     
     btnExit = new JButton("Exit");
     btnExit.setBounds(140,160,120,30);
     btnExit.setFont(new Font("Arial", Font.BOLD,20));
     
     
     
         frame.add(lblEmail);
         frame.add(lblPassword);
         frame.add(txtfldEmail);
         frame.add(psswrdfldPassword);
         frame.add(btnLogin);
         frame.add(btnExit);
         
         frame.setVisible(true);
         frame.setResizable(false);
     
         
     
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    
    
}
