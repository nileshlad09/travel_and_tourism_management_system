import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Update_detail extends JFrame {

	private JPanel contentPane;
	private JLabel user_name;
	private JTextField mobile_no;
	private JTextField Gender;
	private JTextField State;
	private JTextField City;
	private JTextField Email_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Create the frame.
	 */
	public Update_detail(String Username) {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 130, 750, 500);
		 setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kalyan office\\eclipse-workspace\\java project\\bin\\UpdatedProfile.png"));
		lblNewLabel.setBounds(446, 56, 212, 333);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UPDATE CUSTOMER DETAILS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(264, 34, 263, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username:-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(44, 113, 105, 22);
		contentPane.add(lblNewLabel_2);
		
		
	JLabel lblNewLabel_3 = new JLabel("Mobile Number:-");
	lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(44, 155, 105, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender:-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(44, 192, 105, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("State:-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(44, 229, 105, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("City:-");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(44, 264, 105, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Email:-");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(44, 299, 105, 14);
		contentPane.add(lblNewLabel_7);
		
		JButton Update_btn = new JButton("UPDATE");
		Update_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	                String Email_Id = Email_id.getText();
	                String username = user_name.getText();
	                String MobileNumber = mobile_no.getText();
	                int len = MobileNumber.length();
	                String gender=Gender.getText();
	                String state=State.getText();
	                String city=City.getText();
	                
	                try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e1) {
						
						e1.printStackTrace();
					}
					 if (len != 10) {
	                    JOptionPane.showMessageDialog(null, "Enter a valid mobile number");
	                }
				

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject", "root", "nilesh09@45");
                    String sql="Select * from createaccount where username= '"+Username+"'";
                    String query = "UPDATE createaccount set Email_ID='"+Email_Id+"', MobileNumber='"+MobileNumber+"',gender='" +gender + "',state='"+state + "',city='" + city + "'";

                    Statement sta = connection.createStatement();
	                    int x = sta.executeUpdate(query);
                   if (x == 0) {
                    JOptionPane.showMessageDialog(null, "This is alredy exist");
                  } else {
                        JOptionPane.showMessageDialog(null,
                             "Your detail is sucessfully Updated");                                                          
                    connection.close();
                }  } catch (Exception exception) {
                    exception.printStackTrace();
                }
					}		
           
		});
		Update_btn.setForeground(Color.WHITE);
		Update_btn.setBackground(Color.BLACK);
		Update_btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Update_btn.setBounds(73, 381, 89, 23);
		contentPane.add(Update_btn);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(232, 381, 89, 23);
		contentPane.add(btnNewButton_1);
		
		user_name = new JLabel();
		user_name.setBounds(202, 115, 178, 20);
		user_name.setText(Username);
		contentPane.add(user_name);
		
		mobile_no = new JTextField();
		mobile_no.setBounds(202, 153, 178, 20);
		contentPane.add(mobile_no);
		mobile_no.setColumns(10);
		
		Gender = new JTextField();
		Gender.setBounds(202, 190, 178, 20);
		contentPane.add(Gender);
		Gender.setColumns(10);
		
		State = new JTextField();
		State.setBounds(202, 227, 178, 20);
		contentPane.add(State);
		State.setColumns(10);
		
		City = new JTextField();
		City.setBounds(202, 262, 178, 20);
		contentPane.add(City);
		City.setColumns(10);
		
		Email_id = new JTextField();
		Email_id.setBounds(202, 297, 178, 20);
		contentPane.add(Email_id);
		Email_id.setColumns(10);
	
	
	
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject","root","nilesh09@45");
			Statement stmt=con.createStatement();
			String sql="Select * from createaccount where username= '"+Username+"'";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {

				user_name.setText(rs.getString("username"));
				Email_id.setText(rs.getString("Email_ID"));
				mobile_no.setText(rs.getString("MobileNumber"));
				Gender.setText(rs.getString("gender"));
				State.setText(rs.getString("state"));
				City.setText(rs.getString("city"));
				
		}
			} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
