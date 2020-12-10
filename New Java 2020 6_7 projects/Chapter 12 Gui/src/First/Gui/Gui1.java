package First.Gui;
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;

public class Gui1 {

	public Gui1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		FlowLayout flowlayout = new FlowLayout();
		frame.setLayout(flowlayout);
		frame.setTitle("my first Gui");
		frame.setSize(500,500);
		frame.setLocation(0,0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel my_label = new JLabel("This is a label");
		my_label.setText("Change my Label Text");
		my_label.setForeground(Color.CYAN);
		
		
		
		
		JButton my_bttn = new JButton("Don't Click me");
		JButton my_bttn1 = new JButton("Don't Click me");
		JButton my_bttn2 = new JButton("Don't Click me");
		JButton my_bttn3 = new JButton("Don't Click me");
		JButton my_bttn4 = new JButton("Don't Click me");
		frame.pack();
		frame.setVisible(true);
	}

}
