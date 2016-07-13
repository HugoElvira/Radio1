import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class GUI_carro extends Driver{

	private JFrame frame;
	private JTextField txtTextoDeEjemplo;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnGuardarTune;
	private JButton btnNewButton;
	private JButton button;
	private JLabel lblTune;
	private JRadioButton rdbtnAmfm;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_10;
	private JButton btn_11;
	private JButton btn_12;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the application.
	 */
	public GUI_carro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 579, 251);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		rdbtnNewRadioButton = new JRadioButton("Encendido");
		rdbtnNewRadioButton.setBounds(17, 20, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new Listener());
		
		btnNewButton = new JButton("->");
		btnNewButton.addActionListener(new Listener());
		btnNewButton.setBounds(66, 87, 45, 33);
		frame.getContentPane().add(btnNewButton);
		
		button = new JButton("<-");
	    button.addActionListener(new Listener());
		button.setBounds(17, 87, 45, 33);
		frame.getContentPane().add(button);
		
		lblTune = new JLabel("TUNE:");
		lblTune.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTune.setBounds(144, 72, 100, 46);
		frame.getContentPane().add(lblTune);
		
		btn_1 = new JButton("1");
		btn_1.addActionListener(new Listener());
		btn_1.setBounds(17, 162, 39, 33);
		frame.getContentPane().add(btn_1);
		
		btn_2 = new JButton("2");
		btn_2.addActionListener(new Listener());
		btn_2.setBounds(56, 162, 39, 33);
		frame.getContentPane().add(btn_2);
		
		btn_3 = new JButton("3");
		btn_3.addActionListener(new Listener());
		btn_3.setBounds(105, 162, 39, 33);
		frame.getContentPane().add(btn_3);
		
		btn_4 = new JButton("4");
		btn_4.addActionListener(new Listener());
		btn_4.setBounds(144, 162, 39, 33);
		frame.getContentPane().add(btn_4);
		
		btn_5 = new JButton("5");
		btn_5.addActionListener(new Listener());
		btn_5.setBounds(193, 162, 39, 33);
		frame.getContentPane().add(btn_5);
		
		btn_6 = new JButton("6");
		btn_6.addActionListener(new Listener());
		btn_6.setBounds(232, 162, 39, 33);
		frame.getContentPane().add(btn_6);
		
		btn_7 = new JButton("7");
		btn_7.addActionListener(new Listener());
		btn_7.setBounds(281, 162, 39, 33);
		frame.getContentPane().add(btn_7);
		
		btn_8 = new JButton("8");
		btn_8.addActionListener(new Listener());
		btn_8.setBounds(321, 162, 39, 33);
		frame.getContentPane().add(btn_8);
		
		btn_9 = new JButton("9");
		btn_9.addActionListener(new Listener());
		btn_9.setBounds(370, 162, 39, 33);
		frame.getContentPane().add(btn_9);
		
		btn_10 = new JButton("10");
		btn_10.addActionListener(new Listener());
		btn_10.setBounds(409, 162, 45, 33);
		frame.getContentPane().add(btn_10);
		
		btn_11 = new JButton("11");
		btn_11.addActionListener(new Listener());
		btn_11.setBounds(464, 162, 45, 33);
		frame.getContentPane().add(btn_11);
		
		rdbtnGuardarTune = new JRadioButton("Guardar Tune");
		rdbtnGuardarTune.setBounds(17, 132, 109, 23);
		frame.getContentPane().add(rdbtnGuardarTune);
		
		txtTextoDeEjemplo = new JTextField();
		txtTextoDeEjemplo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTextoDeEjemplo.setFont(new Font("Tahoma", Font.BOLD, 50));
		txtTextoDeEjemplo.setText("105.1");
		txtTextoDeEjemplo.setForeground(new Color(0, 0, 139));
		txtTextoDeEjemplo.setBackground(new Color(211, 211, 211));
		txtTextoDeEjemplo.setEditable(false);
		txtTextoDeEjemplo.setBounds(242, 72, 222, 59);
		frame.getContentPane().add(txtTextoDeEjemplo);
		txtTextoDeEjemplo.setColumns(10);
		
		rdbtnAmfm = new JRadioButton("AM/FM");
		rdbtnAmfm.setBounds(17, 46, 109, 23);
		frame.getContentPane().add(rdbtnAmfm);
		
		btn_12 = new JButton("12");
		btn_12.addActionListener(new Listener());
		btn_12.setBounds(508, 162, 45, 33);
		frame.getContentPane().add(btn_12);
	}
	
	
	//listener
	private class Listener implements ActionListener{

			
			public void actionPerformed(ActionEvent e) {
				
				
				//mas ->
				if (e.getSource() ==btnNewButton){
					
				}
				
				//1
				if (e.getSource() ==btn_1){
					
				}
				
				//2
				if (e.getSource() ==btn_2){
					
				}
				
				//3
				if (e.getSource() ==btn_3){
					
				}
				
				//4
				if (e.getSource() ==btn_4){
					
				}
				
				//5
				if (e.getSource() ==btn_5){
					
				}
				
				//6
				if (e.getSource() ==btn_6){
					
				}
				
				//7
				if (e.getSource() ==btn_7){
					
				}
				
				//8
				if (e.getSource() ==btn_8){
					
				}
				
				//9
				if (e.getSource() ==btn_9){
					
				}
				
				//10
				if (e.getSource() ==btn_10){
					
				}
				
				//11
				if (e.getSource() ==btn_11){
					
				}
				
				//12
				if (e.getSource() ==btn_12){
					
				}
				
				
				
				
				
				
				
			}
		}
	
	
	
	
}

