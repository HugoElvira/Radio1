import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JLabel;

public class CARRO extends Driver{

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JRadioButton rdbtnAmfm;
	private JRadioButton rdbtnEncendido;
	private JLabel lblTune;
	private JRadioButton rdbtnGuardar;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CARRO window = new CARRO();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the applicatio
	 */
	public CARRO() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 716, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		rdbtnEncendido = new JRadioButton("Apagado");
		rdbtnEncendido.addActionListener(new Listener());
		rdbtnEncendido.setBounds(6, 7, 90, 23);
		frame.getContentPane().add(rdbtnEncendido);
		
		
		rdbtnAmfm = new JRadioButton("AM");
		rdbtnAmfm.setBounds(6, 33, 109, 23);
		frame.getContentPane().add(rdbtnAmfm);
		rdbtnAmfm.addActionListener(new Listener());
		
		
		btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new Listener());
		btnNewButton.setBounds(42, 85, 45, 33);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("->");
		btnNewButton_1.addActionListener(new Listener());
		btnNewButton_1.setBounds(97, 85, 45, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 80));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setForeground(Color.BLUE);
		textField.setBounds(289, 56, 309, 86);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		button_1 = new JButton("1");
		button_1.addActionListener(new Listener());
		button_1.setBounds(10, 205, 52, 33);
		frame.getContentPane().add(button_1);
		
		rdbtnGuardar = new JRadioButton("Guardar");
		rdbtnGuardar.addActionListener(new Listener());
		rdbtnGuardar.setBounds(6, 147, 109, 23);
		frame.getContentPane().add(rdbtnGuardar);
		
		button_2 = new JButton("2");
		button_2.addActionListener(new Listener());
		button_2.setBounds(63, 205, 52, 33);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("3");
		button_3.addActionListener(new Listener());
		button_3.setBounds(124, 205, 52, 33);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("4");
		button_4.addActionListener(new Listener());
		button_4.setBounds(178, 205, 52, 33);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("5");
		button_5.addActionListener(new Listener());
		button_5.setBounds(240, 205, 52, 33);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("6");
		button_6.addActionListener(new Listener());
		button_6.setBounds(295, 205, 52, 33);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("7");
		button_7.addActionListener(new Listener());
		button_7.setBounds(354, 205, 52, 33);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("8");
		button_8.addActionListener(new Listener());
		button_8.setBounds(410, 205, 52, 33);
		frame.getContentPane().add(button_8);
		
		button_9 = new JButton("9");
		button_9.addActionListener(new Listener());
		button_9.setBounds(472, 205, 52, 33);
		frame.getContentPane().add(button_9);
		
		button_10 = new JButton("10");
		button_10.addActionListener(new Listener());
		button_10.setBounds(525, 205, 52, 33);
		frame.getContentPane().add(button_10);
		
		button_11 = new JButton("11");
		button_11.addActionListener(new Listener());
		button_11.setBounds(586, 205, 52, 33);
		frame.getContentPane().add(button_11);
		
		button_12 = new JButton("12");
		button_12.addActionListener(new Listener());
		button_12.setBounds(639, 205, 52, 33);
		frame.getContentPane().add(button_12);
		
		lblTune = new JLabel("TUNE:");
		lblTune.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblTune.setBounds(178, 56, 101, 86);
		frame.getContentPane().add(lblTune);
	}
	
	
	
	//listener
		private class Listener implements ActionListener{

				
				public void actionPerformed(ActionEvent e) {
					
					if (e.getSource() ==rdbtnEncendido){
						ON_OFF();
						
						if(power==true){
							rdbtnEncendido.setText("Encendido");
							textField.setText(String.valueOf(Tune));
							
						}
						
						else {
							rdbtnEncendido.setText("Apagado");
										textField.setText("");}
							
					}
					
					
					//AM/FM
					
					if (e.getSource()==rdbtnAmfm){
						AM_FM();
						
					
						if(power==true){
						
						if(Tune_Type==true){
						textField.setText(String.valueOf(Tune));
						rdbtnAmfm.setText("FM");
						}
						}
						
						if(Tune_Type==false){
						rdbtnAmfm.setText("AM");
						}
						
							
					}
					
					
					//cambiar emisora: mas
					if (e.getSource()==btnNewButton_1){
						
						if(Tune_Type==true){
							Tune=Tune+0.2;
							if(Tune==107.9){Tune=87.9;}
							textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
						}
						
						
						if(Tune_Type==false){
							Tune=Tune+10;
							if(Tune==1610){Tune=530;}
							textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
						}
						
						
					}
					
					//cambiar emisora: menos
					if (e.getSource()==btnNewButton){
						
						if(Tune_Type==true){
							Tune=Tune-0.2;
							if(Tune==87.9){Tune=107.9;}
							textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
						}
						
						
						if(Tune_Type==false){
							Tune=Tune-10;
							if(Tune<=530){Tune=1610;}
							textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
						}
						
						
					}
					
					//1
					if (e.getSource()==button_1){
						
						if(Save_Selected==false){
						Guardar_Emisora(0);
						}
						
						
						if(Save_Selected==true){
							
							
							Seleccionar_emisora_guardada(0);
							textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
						}
						
						
						
					}
					
					//2
					if (e.getSource()==button_2){
						Guardar_Emisora(1);
						
					}
					
					//3
					if (e.getSource()==button_3){
						Guardar_Emisora(2);
						
					}
					
					//4
					if (e.getSource()==button_4){
						Guardar_Emisora(3);
						
					}
					
					//5
					if (e.getSource()==button_5){
						Guardar_Emisora(4);
						
					}
					
					//6
					if (e.getSource()==button_6){
						Guardar_Emisora(5);
						
					}
					
					//7
					if (e.getSource()==button_7){
						Guardar_Emisora(6);
						
					}
					
					//8
					if (e.getSource()==button_8){
						Guardar_Emisora(7);
						
					}
					
					//9
					if (e.getSource()==button_9){
						Guardar_Emisora(8);
						
					}
					
					//10
					if (e.getSource()==button_10){
						Guardar_Emisora(9);
						
					}
					
					//11
					if (e.getSource()==button_11){
						Guardar_Emisora(10);
						
					}
					
					//12
					if (e.getSource()==button_12){
						Guardar_Emisora(11);
						
					}
					
					
					//Guardar Seleccionar
					if (e.getSource()==rdbtnGuardar){
						Guardar_seleccion();
						
						if(Save_Selected==true){rdbtnGuardar.setText("Seleccionar");}
						else{rdbtnGuardar.setText("Guardar");}
						
					}
					
					
					
					
						
						
					
					
					
					
				}
				
				
		}
	
	
}
