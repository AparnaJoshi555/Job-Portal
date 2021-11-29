package page1;


import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class SubmitProfile implements ActionListener
{
   
    JFrame f;

    JLabel jl1;

    JButton b;
    String x = new String();
    public SubmitProfile(String usp)
    {
        x=usp;
    }

    public void submitprofile()

    {
 
       f=new JFrame("Profile Confirmation");

        b=new JButton("Go to Course");
        b.addActionListener(this);

        f.setLayout(new FlowLayout());

        f.setSize(500,200);
 
       f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        jl1=new JLabel("***Profile Sumbitted**");

        jl1.setFont(new Font("Verdana",Font.PLAIN,20));
        f.add(jl1);

        b.setBounds(100,200,70,50);
        f.add(b);

    }


    public void actionPerformed(ActionEvent e)
    {
     if(e.getSource()==b)
     {
      f.dispose();
      Portal p=new Portal(x);
      p.portal();
     }
    }
}