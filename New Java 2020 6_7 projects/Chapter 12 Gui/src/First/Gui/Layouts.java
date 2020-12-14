package First.Gui;

import javax.swing.*;
import java.awt.*;

public class Layouts {
	JFrame myFrame;
	JPanel contentPane; // gives access to default contentPane
	
	
	public Layouts() {
		myFrame = new JFrame();// create the JFrame window
		contentPane = new JPanel(); // creates a new contentPane
		myFrame.setContentPane(contentPane); //replace old JPanel w/ our new one!
		
		myFrame.setLayout(new FlowLayout()); // option 1 no access to the layout manager elsewhere
		
		FlowLayout flowlayout = new FlowLayout(); // option 2 you now have access to the layout manager
		GridLayout grid = new GridLayout(3,2);
		grid.setHgap(20);
		grid.setVgap(20);
		BorderLayout border = new BorderLayout();
		BorderLayout border2 = new BorderLayout(5,10);
		BoxLayout boxlayout = new BoxLayout(contentPane,BoxLayout.Y_AXIS); // parent needed, contentpane is available
		
	//	contentPane.setLayout(border2);//sets the layout manager
		contentPane.setLayout(grid);//sets the layout manager
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(300,500);
		myFrame.setLocation(2200, 200);
		
		/*
		for (int i = 0;i<20;i++) { 
			myFrame.add(new JButton("button "+(i+1))); // plus i plus 1 is gonna add one to the previous instance of i and make it the button text to make 1234 off of each other.
		}
		*/
		
		/*
		myFrame.add(new JButton("button 1"),border2.PAGE_START);
		myFrame.add(new JButton("button 2"),border2.PAGE_END);
		myFrame.add(new JButton("button 3"),border2.LINE_START);
		myFrame.add(new JButton("button 4"),border2.LINE_END);
		myFrame.add(new JButton("button 5"),border2.CENTER);
		*/
		
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
		
		JButton buttn1 = new JButton("button 1");
		buttn1.setAlignmentX(Component.CENTER_ALIGNMENT);
		myFrame.add(buttn1);
		JButton buttn2 = new JButton("button 2");
		buttn1.setAlignmentX(Component.TOP_ALIGNMENT);
		myFrame.add(buttn2);
		JButton buttn3 = new JButton("button 3");
		buttn1.setAlignmentX(Component.BOTTOM_ALIGNMENT);
		myFrame.add(buttn3);
		JButton buttn4 = new JButton("button 4");
		buttn1.setAlignmentX(Component.LEFT_ALIGNMENT);
		myFrame.add(buttn4);
		JButton buttn5 = new JButton("button 5");
		buttn1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		myFrame.add(buttn5);
		
		/*myFrame.add(new JButton("button 1"));
		myFrame.add(new JButton("button 2"));
		myFrame.add(new JButton("button 3"));
		myFrame.add(new JButton("button 4"));
		myFrame.add(new JButton("button 5"));
		*/
		
		myFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new Layouts();
	}

}
