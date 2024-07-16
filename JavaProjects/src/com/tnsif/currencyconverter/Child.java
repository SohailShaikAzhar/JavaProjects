package com.tnsif.currencyconverter;

import java.awt.Color;    //to import the colors
import javax.swing.ImageIcon;    //to change image icon
import javax.swing.JFrame;    //importing JFrame
import javax.swing.JLabel;    //importing JLabel

public class Child extends JFrame
{
    Child()
    {
	    this.setTitle("Currency Exchange");    //Sets title of the this
	    this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    //exit the application
	    this.setResizable(false);    //prevent this from resize
	    this.setSize(500, 500);;    //sets x and y dimension of the this
	    this.setVisible(true);    //make this to visible
	    ImageIcon image = new ImageIcon("F:/eclipse/images/ce.png");    //create an image icon
	    this.setIconImage(image.getImage());    //change icon of the this
	    this.getContentPane().setBackground(new Color(111, 200, 232));    //change the color of the this
	    JLabel Label = new JLabel();    //create a label
	    this.add(Label);
	    Label.setText("Hello");    //set text of label
	    ImageIcon Image1 = new ImageIcon("F:/eclipse/images/ce.png");
    }
}
