package GraphicInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversordeFahrenheitparaCelsius extends JFrame {

	private JPanel contentPane;
	private JTextField valor;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversordeFahrenheitparaCelsius frame = new ConversordeFahrenheitparaCelsius();
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
	public ConversordeFahrenheitparaCelsius() {
		setTitle("Conversor de Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
				double fahrenheit = Double.parseDouble(valor.getText());
				double celsius = (fahrenheit - 32) / 1.8;
				resultado.setText(celsius + " Celsius");
				} catch (Exception erro) {
					System.out.println("Problemas de Conversão");
				}
			}
		});
		btnConverter.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contentPane.add(btnConverter, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Fahrenheite:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblNewLabel);
		
		valor = new JTextField();
		valor.setHorizontalAlignment(SwingConstants.CENTER);
		valor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(valor);
		valor.setColumns(10);
		
		JLabel lblCelsius = new JLabel("Celsius:");
		lblCelsius.setHorizontalAlignment(SwingConstants.CENTER);
		lblCelsius.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblCelsius);
		
		resultado = new JTextField();
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(resultado);
		resultado.setColumns(10);
	}

}
