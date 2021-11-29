package page1;

import javax.swing.*;


import java.awt.event.*;

import java.awt.*;


import java.sql.*;
import java.io.*;
import java.lang.Exception;

 



public class Profile implements ActionListener
{

JFrame f;

JLabel l,l1,l2,lr,l3,l4,l5,l6,l7,l8;


JButton b1,b2;
JRadioButton br1,br2;

JPanel p,pl,p1,p2,pb,pg,p3,p4,p5,p6,p7,p8;

JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;

JPasswordField pf1;
Font ft,ft1;
String x = new String();

public Profile(String upp)
{
      x=upp;
}

public void profile()

{

      f =new JFrame();

      
      p= new JPanel();
 
     pl= new JPanel();

      p1= new JPanel();

      p2= new JPanel();

      p3= new JPanel();

      p4= new JPanel();
 
     p5= new JPanel();
 
     p6= new JPanel();
      p7=new JPanel();
      p8=new JPanel();
 
     pg= new JPanel();
 

     l= new JLabel("My Profile");

      ft = new Font("TimesRoman",Font.BOLD,35);

      l.setFont(ft);

      l.setForeground(new Color(3, 98, 252));
      pl.add(l);


      l1= new JLabel("Name                        ");
      p1.add(l1);

      l2= new JLabel("Age                         ");
      p2.add(l2);

      l3= new JLabel("Education details   ");
      p3.add(l3);

      l4= new JLabel("Current Location    ");
      p4.add(l4);

      l5= new JLabel("Email                        ");
      p5.add(l5);

      l6= new JLabel("Mobile No                ");
      p6.add(l6);


      //l7= new JLabel("Username              ");
      //p7.add(l7);

      //l8= new JLabel("Password                ");
      //p8.add(l8);


      tf1= new JTextField(10); p1.add(tf1);

      tf2= new JTextField(10); p2.add(tf2);

      tf3= new JTextField(10); p3.add(tf3);

      tf4= new JTextField(10); p4.add(tf4);

      tf5= new JTextField(10); p5.add(tf5);

      tf6= new JTextField(10); p6.add(tf6);

      //tf7= new JTextField(10); p7.add(tf7);
      //pf1=new JPasswordField(10);p8.add(pf1);
      
br1= new JRadioButton("Male");
      br1.addActionListener(this);
      //br1.setActionCommand("Male");
      pg.add(br1);

      br2= new JRadioButton("Female");
      br2.addActionListener(this);
      //br2.setActionCommand("Female");
      pg.add(br2);

      
ButtonGroup bg= new ButtonGroup();

      bg.add(br1);
      bg.add(br2);
      

p.add(pl);
      //p.add(p7);
      //p.add(p8);

      p.add(p1);
 
     p.add(p2);

      p.add(pg);

      p.add(p3);
 
     p.add(p4);

      p.add(p5);

      p.add(p6);

      
      pb= new JPanel();

      b1 = new JButton("submit");

      b1.addActionListener(this);
      b1.setBackground(new Color(32, 102, 168));

      b1.setForeground(Color.WHITE);

      b1.setPreferredSize(new Dimension(80,30));
      pb.add(b1);

      b2 = new JButton("Cancel");

      b2.setBackground(Color.RED);

      b2.setForeground(Color.WHITE);

      b2.setPreferredSize(new Dimension(80,30));
      pb.add(b2);


      p.add(pb);


      f.add(p);

      p.setLayout(new GridLayout(11,1));

      
      f.setLayout(new FlowLayout());

      
      f.setSize(600,800);

      
      f.setVisible(true);

      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }

   public void actionPerformed(ActionEvent e)
   {
    String s2=new String("Null");
    String s1=new String();
    
    if(br1.isSelected())
    {
     s1="Male";
    }
    else if(br2.isSelected())
    {
     s1="Female";
    }
    
    if(e.getSource()==b1)
    {
      String un=new String();
      String pf=new String();    
      Connection c=null;
      Connection cp=null;
      Statement s=null;
      Statement st=null;
      ResultSet rs =null;
      ResultSet rp=null;
      try

      {

       Class.forName("org.postgresql.Driver");

       c=DriverManager.getConnection("jdbc:postgresql://ziggy.db.elephantsql.com/ugbdlvhb","ugbdlvhb","4fFRyTvah3x699uZUcE2FdAk7K2ujeB9");
       System.out.println("open");
       s=c.createStatement();
       cp=DriverManager.getConnection("jdbc:postgresql://ziggy.db.elephantsql.com/agvzuvwg","agvzuvwg","FQmwfrWZ3WBpkj9g5aoNf_kUUUTsidqn");
       st=cp.createStatement();
       rp=st.executeQuery("select * from details");
       while(rp.next())
       {
             un=rp.getString("username");
             un=un.trim();
             pf=rp.getString("password");
             pf=pf.trim();
       }

       String nm=tf1.getText();
       String ag=tf2.getText();
       String ed=tf3.getText();
       String lo=tf4.getText();
       String em=tf5.getText();
       String mn=tf6.getText();
       int a =s.executeUpdate("insert into checkprofile values('"+un+"','"+pf+"','"+nm+"','"+ag+"','"+s1+"','"+ed+"','"+lo+"','"+em+"','"+mn+"','"+s2+"');");
     //  System.out.println(mn);
      }
      catch(Exception ae)
      {
       
      }
     
     f.dispose();
     SubmitProfile sp=new SubmitProfile(x);
     sp.submitprofile();
    }
   }
   
 }