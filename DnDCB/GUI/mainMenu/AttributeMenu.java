package mainMenu;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class AttributeMenu extends JPanel {
	private JTextField txtRolld;

	/**
	 * Create the panel.
	 */
	public AttributeMenu() {
		
		JButton btnNewButton = new JButton("Method I\r\n");
		
		JButton btnNewButton_1 = new JButton("Method II\r\n");
		
		JButton btnNewButton_2 = new JButton("Method III\r\n");
		
		JButton btnNewButton_3 = new JButton("Method IV\r\n");
		
		JButton btnNewButton_4 = new JButton("Method V\r\n");
		
		JButton btnNewButton_5 = new JButton("Method VI");
		
		txtRolld = new JTextField();
		txtRolld.setText("Roll 3d6 - Scores are assigned to Strength, Dexterity, Constitution, " +
				"\nIntelligence, Wisdom, and Charisma (in that order).");
		txtRolld.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
								.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(41)
					.addComponent(txtRolld, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
					.addGap(47))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(txtRolld, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
					.addComponent(btnNewButton_2)
					.addGap(37)
					.addComponent(btnNewButton_3)
					.addGap(35)
					.addComponent(btnNewButton_4)
					.addGap(36)
					.addComponent(btnNewButton_5)
					.addGap(41))
		);
		setLayout(groupLayout);
		
		
	}
}
