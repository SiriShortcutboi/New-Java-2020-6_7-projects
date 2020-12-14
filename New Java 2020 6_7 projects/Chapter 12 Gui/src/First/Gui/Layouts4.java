package First.Gui;

import javax.swing.*;

import java.awt.Component;
import java.awt.LayoutManager;

import javax.awt.*;

public class Layouts4 {
		JFrame myFrame;
		LayoutManager mainPane;
		JPanel contentPane; // gives access to default contentPane
	public Layouts4() {
		myFrame = new JFrame();// create the JFrame window
		contentPane = new JPanel(); // creates a new contentPane
		myFrame.setContentPane(contentPane); //replace old JPanel w/ our new one!

		contentPane.setLayout(mainPane);//sets the layout manager
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(300,500);
		myFrame.setLocation(2200, 200);
	
		JPanel mainPane;
	
		
		JButton buttn1 = new JButton("button 1");
		buttn1.setAlignmentY(Component.CENTER_ALIGNMENT);
		myFrame.add(buttn1);
		JButton buttn2 = new JButton("button 2");
		buttn1.setAlignmentY(Component.TOP_ALIGNMENT);
		myFrame.add(buttn2);
		JButton buttn3 = new JButton("button 3");
		buttn1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		myFrame.add(buttn3);
		JButton buttn4 = new JButton("button 4");
		buttn1.setAlignmentY(Component.LEFT_ALIGNMENT);
		myFrame.add(buttn4);
		JButton buttn5 = new JButton("button 5");
		buttn1.setAlignmentY(Component.RIGHT_ALIGNMENT);
		myFrame.add(buttn5);
		
		myFrame.add(new JButton("button 1"));
		myFrame.add(new JButton("button 2"));
		myFrame.add(new JButton("button 3"));
		myFrame.add(new JButton("button 4"));
		myFrame.add(new JButton("button 5"));
	
	}

}
