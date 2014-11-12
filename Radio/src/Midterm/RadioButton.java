package Midterm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ButtonGroup;

public class RadioButton {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton window = new RadioButton();
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
	public RadioButton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		buttonGroup.add(rdbtnSmall);
		rdbtnSmall.setSelected(true);
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		buttonGroup.add(rdbtnMedium);
		rdbtnMedium.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JRadioButton rdbtnLarge = new JRadioButton("Large");
		buttonGroup.add(rdbtnLarge);
		rdbtnLarge.setFont(new Font("Dialog", Font.BOLD, 16));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(136)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnSmall, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnMedium, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnLarge, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(rdbtnSmall)
					.addGap(42)
					.addComponent(rdbtnMedium, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(rdbtnLarge, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
