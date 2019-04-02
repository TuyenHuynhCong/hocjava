package HocS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class DemoGiaoDien extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoGiaoDien frame = new DemoGiaoDien();
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
	public DemoGiaoDien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		username = new JTextField();
		username.setBounds(228, 62, 86, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(228, 143, 86, 20);
		contentPane.add(password);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(98, 65, 58, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(98, 146, 58, 14);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try{
		            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		            String url="jdbc:sqlserver://localhost:1433;databaseName=SIEUTHISACH;user=tuyen;password=1234";
		            Connection con=DriverManager.getConnection(url);
		            String sql="Select * From test where username	=? and password=?";
		            PreparedStatement pst=con.prepareStatement(sql);
		            pst.setString(1,lblUsername.getText());
		            pst.setString(2, lblPassword.getText());
		            ResultSet rs=pst.executeQuery();
		            if (rs.next()) {
	                    
	 JOptionPane.showConfirmDialog(null,"username or password n");
	                    
	                } else {
	                    JOptionPane.showMessageDialog(null, "Username or Password not Correct");
	                    lblUsername.setText(" ");
	                    lblPassword.setText("  ");
	                }
		            con.close();
		            
	            } catch (Exception ex) {
	                JOptionPane.showMessageDialog(null, ex.toString());
	            }
			}
		});
		btnLogin.setBounds(98, 209, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JFrame frame = new JFrame("EXIT");
			        if (JOptionPane.showConfirmDialog(frame, "Do you want to exit ?",
			                "Thoát", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
			            System.exit(0);
			        }
			}
		});
		btnExit.setBounds(269, 209, 89, 23);
		contentPane.add(btnExit);
	}
}
