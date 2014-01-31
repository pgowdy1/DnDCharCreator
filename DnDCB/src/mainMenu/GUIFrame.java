package mainMenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;

public class GUIFrame extends JFrame {

	private JPanel RootPane;
	private Character newCharacter = new Character();  

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIFrame frame = new GUIFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 411);
		RootPane = new JPanel();
		RootPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(RootPane);
		final CardLayout layout = new CardLayout(0,0); 
		RootPane.setLayout(layout);
		
		JPanel MainMenu = new JPanel();
		RootPane.add(MainMenu, "name_67263595240526");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Woh\\Documents\\DDlogo.jpg"));
		
		JButton btnNewButton = new JButton("Create a Character\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout)(RootPane.getLayout());
				cardLayout.next(RootPane);
				newCharacter.assignAttributes();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Load a Character\r\n");
		
		JButton btnNewButton_2 = new JButton("Print a Character");
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 
			}
		});
		GroupLayout gl_MainMenu = new GroupLayout(MainMenu);
		gl_MainMenu.setHorizontalGroup(
			gl_MainMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MainMenu.createSequentialGroup()
					.addGap(87)
					.addComponent(lblNewLabel)
					.addContainerGap(92, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_MainMenu.createSequentialGroup()
					.addGap(177)
					.addGroup(gl_MainMenu.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
					.addGap(190))
		);
		gl_MainMenu.setVerticalGroup(
			gl_MainMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MainMenu.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		MainMenu.setLayout(gl_MainMenu);
		
		JPanel Attribute_assignment = new JPanel();
		RootPane.add(Attribute_assignment, "name_67263658181659");
		
		JTextPane txtpnRolld = new JTextPane();
		txtpnRolld.setFont(new Font("Tahoma", Font.PLAIN, 9));
		txtpnRolld.setText("Roll 3d6 - Scores are assigned to Strength, Dexterity, Constitution, Intelligence, Wisdom, and Charisma (in that order).");
		
		JButton btnNewButton_4 = new JButton("Method I.\r\n");
		
		JButton btnNewButton_5 = new JButton("Method II.");
		
		JButton btnNewButton_6 = new JButton("Method III.");
		
		JButton btnNewButton_7 = new JButton("Method IV.");
		
		JButton btnNewButton_8 = new JButton("Method V.");
		
		JTextPane txtpnRolldTwice = new JTextPane();
		txtpnRolldTwice.setFont(new Font("Tahoma", Font.PLAIN, 9));
		txtpnRolldTwice.setText("Roll 3d6 twice - Note the total of each roll. Use whichever result you prefer for your character's Strength score. Repeat this for Dexterity, Constitution, Intelligence, Wisdom, and Charisma. This allows you to pick the best score from each pair, generally ensuring that your character does not have any really low ability scores.");
		
		JTextPane txtpnRolldSix = new JTextPane();
		txtpnRolldSix.setFont(new Font("Tahoma", Font.PLAIN, 9));
		txtpnRolldSix.setText("Roll 3d6 six times - Jot down the total for each roll. Assign the scores to your character's six abilities however you want. This gives you the chance to custom-tailor your character, although you are not guaranteed high scores.");
		
		JTextPane txtpnRollFourSixsided = new JTextPane();
		txtpnRollFourSixsided.setFont(new Font("Tahoma", Font.PLAIN, 9));
		txtpnRollFourSixsided.setText("Roll four six-sided dice (4d6). Discard the lowest die and total the remaining three. Repeat this five more times, then assign the six numbers to the character's abilities however you want.");
		
		JTextPane txtpnIWantTo = new JTextPane();
		txtpnIWantTo.setText("I want to roll my dice outside of the creator and input my abilities.");
		txtpnIWantTo.setFont(new Font("Tahoma", Font.PLAIN, 9));
		
		JLabel lblAttributeAssignment = new JLabel("Attribute Assignment");
		lblAttributeAssignment.setFont(new Font("Tahoma", Font.BOLD, 16));
		GroupLayout gl_Attribute_assignment = new GroupLayout(Attribute_assignment);
		gl_Attribute_assignment.setHorizontalGroup(
			gl_Attribute_assignment.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Attribute_assignment.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_Attribute_assignment.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Attribute_assignment.createSequentialGroup()
							.addGroup(gl_Attribute_assignment.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton_5, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_Attribute_assignment.createParallelGroup(Alignment.LEADING)
								.addComponent(txtpnRolld, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtpnRolldTwice, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_Attribute_assignment.createSequentialGroup()
							.addGroup(gl_Attribute_assignment.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnNewButton_8, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
								.addComponent(btnNewButton_7, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
								.addComponent(btnNewButton_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_Attribute_assignment.createParallelGroup(Alignment.LEADING)
								.addComponent(txtpnIWantTo, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
								.addComponent(txtpnRollFourSixsided, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
								.addComponent(txtpnRolldSix, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))))
					.addGap(28))
				.addGroup(Alignment.TRAILING, gl_Attribute_assignment.createSequentialGroup()
					.addContainerGap(184, Short.MAX_VALUE)
					.addComponent(lblAttributeAssignment, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
					.addGap(129))
		);
		gl_Attribute_assignment.setVerticalGroup(
			gl_Attribute_assignment.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Attribute_assignment.createSequentialGroup()
					.addComponent(lblAttributeAssignment, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Attribute_assignment.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_4)
						.addComponent(txtpnRolld, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addGroup(gl_Attribute_assignment.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtpnRolldTwice, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_5, Alignment.LEADING))
					.addGap(17)
					.addGroup(gl_Attribute_assignment.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_6)
						.addComponent(txtpnRolldSix, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_Attribute_assignment.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_7)
						.addComponent(txtpnRollFourSixsided, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_Attribute_assignment.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_8)
						.addComponent(txtpnIWantTo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(52))
		);
		Attribute_assignment.setLayout(gl_Attribute_assignment);
		
		JPanel panel_2 = new JPanel();
		RootPane.add(panel_2, "name_67263727774969");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 509, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 363, Short.MAX_VALUE)
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		RootPane.add(panel_3, "name_67263794626219");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 509, Short.MAX_VALUE)
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 363, Short.MAX_VALUE)
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		RootPane.add(panel_4, "name_67263860636324");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 509, Short.MAX_VALUE)
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 363, Short.MAX_VALUE)
		);
		panel_4.setLayout(gl_panel_4);
	}
}
