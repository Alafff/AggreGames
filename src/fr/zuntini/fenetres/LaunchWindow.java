package fr.zuntini.fenetres;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;

public class LaunchWindow {

	private int width = 609;
	private int height = 239;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LaunchWindow window = new LaunchWindow();
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
	public LaunchWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				System.out.println("width =" + frame.getWidth() + " height = " + frame.getHeight());
			}
		});
		frame.setTitle("AggreGames First time");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
		panel.setPreferredSize(new Dimension(609, 40));
		panel.setMinimumSize(new Dimension(width, 50));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{161, 81, 0, 0};
		gbl_panel.rowHeights = new int[]{14, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblPltfmUsd = new JLabel("Prefered Platforms used : (The ones you wanna see in your top window)");
		GridBagConstraints gbc_lblPltfmUsd = new GridBagConstraints();
		gbc_lblPltfmUsd.gridwidth = 2;
		gbc_lblPltfmUsd.insets = new Insets(0, 0, 0, 5);
		gbc_lblPltfmUsd.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblPltfmUsd.gridx = 0;
		gbc_lblPltfmUsd.gridy = 0;
		panel.add(lblPltfmUsd, gbc_lblPltfmUsd);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator.setBackground(Color.CYAN);
		separator.setOpaque(true);
		separator.setRequestFocusEnabled(false);
		separator.setSize(new Dimension(width, 5));
		separator.setMinimumSize(new Dimension(409, 5));
		separator.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridwidth = 3;
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 1;
		panel.add(separator, gbc_separator);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Steam");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 2;
		panel_1.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("GoG Galaxy");
		GridBagConstraints gbc_chckbxNewCheckBox_3 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_3.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_3.gridx = 4;
		gbc_chckbxNewCheckBox_3.gridy = 2;
		panel_1.add(chckbxNewCheckBox_3, gbc_chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Origin");
		GridBagConstraints gbc_chckbxNewCheckBox_2 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_2.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox_2.gridx = 6;
		gbc_chckbxNewCheckBox_2.gridy = 2;
		panel_1.add(chckbxNewCheckBox_2, gbc_chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Discord Store");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_1.gridx = 1;
		gbc_chckbxNewCheckBox_1.gridy = 3;
		panel_1.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Twitch");
		GridBagConstraints gbc_chckbxNewCheckBox_4 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4.gridx = 4;
		gbc_chckbxNewCheckBox_4.gridy = 3;
		panel_1.add(chckbxNewCheckBox_4, gbc_chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Others");
		GridBagConstraints gbc_chckbxNewCheckBox_5 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_5.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_5.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox_5.gridx = 6;
		gbc_chckbxNewCheckBox_5.gridy = 3;
		panel_1.add(chckbxNewCheckBox_5, gbc_chckbxNewCheckBox_5);
	}

}
