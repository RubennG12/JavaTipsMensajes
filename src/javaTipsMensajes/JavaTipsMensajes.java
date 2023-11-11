package javaTipsMensajes;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;


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
		frame.setBounds(100, 100, 531, 357);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton btnTip1 = new JButton("Tip Nº1");
		sl_panel.putConstraint(SpringLayout.NORTH, btnTip1, 140, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnTip1, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnTip1, -93, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnTip1, -365, SpringLayout.EAST, panel);
		btnTip1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se ha pulsado el boton 'Tip Nº1'.");
				
				JOptionPane.showMessageDialog(btnTip1,"Los nombres de las variables suelen ponerse en ingles.");
				
			}
		});
		btnTip1.setForeground(new Color(0, 0, 0));
		btnTip1.setBackground(new Color(0, 255, 0));
		panel.add(btnTip1);
		
		JButton btnTip2 = new JButton("Tip Nº2");
		sl_panel.putConstraint(SpringLayout.WEST, btnTip2, 30, SpringLayout.EAST, btnTip1);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnTip2, -93, SpringLayout.SOUTH, panel);
		btnTip2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se ha pulsado el boton 'Tip Nº2'.");
				
				JOptionPane.showMessageDialog(btnTip2,"Todo lo que vay detras de un punto(.) es un metodo.");
			}
		});
		btnTip2.setForeground(new Color(0, 0, 0));
		btnTip2.setBackground(new Color(0, 255, 0));
		panel.add(btnTip2);
		
		JButton btnTip3 = new JButton("Tip Nº3");
		sl_panel.putConstraint(SpringLayout.WEST, btnTip3, 353, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnTip3, -93, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnTip2, -38, SpringLayout.WEST, btnTip3);
		sl_panel.putConstraint(SpringLayout.EAST, btnTip3, -27, SpringLayout.EAST, panel);
		btnTip3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se ha pulsado el boton 'Tip Nº3'.");
				
				JOptionPane.showMessageDialog(btnTip3,"Poner comentarios a tu codigo es muy buena manera de trabajar.");
			}
		});
		btnTip3.setForeground(new Color(0, 0, 0));
		btnTip3.setBackground(new Color(0, 255, 0));
		panel.add(btnTip3);
		
		JLabel lblNewLabel = new JLabel("TIPS DE JAVA");
		sl_panel.putConstraint(SpringLayout.NORTH, btnTip3, 65, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.NORTH, btnTip2, 65, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 56, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 207, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, -116, SpringLayout.EAST, panel);
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 16));
		panel.add(lblNewLabel);
	}
}
