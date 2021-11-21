import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Choice;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookHotel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String Username = null;
					BookHotel frame = new BookHotel(Username);
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
	public BookHotel(String Username) {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 130, 828, 500);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 245, 230));
		panel.setBorder(new MatteBorder(2, 2, 2, 0, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 389, 463);
		contentPane.add(panel);
		panel.setLayout(null);
		
		

		
		JLabel lblNewLabel_5 = new JLabel("Mobile Number:-");
		lblNewLabel_5.setBounds(26, 266, 147, 22);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Cambria", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel("Username:-");
		lblNewLabel_2.setBounds(26, 75, 123, 23);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Cambria", Font.PLAIN, 16));
		
		
		JLabel lblNewLabel = new JLabel("BOOK HOTEL");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(184, 10, 170, 47);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 24));
		
		JLabel lblNewLabel_3 = new JLabel("Select Hotel:-");
		lblNewLabel_3.setBounds(25, 108, 123, 29);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Cambria", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4 = new JLabel("Total Persons:-");
		lblNewLabel_4.setBounds(25, 148, 121, 29);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Cambria", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4_1 = new JLabel("AC/Non AC:-");
		lblNewLabel_4_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		lblNewLabel_4_1.setBounds(25, 185, 121, 29);
		panel.add(lblNewLabel_4_1);
		
		
		JLabel lblNewLabel_6 = new JLabel("Total Price:-");
		lblNewLabel_6.setBounds(26, 299, 123, 22);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Cambria", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Food Included:-");
		lblNewLabel_4_1_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		lblNewLabel_4_1_1.setBounds(25, 226, 121, 29);
		panel.add(lblNewLabel_4_1_1);

		
		JLabel User_name = new JLabel("Username");
		User_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		User_name.setBounds(184, 75, 176, 21);
		panel.add(User_name);
		
		JLabel MobileNumber = new JLabel("Mobilenumber");
		MobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MobileNumber.setBounds(179, 267, 175, 21);
		panel.add(MobileNumber);
		
		textField = new JTextField();
		textField.setBounds(184, 151, 199, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 0, 2, 2, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(253, 245, 230));
		panel_1.setBounds(388, 0, 426, 463);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kalyan office\\eclipse-workspace\\java project\\bin\\hotel.jpg"));
		lblNewLabel_1.setBounds(33, 42, 350, 363);
		panel_1.add(lblNewLabel_1);
	
		JComboBox SelectHotel = new JComboBox();
		SelectHotel.setModel(new DefaultComboBoxModel(new String[] {"Mardan Palace,Turkey","Burj Al Arab,Dubai","Atlantis Paradise,Bahamas"}));
		SelectHotel.setBackground(Color.WHITE);
		SelectHotel.setBounds(184, 113, 195, 22);
		panel.add(SelectHotel);

		
		JComboBox acnonac = new JComboBox();
		acnonac.setModel(new DefaultComboBoxModel(new String[] {"AC","Non-AC"}));
		acnonac.setBackground(Color.WHITE);
		acnonac.setBounds(184, 190, 197, 22);
		panel.add(acnonac);
		
		JComboBox Food = new JComboBox();
		Food.setModel(new DefaultComboBoxModel(new String[] {"Yes","No"}));
		Food.setBackground(Color.WHITE);
		Food.setBounds(184, 231, 196, 22);
		panel.add(Food);
		
		JLabel TotalPrice = new JLabel("");
		TotalPrice.setBounds(184, 301, 126, 20);
		panel.add(TotalPrice);
		TotalPrice.setForeground(Color.RED);
		TotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton Checkprice_btn = new JButton("Check Price");
		Checkprice_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p =(String) SelectHotel.getSelectedItem();
				String q =(String) acnonac.getSelectedItem();
				String r =(String) Food.getSelectedItem();
				int cost =0;
				if(p.equals("Mardan Palace,Turkey")&& q.equals("AC")&& r.equals("Yes")) {
				  cost+=50000;
			    }
				else if(p.equals("Mardan Palace,Turkey")&& q.equals("Non-AC")&& r.equals("Yes")) {
					  cost+=45000;
				}
				else if(p.equals("Mardan Palace,Turkey")&& q.equals("AC")&& r.equals("No")) {
					  cost+=42000;
				}
				else if(p.equals("Mardan Palace,Turkey")&& q.equals("Non-AC")&& r.equals("No")) {
					  cost+=30000;
				}
				else if(p.equals("Burj Al Arab,Dubai")&& q.equals("AC")&& r.equals("Yes")) {
					  cost+=45000;
				}
				else if(p.equals("Burj Al Arab,Dubai")&& q.equals("Non-AC")&& r.equals("Yes")) {
						  cost+=40000;
				}
				else if(p.equals("Burj Al Arab,Dubai")&& q.equals("AC")&& r.equals("No")) {
						  cost+=36000;
				}
				else if(p.equals("Burj Al Arab,Dubai")&& q.equals("Non-AC")&& r.equals("No")) {
						  cost+=25000;
				}
				else if(p.equals("Atlantis Paradise,Bahamas")&& q.equals("AC")&& r.equals("Yes")) {
						  cost+=40000;
			    }
				else if(p.equals("Atlantis Paradise,Bahamas")&& q.equals("Non-AC")&& r.equals("Yes")) {
							  cost+=36000;
				}
				else if(p.equals("Atlantis Paradise,Bahamas")&& q.equals("AC")&& r.equals("No")) {
							  cost+=30000;
				}
				else if(p.equals("Atlantis Paradise,Bahamas")&& q.equals("Non-AC")&& r.equals("No")) {
							  cost+=20000;
				}	
			int persons=Integer.parseInt(textField.getText());
			cost*=persons;
			TotalPrice.setText("Rs "+cost);
				
			}
		});
		Checkprice_btn.setBounds(50, 353, 123, 29);
		panel.add(Checkprice_btn);
		Checkprice_btn.setHorizontalAlignment(SwingConstants.LEADING);
		Checkprice_btn.setFont(new Font("Cambria", Font.BOLD, 14));
		Checkprice_btn.setForeground(Color.WHITE);
		Checkprice_btn.setBackground(Color.BLACK);		
		
		
		JButton Book_btn = new JButton("Book");
		Book_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			}  
			 String person=textField.getText();
            if( person.trim().isEmpty())
            {
            	JOptionPane.showMessageDialog(null, "please Enter Total Persons");
            	
            }
            else {

            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject", "root", "nilesh09@45");
                String mobileNumber=MobileNumber.getText();
                String Hotel= (String) SelectHotel.getSelectedItem();
                String price=TotalPrice.getText();
                String Ac=(String)acnonac.getSelectedItem();
                String food=(String)Food.getSelectedItem();
              
                String query = "INSERT INTO bookhotel values('" + User_name.getText()+ "','" + SelectHotel.getSelectedItem()+ "','" + 
                textField.getText() + "','" +  acnonac.getSelectedItem() + "','" + Food.getSelectedItem() +"','"+ 
                		MobileNumber.getText()+ "','" + TotalPrice.getText() + "')";
                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                setVisible(false);
                HotelBookDetail j=new HotelBookDetail(Username,mobileNumber,Hotel,price,Ac,food,person);
                j.setVisible(true);
                Statement sta = connection.createStatement();
                 int x = sta.executeUpdate(query);
               } catch (Exception exception) {
                exception.printStackTrace();
            }
			}
			}
		});

		Book_btn.setBounds(209, 353, 111, 29);
		panel.add(Book_btn);
		Book_btn.setBackground(Color.BLACK);
		Book_btn.setFont(new Font("Cambria", Font.BOLD, 14));
		Book_btn.setForeground(Color.WHITE);				
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(139, 411, 89, 27);
		panel.add(btnNewButton);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 14));
		btnNewButton.setForeground(Color.WHITE);
		

		try {	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject","root","nilesh09@45");
			Statement stmt=con.createStatement();
			String sql="Select * from createaccount where username= '"+Username+"'";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				User_name.setText(rs.getString("username"));
				MobileNumber.setText(rs.getString("MobileNumber"));
		}
			} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}

