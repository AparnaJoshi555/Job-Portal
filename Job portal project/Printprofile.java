package page1;

import javax.swing.*;



import java.awt.event.*;

import java.awt.*;
import java.sql.*;

import java.io.*;
import java.lang.Exception;
 




public class Printprofile implements ActionListener
{
    String nm=new String();
    String ag=new String();
    String ge=new String();
    String ed=new String();
    String lo=new String();
    String em=new String();
    String mn=new String();
    String ja=new String();
    String un=new String();
    String pa=new String();
    String u=new String();
        Connection c=null;
        Connection cp=null;
        Statement s=null;
        Statement st=null;
        ResultSet rs=null;
        ResultSet rp=null;
        Connection cj=null;
        Statement sj=null;
        ResultSet rj=null;


//DefaultTableModel dt=new DefaultTableModel();
//JTable jt=new JTable();
JFrame f;


JLabel l,l1,l2,l7,l3,l4,l5,l6,l8;



JButton b1,b2,b3,b4;

JRadioButton br1,br2;


JPanel p,pl,p1,p2,pb,p7,p3,p4,p5,p6,p8,pc;


JTextField tf1,tf2,tf3,tf4,tf5,tf6;


Font ft,ft1;
String x=new String();

public Printprofile(String us)
{
  x=us;
}

 public void printprofile()


{
      try

      {
        

       Class.forName("org.postgresql.Driver");

       c=DriverManager.getConnection("jdbc:postgresql://ziggy.db.elephantsql.com/ugbdlvhb","ugbdlvhb","4fFRyTvah3x699uZUcE2FdAk7K2ujeB9");

       s=c.createStatement();
       cp=DriverManager.getConnection("jdbc:postgresql://ziggy.db.elephantsql.com/agvzuvwg","agvzuvwg","FQmwfrWZ3WBpkj9g5aoNf_kUUUTsidqn");
      // cj=DriverManager.getConnection("jdbc:postgresql://ziggy.db.elephantsql.com/agvzuvwg","agvzuvwg","FQmwfrWZ3WBpkj9g5aoNf_kUUUTsidqn");

       st=cp.createStatement();
      // sj=cj.createStatement();
       rs=s.executeQuery("select * from checkprofile where username='"+x+"';");
       rp=st.executeQuery("select * from details where username='"+x+"';");
      // rj=sj.executeQuery("select * from job");
       while(rp.next())
       {
             u=rp.getString("username");
             u=u.trim();
       }
       while(rs.next())
       {
         un=rs.getString("username");
         un=un.trim();
         pa=rs.getString("password");
         pa=pa.trim();
         nm=rs.getString("name");
         nm=nm.trim();
         ag=rs.getString("age");
         ag=ag.trim();
         ge=rs.getString("gender");
         ge=ge.trim();
         ed=rs.getString("education");
         ed=ed.trim();
         lo=rs.getString("location");
         lo=lo.trim();
         em=rs.getString("email");
         em=em.trim();
         mn=rs.getString("num");
         mn=mn.trim();
         ja=rs.getString("applydetail");
         ja=ja.trim();
         
       }
      /* while(rj.next())
       {
             ja=rj.getString("appliedjob");
             ja=ja.trim();
       }*/
      }
      catch(Exception ae)
      {
      }
      f =new JFrame();


      
      p= new JPanel();

 
     pl= new JPanel();


      p1= new JPanel();


      p2= new JPanel();


      p3= new JPanel();


      p4= new JPanel();

 
     p5= new JPanel();

 
     p6= new JPanel();

 
     p7= new JPanel();

      p8=new JPanel();
     
 

l= new JLabel("My Profile");


      ft = new Font("TimesRoman",Font.BOLD,35);


      l.setFont(ft);


      l.setForeground(new Color(3, 98, 252));

      pl.add(l);



      l1= new JLabel("Name            :             "+nm);

      p1.add(l1);


      l2= new JLabel("Age               :                "+ag);

      p2.add(l2);


      l7= new JLabel("Gender          :             "+ge);

      p7.add(l7);


      l3= new JLabel("Education details     :    "+ed);

      p3.add(l3);


      l4= new JLabel("Current Location    :    "+lo);

      p4.add(l4);


      l5= new JLabel("Email         :        "+em);

      p5.add(l5);


      l6= new JLabel("Mobile No        :        "+mn);

      p6.add(l6);

      l8=new JLabel("Jobs Applied         :        "+ja);
      p8.add(l8);
      p.add(pl);


      p.add(p1);

 
     p.add(p2);

 
     p.add(p7);


      p.add(p3);

 
     p.add(p4);


      p.add(p5);


      p.add(p6);
      p.add(p8);


      
pb= new JPanel();


      b1 = new JButton("Edit");


      b1.setBackground(new Color(32, 102, 168));


      b1.setForeground(Color.WHITE);


      b1.setPreferredSize(new Dimension(80,30));

      pb.add(b1);

      
      b3 = new JButton("Delete");


      b3.setBackground(new Color(32, 102, 168));


      b3.setForeground(Color.WHITE);


      b3.setPreferredSize(new Dimension(80,30));

      pb.add(b3);


      b2 = new JButton("Logout");


      b2.setBackground(Color.RED);


      b2.setForeground(Color.WHITE);


      b2.setPreferredSize(new Dimension(80,30));

      pb.add(b2);


      pc= new JPanel();


      b4 = new JButton("Go to course");

      b4.setBackground(new Color(232, 230, 227));

      b4.setForeground(Color.BLUE);


      b4.setPreferredSize(new Dimension(300,40));
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);     
      pc.add(b4);


      p.add(pb);

      p.add(pc);

      f.add(p);


      p.setLayout(new GridLayout(11,1));


      
f.setLayout(new FlowLayout());


      
f.setSize(400,700);


      
f.setVisible(true);
 
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


   }

   public void actionPerformed(ActionEvent e)
   {
    
    if(e.getSource()==b1)
    {
      f.dispose();
     Editprofile p=new Editprofile(x);
     p.editprofile();
    }
    else if(e.getSource()==b3)
    {
     try
      {
          st.executeUpdate("delete from details where username='"+u+"';");
      s.executeUpdate("delete from checkprofile where username='"+un+"';");
    }
    catch(SQLException aee){ }
   
     f.dispose();
     Login l=new Login();
     l.login();
    }
    else if(e.getSource()==b2)
    {
     f.dispose();
     Login l=new Login();
     l.login();
    }
    else if(e.getSource()==b4)
    {
     f.dispose();
     Portal po=new Portal(x);
     po.portal();
    }
   }  
}