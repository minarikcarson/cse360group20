import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.MatteBorder;

public class toDoListUnlimited2019 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					toDoListUnlimited2019 window = new toDoListUnlimited2019();
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
	public toDoListUnlimited2019() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {60};
		gbl_panel.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel.setLayout(gbl_panel);
		
		
		
		JButton saveButton = new JButton("SAVE");
		
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
			}
		});
		
		
		
		JButton deleteButton = new JButton("DELETE");
		
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		
		
		
		JButton addButton = new JButton("ADD");
		
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		JComboBox displayOptions = new JComboBox();
		displayOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		
		
		
		
		
		displayOptions.setModel(new DefaultComboBoxModel(new String[] {"Priority", "Due Date", "Name"}));
		displayOptions.setMaximumRowCount(3);
		GridBagConstraints gbc_displayOptions = new GridBagConstraints();
		gbc_displayOptions.insets = new Insets(0, 0, 5, 0);
		gbc_displayOptions.gridx = 0;
		gbc_displayOptions.gridy = 0;
		panel.add(displayOptions, gbc_displayOptions);
		
		
		addButton.setForeground(Color.BLACK);
		GridBagConstraints gbc_addButton = new GridBagConstraints();
		gbc_addButton.anchor = GridBagConstraints.WEST;
		gbc_addButton.insets = new Insets(0, 0, 5, 0);
		gbc_addButton.gridx = 0;
		gbc_addButton.gridy = 1;
		panel.add(addButton, gbc_addButton);
		GridBagConstraints gbc_deleteButton = new GridBagConstraints();
		gbc_deleteButton.anchor = GridBagConstraints.WEST;
		gbc_deleteButton.insets = new Insets(0, 0, 5, 0);
		gbc_deleteButton.gridx = 0;
		gbc_deleteButton.gridy = 2;
		panel.add(deleteButton, gbc_deleteButton);
		GridBagConstraints gbc_saveButton = new GridBagConstraints();
		gbc_saveButton.anchor = GridBagConstraints.WEST;
		gbc_saveButton.insets = new Insets(0, 0, 5, 0);
		gbc_saveButton.gridx = 0;
		gbc_saveButton.gridy = 3;
		panel.add(saveButton, gbc_saveButton);
		
		
		
		JButton printButton = new JButton("PRINT");
		
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		
		
		
		JButton loadButton = new JButton("LOAD");
		
		loadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		
		
		
		GridBagConstraints gbc_loadVutton = new GridBagConstraints();
		gbc_loadVutton.anchor = GridBagConstraints.WEST;
		gbc_loadVutton.insets = new Insets(0, 0, 5, 0);
		gbc_loadVutton.gridx = 0;
		gbc_loadVutton.gridy = 4;
		panel.add(loadButton, gbc_loadVutton);
		GridBagConstraints gbc_printButton = new GridBagConstraints();
		gbc_printButton.anchor = GridBagConstraints.WEST;
		gbc_printButton.insets = new Insets(0, 0, 5, 0);
		gbc_printButton.gridx = 0;
		gbc_printButton.gridy = 5;
		panel.add(printButton, gbc_printButton);
		
		JButton btnEdit = new JButton("EDIT");
		GridBagConstraints gbc_btnEdit = new GridBagConstraints();
		gbc_btnEdit.anchor = GridBagConstraints.WEST;
		gbc_btnEdit.gridx = 0;
		gbc_btnEdit.gridy = 6;
		panel.add(btnEdit, gbc_btnEdit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
	}
}
