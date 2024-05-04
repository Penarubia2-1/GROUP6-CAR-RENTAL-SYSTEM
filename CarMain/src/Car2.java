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
    
    private JFrame f = new JFrame("Reservation");
    private JLabel lblVehicleModel, lbldays, lblAddress,lblContactnumber,lblNextResults;
    private JTextField txtfldName = new JTextField();
    private JTextField txtflddays = new JTextField();
       private JTextField txtfldAddress = new JTextField();
       private JTextField txtfldContactnumber = new JTextField(); 
      private JTextField txtfldNextResults = new JTextField(); 

    private JButton btnNext, btnBack;
    private JTextArea txtareaNextResults = new JTextArea();

    
    Car2(){
    
    f.setSize(450, 400);
    f.setLayout(null);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    
    lblVehicleModel = new JLabel("VehicleModel:");
    lblVehicleModel.setBounds(20, 50, 200, 30);
    lblVehicleModel.setFont(new Font("Arial", Font.BOLD, 20));
    
    lbldays = new JLabel("days:");
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
    
    
    

    
    
        
    btnNext = new JButton("Next");
    btnNext.setBounds(20, 250, 100, 30);
    btnNext.setFont(new Font("Arial", Font.PLAIN, 15));
    btnNext.addActionListener(this);
   
    btnBack = new JButton("Back");
    btnBack.setBounds(190, 250, 100, 30);
    btnBack.setFont(new Font("Arial", Font.PLAIN, 15));
    btnBack.addActionListener(this);
    
    txtflddays.setBounds(200, 100, 150,30);
    txtflddays.setFont(new Font("Arial", Font.PLAIN, 20));
    
    
    txtfldAddress.setBounds(200,150 , 150,30);
    txtfldAddress.setFont(new Font("Arial", Font.PLAIN, 20));
    
    txtfldContactnumber.setBounds(200, 200, 150,30);
    txtfldContactnumber.setFont(new Font("Arial", Font.PLAIN, 20));
   
    txtfldNextResults.setBounds(200, 300, 150,30);
    txtfldNextResults.setFont(new Font("Arial", Font.PLAIN, 15));

   
    
    lblNextResults = new JLabel("");
    lblNextResults.setBounds(20, 300, 480, 30);
    lblNextResults.setFont(new Font("Arial", Font.PLAIN, 15));
    
    txtareaNextResults.setBounds(20, 300, 400, 200);
    txtareaNextResults.setFont(new Font("Arial", Font.PLAIN, 15));  
    txtareaNextResults.setEditable(false);
    txtareaNextResults.setLineWrap(true);
    
    f.add(btnNext);
    f.add(btnBack);
    f.add(lblVehicleModel);
    f.add(lbldays);
    f.add(lblContactnumber);
    f.add(txtareaNextResults);
    f.add(lblAddress);
    f.add(lblNextResults);
   
    
            
    f.setVisible(true);
    f.setResizable(false);
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnNext){
            JFrame frame2 = new JFrame("");
            frame2.setVisible(true);
            frame2.setSize(450,400);
            JLabel label = new JLabel("");
            JPanel panel = new JPanel();
            frame2.add(panel);
            panel.add(label);
                   
 
        }else if(e.getSource() == btnBack){
           JFrame frame3 = new JFrame("");
            frame3.setVisible(true);
            frame3.setSize(450,400);
            JLabel label = new JLabel("");
            JPanel panel = new JPanel();
            frame3.add(panel);
            panel.add(label);
            
           
        }
        
    }
    
}