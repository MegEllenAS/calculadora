package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
	
	private JButton btnsoma;
	private JButton btnsub;
	private JButton bntmulti;
	private JButton btndiv;
	private JButton btnNewButton_5;
	private JButton btn9;
	private JButton btn8;
	private JButton btn7;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btn3;
	private JButton btn2;
	private JButton btn1;
	private JButton btnigual;
	private JButton btnponto;
	private JButton btn0;
	 double numero1;
	 double numero2;
	 double resultado;
	 String operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(Color.PINK);
		frmCalculadora.setTitle("calculadora");
		frmCalculadora.setBounds(100, 100, 338, 325);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setBackground(Color.CYAN);
		txtField.setForeground(Color.MAGENTA);
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Georgia", Font.BOLD, 12));
		txtField.setBounds(6, 27, 305, 29);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		btnsoma = new JButton("+");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
			}
		});
		btnsoma.setForeground(Color.MAGENTA);
		btnsoma.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btnsoma.setBounds(200, 132, 56, 29);
		frmCalculadora.getContentPane().add(btnsoma);
		
		btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
			}
		});
		btnsub.setForeground(Color.MAGENTA);
		btnsub.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btnsub.setBounds(200, 163, 56, 29);
		frmCalculadora.getContentPane().add(btnsub);
		
		bntmulti = new JButton("x");
		bntmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "x";
			}
		});
		bntmulti.setForeground(Color.MAGENTA);
		bntmulti.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		bntmulti.setBounds(200, 196, 56, 29);
		frmCalculadora.getContentPane().add(bntmulti);
		
		btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "/";
			}
		});
		btndiv.setForeground(Color.MAGENTA);
		btndiv.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btndiv.setBounds(200, 232, 56, 29);
		frmCalculadora.getContentPane().add(btndiv);
		
		btnNewButton_5 = new JButton("C");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnNewButton_5.setForeground(Color.MAGENTA);
		btnNewButton_5.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btnNewButton_5.setBounds(200, 98, 56, 29);
		frmCalculadora.getContentPane().add(btnNewButton_5);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btn9.setBounds(134, 132, 56, 29);
		frmCalculadora.getContentPane().add(btn9);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btn8.setBounds(72, 132, 56, 29);
		frmCalculadora.getContentPane().add(btn8);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btn7.setBounds(6, 132, 56, 29);
		frmCalculadora.getContentPane().add(btn7);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btn6.setBounds(134, 165, 56, 29);
		frmCalculadora.getContentPane().add(btn6);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn5.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btn5.setBounds(72, 165, 56, 29);
		frmCalculadora.getContentPane().add(btn5);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn4.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btn4.setBounds(6, 165, 56, 29);
		frmCalculadora.getContentPane().add(btn4);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn3.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btn3.setBounds(134, 198, 56, 29);
		frmCalculadora.getContentPane().add(btn3);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn2.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btn2.setBounds(72, 198, 56, 29);
		frmCalculadora.getContentPane().add(btn2);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn1.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btn1.setBounds(6, 198, 56, 29);
		frmCalculadora.getContentPane().add(btn1);
		
		btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionar;
				numero2 = Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
					resultado = numero1+numero2;
					selecionar = String.format("%.of",resultado);
					txtField.setText(selecionar);			
					}else if(operacao.equals("-")) {
						resultado = numero1-numero2;
						selecionar = String.format("%.of",resultado);
						txtField.setText(selecionar);
					}else if(operacao.equals("x")) {
						resultado = numero1*numero2;
						selecionar = String.format("%.of",resultado);
						txtField.setText(selecionar);	
					}else if(operacao.equals("/")) {
						resultado = numero1/numero2;
						selecionar = String.format("%.of",resultado);
						txtField.setText(selecionar);	
					}
			}
		});
		btnigual.setForeground(Color.MAGENTA);
		btnigual.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btnigual.setBounds(134, 234, 56, 29);
		frmCalculadora.getContentPane().add(btnigual);
		
		btnponto = new JButton(".");
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {String IngressarNumero = txtField.getText()+btnponto.getText();
			txtField.setText(IngressarNumero);
			}
		});
		btnponto.setForeground(Color.MAGENTA);
		btnponto.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btnponto.setBounds(72, 234, 56, 29);
		frmCalculadora.getContentPane().add(btnponto);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn0.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn0.setForeground(Color.BLACK);
		btn0.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		btn0.setBounds(6, 234, 56, 29);
		frmCalculadora.getContentPane().add(btn0);
	}
}
