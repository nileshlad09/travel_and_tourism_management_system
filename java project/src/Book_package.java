import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Book_package extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String Username=null;
					Book_package frame = new Book_package(Username);
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
	public Book_package(String Username) {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 130, 850, 500);
		 setResizable(false); 
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOK PACKAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(100, 34, 213, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kalyan office\\eclipse-workspace\\java project\\bin\\Book package.jpg"));
		lblNewLabel_1.setBounds(369, 63, 436, 370);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User_name:-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(26, 140, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox_selectpackage = new JComboBox();
		comboBox_selectpackage.setBackground(Color.WHITE);
		comboBox_selectpackage.setModel(new DefaultComboBoxModel(new String[] {"Gold Package","Silver Package","Bronze Package"}));
		comboBox_selectpackage.setForeground(Color.BLACK);
		comboBox_selectpackage.setBounds(190, 187, 123, 22);
		contentPane.add(comboBox_selectpackage);
	
		JLabel lblNewLabel_3 = new JLabel("Select Package:-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(26, 187, 123, 18);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Total Persons:-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(26, 241, 105, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(192, 238, 121, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Mobile Number:-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(26, 293, 123, 22);
		contentPane.add(lblNewLabel_5);
		
		
		JLabel TotalPrice = new JLabel("");
		TotalPrice.setForeground(Color.RED);
		TotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TotalPrice.setBounds(187, 342, 126, 20);
		contentPane.add(TotalPrice);
		
		JLabel lblNewLabel_6 = new JLabel("Total Price:-");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(26, 342, 123, 22);
		contentPane.add(lblNewLabel_6);
		
		JLabel Username_1 = new JLabel("");
		Username_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Username_1.setBounds(190, 138, 123, 22);
		contentPane.add(Username_1);
		
		JLabel Mobilenumber = new JLabel("");
		Mobilenumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Mobilenumber.setBounds(197, 293, 116, 20);
		contentPane.add(Mobilenumber);
		
		JButton Checkprice_btn = new JButton("Check Price");
		Checkprice_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p =(String) comboBox_selectpackage.getSelectedItem();
				int cost =0;
				if(p.equals("Gold Package")) {
				  cost+=12000;
			}else if(p.equals("Silver Package")) {
				cost+=25000;
			}
			else if(p.equals("Bronze Package")) {
				cost+=32000;
			}
			
			int persons=Integer.parseInt(textField.getText());
			cost*=persons;
			TotalPrice.setText("Rs "+cost);
				
			}
		});
		Checkprice_btn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Checkprice_btn.setForeground(Color.WHITE);
		Checkprice_btn.setBackground(new Color(0, 0, 0));
		Checkprice_btn.setBounds(26, 397, 105, 23);
		contentPane.add(Checkprice_btn);
		
		JButton Book_btn = new JButton("Book");
		Book_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e1) {
						
						e1.printStackTrace();
					}
                String Package=(String) comboBox_selectpackage.getSelectedItem();
                String person=textField.getText();
                if(person.trim().isEmpty())
                {
                	JOptionPane.showMessageDialog(null, "please Select all option");
                	
                } 
                else {
                
	                try {
	                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject", "root", "nilesh09@45");
                        String Totalprice=TotalPrice.getText();
                        String MobileNo=Mobilenumber.getText();       
	                    String query = "INSERT INTO bookpackage values('" + Username_1.getText()+ "','" + comboBox_selectpackage.getSelectedItem() + "','" + textField.getText() + "','" +
	                    		Mobilenumber.getText()+ "','" + TotalPrice.getText() + "')";
	                    JOptionPane.showMessageDialog(null, "Package Book Successfully");
	                    setVisible(false);
	                    View_package j=new View_package(Username,Totalprice,MobileNo,Package,person);
	                    j.setVisible(true);
	                    
	                    Statement sta = connection.createStatement();
 	                    int x = sta.executeUpdate(query);
                       } catch (Exception exception) {
	                    exception.printStackTrace();
	                }
                }
			}
		});
		Book_btn.setBackground(Color.BLACK);
		Book_btn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Book_btn.setForeground(Color.WHITE);
		Book_btn.setBounds(141, 398, 105, 23);
		contentPane.add(Book_btn);
		
		JButton Back_btn = new JButton("Back");
		Back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		Back_btn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Back_btn.setForeground(Color.WHITE);
		Back_btn.setBackground(Color.BLACK);
		Back_btn.setBounds(256, 398, 105, 23);
		contentPane.add(Back_btn);
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject","root","nilesh09@45");
			Statement stmt=con.createStatement();
			String sql="Select * from createaccount where username= '"+Username+"'";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {

				Username_1.setText(rs.getString("username"));
				Mobilenumber.setText(rs.getString("MobileNumber"));
				
				
		}
			} catch (Exception e1) {
			e1.printStackTrace();
		}
	
	}

	private void toString(JLabel totalPrice) {
		// TODO Auto-generated method stub
		
	}
}
