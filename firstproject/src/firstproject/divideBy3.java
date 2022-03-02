package firstproject;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class divideBy3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					divideBy3 window = new divideBy3();   //sets the window 
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
	public divideBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
		private final JTextField inputbox = new JTextField();  
	private JLabel lblNewLabel_2;
	
	private void initialize() {     //sets the first label
		frame = new JFrame();
		frame.setBounds(100, 100, 387, 129);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the number you wish to divide by 3");   //this is what the label says
		lblNewLabel.setBounds(10, 0, 434, 14); 
		frame.getContentPane().add(lblNewLabel);
		inputbox.setBounds(10, 21, 64, 25);
		frame.getContentPane().add(inputbox);
		inputbox.setColumns(10);
		
		
		JLabel correct = new JLabel("");    
		correct.setBounds(10, 57, 351, 14);
		frame.getContentPane().add(correct);
		
		JButton btnNewButton = new JButton("Check Number");   //creates the button which runs the application 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String input = inputbox.getText();

				int userNum = 0;       //what the user enters
				if (input !=  null && !input.trim().isEmpty())
				 userNum = Integer.parseInt(input);
			
				if (userNum % 3 == 0) {   // the statment that divides the number by 3
					 
			 double ans = ((double)userNum / 3);
			 //String Ans = Integer.toString(ans);
			 correct.setText("The number is divisible by 3, and the result is: " + ans);   // the statment the system prints which shows if the num is divisble by 3 and the awnser
				}
				else   {
					double ans = ((double)userNum / 3);
					correct.setText("The number is not divisible by 3, and the result is: " + ans);  // the statement if the number is not divisble by 3 and the anwser it is (with a decimal)
			}
			
		}});
		
		
		btnNewButton.setBounds(84, 22, 147, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		
		/*
		 * lblNewLabel_2 = new JLabel("This Number is Divisble by 3 ");
				lblNewLabel_2.setBounds(0, 69, 169, 14);
				frame.getContentPane().add(lblNewLabel_2);
				JLabel ansbox = new JLabel(Ans);
				ansbox.setBounds(112, 56, 46, 14);
				frame.getContentPane().add(ansbox);
				
				
				
				lblNewLabel_2 = new JLabel("This Number is not Divisble by 3 ");
					lblNewLabel_2.setBounds(0, 69, 169, 14);
					frame.getContentPane().add(lblNewLabel_2);}
				
				
				
				
		 */
		
	
		
			
		
		
	}
}
