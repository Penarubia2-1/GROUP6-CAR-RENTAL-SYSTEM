import java.awt.Frame;
import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daiichi Magno
 */
public class car4 extends JFrame{
    public car4(){
        setSize(500, 500);
        
        private Frame f = new JFrame("My Login");
    private JLabel lblEmail, lblPassword, lblLoginResults;
    private JTextField txtfldEmail = new JTextField(); 
    private JPasswordField psswrdfldPassword = new JPasswordField();
    private JButton btnLogIn, btnBack;
    private JTextArea txtareaLoginResults = new JTextArea();
            
       
 
    
    
    
        
    btnLogIn = new JButton("LogIn");
    btnLogIn.setBounds(20, 170, 100, 30);
    btnLogIn.setFont(new Font("Arial", Font.PLAIN, 15));
    btnLogIn.addActionListener(this);
   
    btnBack = new JButton("Back");
    btnBack.setBounds(190, 170, 100, 30);
    btnBack.setFont(new Font("Arial", Font.PLAIN, 15));
    btnBack.addActionListener(this);
        

        //Add to Frame
        
    add(lblEmail);
    add(lblPassword);
    add(txtfldEmail);
    add(psswrdfldPassword);
    add(btnLogIn);
    add(btnBack);
    add(lblLoginResults);
    add(txtareaLoginResults);
        
        //Layout
        setLayout(null);
        
        //Visible 
        setVisible(true);
      
        
    }
}
