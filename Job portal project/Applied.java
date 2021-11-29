package page1;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Applied implements ActionListener  
{

    JFrame f;

    JLabel jl1;

    JButton b;
    String x= new String();
    public Applied(String ua)
    {
        x=ua;
    }

    public void applied()

    {

        f=new JFrame("Applied");

        b=new JButton("My Profile");

        b.addActionListener(this);
        f.setLayout(new FlowLayout());

        f.setSize(400,200);

        f.setVisible(true);

        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        jl1=new JLabel("***Applied Successfully**");

        jl1.setFont(new Font("Verdana",Font.PLAIN,20));

        f.add(jl1);
        b.setBackground(Color.BLUE);

        b.setForeground(Color.WHITE);

        b.setBounds(100,200,70,50);

        f.add(b);

    }
    public void actionPerformed(ActionEvent e)
    {
     if(e.getSource()==b)
     {
      f.dispose();
      Printprofile pp=new Printprofile(x);
      pp.printprofile();
     }
    
}
}