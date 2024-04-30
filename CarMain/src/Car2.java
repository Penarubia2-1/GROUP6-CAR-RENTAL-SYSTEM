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
    private JLabel lblName, lbldays, lblAddress,lblContactnumber,lblLoginResults;
    private JTextField txtfldName = new JTextField();
    private JTextField txtflddays = new JTextField();
       private JTextField txtfldAddress = new JTextField();
       private JTextField txtfldContactnumber = new JTextField(); 
      private JTextField txtfldLoginResults = new JTextField(); 

    private JButton btnNext, btnBack;
    private JTextArea txtareaLoginResults = new JTextArea();

    
    Car2(){
    
    f.setSize(450, 400);
    f.setLayout(null);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    
    lblName = new JLabel("Name:");
    lblName.setBounds(20, 50, 200, 30);
    lblName.setFont(new Font("Arial", Font.BOLD, 20));
    
    lbldays = new JLabel("days");
    lbldays.setBounds(20, 100, 200, 30);
    lbldays.setFont(new Font("Arial", Font.BOLD, 20));
  
    
    txtfldName.setBounds(200, 50, 150,30);
    txtfldName.setFont(new Font("Arial", Font.PLAIN, 20));
    
    lblAddress = new JLabel("Address:");
    lblAddress.setBounds(20, 150, 200, 30);
    lblAddress.setFont(new Font("Arial", Font.BOLD, 20));
    
    lblContactnumber = new JLabel("Contactnumber:");
    lblContactnumber.setBounds(20, 200, 200, 30);
    lblContactnumber.setFont(new Font("Arial", Font.BOLD, 20));
    
    
    
    txtflddays.setBounds(200, 100, 150,30);
    txtflddays.setFont(new Font("Arial", Font.PLAIN, 20));
    
    
    txtfldAddress.setBounds(200,150 , 150,30);
    txtfldAddress.setFont(new Font("Arial", Font.PLAIN, 20));
    
    txtfldContactnumber.setBounds(200, 200, 150,30);
    txtfldContactnumber.setFont(new Font("Arial", Font.PLAIN, 20));
   
    txtfldLoginResults.setBounds(200, 300, 150,30);
    txtfldLoginResults.setFont(new Font("Arial", Font.PLAIN, 15));

    
    
        
    btnNext = new JButton("Next");
    btnNext.setBounds(20, 250, 100, 30);
    btnNext.setFont(new Font("Arial", Font.PLAIN, 15));
    btnNext.addActionListener(this);
   
    btnBack = new JButton("Back");
    btnBack.setBounds(190, 250, 100, 30);
    btnBack.setFont(new Font("Arial", Font.PLAIN, 15));
    btnBack.addActionListener(this);
    
   
    
    lblLoginResults = new JLabel("");
    lblLoginResults.setBounds(20, 300, 480, 30);
    lblLoginResults.setFont(new Font("Arial", Font.PLAIN, 15));
    
    txtareaLoginResults.setBounds(20, 300, 400, 200);
    txtareaLoginResults.setFont(new Font("Arial", Font.PLAIN, 15));  
    txtareaLoginResults.setEditable(false);
    txtareaLoginResults.setLineWrap(true);
    
    f.add(btnNext);
    f.add(btnBack);
    f.add(lblName);
    f.add(lbldays);
    f.add(lblContactnumber);
    f.add(txtareaLoginResults);
    f.add(lblAddress);
    f.add(txtfldName);
    f.add(txtflddays);
    f.add(txtfldAddress);
    f.add(txtfldContactnumber);
    
   
    
            
    f.setVisible(true);
    f.setResizable(false);
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnNext){
            
           lbldays.setText("");
           lbl
           
           lblLoginResults.setText("");
           txtareaLoginResults.setText("Your email : "+email+"\nPassword : "+password);
        }else if(e.getSource() == btnBack){
           txtfldName.setText("");
           txtflddays.setText("");
           txtfldContactnumber.setText("");
           txtfldAddress.setText("");
           
           
           
           lblLoginResults.setText("");
           txtareaLoginResults.setText(""); 
           
        }
        
    }
    
}