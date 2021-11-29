package page1;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class HumanService

{

    JFrame f;

    JLabel jl1;

    public void humanservice()

    {

        f=new JFrame("HumanService");

        f.setLayout(new FlowLayout());

        f.setSize(500,500);

        f.setVisible(true);

        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        jl1=new JLabel("*Offers not available***");

        jl1.setFont(new Font("Verdana",Font.PLAIN,20));

        f.add(jl1);

    }

}