import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 class viewHotels extends JFrame  implements ActionListener
{

ImageIcon s[];
JLabel l;
JButton b1,b2;
int i,l1;
JPanel p;
private JLabel lblNewLabel;

public viewHotels()
{
    setBounds(300, 130, 750, 500);
	 setResizable(false);
    setVisible(true);
    getContentPane().setLayout(null);
    JPanel p=new JPanel(new FlowLayout());
    p.setBounds(0, 428, 734, 33);
    b1=new JButton("<<");
    b2=new JButton(">>");
    
    p.add(b1);
    p.add(b2);
    getContentPane().add(p);
    b1.addActionListener(this);
    b2.addActionListener(this);
    s = new ImageIcon[3]; 
    s[0] = new ImageIcon("C:\\Users\\kalyan office\\eclipse-workspace\\java project\\bin\\hotel_1.jpg");
    s[1] = new ImageIcon("C:\\Users\\kalyan office\\eclipse-workspace\\java project\\bin\\hotel_2.jpg");
    s[2] = new ImageIcon("C:\\Users\\kalyan office\\eclipse-workspace\\java project\\bin\\hotel_3.jpg");
    l = new JLabel("",JLabel.CENTER); 
    l.setBounds(0, 0, 734, 428);
    getContentPane().add(l);
    l.setIcon(s[0]);
    
    
}
public  void actionPerformed(ActionEvent e)
{

    if(e.getSource()==b1)
    {
        if(i==0)
        {
            JOptionPane.showMessageDialog(null,"This is First Hotel");
        }
        else
            {
            i=i-1;
            l.setIcon(s[i]);
        }
    }
    if(e.getSource()==b2)
    {
        if(i==s.length-1)
        {
            JOptionPane.showMessageDialog(null,"This is Last Hotel");
        }
        else
            {
            i=i+1;
            l.setIcon(s[i]);
            }
        }

     }
public static void main(String args[])
{
    viewHotels obj = new viewHotels();
}
 }