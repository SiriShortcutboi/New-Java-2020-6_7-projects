package First.Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
public class Guinumber3competition implements ActionListener {
	JLabel name_lbl3;
	JTextField name_tb3;
	JButton Click_bttn;
	String name3;
	JFrame mainframe3;
	int numclicks = 0;
	
	public Guinumber3competition() {
		// Initial setup
		mainframe3 = new JFrame();
		FlowLayout layout = new FlowLayout();
		mainframe3.setLayout(layout);
		mainframe3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe3.setSize(300,500);
		mainframe3.setLocation(200, 200);
	
		Click_bttn = new JButton("Clicks "+Integer.toString(numclicks));
		Click_bttn.addActionListener(this);
		
		mainframe3.add(Click_bttn);
		
		
		
		mainframe3.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new Guinumber3competition();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		Date startTime = Calendar.getInstance().getTime();
		numclicks++;
		Click_bttn.setText("Clicks "+Integer.toString(numclicks));
		if (numclicks == 10) {
			Font font = new Font("Verdana", Font.BOLD, 20);
			Click_bttn.setFont(font);
		}
		if (numclicks == 20) {
			Font font = new Font("Verdana", Font.BOLD, 25);
			Click_bttn.setFont(font);
		}
		if (numclicks == 30) {
			Font font = new Font("Verdana", Font.BOLD, 30);
			Click_bttn.setFont(font);
		}
		if (numclicks == 40) {
			Font font = new Font("Verdana", Font.BOLD, 35);
			Click_bttn.setFont(font);
		}
		if (numclicks == 50) {
			Font font = new Font("Verdana", Font.BOLD, 40);
			Click_bttn.setFont(font);
			//JOptionPane.showMessageDialog(null,"Woah we're halfway there!");
			mainframe3.getContentPane().setBackground(Color.GREEN);
			mainframe3.getContentPane().setBackground(Color.WHITE);
			mainframe3.getContentPane().setBackground(Color.GREEN);
			mainframe3.getContentPane().setBackground(Color.WHITE);
			mainframe3.getContentPane().setBackground(Color.GREEN);
			mainframe3.getContentPane().setBackground(Color.WHITE);
		}
		if (numclicks >= 100) {
			Date endTime= Calendar.getInstance().getTime();
			mainframe3.getContentPane().setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(null,"You reacheed 100 clicks at "+ Calendar.getInstance().getTime());
			
			Runnable sound1 = (Runnable)Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.error");
			sound1.run();
					
		}
		
	}
}
