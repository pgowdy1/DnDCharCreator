package mainMenu; 
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JToolBar;
import java.awt.Panel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;


public class menuFrame extends JFrame {
 
	private JPanel Main_Menu;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuFrame frame = new menuFrame();
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
	public menuFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(menuFrame.class.getResource("/resources/fire_dragon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 443);
		Main_Menu = new JPanel();
		Main_Menu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Main_Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Main_Menu); 
		
		JButton btnCreateACharacter = new JButton("Create a Character");
		btnCreateACharacter.setBounds(256, 131, 189, 29);
		btnCreateACharacter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Character newCharacter = new Character();
				newCharacter.createCharacter();
				AttributeMenu attribute = new AttributeMenu();
			}
		});
		btnCreateACharacter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnCreateACharacter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCreateACharacter.setActionCommand("Create a Character");
		
		JButton btnLoadACharacter = new JButton("Load a Character");
		btnLoadACharacter.setBounds(256, 171, 189, 29);
		btnLoadACharacter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLoadACharacter.setActionCommand("Load");
		
		JButton btnPrintaCharacter = new JButton("Print a Character");
		btnPrintaCharacter.setBounds(256, 211, 189, 29);
		btnPrintaCharacter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPrintaCharacter.setActionCommand("Create a Character");
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0); 
			}
		});
		btnExit.setBounds(256, 251, 189, 29);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnExit.setActionCommand("Create a Character");
		Main_Menu.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(177, 0, 330, 120);
		lblNewLabel.setIcon(new ImageIcon(menuFrame.class.getResource("/resources/DnDlogoS.jpg")));
		Main_Menu.add(lblNewLabel);
		Main_Menu.add(btnExit);
		Main_Menu.add(btnLoadACharacter);
		Main_Menu.add(btnCreateACharacter);
		Main_Menu.add(btnPrintaCharacter);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
