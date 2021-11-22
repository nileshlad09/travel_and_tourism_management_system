import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import net.proteanit.sql.DbUtils;
import java.awt.Font;
import javax.swing.JLabel;

public class paymentHistory extends JFrame {

	private JPanel contentPane;
	
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String Username=null;
					paymentHistory frame = new paymentHistory(Username);
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
	public paymentHistory(String Username) {
		
		setBounds(300, 130, 850, 500);
		 setResizable(false); 
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 181, 814, 269);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		JButton btnNewButton = new JButton("Package");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject","root","nilesh09@45");
//					Statement stmt=con.createStatement();
					String sql="Select date,username,NameOnCard,PackageName,Amount from paymentpackage where username='"+Username+"'";
					PreparedStatement pstmt=con.prepareStatement(sql);
					ResultSet rs=pstmt.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
			catch (Exception e1) {
			e1.printStackTrace();
		}
			}
				
		});
		btnNewButton.setBounds(92, 113, 137, 41);
		contentPane.add(btnNewButton);
		
		JButton btnHotel = new JButton("Hotel");
		btnHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject","root","nilesh09@45");
//					Statement stmt=con.createStatement();
					String sql="Select date,username,NameOnCard,hotel,Ac_noAc,food,persons,Days,Amount from payment_detail where username='"+Username+"'";
					PreparedStatement pstmt=con.prepareStatement(sql);
					ResultSet rs=pstmt.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
			catch (Exception e1) {
			e1.printStackTrace();
		}
			}
		});
		btnHotel.setForeground(Color.WHITE);
		btnHotel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHotel.setBackground(Color.BLACK);
		btnHotel.setBounds(264, 113, 137, 41);
		contentPane.add(btnHotel);
		
		JLabel lblNewLabel = new JLabel("Payment History");
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(352, 23, 181, 41);
		contentPane.add(lblNewLabel);
		
	
		
		
		
		
	}
}
