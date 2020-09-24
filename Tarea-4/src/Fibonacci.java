import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fibonacci extends JFrame {

	private JPanel contentPane;
	private JTextField txtIteracion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibonacci frame = new Fibonacci();
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
	public Fibonacci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iteraciones");
		lblNewLabel.setBounds(31, 26, 67, 14);
		contentPane.add(lblNewLabel);
		
		txtIteracion = new JTextField();
		txtIteracion.setBounds(108, 23, 86, 20);
		contentPane.add(txtIteracion);
		txtIteracion.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(236, 22, 171, 22);
		contentPane.add(comboBox);
		
		JButton btnCalcular = new JButton("Calcular serie");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int intNumero1=0, intNumero2=1, intX = 0;
				int intIteraciones = Integer.parseInt(txtIteracion.getText());

				comboBox.removeAllItems();
				
				comboBox.addItem("Serie de Fibonacci");
				comboBox.addItem(intNumero1);
				comboBox.addItem(intNumero2);

		        do
		        {
		            int intSuma = intNumero1 + intNumero2;
		            comboBox.addItem(intSuma);

		            intNumero1 = intNumero2;
		            intNumero2 = intSuma;

		            intX ++;
		        } while(intX <= intIteraciones);
				
			}
		});
		btnCalcular.setBounds(31, 105, 112, 23);
		contentPane.add(btnCalcular);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnSalir.setBounds(295, 105, 112, 23);
		contentPane.add(btnSalir);
	}
}
