package javaTipsMensajes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class JavaTipsMensajes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaTipsMensajes window = new JavaTipsMensajes();
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
	public JavaTipsMensajes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 543, 357);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton btnTip1 = new JButton("Tip Nº1");
		btnTip1.setForeground(new Color(0, 0, 0));
		btnTip1.setBackground(new Color(0, 255, 0));
		sl_panel.putConstraint(SpringLayout.NORTH, btnTip1, 126, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnTip1, 99, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnTip1, -131, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnTip1, -361, SpringLayout.EAST, panel);
		panel.add(btnTip1);
		
		JButton btnTip2 = new JButton("Tip Nº2");
		btnTip2.setForeground(new Color(0, 0, 0));
		btnTip2.setBackground(new Color(0, 255, 0));
		sl_panel.putConstraint(SpringLayout.NORTH, btnTip2, 126, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnTip2, 65, SpringLayout.EAST, btnTip1);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnTip2, 61, SpringLayout.NORTH, btnTip1);
		sl_panel.putConstraint(SpringLayout.EAST, btnTip2, -229, SpringLayout.EAST, panel);
		panel.add(btnTip2);
		
		JButton btnTip3 = new JButton("Tip Nº3");
		btnTip3.setForeground(new Color(0, 0, 0));
		btnTip3.setBackground(new Color(0, 255, 0));
		sl_panel.putConstraint(SpringLayout.NORTH, btnTip3, 0, SpringLayout.NORTH, btnTip1);
		sl_panel.putConstraint(SpringLayout.WEST, btnTip3, 74, SpringLayout.EAST, btnTip2);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnTip3, 0, SpringLayout.SOUTH, btnTip1);
		sl_panel.putConstraint(SpringLayout.EAST, btnTip3, -88, SpringLayout.EAST, panel);
		panel.add(btnTip3);
		
		JLabel lblNewLabel = new JLabel("TIPS DE JAVA");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 34, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 214, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, -109, SpringLayout.EAST, panel);
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 16));
		panel.add(lblNewLabel);
	}
}
