/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepage;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author 639319165346
 */
public class Home extends JFrame{
    private JFrame frame = new JFrame("Homepage");
    private JLabel lblCarRentalSystem;
    private JButton btnAvailableVehicle,btnReservation,btnOtherservices;
   
    
 Home(){
     frame.setSize(300,450);
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
     lblCarRentalSystem = new JLabel("CarRentalSystem");
     lblCarRentalSystem.setBounds(70,50,200,30);
     lblCarRentalSystem.setFont(new Font("Arial", Font.BOLD, 20));
     
     
     
     btnAvailableVehicle = new JButton("Available");
     btnAvailableVehicle.setBounds(80,100, 120,30 );
     btnAvailableVehicle.setFont(new Font("Arial", Font.PLAIN,15));
     
     btnReservation = new JButton("Reservation");
     btnReservation.setBounds(80,150, 120,30);
     btnReservation.setFont(new Font("Arial", Font.PLAIN,15));
   
     btnOtherservices = new JButton("Other Services");
     btnOtherservices.setBounds(80,200,120, 30);
     btnOtherservices.setFont(new Font("Arial", Font.PLAIN,15));
     
     
    
     
     
     frame.add(btnOtherservices);
     frame.add(lblCarRentalSystem);
     frame.add(btnAvailableVehicle);
     frame.add(btnReservation);
     frame.setVisible(true);
     frame.setResizable(false);
        
        
        
     
     
     
     
     
     
     
     
     
 
        
        
        } 
 
 
 
 
 
    
    
    
}
