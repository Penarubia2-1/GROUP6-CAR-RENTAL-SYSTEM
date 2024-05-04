import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
        private JFrame f=new JFrame("Available Vehicles");
        private JButton btnMuscle,btnSUV,btnVan,btnHatchback,btnPickup;
   availablevehicles(){
       
       //setsize
       f.setSize(450,400);
       
       lblAvailableVehicle=new JLabel("Available Vehicles");
       lblAvailableVehicle.setBounds(130,20,190,30);
       lblAvailableVehicle.setFont(new Font("Perpetua Titling MT", Font.BOLD,15));
              
       lblTypes=new JLabel("Types");
       lblTypes.setBounds(190,40,190,30);
       lblTypes.setFont(new Font("Perpetua Titling MT", Font.BOLD,15));
       
       
       //buttons
      btnMuscle = new JButton("Muscle Car");
       btnMuscle.setBounds(142,75,160,30);

        btnSUV = new JButton("SUV Car");
       btnSUV.setBounds(142,115,160,30); 
       
        btnVan = new JButton("Van Car");
       btnVan.setBounds(142,155,160,30);
       
        btnHatchback = new JButton("Hatchback Car");
       btnHatchback.setBounds(142,195,160,30);
       
        btnPickup = new JButton("Pickup Car");
       btnPickup.setBounds(142,235,160,30);

       

       //f.add
       f.add(lblAvailableVehicle);
       f.add(lblTypes);
       f.add(btnMuscle);
       f.add(btnSUV);
       f.add(btnVan);
       f.add(btnHatchback);
       f.add(btnPickup);
       
       //f.set
       f.setLayout(null);
       
       f.setVisible(true);
       
       f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
   
 
   
   }

public  void actionPerformed(ActionEvent e){
    if(e.getSource() == btnMuscle){
JFrame frame2 = new JFrame ("");
frame2.setVisible (true);
JLabel label = new JLabel("");
frame2.setSize(400,400);
JPanel panel = new JPanel();

frame2.add(panel);
panel.add(label);
        
            
}
    else if (e.getSource() == btnSUV){
    JFrame frame3 = new JFrame ("");
frame3.setVisible (true);
JLabel label = new JLabel("");
frame3.setSize(400,400);
JPanel panel = new JPanel();

frame3.add(panel);
panel.add(label);
        
}
}
}