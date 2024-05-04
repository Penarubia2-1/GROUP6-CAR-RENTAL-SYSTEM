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
 * @author lenovo
 */

   
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author penarubia
 */

public class SUVCar implements ActionListener{
     private JLabel lblSUVCar,lblCherttiggo,lblMustang, lblRover, lblGeely,lblWagon,lblPrice,lblJetour, lblSuzukiJimny, lblKia,lblFoton,lblHyundai;
     private JFrame fr=new JFrame("SUV Car");
     private JTextField txtfldChoose= new JTextField();
     private JButton btnnext,btnadd,btndelete,btnadd1,btndelete1,btnadd2,btndelete2,btnadd3,btndelete3,btnadd4,btndelete4,btnback;
     
     SUVCar(){

     fr.setSize(550,400);
     fr.setLayout(null);
     fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
       
     lblSUVCar=new JLabel("List of Available SUV Car");
     lblSUVCar.setBounds(180,20,280,30);
     lblSUVCar.setFont(new Font("Perpetua Titling MT", Font.BOLD,15));
            
    lblCherttiggo = new JLabel("Chery Tiggo");
    lblCherttiggo.setBounds(250, 70, 150, 30);
    lblCherttiggo.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblMustang = new JLabel("Mustang");
    lblMustang.setBounds(250, 100, 150, 30);
    lblMustang.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblRover = new JLabel("Land Rover");
    lblRover.setBounds(250, 130, 150, 30);
    lblRover.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblHyundai = new JLabel("Geely GX3");
    lblHyundai.setBounds(250, 160, 150, 30);
    lblHyundai.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    lblWagon = new JLabel("BAIC Wagon");
    lblWagon.setBounds(250, 190, 150, 30);
    lblWagon.setFont(new Font("Arial Black", Font.BOLD, 15));
    
    //price
    lblPrice=new JLabel("Price");
    lblPrice.setBounds(370,40,200,40);
    lblPrice.setFont(new Font("Arial",Font.BOLD,15));
    
    
    lblJetour = new JLabel("10,000");
    lblJetour.setBounds(368, 70, 120, 30);
    lblJetour.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblSuzukiJimny = new JLabel("10,000");
    lblSuzukiJimny.setBounds(368, 100, 120, 30);
    lblSuzukiJimny.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblKia = new JLabel("10,000");
    lblKia.setBounds(368, 130, 120, 30);
    lblKia.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblFoton = new JLabel("10,000");
    lblFoton.setBounds(368, 160, 160, 30);
    lblFoton.setFont(new Font("Arial", Font.PLAIN, 15));
    
    lblGeely = new JLabel("10,000");
    lblGeely.setBounds(368, 190, 190, 30);
    lblGeely.setFont(new Font("Arial", Font.PLAIN, 15));

    //buttons
    btnadd = new JButton("ADD");
    btnadd.setBounds(184, 196, 60, 20);
    btnadd.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd.addActionListener(this);
    
    btndelete = new JButton("DELETE");
    btndelete.setBounds(105, 196, 70, 20);
    btndelete.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete.addActionListener(this);
    
    btnadd1 = new JButton("ADD");
    btnadd1.setBounds(184, 76, 60, 20);
    btnadd1.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd1.addActionListener(this);
    
    btndelete1 = new JButton("DELETE");
    btndelete1.setBounds(105, 76, 70, 20);
    btndelete1.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete1.addActionListener(this);
    
     
    btnadd2 = new JButton("ADD");
    btnadd2.setBounds(184, 106, 60, 20);
    btnadd2.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd2.addActionListener(this);
    
    btndelete2 = new JButton("DELETE");
    btndelete2.setBounds(105, 106, 70, 20);
    btndelete2.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete2.addActionListener(this);

    btnadd3 = new JButton("ADD");
    btnadd3.setBounds(184, 136, 60, 20);
    btnadd3.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd3.addActionListener(this);

    btndelete3 = new JButton("DELETE");
    btndelete3.setBounds(105, 136, 70, 20);
    btndelete3.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete3.addActionListener(this);
    
    btnadd4 = new JButton("ADD");
    btnadd4.setBounds(184, 166, 60, 20);
    btnadd4.setFont(new Font("Arial Black", Font.BOLD, 8));
    btnadd4.addActionListener(this);
    
    btndelete4 = new JButton("DELETE");
    btndelete4.setBounds(105, 166, 70, 20);
    btndelete4.setFont(new Font("Arial Black", Font.BOLD, 8));
    btndelete4.addActionListener(this);
    
    btnback = new JButton("BACK");
    btnback.setBounds(130, 240, 100, 30);
    btnback.setFont(new Font("Arial", Font.BOLD, 15));
    btnback.addActionListener(this);
    
    btnnext = new JButton("NEXT");
    btnnext.setBounds(260, 240, 100, 30);
    btnnext.setFont(new Font("Arial", Font.BOLD, 15));
    btnnext.addActionListener(this);
    
    //add
    fr.add(lblSUVCar);
    fr.add(lblCherttiggo);
    fr.add(lblMustang);
    fr.add(lblRover);
    fr.add(lblHyundai);
    fr.add(lblWagon);
    fr.add(lblPrice);
    fr.add(lblJetour);
    fr.add(lblSuzukiJimny);
    fr.add(lblKia);
    fr.add(lblFoton);
    fr.add(lblGeely);
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
    fr.add(btnback);
    
    fr.setVisible(true);
    fr.setResizable(false);
}
     @Override
     public void actionPerformed(ActionEvent e){
}
}
 
