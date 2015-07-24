package carl;

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
		goals.setBackground(Color.GRAY);
		input.setBackground(Color.BLACK);
		input.setForeground(Color.WHITE);
		goals.setEditable(false);
		goals.setText("Do this:");

		frame.setLayout(new GridLayout(4, 1));

		frame.add(carl);
		frame.add(input);
		frame.add(goals);
		frame.add(panel);
		panel.add(button);

		frame.pack();
		frame.setVisible(true);
		frame.setSize(1600, 800);

		int x = 0;
		while(x < 150) {
			carl.moveCarlVertical();
			carl.repaint();
			Thread.sleep(2);
			x++;
		}

		/*while(true) {
			int x = 0;
			while (x < 50) {
				carl.moveCarlHorizontal();
				carl.repaint();
				Thread.sleep(10);
				x++;
			}
			int y = 0;
			while(y < 7) {
				carl.moveCarlVertical();
				carl.repaint();
				Thread.sleep(10);
				y++;
			}
		}*/

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("submit".equals(e.getActionCommand())) {
			
		}
		
	}
}
