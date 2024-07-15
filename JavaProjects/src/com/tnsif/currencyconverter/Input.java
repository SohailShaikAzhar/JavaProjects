package com.tnsif.currencyconverter;

import java.awt.Color;    //to import the colors
import javax.swing.ImageIcon;    //to change image icon
import javax.swing.JFrame;    //importing JFrame

public class Input 
{
    public static void main(String[] args) 
    {
    	
	    JFrame frame = new JFrame();    //creates a frame
	    frame.setTitle("Currency Exchange");    //Sets title of the frame
	    frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    //exit the application
	    frame.setResizable(false);    //prevent frame from resize
	    frame.setSize(420, 420);    //sets x and y dimension of the frame
	    frame.setVisible(true);    //make frame to visible
	    
	    ImageIcon image = new ImageIcon("currencyexchange.png");    //create an image icon
	    frame.setIconImage(image.getImage());    //change icon of the frame
	    frame.getContentPane().setBackground(new Color(111, 200, 232));    //change the color of the frame
	}
}
