package First.Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Guinumber2 implements ActionListener {
	JLabel name_lbl;
	JTextField name_tb;
	JButton dontClick_bttn;
	String name;
	JFrame mainframe;
	
	public Guinumber2() {
		// initial default set up of frame 
		mainframe = new JFrame();
		FlowLayout layout = new FlowLayout();
		mainframe.setLayout(layout);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setSize(300,500);
		mainframe.setLocation(200, 200);
		
		// Build the widgets 
		name_lbl = new JLabel();
		name_lbl.setText("Enter your name");
		
		name_tb = new JTextField();
		name_tb.setPreferredSize(new Dimension(100,25));
		
		
		
		
		dontClick_bttn = new JButton("        ");
		dontClick_bttn.addActionListener(this);
		
		
	
		// add widgets section
		mainframe.add(dontClick_bttn);
		mainframe.add(name_tb);
		
		//color changer 
		
		name_lbl.setBackground(Color.CYAN);
		
		
		
		
		
		//this needs to be the last line in the constructor
		mainframe.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Guinumber2();
	}
	
	@Override 
	public void actionPerformed(ActionEvent e) {
		name = name_tb.getText();
		mainframe.getContentPane().setBackground(Color.BLUE);
		JOptionPane.showMessageDialog(null,"I told you not to Click "+name);
		
	}
	
	}
