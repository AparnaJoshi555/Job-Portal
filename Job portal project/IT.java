package page1;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.sql.*;
import java.io.*;
import java.lang.Exception;
public class IT  implements ActionListener
{
      Connection c=null;
      Statement s=null;
      ResultSet rs=null;
      Connection cj=null;
      Statement sj=null;
      ResultSet rj=null;
      String u= new String();
      String pa= new String();
      String b= new String();
      String nm=new String();
    String ag=new String();
    String ge=new String();
    String ed=new String();
    String lo=new String();
    String em=new String();
    String mn=new String();
   

    JFrame f;

    JButton ba1,ba2,ba3;

    JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10;

    JPanel p1,p2;
    String x= new String();
    public IT(String ut)
     {
       x=ut;
     }
    public void it()

    {

        f=new JFrame("IT");

        ba1=new JButton("Apply");
        ba2=new JButton("Apply");
        ba3=new JButton("Back");

        ba1.addActionListener(this);
        ba2.addActionListener(this);
        ba3.addActionListener(this);
        p1=new JPanel();

        p2=new JPanel();
        p1.setBounds(10,10,250,200);
        p2.setLayout(new FlowLayout());

        ba1.setBackground(Color.BLUE);
        ba1.setForeground(Color.WHITE);
        ba3.setBackground(new Color(232, 230, 227));
        ba3.setForeground(Color.BLUE);
        ba3.setBounds(5,560,70,40);

        jl1=new JLabel("*React.js Development");

        jl1.setFont(new Font("Verdana",Font.PLAIN,20));
 
        jl2=new JLabel("   Vidyalai,Kochi                ");

        jl2.setFont(new Font("Verdana",Font.PLAIN,15));
 
        jl3=new JLabel("BE/B.Tech      ");

        jl3.setFont(new Font("Verdana",Font.PLAIN,15));
        jl4=new JLabel("    10000 Monthly      ");

        jl4.setFont(new Font("Verdana",Font.PLAIN,15));
  
        jl5=new JLabel("                   Freshers                             ");

        jl5.setFont(new Font("Verdana",Font.PLAIN,15));
 
        p1.add(jl1); p1.add(jl2); p1.add(jl3); p1.add(jl4); p1.add(jl5);

        p1.add(ba1);
       

       
        ba2.setBackground(Color.BLUE);

        ba2.setForeground(Color.WHITE);
        jl6=new JLabel("*Full Stack Development");

        jl6.setFont(new Font("Verdana",Font.PLAIN,20)); 
        jl7=new JLabel("   Vidyalai,Kochi                ");

        jl7.setFont(new Font("Verdana",Font.PLAIN,15)); 
        jl8=new JLabel("BE/B.Tech      ");

        jl8.setFont(new Font("Verdana",Font.PLAIN,15));
        jl9=new JLabel("    9000-15000 Monthly      ");

        jl9.setFont(new Font("Verdana",Font.PLAIN,15));  
        jl10=new JLabel("                   Freshers                             ");

        jl10.setFont(new Font("Verdana",Font.PLAIN,15)); 
        p2.add(jl6); p2.add(jl7); p2.add(jl8); p2.add(jl9); p2.add(jl10);

        f.add(ba3);
        p2.add(ba2);
        p2.setBounds(10,300,250,200);
        f.add(p1);
        f.add(p2);
        f.setSize(1500,2000);

        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

   /* public void actionPerformed(ActionEvent e)
    {
        String ss1= new String();
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
      try

      {

       Class.forName("org.postgresql.Driver");

       c=DriverManager.getConnection("jdbc:postgresql://ziggy.db.elephantsql.com/agvzuvwg","agvzuvwg","FQmwfrWZ3WBpkj9g5aoNf_kUUUTsidqn");

       cj=c=DriverManager.getConnection("jdbc:postgresql://ziggy.db.elephantsql.com/agvzuvwg","agvzuvwg","FQmwfrWZ3WBpkj9g5aoNf_kUUUTsidqn");
       s=c.createStatement();
       sj=cj.createStatement();
       rj=sj.executeQuery("select * from job");
       rs=s.executeQuery("select * from details");
       
       while(rs.next())
       {
        un=rs.getString("username");
        un=un.trim();
        pa=rs.getString("password");
        pa=pa.trim();
       
       
             //b=rs.getString("applydetails");
             //b=b.trim();
       }
       System.out.println(un);
         if(e.getSource()==ba1)
          {
           ss1 = jl1.getText();
           }
         else if(e.getSource()==ba2)
        {
        ss1 = jl6.getText();
         }
    
       //if(b=="Null")
          
      // int a=s.executeUpdate("update checkprofile set applydetail='"+ss1+"' where username='"+u+"'and password='"+pa+"';");
          
  //  int ap=sj.executeUpdate("insert into job values('"+un+"','"+pa+"','"+ss1+"');");
      else
         {
        a=s.executeUpdate("insert into checkprofile values('"+u+"','"+pa+"','"+ss1+"');");
          }
    }
      catch(Exception ae)
      {
      }
      f.dispose();
      Applied a=new Applied();
      a.applied();
     if(e.getSource()==ba3)
        {
            f.dispose();
            Portal pp=new Portal();
            pp.portal();
        }
      
     }*/
     public void actionPerformed(ActionEvent e)
    {
     String un=new String();
     String ps=new String();
     String b=new String();
     Connection c=null;

      Statement s=null;
      ResultSet rs=null;
   
     if(e.getSource()==ba1)
     {
      
      try

      {

       Class.forName("org.postgresql.Driver");

       c=DriverManager.getConnection("jdbc:postgresql://ziggy.db.elephantsql.com/ugbdlvhb","ugbdlvhb","4fFRyTvah3x699uZUcE2FdAk7K2ujeB9");

       s=c.createStatement();
       rs=s.executeQuery("select * from checkprofile");
       while(rs.next())
       {
        un=rs.getString("username");
        ps=rs.getString("password");
       
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
         b=rs.getString("applydetail");
         b=b.trim();
       }
       
       if(b.equals("Null"))
       {
       String ss3=jl1.getText();
       int a=s.executeUpdate("update checkprofile set applydetail='"+ss3+"' where username='"+un+"'and password='"+ps+"';");
     //  System.out.println(ss3);
       }
       else
       {
        String ss3=jl1.getText();
        ss3=b+","+ss3;
        int a=s.executeUpdate("update checkprofile set applydetail='"+ss3+"' where username='"+un+"'and password='"+ps+"';");
     //   System.out.println(ss3);
       }
      }
      catch(Exception ae)
      {
      }
      f.dispose();
      Applied a=new Applied(x);
      a.applied();
     }
     else if(e.getSource()==ba2)
     {
      try

      {

       Class.forName("org.postgresql.Driver");

       c=DriverManager.getConnection("jdbc:postgresql://ziggy.db.elephantsql.com/ugbdlvhb","ugbdlvhb","4fFRyTvah3x699uZUcE2FdAk7K2ujeB9");

       s=c.createStatement();
       rs=s.executeQuery("select * from checkprofile");
      // System.out.println("open");
       while(rs.next())
       {
        un=rs.getString("username");
        un=un.trim();
        ps=rs.getString("password");
        ps=ps.trim();
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
         b=rs.getString("applydetail");
         b=b.trim();
       }
      // System.out.println(b);
       String ss3=jl6.getText();
       if(b.equals("Null"))
       {
       int a=s.executeUpdate("update checkprofile set applydetail='"+ss3+"' where username='"+un+"'and password='"+ps+"';");
       }
       else
       {
        ss3=b+","+ss3;
       // System.out.println(ss3);

        int a=s.executeUpdate("update checkprofile set applydetail='"+ss3+"' where username='"+un+"'and password='"+ps+"';");
       }
      }
      catch(Exception ae)
      {
      }
      f.dispose();
      Applied a=new Applied(x);
      a.applied();
     }
    }
     
}
