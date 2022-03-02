package firstproject;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MetricC {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricC window = new MetricC();
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
	public MetricC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 248, 144);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel selectPrompt = new JLabel("Select a conversion type:");

		selectPrompt.setBounds(10, 11, 175, 14);
		frame.getContentPane().add(selectPrompt);
		
		JLabel output = new JLabel("");
	
		output.setBounds(10, 84, 216, 14);
		frame.getContentPane().add(output);
		
		String[] units = {"Inches to Centimeters", "Feet to Meters", "Gallons to Liters", "Pounds to Kilograms"}; //sets the options for the combobox
		JComboBox select = new JComboBox(units);  // creates the system the user interacts with 
		
		select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object boxCheck = select.getSelectedItem(); 
				String convert = boxCheck.toString(); 
				switch (convert) { //switch statement that checks selection for output
				case "Inches to Centimeters": //creates the conversion to centimeters 
					output.setText("1 inch = 2.54 centimeters"); //set text to GUI
					break;
				case "Feet to Meters": //creates the conversion to meters 
					output.setText("1 foot = 0.3048 meters");
					break;
				case "Gallons to Liters": //creates the conversion to liters  
					output.setText("1 gallon = 4.5461 liters");
					break;
				case "Pounds to Kilograms": //creates the conversion to kilograms  
					output.setText("1 pound = 0.4536 kilograms");
					break;
			}
			}
		});
		
		select.setBounds(10, 26, 216, 22);
		frame.getContentPane().add(select);
		
	}
}


