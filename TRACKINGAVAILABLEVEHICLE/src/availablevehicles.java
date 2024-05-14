import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author penarubia
 */
public class availablevehicles extends JFrame {
        private JLabel lblAvailableVehicle, lblTypes, lblChoose;  
        private JButton btnMuscle,btnSUV,btnVan,btnHatchback,btnPickup;
        private JFrame fr=new JFrame("Available Vehicle");

       availablevehicles(){
       fr.setSize(450,400);
       fr.getContentPane().setBackground(Color.gray);
       fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
       
       
       lblAvailableVehicle=new JLabel("AVAILABLE TYPES OF VEHICLE");
       lblAvailableVehicle.setBounds(100,20,390,30);
       lblAvailableVehicle.setFont(new Font("Arial", Font.BOLD,15));
       lblAvailableVehicle.setForeground(Color.WHITE);
       
       lblTypes=new JLabel("CHOOSE WHAT TYPE OF CAR:");
       lblTypes.setBounds(146,45,190,30);
       lblTypes.setFont(new Font("Arial", Font.BOLD,10));
       lblTypes.setForeground(Color.WHITE);

       
       //buttons
       btnMuscle = new JButton("MUSCLE CAR");
       btnMuscle.setBounds(142,75,160,30);
       btnMuscle.setBackground(Color.BLACK);
       btnMuscle.setForeground(Color.WHITE);

       btnSUV = new JButton("SUV CAR");
       btnSUV.setBounds(142,115,160,30); 
       btnSUV.setBackground(Color.BLACK);
       btnSUV.setForeground(Color.WHITE);

       
       btnVan = new JButton("VAN CAR");
       btnVan.setBounds(142,155,160,30);
       btnVan.setBackground(Color.BLACK);
       btnVan.setForeground(Color.WHITE);
       
       btnHatchback = new JButton("HATCHBACK CAR");
       btnHatchback.setBounds(142,195,160,30);
       btnHatchback.setBackground(Color.BLACK);
       btnHatchback.setForeground(Color.WHITE);
       
       btnPickup = new JButton("PICKUP CAR");
       btnPickup.setBounds(142,235,160,30);
       btnPickup.setBackground(Color.BLACK);
       btnPickup.setForeground(Color.WHITE);

       

       //f.add
       fr.add(lblAvailableVehicle);
       fr.add(lblTypes);
       fr.add(btnMuscle);
       fr.add(btnSUV);
       fr.add(btnVan);
       fr.add(btnHatchback);
       fr.add(btnPickup);
       
       //f.set
       fr.setLayout(null);
       fr.setVisible(true);
           fr.setResizable(false);

 
   
   }

public  void actionPerformed(ActionEvent e){
    
}

}
