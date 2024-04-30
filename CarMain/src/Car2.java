
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daiichi Magno
 */
public class Car2 implements ActionListener {
    
    private JFrame f = new JFrame("My Login");
    private JLabel lblEmail, lblPassword, lblLoginResults;
    private JTextField txtfldEmail = new JTextField(); 
    private JPasswordField psswrdfldPassword = new JPasswordField();
    private JButton btnLogIn, btnExit;
    private JTextArea txtareaLoginResults = new JTextArea();

    
    car2(){
    
    f.setSize(450, 450);
    f.setLayout(null);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    
    lblEmail = new JLabel("Email:");
    lblEmail.setBounds(20, 50, 200, 30);
    lblEmail.setFont(new Font("Arial", Font.BOLD, 15));
    
    lblPassword = new JLabel("Password:");
    lblPassword.setBounds(20, 100, 200, 30);
    lblPassword.setFont(new Font("Arial", Font.BOLD, 15));
    
    txtfldEmail.setBounds(140, 50, 150,30);
    txtfldEmail.setFont(new Font("Arial", Font.PLAIN, 15));
    
    psswrdfldPassword.setBounds(140, 100, 150,30);
    psswrdfldPassword.setFont(new Font("Arial", Font.PLAIN, 15));

 
    
    
    
        
    btnLogIn = new JButton("LogIn");
    btnLogIn.setBounds(20, 170, 100, 30);
    btnLogIn.setFont(new Font("Arial", Font.PLAIN, 15));
    btnLogIn.addActionListener(this);
   
    btnExit.setBounds(190, 170, 100, 30);
    btnExit.setFont(new Font("Arial", Font.PLAIN, 15));
    btnExit.addActionListener(this);
    
   
    
    lblLoginResults = new JLabel("");
    lblLoginResults.setBounds(20, 200, 480, 30);
    lblLoginResults.setFont(new Font("Arial", Font.PLAIN, 15));
    
    txtareaLoginResults.setBounds(20, 300, 400, 200);
    txtareaLoginResults.setFont(new Font("Arial", Font.PLAIN, 15));  
    txtareaLoginResults.setEditable(false);
    txtareaLoginResults.setLineWrap(true);
    
    f.add(lblEmail);
    f.add(lblPassword);
    f.add(txtfldEmail);
    f.add(psswrdfldPassword);
    f.add(btnLogIn);
    f.add(btnExit);
    f.add(lblLoginResults);
    f.add(txtareaLoginResults);

    f.setVisible(true);
    f.setResizable(false);
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnLogIn){
           String email = txtfldEmail.getText();
           String password = psswrdfldPassword.getText();
           
           lblLoginResults.setText("!");
           txtareaLoginResults.setText("Your email : "+email+"\nPassword : "+password);
        }else if(e.getSource() == btnReset){
           txtfldEmail.setText("");
           psswrdfldPassword.setText("");
           
           lblLoginResults.setText("");
           txtareaLoginResults.setText(""); 
           
        }
        
    }
    
}