package page1;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Market implements ActionListener
{
 
   JFrame f;

    JButton ba1,ba2;

    JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10;

    JPanel p1,p2;

    public void market()

    {

        f=new JFrame("Marketing");

        ba1=new JButton("Apply");

        ba2=new JButton("Apply");
        ba1.addActionListener(this);
        ba2.addActionListener(this);

        p1=new JPanel();

        p2=new JPanel();

        p1.setLayout(new FlowLayout());

        ba1.setBackground(Color.BLUE);

        ba1.setForeground(Color.WHITE);

        jl1=new JLabel("*Market Research Analyst");

        jl1.setFont(new Font("Verdana",Font.PLAIN,20));
 
        jl2=new JLabel("             Skizzle Technologies,Kochi                ");

        jl2.setFont(new Font("Verdana",Font.PLAIN,15));
 
        jl3=new JLabel("BBA/BBM,BCA,BA      ");

        jl3.setFont(new Font("Verdana",Font.PLAIN,15));

        jl4=new JLabel("    10000 Monthly      ");

        jl4.setFont(new Font("Verdana",Font.PLAIN,15));
  
        jl5=new JLabel("                   Freshers                             ");

        jl5.setFont(new Font("Verdana",Font.PLAIN,15));
 
        p1.add(jl1); p1.add(jl2); p1.add(jl3); p1.add(jl4); p1.add(jl5);

        p1.add(ba1);
        p1.setBounds(10,10,275,200);
        p2.setLayout(new FlowLayout());

        ba2.setBackground(Color.BLUE);
        ba2.setForeground(Color.WHITE);

        jl6=new JLabel("*Business Development Sales");

        jl6.setFont(new Font("Verdana",Font.PLAIN,20));
 
        jl7=new JLabel("   ISmart InnovationsKochi                ");

        jl7.setFont(new Font("Verdana",Font.PLAIN,15));
 
        jl8=new JLabel("Diploma,B.Com,M.Com      ");

        jl8.setFont(new Font("Verdana",Font.PLAIN,15));
        jl9=new JLabel("    10000 Monthly      ");

        jl9.setFont(new Font("Verdana",Font.PLAIN,15));  
        jl10=new JLabel("                   Freshers                             ");

        jl10.setFont(new Font("Verdana",Font.PLAIN,15)); 
        p2.add(jl6); p2.add(jl7); p2.add(jl8); p2.add(jl9); p2.add(jl10);

        p2.add(ba2);
        p2.setBounds(10,300,300,200);
        f.add(p1);
        f.add(p2);
        f.setSize(500,500);

        f.setLayout(new BorderLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e)
    {
     if(e.getSource()==ba1)
     {
      f.dispose();
      Profile p=new Profile();
      p.profile();
     }
     else if(e.getSource()==ba2)
     {
      f.dispose();
      Profile p=new Profile();
      p.profile();
     }
    }
}