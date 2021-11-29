package page1;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Manufacture

{

    JFrame f;

    JLabel jl1;

    public void manufacture()

    {
 
       f=new JFrame("Manufacturing");

        f.setLayout(new FlowLayout());

        f.setSize(500,500);

        f.setVisible(true);

        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        jl1=new JLabel("*Offers not available***");

        jl1.setFont(new Font("Verdana",Font.PLAIN,20));

        f.add(jl1);

    }

}