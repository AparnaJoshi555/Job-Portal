package page1;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

import java.sql.*;
import java.io.*;
import java.lang.Exception;
class Imag extends JPanel 
{

  JPanel p;

  Image img ;

  Imag()

  { 
   p =new JPanel();

   setPreferredSize(new Dimension(200,350));

   img = new ImageIcon("C:\\Users\\MY PC\\Pictures\\jobs.jpg").getImage();

  }

  
public void paintComponent(Graphics g)

  {

  
     g.drawImage(img,0,0,200,350,this);

  }


}


public class Login implements ActionListener
{

  JFrame f;

  JLabel l,l1,l2;

  JPasswordField pf;

  JButton b1,b2,b3;

  JPanel p,pl,p1,p2,pb,plr;

  JTextField tf1,tf2;

  Font ft,ft1;
  //
Imag i;

  public void login()

  {

      f =new JFrame();

      
p= new JPanel();
 
     pl= new JPanel();

      p1= new JPanel();

      p2= new JPanel();

      plr= new JPanel();
 
     l= new JLabel("LOGIN");

      l1= new JLabel("Login ID ");
      p1.add(l1);

      
l2= new JLabel("Password");
      p2.add(l2);

      ft = new Font("TimesRoman",Font.BOLD,35);

      l.setFont(ft);

      l.setForeground(new Color(3, 98, 252)); pl.add(l);

      //i= new Imag();

      //f.add(i,BorderLayout.EAST);


      tf1= new JTextField(10);
      p1.add(tf1);

      pf= new JPasswordField(10);
      p2.add(pf);

      b3= new JButton("new user? create an account .");
      b3.addActionListener(this);

      ft1 = new Font("Helvetica",Font.BOLD,12);

      b3.setFont(ft1);

      b3.setForeground(new Color(3, 161, 252));
      plr.add(b3);


      //f.add(i);

      p.add(pl);
 
     p.add(p1);
 
     p.add(p2);

      
pb= new JPanel();

      b1 = new JButton("Sign in");
      b1.addActionListener(this);

      b1.setBackground(new Color(32, 102, 168));

      b1.setForeground(Color.WHITE);

      b1.setPreferredSize(new Dimension(80,30));
      pb.add(b1);

      b2 = new JButton("Cancel");
      b2.addActionListener(this);

      b2.setBackground(Color.RED);

      b2.setForeground(Color.WHITE);

      b2.setPreferredSize(new Dimension(80,30));
      pb.add(b2);


      p.add(pb);


      p.add(plr);


      f.add(p);

      
p.setLayout(new GridLayout(6,1));

      
f.setLayout(new FlowLayout());

      
f.setSize(404,385);

      
f.setVisible(true);

      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }

   public void actionPerformed(ActionEvent e)
   {
    if(e.getSource()==b1)
    {
      String pf1="",un="";
      String un1=tf1.getText();
      String pf2=new String(pf.getPassword());
      Connection c=null;

      Statement s=null;
      ResultSet rs=null;
      try

      {

       Class.forName("org.postgresql.Driver");

       c=DriverManager.getConnection("jdbc:postgresql://ziggy.db.elephantsql.com/agvzuvwg","agvzuvwg","FQmwfrWZ3WBpkj9g5aoNf_kUUUTsidqn");

       s=c.createStatement();
       rs=s.executeQuery("select * from details where username='"+un1+"';");
       while(rs.next())
       {
         un=rs.getString("username");
         un=un.trim();
         pf1=rs.getString("password");
         pf1=pf1.trim();
       }
       
       if((un1.equals(un))&&(pf2.equals(pf1)))
       {
        
        f.dispose(); 
        Printprofile pp=new Printprofile(un);
        pp.printprofile();
        
       }
       else
       {
        JOptionPane.showMessageDialog(f, "Invalid Username or Password");
        tf1.setText("");
        pf.setText("");
       }
      }
      catch(Exception ae)
      {
      }
    }
    else if(e.getSource()==b3)
    {
     f.dispose();
     Registration r=new Registration();
     r.registration();
    }
    else if(e.getSource()==b2)
    {
     tf1.setText("");
     pf.setText("");
    }
   }
}