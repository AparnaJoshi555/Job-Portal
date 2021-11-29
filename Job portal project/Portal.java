package page1;


import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


public class Portal implements ActionListener
 
 {

    JFrame f;

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,ba;

    JPanel p3;

    JLabel l;
    String x= new String();
    public Portal(String ul)
    {
      x=ul;
    }

    public void portal()

    {

        f=new JFrame();

        f.setLayout(null);

        l=new JLabel("CATEGORIES OF JOBS");

        b1=new JButton("Manufacturing");
        b1.addActionListener(this);

        b2=new JButton("Information Technology");
        b2.addActionListener(this);

        b3=new JButton("Human Services");
        b3.addActionListener(this);
        b4=new JButton("Health Science");

        b4.addActionListener(this);
        b5=new JButton("Agriculture, Food and Natural Resources");

        b6=new JButton("Architecture and Construction");

        b7=new JButton("Arts, Audio/Video Technology and Communications");

        b8=new JButton("Business Management and Administration");

        b9=new JButton("Education and Training");

        b10=new JButton("Finance");

        b10.addActionListener(this);
        b11=new JButton("Government and Public Administration");

        b12=new JButton("Hospitality and Tourism");

        b13=new JButton("Law, Public Safety, Corrections and Security");

        b14=new JButton("Marketing, Sales and Service");
        b14.addActionListener(this);

        b15=new JButton("Transportation, Distribution and Logistics");

        b16=new JButton("Science, Technology, Engineering and Mathematics");

        ba=new JButton("Back"); ba.addActionListener(this);
        p3=new JPanel();

        l.setBounds(550,5,400,50);
        ba.setBounds(5,5,70,35);
        ba.setBackground(new Color(232, 230, 227));
        ba.setForeground(Color.BLUE);

        f.add(ba);

        l.setFont(new Font("Verdana",Font.PLAIN,35));

        l.setOpaque(true);

        l.setForeground(Color.WHITE);

        l.setBackground(Color.RED);

        f.add(l);

        //b1.setForeground(Color.BLACK);

        //b1.setBackground(Color.ORANGE);

        p3.setLayout(new GridLayout(4,4,15,10));

        p3.add(b1);
        p3.add(b2);

        p3.add(b3);

        p3.add(b4);

        p3.add(b5);
        p3.add(b6);
        p3.add(b7);
        p3.add(b8);
        p3.add(b9);
        p3.add(b10);
        p3.add(b11);

        p3.add(b12);
        p3.add(b13);
        p3.add(b14);
        p3.add(b15);
        p3.add(b16);

        p3.setBounds(15,100,1500,600);

        f.add(p3);

        f.setSize(2000,1500);

        f.setVisible(true);

        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==ba)
      {
       f.dispose();
       Printprofile pp = new Printprofile(x);
       pp.printprofile();
      }
     else if(e.getSource()==b1)
     {
      f.dispose();
      Manufacture ma=new Manufacture();
      ma.manufacture();
     }
     else if(e.getSource()==b2)
     {
      f.dispose();
      IT i=new IT(x);
      i.it();
     }
     else if(e.getSource()==b3)
     {
      f.dispose();
      HumanService hs=new HumanService();
      hs.humanservice();
     }
     else if(e.getSource()==b4)
     {
      f.dispose();
      HealthService he=new HealthService();
      he.healthservice();
     }
     else if(e.getSource()==b10)
     {
      f.dispose();
      Finance fi=new Finance();
      fi.finance();
     }
     else if(e.getSource()==b14)
     {
      f.dispose();
      Market mk=new Market();
      mk.market();
     }
   }
}