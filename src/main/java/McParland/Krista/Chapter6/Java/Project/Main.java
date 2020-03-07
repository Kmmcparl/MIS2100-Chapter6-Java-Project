package McParland.Krista.Chapter6.Java.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(32, 75, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(32, 117, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numerator");
		lblNewLabel.setBounds(32, 60, 65, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Denominator");
		lblNewLabel_1.setBounds(32, 104, 65, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel ResultLabel = new JLabel("New label");
		ResultLabel.setBounds(135, 161, 45, 13);
		frame.getContentPane().add(ResultLabel);
		
		JButton btnNewButton = new JButton("Calculate");
		
		btnNewButton.setBounds(32, 157, 85, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double numerator = Double.parseDouble(textField.getText());
				double denominator= Double.parseDouble(textField_1.getText());
				SimpleMath cat = new SimpleMath();
				try { Double result = cat.divide(numerator, denominator);
					ResultLabel.setText(result.toString());
				}catch(ArithmeticException e1) { 
					ResultLabel.setText("Cannot divide by 0");
				}
			}
		});
	}
	
}
