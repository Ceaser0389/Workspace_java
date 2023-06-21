package application;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculadora  extends JFrame implements ActionListener{

	
	JTextField visor;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bMais,bMenos,bMult,bDividir,bc,bIgual;
	String primeiro= "", segundo= "";
	int cont =1;
	String sinal= "";
	
	
	public Calculadora() {
		super("Calculadora");
		this.setSize(253,350);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		visor = new JTextField();
		visor.setBounds(3,10,230,30);
		visor.setEnabled(false);
		visor.setDisabledTextColor(Color.black);
		this.add(visor);
		
		this.setVisible(true);
		
		
		b1 = new JButton("1");
		b1.setBounds(3, 60, 50, 50);
		b1.addActionListener(this);
		this.add(b1);
		
		b2 = new JButton("2");
		b2.setBounds(63, 60, 50, 50);
		b2.addActionListener(this);
		this.add(b2);
		
		b3 = new JButton("3");
		b3.setBounds(123, 60, 50, 50);
		b3.addActionListener(this);
		this.add(b3);

		
		bDividir = new JButton("/");
		bDividir.setBounds(183, 60, 50, 50);
		bDividir.addActionListener(this);
		this.add(bDividir);

		// segunda linha
		
		b4 = new JButton("4");
		b4.setBounds(3, 120, 50, 50);
		b4.addActionListener(this);
		this.add(b4);
		
		b5 = new JButton("5");
		b5.setBounds(63, 120, 50, 50);
		b5.addActionListener(this);
		this.add(b5);
		
		b6 = new JButton("6");
		b6.setBounds(123, 120, 50, 50);
		b6.addActionListener(this);
		this.add(b6);
		
		bMult = new JButton("X");
		bMult.setBounds(183, 120, 50, 50);
		bMult.addActionListener(this);
		this.add(bMult);
		
		// terceira linha 
		
		b7 = new JButton("7");
		b7.setBounds(3, 180, 50, 50);
		b7.addActionListener(this);
		this.add(b7);
		
		b8 = new JButton("8");
		b8.setBounds(63, 180, 50, 50);
		b8.addActionListener(this);
		this.add(b8);
		
		b9 = new JButton("9");
		b9.setBounds(123, 180, 50, 50);
		b9.addActionListener(this);
		this.add(b9);
		
		
		bMenos = new JButton("-");
		bMenos.setBounds(183, 180, 50, 50);
		bMenos.addActionListener(this);
		this.add(bMenos);
		
		// Quarta linha 
		
		b0 = new JButton("0");
		b0.setBounds(3, 240, 50, 50);
		b0.addActionListener(this);
		this.add(b0);
		
		bc = new JButton("C");
		bc.setBounds(63, 240, 50, 50);
		bc.addActionListener(this);
		this.add(bc);
		
		bIgual = new JButton("=");
		bIgual.setBounds(123, 240, 50, 50);
		bIgual.addActionListener(this);
		this.add(bIgual);
		
		bMais = new JButton("+");
		bMais.setBounds(183, 240, 50, 50);
		bMais.addActionListener(this);
		this.add(bMais);
		
		
	}
	
	public static void main(String[] args) {
		new Calculadora();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		if(e.getSource() == b1) {
			String n = "1";
			if(cont == 1) {
				primeiro  += n;
				visor.setText(primeiro);
			}else if(cont == 2) {
				segundo = segundo +n;
				visor.setText(segundo);
			}
			
		 }else if(e.getSource() == b2) {
			    
			 String n = "2";
				if(cont == 1) {
					primeiro  += n;
					visor.setText(primeiro);
				}else if(cont == 2) {
					segundo = segundo +n;
					visor.setText(segundo);
				}
		 }
		 else if(e.getSource() == b3) {
			   
			 String n = "3";
				if(cont == 1) {
					primeiro  += n;
					visor.setText(primeiro);
				}else if(cont == 2) {
					segundo = segundo +n;
					visor.setText(segundo);
				}
		 }
		 else if(e.getSource() == b4) {
			 
			 String n = "4";
				if(cont == 1) {
					primeiro  += n;
					visor.setText(primeiro);
				}else if(cont == 2) {
					segundo = segundo +n;
					visor.setText(segundo);
				}
		 }
		 else if(e.getSource() == b5) {
			 String n = "5";
				if(cont == 1) {
					primeiro  += n;
					visor.setText(primeiro);
				}else if(cont == 2) {
					segundo = segundo +n;
					visor.setText(segundo);
				}
		 }
		 else if(e.getSource() == b6) {
			 String n = "6";
				if(cont == 1) {
					primeiro  += n;
					visor.setText(primeiro);
				}else if(cont == 2) {
					segundo = segundo +n;
					visor.setText(segundo);
				}
		 }
		 else if(e.getSource() == b7) {
			 String n = "7";
				if(cont == 1) {
					primeiro  += n;
					visor.setText(primeiro);
				}else if(cont == 2) {
					segundo = segundo +n;
					visor.setText(segundo);
				}
		 }
		 else if(e.getSource() == b8) {
			 String n = "8";
				if(cont == 1) {
					primeiro  += n;
					visor.setText(primeiro);
				}else if(cont == 2) {
					segundo = segundo +n;
					visor.setText(segundo);
				}
		 }
		 else if(e.getSource() == b9) {
			 String n = "9";
				if(cont == 1) {
					primeiro  += n;
					visor.setText(primeiro);
				}else if(cont == 2) {
					segundo = segundo +n;
					visor.setText(segundo);
				}
		 }
		 else if(e.getSource() == b0) {
			 String n = "0";
				if(cont == 1) {
					primeiro  += n;
					visor.setText(primeiro);
				}else if(cont == 2) {
					segundo = segundo +n;
					visor.setText(segundo);
				}
		 }
		 else if(e.getSource() == bMais) {
			 sinal = "mais";
			 cont = 2;
			 visor.setText("");
		 }
		 else if(e.getSource() == bMenos) {
			 sinal = "menos";
			 cont = 2;
			 visor.setText("");
		 }
		 else if(e.getSource() == bMult) {
			 sinal = "mult";
			 cont = 2;
			 visor.setText("");
		 }
		 else if(e.getSource() == bDividir) {
			 sinal = "dividir";
			 cont = 2;
			 visor.setText("");
		 }
		 else if(e.getSource() == bc) {
			 visor.setText("");
			 cont = 1;
			 
		 }
		 else if(e.getSource() == bIgual) {
			 
			 if (sinal == "mais") {
				 
				 int num1 = Integer.parseInt(primeiro);
				 int num2 = Integer.parseInt(segundo);
				 int result = num1 + num2;
				 
				 visor.setText(""+result); // cast int p string
				 primeiro = "";
				 segundo = "";
				 
			 } else if ( sinal == "menos"){
				 
				 int num1 = Integer.parseInt(primeiro);
				 int num2 = Integer.parseInt(segundo);
				 int result = num1 - num2;
				 
				 visor.setText(""+result);
				 primeiro = "";
				 segundo = "";
				 
				 
			 }else if ( sinal == "mult"){
				 
				 int num1 = Integer.parseInt(primeiro);
				 int num2 = Integer.parseInt(segundo);
				 int result = num1 * num2;
				 
				 visor.setText(""+result);
				 primeiro = "";
				 segundo = "";
				 
			 }else if ( sinal == "dividir"){
				 
				 int num1 = Integer.parseInt(primeiro);
				 int num2 = Integer.parseInt(segundo);
				 int result = num1 / num2;
				 
				 visor.setText(""+result);
				 primeiro = "";
				 segundo = "";
			 }
			 
		 }
		
			
			
			
			
	}
	
	
	
	
	
	
}
