

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Main implements ActionListener {

	public static void main(String[] args) throws InterruptedException {

		JFrame frame = new JFrame("Code Carl");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



		CarlWidget carl = new CarlWidget();
		JTextArea input = new JTextArea("This is where your code will go");
		JTextArea goals = new JTextArea();
		JPanel panel = new JPanel();
		JButton button = new JButton("Submit");
		button.setActionCommand("submit");
		//button.addActionListener(carl); 
		goals.setBackground(Color.GRAY);
		input.setBackground(Color.BLACK);
		input.setForeground(Color.WHITE);
		goals.setEditable(false);
		goals.setText("Do this:");

		frame.setLayout(new GridLayout(3, 1));

		frame.add(carl);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel.add(input);
		panel.add(Box.createRigidArea(new Dimension(0,5)));
		panel.add(button);
		frame.add(panel);
		frame.add(goals);

		frame.pack();
		frame.setVisible(true);
		frame.setSize(1000, 800);

		int x = 0;
		while(x < 206) {
			carl.moveCarlVertical();
			carl.repaint();
			Thread.sleep(2);
			x++;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("submit".equals(e.getActionCommand())) {
			
			
		}
	}
}