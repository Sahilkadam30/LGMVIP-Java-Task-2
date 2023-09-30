import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CurrencyConverter1 {

	private JFrame frame;
	private JTextField Textbox1;
	private JTextField Textbox2;
	private JTextField FromCurrency;
	private JTextField ToCurrency;
	private JTextField EnterAmmount;
	private JTextField Result;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyConverter1 window = new CurrencyConverter1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	double USA =83.08;
	double CHINA =12.00;
	double AUSTRALIA=53.70;
	double RUSSIA =0.87;
	double FRANCE =88.44;
	double BRAZIL =17.06;
	double BANGLADESH = 0.75;
	double JAPAN =0.56;
	double INDIA=1.00;

	public CurrencyConverter1() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 868, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblNewLabel.setBounds(274, 10, 307, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox Firstc = new JComboBox();
		Firstc.setModel(new DefaultComboBoxModel(new String[] {"Choose one", "INDIA", "USA", "CHINA", "AUSTRALIA", "RUSSIA", "FRANCE", "BRAZIL", "BANGLADESH", "JAPAN"}));
		Firstc.setBounds(38, 107, 240, 28);
		frame.getContentPane().add(Firstc);
		
		JComboBox Secondc = new JComboBox();
		Secondc.setModel(new DefaultComboBoxModel(new String[] {"Choose one", "INDIA", "USA", "CHINA", "AUSTRALIA", "RUSSIA", "FRANCE", "BRAZIL", "BANGLADESH", "JAPAN"}));
		Secondc.setBounds(575, 107, 240, 28);
		frame.getContentPane().add(Secondc);
		
		Textbox1 = new JTextField();
		Textbox1.setBounds(38, 216, 240, 28);
		frame.getContentPane().add(Textbox1);
		Textbox1.setColumns(10);
		
		Textbox2 = new JTextField();
		Textbox2.setColumns(10);
		Textbox2.setBounds(575, 216, 240, 28);
		frame.getContentPane().add(Textbox2);
		
		FromCurrency = new JTextField();
		FromCurrency.setFont(new Font("Tahoma", Font.BOLD, 12));
		FromCurrency.setText("From Currency");
		FromCurrency.setBounds(38, 78, 157, 19);
		frame.getContentPane().add(FromCurrency);
		FromCurrency.setColumns(10);
		
		ToCurrency = new JTextField();
		ToCurrency.setFont(new Font("Tahoma", Font.BOLD, 12));
		ToCurrency.setText("To Currency");
		ToCurrency.setColumns(10);
		ToCurrency.setBounds(575, 78, 157, 19);
		frame.getContentPane().add(ToCurrency);
		
		EnterAmmount = new JTextField();
		EnterAmmount.setFont(new Font("Tahoma", Font.BOLD, 12));
		EnterAmmount.setText("Enter Ammount");
		EnterAmmount.setBounds(38, 175, 157, 19);
		frame.getContentPane().add(EnterAmmount);
		EnterAmmount.setColumns(10);
		
		Result = new JTextField();
		Result.setFont(new Font("Tahoma", Font.BOLD, 13));
		Result.setText("Result");
		Result.setColumns(10);
		Result.setBounds(575, 175, 157, 19);
		frame.getContentPane().add(Result);
		
		JButton convertbutton = new JButton("CONVERT");
		convertbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double changeamount = Double.parseDouble(Textbox1.getText());
				double amountrupees = 0.0;
				
				
				switch(Firstc.getSelectedItem().toString())
				{
				case "USA": amountrupees = changeamount* USA;break;
				case "CHINA": amountrupees = changeamount* CHINA;break;
				case "AUSTRALIA": amountrupees = changeamount* AUSTRALIA;break;
				case "RUSSIA": amountrupees = changeamount* RUSSIA;break;
				case "FRANCE": amountrupees = changeamount* FRANCE;break;
				case "BRAZIL": amountrupees = changeamount* BRAZIL;break;
				case "BANGLADESH": amountrupees = changeamount* BANGLADESH;break;
				case "JAPAN": amountrupees = changeamount* JAPAN;break;
				case "INDIA": amountrupees = changeamount* INDIA;break;
			
				}
				
				double newamount=0.0;
				switch(Secondc.getSelectedItem().toString())
				{
				case "USA":  newamount = amountrupees/ USA;break;
				case "CHINA":  newamount = amountrupees/ CHINA;break;
				case "AUSTRALIA":  newamount = amountrupees/ AUSTRALIA;break;
				case "RUSSIA":  newamount = amountrupees/ RUSSIA;break;
				case "FRANCE":  newamount = amountrupees/ FRANCE;break;
				case "BRAZIL": newamount = amountrupees/BRAZIL;break;
				case "BANGLADESH":  newamount = amountrupees/ BANGLADESH;break;
				case "JAPAN":  newamount = amountrupees/ JAPAN;break;
				case "INDIA":  newamount = amountrupees/ INDIA;break;
			
				}
				String finalvalue = String.format("%.2f",newamount);
				Textbox2.setText(finalvalue);
			}
		});
		convertbutton.setFont(new Font("Tahoma", Font.BOLD, 16));
		convertbutton.setBounds(382, 215, 112, 28);
		frame.getContentPane().add(convertbutton);
		
		JButton resetbutton = new JButton("RESET");
		resetbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Textbox1.setText(null);
				Textbox2.setText(null);
			}
		});
		resetbutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		resetbutton.setBounds(108, 293, 85, 21);
		frame.getContentPane().add(resetbutton);
		
		JButton exitbutton = new JButton("EXIT");
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitbutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		exitbutton.setBounds(647, 295, 85, 21);
		frame.getContentPane().add(exitbutton);
	}
}
