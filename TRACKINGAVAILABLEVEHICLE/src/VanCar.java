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

public class VanCar implements ActionListener{
     private JLabel lblAvailableVanCar, lblMiniMPV,lblMiniVan, lblBoxVan, lblMicroVan,lblPanelVan,lblpricelist,lblPMPV, lblPMini, lblPBox,lblPMicro,lblPPanel;
     private JFrame fr=new JFrame("Van Car");
     private JButton btnadd,btndelete,btnadd1,btndelete1,btnadd2,btndelete2,btnadd3,btndelete3,btnadd4,btndelete4,btnnext,btnback;     
     VanCar(){

     fr.setSize(620,360);
     fr.setLayout(null);
     fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
       
     lblAvailableVanCar=new JLabel("List of Available Van Car");
     lblAvailableVanCar.setBounds(180,20,280,30);
     lblAvailableVanCar.setFont(new Font("Perpetua Titling MT", Font.BOLD,15));
            
    lblMiniMPV = new JLabel("Mini MPV");
    lblMiniMPV.setBounds(265, 60, 120, 30);
    lblMiniMPV.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblMiniVan = new JLabel("Mini Van");
    lblMiniVan.setBounds(265, 90, 120, 30);
    lblMiniVan.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblBoxVan = new JLabel("Box Van");
    lblBoxVan.setBounds(265, 120, 170, 30);
    lblBoxVan.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblMicroVan = new JLabel("Micro Van");
    lblMicroVan.setBounds(265, 150, 120, 30);
    lblMicroVan.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblPanelVan = new JLabel("Panel Van");
    lblPanelVan.setBounds(265, 180, 150, 30);
    lblPanelVan.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    //pricelist
    lblpricelist= new JLabel ("Price");
    lblpricelist.setBounds(370,40,180,30);
    lblpricelist.setFont(new Font("Arial",Font.BOLD, 15));
    
    lblPMPV = new JLabel("10,000");
    lblPMPV.setBounds(368, 120, 170, 30);
    lblPMPV.setFont(new Font("Arial", Font.PLAIN, 15));
   
    lblPMini = new JLabel("10,000");
    lblPMini.setBounds(368, 60, 120, 30);
    lblPMini.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPBox = new JLabel("10,000");
    lblPBox.setBounds(368, 90, 120, 30);
    lblPBox.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPMicro = new JLabel("10,000");
    lblPMicro.setBounds(368, 150, 150, 30);
    lblPMicro.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblPPanel = new JLabel("10,000");
    lblPPanel.setBounds(368, 180, 120, 30);
    lblPPanel.setFont(new Font("Arial", Font.PLAIN, 15));

    //buttons
    btnadd = new JButton("ADD");
    btnadd.setBounds(200, 65, 60, 20);
    btnadd.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd.addActionListener(this);
    
    btndelete = new JButton("DELETE");
    btndelete.setBounds(120, 65, 70, 20);
    btndelete.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete.addActionListener(this);
    
    //buttonMINIVAN
    btnadd1 = new JButton("ADD");
    btnadd1.setBounds(200, 95, 60, 20);
    btnadd1.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd1.addActionListener(this);
    
    btndelete1 = new JButton("DELETE");
    btndelete1.setBounds(120, 95, 70, 20);
    btndelete1.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete1.addActionListener(this);
    
     //buttonMINIBUSVAN
    btnadd2 = new JButton("ADD");
    btnadd2.setBounds(200, 125, 60, 20);
    btnadd2.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd2.addActionListener(this);
    
    btndelete2 = new JButton("DELETE");
    btndelete2.setBounds(120, 125, 70, 20);
    btndelete2.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete2.addActionListener(this);

    //buttonmicro
    btnadd3 = new JButton("ADD");
    btnadd3.setBounds(200, 155, 60, 20);
    btnadd3.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd3.addActionListener(this);

    btndelete3 = new JButton("DELETE");
    btndelete3.setBounds(120, 155, 70, 20);
    btndelete3.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete3.addActionListener(this);
    
    //buttonpanel
    btnadd4 = new JButton("ADD");
    btnadd4.setBounds(200, 185, 60, 20);
    btnadd4.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd4.addActionListener(this);
    
    btndelete4 = new JButton("DELETE");
    btndelete4.setBounds(120, 185, 70, 20);
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
    fr.add(lblAvailableVanCar);
    fr.add(lblMiniMPV);
    fr.add(lblMiniVan);
    fr.add(lblBoxVan);
    fr.add(lblMicroVan);
    fr.add(lblPanelVan);
    fr.add(lblpricelist);
    fr.add(lblPMPV);
    fr.add(lblPMini);
    fr.add(lblPBox);
    fr.add(lblPMicro);
    fr.add(lblPPanel);
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