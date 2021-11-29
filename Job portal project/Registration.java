package page1;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

import java.sql.*;
import java.io.*;
import java.lang.Exception;
 

class Registration implements ActionListener
{
  String un;

JFrame f;

JLabel l,l1,l2,l3,l4,l5,lr;

JPasswordField pf1,pf2;

JButton b1,b2;

JPanel p,pl,p1,p2,p3,p4,p5,pb,plr;

JTextField tf1,tf2,tf3;

Font ft,ft1;
  public void registration()

  {

      f =new JFrame();

      
p= new JPanel();
 
     pl= new JPanel();

      p1= new JPanel();

      p2= new JPanel();

      p3= new JPanel();

      p4= new JPanel();

      p5= new JPanel();
      plr= new JPanel();
 
     l= new JLabel("Create an Account");

      l1= new JLabel("Username:               ");
      p1.add(l1);
      l5=new JLabel("Name:                   ");
      p5.add(l5);
      
l2= new JLabel("Email:                         ");  
      p2.add(l2);

      
l3= new JLabel("New Password:       ");    
      p3.add(l3);

      
l4= new JLabel("Confirm Password:");
      p4.add(l4);
      ft = new Font("TimesRoman",Font.BOLD,35);

      l.setFont(ft);

      l.setForeground(new Color(3, 98, 252));
      pl.add(l);


      tf1= new JTextField(15);
      p1.add(tf1);

      tf3= new JTextField(15);
      p5.add(tf3);
      tf2= new JTextField(15);
      p2.add(tf2);
      pf1= new JPasswordField(15);
      p3.add(pf1);
      pf2= new JPasswordField(15);
      p4.add(pf2);
      p.add(pl);
      p.add(p1);
      p.add(p5);
 
     p.add(p2);
 
     p.add(p3);

      p.add(p4);
      
pb= new JPanel();

      b1 = new JButton("Submit");
      b1.addActionListener(this);

      b1.setBackground(new Color(32, 102, 168));

      b1.setForeground(Color.WHITE);

      b1.setPreferredSize(new Dimension(80,30));
      b2 = new JButton("Cancel");

      b2.setBackground(Color.RED);

      b2.setForeground(Color.WHITE);

      b2.setPreferredSize(new Dimension(80,30));
      //pf1.addActionListener(this);
      //pf2.addActionListener(this);
      pb.add(b2);

      pb.add(b1);
 
     p.add(pb);


      f.add(p);

      
p.setLayout(new GridLayout(8,1));

      
f.setLayout(new FlowLayout());

      
f.setSize(600,500);

      
f.setVisible(true);

      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }

   public void actionPerformed(ActionEvent e)
   {
    String s1,s2;
    s1=new String(pf1.getPassword());
    s2=new String(pf2.getPassword());
    if(e.getSource()==b1)
    {
     if(s1.equals(s2))
     {
      Connection c=null;

      Statement s=null;
      ResultSet rs;
      try

      {

       Class.forName("org.postgresql.Driver");

       c=DriverManager.getConnection("jdbc:postgresql://ziggy.db.elephantsql.com/agvzuvwg","agvzuvwg","FQmwfrWZ3WBpkj9g5aoNf_kUUUTsidqn");

       s=c.createStatement();
        un=tf1.getText();
       String pf=new String(pf2.getPassword());
       String nm=tf3.getText();
       String em=tf2.getText();
       int a=s.executeUpdate("insert into details values('"+un+"','"+pf+"','"+nm+"','"+em+"');");
      }
      catch(Exception ae)
      {
      }
       f.dispose();
       Profile p=new Profile(un);
       p.profile();
     }
     else
      {
            JOptionPane.showMessageDialog(f, "Password Error");
            pf1.setText("");
            pf2.setText("");
      }
    }
    else
    { 
      
     pf1.setText("");
     pf2.setText("");
    }
   } 
 }