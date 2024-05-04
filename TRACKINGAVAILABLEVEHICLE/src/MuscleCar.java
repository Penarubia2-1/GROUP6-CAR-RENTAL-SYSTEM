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

public class MuscleCar implements ActionListener{
     private JLabel lblAvailableMuscleCar, lblChevrolet,lblMustang, lblFord, lblChallenger,lblDodge,lblprice,lblPChevrolet, lblPMustang, lblPFord,lblPChallenger,lblPDodge;
     private JFrame fr=new JFrame("Muscle Car");
     private JButton btnadd,btndelete,btnadd1,btndelete1,btnadd2,btndelete2,btnadd3,btndelete3,btnadd4,btndelete4,btnnext,btnback;
     MuscleCar(){

     fr.setSize(600,400);
     fr.setLayout(null);
     fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
     
     lblAvailableMuscleCar=new JLabel("List of Available Muscle Car");
     lblAvailableMuscleCar.setBounds(150,20,290,30);
     lblAvailableMuscleCar.setFont(new Font("Perpetua Titling MT", Font.BOLD,15));
       
     
   
    
      lblChevrolet = new JLabel("Chevrolet");
      lblChevrolet.setBounds(242, 59, 120, 30);
      lblChevrolet.setFont(new Font("Arial Black", Font.BOLD, 15));
      
     lblMustang = new JLabel  ("Mustang");
     lblMustang.setBounds(242, 89, 120, 30);
     lblMustang.setFont(new Font("Arial Black", Font.BOLD,15));
     
    lblFord = new JLabel("Ford");
    lblFord.setBounds(242, 119, 120, 30);
    lblFord.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblChallenger = new JLabel("Challenger");
    lblChallenger.setBounds(242, 148, 120, 30);
    lblChallenger.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblDodge = new JLabel("Dodge");
    lblDodge.setBounds(242, 179, 120, 30);
    lblDodge.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    
    //pricelist 
    lblprice=new JLabel("Price");
     lblprice.setBounds(352,42,290,30);
     lblprice.setFont(new Font("Arial Black", Font.PLAIN,15));
    
   lblPChevrolet = new JLabel("10,000");
    lblPChevrolet.setBounds(350, 60, 120, 30);
    lblPChevrolet.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPMustang = new JLabel("10,000");
    lblPMustang.setBounds(350, 90, 120, 30);
    lblPMustang.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPFord = new JLabel("10,000");
    lblPFord.setBounds(350, 120, 120, 30);
    lblPFord.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPChallenger = new JLabel("10,000");
    lblPChallenger.setBounds(350, 150, 120, 30);
    lblPChallenger.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPDodge = new JLabel("10,000");
    lblPDodge.setBounds(350, 180, 120, 30);
    lblPDodge.setFont(new Font("Arial", Font.PLAIN, 15));
      
    //button
    btnadd = new JButton("ADD");
    btnadd.setBounds(178, 65, 60, 20);
    btnadd.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd.addActionListener(this);
    
    btndelete = new JButton("DELETE");
    btndelete.setBounds(100, 65, 70, 20);
    btndelete.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete.addActionListener(this);
    
    btnadd1 = new JButton("ADD");
    btnadd1.setBounds(178, 95, 60, 20);
    btnadd1.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd1.addActionListener(this);
    
    btndelete1 = new JButton("DELETE");
    btndelete1.setBounds(100, 95, 70, 20);
    btndelete1.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete1.addActionListener(this);
    
    
    btnadd2 = new JButton("ADD");
    btnadd2.setBounds(178, 125, 60, 20);
    btnadd2.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd2.addActionListener(this);
    
    btndelete2 = new JButton("DELETE");
    btndelete2.setBounds(100, 125, 70, 20);
    btndelete2.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete2.addActionListener(this);

    btnadd3 = new JButton("ADD");
    btnadd3.setBounds(178, 155, 60, 20);
    btnadd3.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd3.addActionListener(this);

    btndelete3 = new JButton("DELETE");
    btndelete3.setBounds(100, 155, 70, 20);
    btndelete3.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete3.addActionListener(this);
    
    btnadd4 = new JButton("ADD");
    btnadd4.setBounds(178, 185, 60, 20);
    btnadd4.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd4.addActionListener(this);
    
    btndelete4 = new JButton("DELETE");
    btndelete4.setBounds(100, 185, 70, 20);
    btndelete4.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete4.addActionListener(this);
    
    btnnext = new JButton("NEXT");
    btnnext.setBounds(280, 240, 100, 30);
    btnnext.setFont(new Font("Arial", Font.BOLD, 15));
    btnnext.addActionListener(this);
    
    btnback = new JButton("BACK");
    btnback.setBounds(150, 240, 100, 30);
    btnback.setFont(new Font("Arial", Font.BOLD, 15));
    btnback.addActionListener(this);

    //add
    fr.add(lblAvailableMuscleCar);
    fr.add(lblChevrolet);
    fr.add(lblMustang); 
    fr.add(lblFord);
    fr.add(lblChallenger);
    fr.add(lblDodge);
    fr.add(lblprice);
    fr.add(lblPChevrolet);
    fr.add(lblPMustang);
    fr.add(lblPFord);
    fr.add(lblPChallenger);
    fr.add(lblPDodge);
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
