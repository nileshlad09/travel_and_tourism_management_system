import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class createaccount extends JFrame {

	private JPanel contentPane;
	private JTextField Email_id;
	private JTextField mobile_no;
	private JPasswordField Password;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField last_name;
	private JTextField first_name;
	private JTextField user_name;
	private JLabel lblNewLabel_7;
	private JButton create_account;
	private JLabel lblNewLabel_9;
	private JTextField Gender;
	private JTextField State;
	private JTextField City;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createaccount frame = new createaccount();
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
	public createaccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(170, 150, 900, 500);
	    setResizable(false); 

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		create_account = new JButton("CREATE ACCOUNT");
		create_account.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String First_name = first_name.getText();
	                String Last_name = last_name.getText();
	                String Email_Id = Email_id.getText();
	                String username = user_name.getText();
	                String MobileNumber = mobile_no.getText();
	                int len = MobileNumber.length();
	                String password = Password.getText();
	                String gender=Gender.getText();
	                String state=State.getText();
	                String city=City.getText();
	                
	                try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e1) {
						
						e1.printStackTrace();
					}
					

	                String msg = "" + First_name;
	                msg += " \n";
	                
	                if(First_name.trim().isEmpty() && Last_name.trim().isEmpty() && Email_Id.trim().isEmpty()
	                	&& username.trim().isEmpty() && MobileNumber.trim().isEmpty() && password.trim().isEmpty()	)
	                {
	                	JOptionPane.showMessageDialog(create_account, "please Enter all detail");
	                	
	                }
	                else if (len != 10) {
	                    JOptionPane.showMessageDialog(create_account, "Enter a valid mobile number");
	                }

	                try {
	                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject", "root", "nilesh09@45");

	                    String query = "INSERT INTO createaccount values('" + First_name + "','" + Last_name + "','" + Email_Id + "','" +
                          MobileNumber + "','" + password + "','" +username + "','" +gender + "','" +state + "','" + city + "')";

	                    Statement sta = connection.createStatement();
 	                    int x = sta.executeUpdate(query);
                       if (x == 0) {
                        JOptionPane.showMessageDialog(create_account, "This is alredy exist");
                      } else {
	                        JOptionPane.showMessageDialog(create_account,
	                            "Welcome, " + msg + "Your account is sucessfully created");
	                        setVisible(false);
	                        loginpage j= new loginpage();
	                        j.setVisible(true);                                                             
	                    
	                    connection.close();
                    }  } catch (Exception exception) {
	                    exception.printStackTrace();
	                }
			}
		});
		
		City = new JTextField();
		City.setBounds(165, 345, 199, 26);
		contentPane.add(City);
		City.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("City:-");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setBounds(81, 349, 61, 14);
		contentPane.add(lblNewLabel_11);
		
		State = new JTextField();
		State.setBounds(650, 299, 199, 22);
		contentPane.add(State);
		State.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("State:-");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(552, 300, 68, 14);
		contentPane.add(lblNewLabel_10);
		
		Gender = new JTextField();
		Gender.setBounds(165, 298, 199, 23);
		contentPane.add(Gender);
		Gender.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Gender:-");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(81, 300, 61, 14);
		contentPane.add(lblNewLabel_9);
		create_account.setBackground(Color.CYAN);
		create_account.setFont(new Font("Tahoma", Font.BOLD, 13));
		create_account.setBounds(429, 411, 156, 39);
		contentPane.add(create_account);
		
		JLabel lblNewLabel_8 = new JLabel("Already have account ?");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setBounds(624, 394, 130, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				loginpage j=new loginpage();
				j.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(636, 419, 89, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel_7 = new JLabel("Set Username:-");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(38, 247, 117, 14);
		contentPane.add(lblNewLabel_7);
		
		user_name = new JTextField();
		user_name.setBounds(165, 242, 199, 25);
		contentPane.add(user_name);
		user_name.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Last Name:-");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(530, 125, 90, 18);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("First name:-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(65, 127, 90, 14);
		contentPane.add(lblNewLabel_5);
		
		first_name = new JTextField();
		first_name.setBounds(165, 126, 199, 26);
		contentPane.add(first_name);
		first_name.setColumns(10);
		
		last_name = new JTextField();
		last_name.setBounds(650, 123, 200, 27);
		contentPane.add(last_name);
		last_name.setColumns(10);
		
		Email_id = new JTextField();
		Email_id.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Email_id.setBounds(165, 180, 199, 26);
		contentPane.add(Email_id);
		Email_id.setColumns(10);
		
		mobile_no = new JTextField();
		mobile_no.setFont(new Font("Tahoma", Font.PLAIN, 13));
		mobile_no.setBounds(651, 180, 199, 26);
		contentPane.add(mobile_no);
		mobile_no.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Email ID:-");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(81, 183, 74, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mobile Number:-");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(504, 183, 116, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password:-");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(530, 242, 90, 25);
		contentPane.add(lblNewLabel_2);
		
		Password = new JPasswordField();
		Password.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Password.setBounds(651, 243, 199, 26);
		contentPane.add(Password);
		Password.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Create New Account");
		lblNewLabel_3.setForeground(Color.ORANGE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(347, 53, 273, 44);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\kalyan office\\eclipse-workspace\\java project\\bin\\loginpage.jpg"));
		lblNewLabel_4.setBounds(-22, -126, 974, 643);
		contentPane.add(lblNewLabel_4);
	}
}
