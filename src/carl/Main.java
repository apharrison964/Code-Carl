package carl;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		JFrame frame = new JFrame("Code Carl");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



		CarlWidget carl = new CarlWidget();
		JTextArea input = new JTextArea("This is where your code will go");
		JTextArea goals = new JTextArea();
//		JButton button = new JButton("Submit");
//		button.setPreferredSize(new Dimension(40, 40));
		goals.setBackground(Color.GRAY);
		input.setBackground(Color.BLACK);
		input.setForeground(Color.WHITE);
		goals.setEditable(false);
		goals.setText("Do this:");

		frame.setLayout(new GridLayout(3, 1));

		frame.add(carl);
		frame.add(input);
		frame.add(goals);

		frame.pack();
		frame.setVisible(true);
		frame.setSize(1600, 800);

		int x = 0;
		while(x < 220) {
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
}
