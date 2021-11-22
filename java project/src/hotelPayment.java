import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Choice;
import javax.swing.JButton;

public class hotelPayment extends JFrame {

	private JPanel contentPane;
	private JTextField ExpireDate;
	private JTextField CardNumber;
	private JTextField CardName;
	private JTextField CVC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
//				try {
//					
//					String Username=null;
//					String price=null;
//					String hotel=null;
//					hotelPayment frame = new hotelPayment(Username,price,hotel);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param  
	 * @param hotel 
	 * @param days2 
	 * @param food2 
	 */
	public hotelPayment(String Username, String price, String hotel,String Ac,String food,  String person,String Days) {
		setBounds(300, 130, 850, 500);
		 setResizable(false); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("CARD NUMBER:-");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(66, 134, 159, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CARD HOLDER NAME:-");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(66, 209, 238, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("EXPIRATION DATE:-");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(66, 291, 238, 31);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("CVC:-");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(499, 134, 116, 31);
		contentPane.add(lblNewLabel_1_2);
		
		ExpireDate = new JTextField();
		ExpireDate.setBounds(66, 316, 246, 31);
		contentPane.add(ExpireDate);
		ExpireDate.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Amount:-");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(499, 196, 82, 26);
		contentPane.add(lblNewLabel);
		
		JLabel Amount = new JLabel("New label");
		Amount.setForeground(Color.RED);
		Amount.setFont(new Font("Tahoma", Font.ITALIC, 15));
		Amount.setBounds(621, 198, 98, 22);
		contentPane.add(Amount);
		
		CardNumber = new JTextField();
		CardNumber.setBounds(66, 158, 241, 31);
		contentPane.add(CardNumber);
		CardNumber.setColumns(10);
		
		CardName = new JTextField();
		CardName.setBounds(66, 237, 238, 31);
		contentPane.add(CardName);
		CardName.setColumns(10);
		
		CVC = new JTextField();
		CVC.setBounds(499, 158, 136, 27);
		contentPane.add(CVC);
		CVC.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Username:-");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(500, 237, 105, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel Username_1 = new JLabel("New label");
		Username_1.setForeground(Color.BLACK);
		Username_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		Username_1.setBounds(627, 239, 123, 22);
		contentPane.add(Username_1);
		
		
		JLabel lblNewLabel_3 = new JLabel("Hotel Name:-");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(499, 283, 116, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel Hotel_name = new JLabel("New label");
		Hotel_name.setForeground(Color.BLACK);
		Hotel_name.setFont(new Font("Tahoma", Font.BOLD, 15));
		Hotel_name.setBounds(626, 285, 185, 26);
		contentPane.add(Hotel_name);
		

		JButton Pay_btn = new JButton("PAY");
		Pay_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e1) {
						
						e1.printStackTrace();
					}  
                int len = CVC.getText().length();
                int len2=CardNumber.getText().length();
                if(CardNumber.getText().trim().isEmpty() && CVC.getText().trim().isEmpty() && CardName.getText().trim().isEmpty()&&  ExpireDate.getText().trim().isEmpty()	)
                {
                	JOptionPane.showMessageDialog(null, "please Enter all detail");
                	
                }
                else if(len!=3)
                {
                	JOptionPane.showMessageDialog(null, "please Enter valid CVC");
                }
                else if(CardNumber.getText().matches("[0-9]{4}[ ]{1}[0-9]{4}[ ]{1}[0-9]{4}[ ]{1}[0-9]{4}")==false)
                {
                	JOptionPane.showMessageDialog(null, "please Enter valid card Number");
                }
                else if(ExpireDate.getText().matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}")==false)
                {
                	JOptionPane.showMessageDialog(null, "please Enter Date in given formate");
                }
                else {
	                try {
	                	DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd/MM/yyyy");
	                	LocalDateTime now =LocalDateTime.now();
//	                	Date date=new Date(eventMask);
//	                	java.sql.Date sqldate=new java.sql.Date(date.getTime());
	                	
	                	
	                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject", "root", "nilesh09@45");

	                    String query = "INSERT INTO payment_detail values('" +dtf.format(now)+ "','" + 
	                    Username_1.getText()+ "','" + CardNumber.getText() + "','" +
	                    CVC.getText() + "','" +ExpireDate.getText()+ "','" + 
	                    CardName.getText() + "','" + Hotel_name.getText() + "','" +
	                    Ac+ "','" +food + "','" + person + "','" + Days + "','" + Amount.getText() + "')";
	                    JOptionPane.showMessageDialog(null, "Payment Successfull..\n Thank you for visiting :).. ");
	                    setVisible(false);
	                    Statement sta = connection.createStatement();
 	                    int x = sta.executeUpdate(query);
                       } catch (Exception exception) {
	                    exception.printStackTrace();
	                }
                }
			}
		});
		Pay_btn.setBackground(Color.BLACK);
		Pay_btn.setForeground(Color.WHITE);
		Pay_btn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Pay_btn.setBounds(323, 398, 136, 31);
		contentPane.add(Pay_btn);
		
		
		

		Username_1.setText(Username);
		Amount.setText(price);
		Hotel_name.setText(hotel);
		
		
		
		
		
		JLabel lblNewLabel_4 = new JLabel("xxxx xxxx xxxx xxxx");
		lblNewLabel_4.setForeground(Color.GRAY);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(197, 144, 107, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("xxx");
		lblNewLabel_5.setForeground(Color.GRAY);
		lblNewLabel_5.setBounds(547, 144, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("DD-MM-YYYY");
		lblNewLabel_6.setForeground(Color.GRAY);
		lblNewLabel_6.setBounds(222, 301, 82, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Payment");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_7.setBounds(320, 34, 123, 57);
		contentPane.add(lblNewLabel_7);
	}
}
