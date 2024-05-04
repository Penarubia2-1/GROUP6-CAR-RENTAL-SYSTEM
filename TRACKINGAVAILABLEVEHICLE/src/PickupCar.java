import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author penarubia
 */

public class PickupCar implements ActionListener{
     private JLabel lblAvailablePickup, lblRanger, lblToyota, lblIsuzuD,lblNavarra,lblfoton,lblPrice,lblPRanger,lblPToyota, lblPIsuzuD,lblPNavarra,lblPfoton;
     private JFrame fr=new JFrame("Pickup Car");
     private JTextField txtfldChoose= new JTextField();
     private JButton btnadd,btndelete,btnadd1,btndelete1,btnadd2,btndelete2,btnadd3,btndelete3,btnadd4,btndelete4,btnnext,btnback;
     
     PickupCar(){

     fr.setSize(550,350);
     fr.setLayout(null);
     fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
       
    lblAvailablePickup=new JLabel("List of Available Pickup Car");
    lblAvailablePickup.setBounds(180,20,280,30);
    lblAvailablePickup.setFont(new Font("Perpetua Titling MT", Font.BOLD,15));
            
    lblRanger = new JLabel("Ford Ranger");
    lblRanger.setBounds(210, 60, 120, 30);
    lblRanger.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblToyota = new JLabel("Toyota Hilux");
    lblToyota.setBounds(210, 120, 170, 30);
    lblToyota.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblIsuzuD = new JLabel("Isuzu D-Max");
    lblIsuzuD.setBounds(210, 90, 170, 30);
    lblIsuzuD.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    
    lblNavarra= new JLabel("Nissan Navara");
    lblNavarra.setBounds(210, 150, 160, 30);
    lblNavarra.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblfoton = new JLabel("Foton Thunder");
    lblfoton.setBounds(210, 180, 150, 30);
    lblfoton.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    //pricelist
    lblPrice=new JLabel("Price");
    lblPrice.setBounds(353,42,200,30);
    lblPrice.setFont(new Font("Arial", Font.PLAIN,15));
    
    lblPRanger = new JLabel("10,000");
    lblPRanger.setBounds(350, 60, 180, 30);
    lblPRanger.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPToyota = new JLabel("10,000");
    lblPToyota.setBounds(350, 90, 170, 30);
    lblPToyota.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPIsuzuD = new JLabel("10,000");
    lblPIsuzuD.setBounds(350, 120, 150, 30);
    lblPIsuzuD.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPNavarra = new JLabel("10,000");
    lblPNavarra.setBounds(350, 150, 190, 30);
    lblPNavarra.setFont(new Font("Arial", Font.PLAIN, 15));
    
    
    lblPfoton = new JLabel("10,000");
    lblPfoton.setBounds(350, 180, 180, 30);
    lblPfoton.setFont(new Font("Arial", Font.PLAIN, 15));
     
    
    
    
    //buttons
    btnadd = new JButton("ADD");
    btnadd.setBounds(143, 67, 60, 20);
    btnadd.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd.addActionListener(this);
    
    btndelete = new JButton("DELETE");
    btndelete.setBounds(65, 67, 70, 20);
    btndelete.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete.addActionListener(this);

    
    btnadd1 = new JButton("ADD");
    btnadd1.setBounds(143, 97, 60, 20);
    btnadd1.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd1.addActionListener(this);
    
    btndelete1 = new JButton("DELETE");
    btndelete1.setBounds(65, 97, 70, 20);
    btndelete1.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete1.addActionListener(this);
    
     
    btnadd2 = new JButton("ADD");
    btnadd2.setBounds(143, 127, 60, 20);
    btnadd2.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd2.addActionListener(this);
    
    btndelete2 = new JButton("DELETE");
    btndelete2.setBounds(65, 127, 70, 20);
    btndelete2.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete2.addActionListener(this);

    btnadd3 = new JButton("ADD");
    btnadd3.setBounds(143, 157, 60, 20);
    btnadd3.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd3.addActionListener(this);

    btndelete3 = new JButton("DELETE");
    btndelete3.setBounds(65, 157, 70, 20);
    btndelete3.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete3.addActionListener(this);
    
    btnadd4 = new JButton("ADD");
    btnadd4.setBounds(143, 187, 60, 20);
    btnadd4.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd4.addActionListener(this);
    
    btndelete4 = new JButton("DELETE");
    btndelete4.setBounds(65, 187, 70, 20);
    btndelete4.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete4.addActionListener(this);
   
    btnback = new JButton("BACK");
    btnback.setBounds(170, 220, 100, 30);
    btnback.setFont(new Font("Arial", Font.BOLD, 15));
    btnback.addActionListener(this);
    
    btnnext = new JButton("NEXT");
    btnnext.setBounds(290, 220, 100, 30);
    btnnext.setFont(new Font("Arial", Font.BOLD, 15));
    btnnext.addActionListener(this);
   
    
    //add
    fr.add(lblAvailablePickup);
    fr.add(lblRanger);
    fr.add(lblToyota);
    fr.add(lblIsuzuD);
    fr.add(lblNavarra);
    fr.add(lblfoton);
    fr.add(lblPrice);
    fr.add(lblPRanger);
    fr.add(lblPToyota);
    fr.add(lblPIsuzuD);
    fr.add(lblPNavarra);
    fr.add(lblPfoton);
    fr.add(btnnext);
    fr.add(btnadd);
    fr.add(btndelete);
    fr.add(btnadd1);
    fr.add(btndelete1);
    fr.add(btnadd2);
    fr.add(btndelete2);
    fr.add(btnadd3);
    fr.add(btndelete3);
    fr.add(btnadd4);
    fr.add(btndelete4);
    fr.add(btnnext);
    fr.add(btnback);
    
    fr.setVisible(true);
    fr.setResizable(false);
}
     @Override
     public void actionPerformed(ActionEvent e){
}
}