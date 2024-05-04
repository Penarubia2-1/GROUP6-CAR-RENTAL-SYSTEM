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

public class HatchbackCar implements ActionListener{
     private JLabel lblAvailableHatchBack, lblMazda2,lblBYD, lblMazda3, lblBrio,lblToyota,lblPrice,lblPMazda2, lblPBYD, lblPMazda3,lblPBrio,lblPtoyota;
     private JFrame fr=new JFrame("Hatchback Car");
     private JTextField txtfldChoose= new JTextField();
     private JButton btnadd,btndelete,btnadd1,btndelete1,btnadd2,btndelete2,btnadd3,btndelete3,btnadd4,btndelete4,btnnext,btnback;
     
     HatchbackCar(){

     fr.setSize(600,350);
     fr.setLayout(null);
     fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
       
     lblAvailableHatchBack=new JLabel("List of Available Hatchback Car");
     lblAvailableHatchBack.setBounds(150,20,330,30);
     lblAvailableHatchBack.setFont(new Font("Perpetua Titling MT", Font.BOLD,15));
            
    lblMazda2 = new JLabel("Mazda 2");
    lblMazda2.setBounds(227, 60, 120, 30);
    lblMazda2.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblMazda3 = new JLabel("Mazda 3");
    lblMazda3.setBounds(227, 120, 170, 30);
    lblMazda3.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblBYD = new JLabel("BYD Dolphin");
    lblBYD.setBounds(227, 90, 120, 30);
    lblBYD.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblBrio = new JLabel("Honda Brio");
    lblBrio.setBounds(227, 150, 120, 30);
    lblBrio.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblToyota = new JLabel("Toyota Wigo");
    lblToyota.setBounds(227, 180, 150, 30);
    lblToyota.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    //pricelist
    lblPrice=new JLabel("Price");
     lblPrice.setBounds(352,40,290,30);
     lblPrice.setFont(new Font("Arial", Font.BOLD,15));
     
    lblPMazda2 = new JLabel("10,000");
    lblPMazda2.setBounds(350, 60, 150, 30);
    lblPMazda2.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPBYD = new JLabel("10,000");
    lblPBYD.setBounds(350, 90, 170, 30);
    lblPBYD.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPMazda3 = new JLabel("10,000");
    lblPMazda3.setBounds(350, 120, 170, 30);
    lblPMazda3.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPBrio = new JLabel("10,000");
    lblPBrio.setBounds(350, 150, 150, 30);
    lblPBrio.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPtoyota = new JLabel("10,000");
    lblPtoyota.setBounds(350, 180, 120, 30);
    lblPtoyota.setFont(new Font("Arial", Font.PLAIN, 15));

    //buttons
    btnadd = new JButton("ADD");
    btnadd.setBounds(160, 67, 60, 20);
    btnadd.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd.addActionListener(this);
    
    btndelete = new JButton("DELETE");
    btndelete.setBounds(85, 67, 70, 20);
    btndelete.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete.addActionListener(this);

    
    btnadd1 = new JButton("ADD");
    btnadd1.setBounds(160, 97, 60, 20);
    btnadd1.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd1.addActionListener(this);
    
    btndelete1 = new JButton("DELETE");
    btndelete1.setBounds(85, 97, 70, 20);
    btndelete1.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete1.addActionListener(this);
    
     //buttonMINIBUSVAN
    btnadd2 = new JButton("ADD");
    btnadd2.setBounds(160, 127, 60, 20);
    btnadd2.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd2.addActionListener(this);
    
    btndelete2 = new JButton("DELETE");
    btndelete2.setBounds(85, 127, 70, 20);
    btndelete2.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete2.addActionListener(this);

    //buttonmicro
    btnadd3 = new JButton("ADD");
    btnadd3.setBounds(160, 157, 60, 20);
    btnadd3.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd3.addActionListener(this);

    btndelete3 = new JButton("DELETE");
    btndelete3.setBounds(85, 157, 70, 20);
    btndelete3.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete3.addActionListener(this);
    
    //buttonpanel
    btnadd4 = new JButton("ADD");
    btnadd4.setBounds(160, 187, 60, 20);
    btnadd4.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd4.addActionListener(this);
    
    btndelete4 = new JButton("DELETE");
    btndelete4.setBounds(85, 187, 70, 20);
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
    fr.add(lblAvailableHatchBack);
    fr.add(lblMazda2);
    fr.add(lblMazda3);
    fr.add(lblBYD);
    fr.add(lblBrio);
    fr.add(lblToyota);
    fr.add(lblPrice);
    fr.add(lblPMazda2);
    fr.add(lblPBYD);
    fr.add(lblPMazda3);
    fr.add(lblPBrio);
    fr.add(lblPtoyota);
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