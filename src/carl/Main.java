package carl;

import java.awt.*;

import javax.swing.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		JFrame frame = new JFrame("Code Carl");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		CarlWidget carl = new CarlWidget();
    	JTextField input = new JTextField("This is where your code will go");
    	JTextArea goals = new JTextArea();
    	goals.setBackground(Color.GRAY);
    	input.setBackground(Color.BLACK);
    	input.setForeground(Color.WHITE);
    	goals.setEditable(false);
    	goals.setText("Do this:");
		
		frame.setLayout(new GridLayout(3, 1));
		
		frame.add(carl);
		frame.add(input);
		frame.add(goals);
		
		
		carl.moveCarlHorizontal();
		carl.repaint();
		Thread.sleep(10);	
		
		frame.pack();
		frame.setVisible(true);
		frame.setSize(1600, 800);
		
	}
	
}
