package com.hws;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		HelloForm frame = new HelloForm();
		frame.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public HelloForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("Quitter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QuitterBtnActionPerformed(arg0);
			}
		});

		btnNewButton.setBounds(201, 291, 109, 35);
		panel.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Hello World");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 47));
		lblNewLabel.setBounds(147, 134, 247, 53);
		panel.add(lblNewLabel);
	}

	public void QuitterBtnActionPerformed(ActionEvent evt) {
		this.dispose();
	}

}
