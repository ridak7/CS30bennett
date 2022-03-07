package firstproject;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import java.awt.EventQueue;

import javax.swing.JFrame;

public class plates {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					plates window = new plates();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public plates() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel plates = new JLabel(new ImageIcon(plates.class.getResource("/firstproject/PLATES3.jpg")));
		plates.setBounds(10, 11, 428, 126);
		frame.getContentPane().add(plates);
		
		JLabel prize = new JLabel(new ImageIcon(plates.class.getResource("/firstproject/goodprize.jpg")));
		prize.setBounds(144, 165, 147, 96);
		frame.getContentPane().add(prize);
		
		JButton playButton = new JButton("Play");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //Checks for if the button is pressed
					playButton.setText("Play Again?"); //set text to label
					double ranNumDouble = (2 - 1 + 1) * Math.random() + 1; //random number generation
					int ranNum = (int)ranNumDouble; //cast random number to int
					
					if (ranNum == 1) { //first case
						plates.setIcon(new ImageIcon(plates.class.getResource("/firstproject/Untitled-1-Recovered.jpg"))); //set image to label
						prize.setIcon(new ImageIcon(plates.class.getResource("/firstproject/badprize.jpg"))); //consulation prize
					} 
					if (ranNum == 2) { //second case
						plates.setIcon(new ImageIcon(plates.class.getResource("/firstproject/plate3bronken.jpg")));
						prize.setIcon(new ImageIcon(plates.class.getResource("/firstproject/goodprize.jpg")));
					} 
			}
		});
		playButton.setBounds(144, 134, 133, 23);
		frame.getContentPane().add(playButton);
	}
}



