package Lampotilamuunnin;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lampotilamuunnin extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private final JButton btnNewButton = new JButton("Convert");
	private JTextField celsius;
	private final JTextField Farenheit = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lampotilamuunnin frame = new Lampotilamuunnin();
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
	public Lampotilamuunnin() {
		setTitle("Celsius Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblNewLabel = new JLabel("Celsius");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 2;
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField sy�te = new JTextField();
				String tulos = sy�te.getText();
				celsius.setText(tulos);
				celsius.getText();
				

			}
		});
		
		celsius = new JTextField();
		GridBagConstraints gbc_celsius = new GridBagConstraints();
		gbc_celsius.insets = new Insets(0, 0, 5, 5);
		gbc_celsius.fill = GridBagConstraints.HORIZONTAL;
		gbc_celsius.gridx = 3;
		gbc_celsius.gridy = 1;
		contentPane.add(celsius, gbc_celsius);
		celsius.setColumns(10);
		contentPane.add(btnNewButton, gbc_btnNewButton);
		GridBagConstraints gbc_Farenheit = new GridBagConstraints();
		gbc_Farenheit.insets = new Insets(0, 0, 0, 5);
		gbc_Farenheit.gridx = 3;
		gbc_Farenheit.gridy = 2;
		contentPane.add(Farenheit, gbc_Farenheit);
		Farenheit.setColumns(10);
	}

}
