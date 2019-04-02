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

public class GiaoDien extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDien frame = new GiaoDien();
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
	public GiaoDien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(96, 63, 48, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(96, 130, 58, 14);
		contentPane.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(252, 60, 86, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(263, 130, 75, 20);
		contentPane.add(password);
		
		JButton btnLOGIN = new JButton("LOGIN");
		btnLOGIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
		            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		            String url="jdbc:sqlserver://localhost:1433;databaseName=SIEUTHISACH;user=tuyen;password=1234";
		            Connection con=DriverManager.getConnection(url);
		            String sql="Select * From test where username	=? and password=?";
		            PreparedStatement pst=con.prepareStatement(sql);
		            pst.setString(1,txtUsername.getText());
		            pst.setString(2, lblPassword.getText());
		            ResultSet rs=pst.executeQuery();
		            if (rs.next()) {
	                    
	 JOptionPane.showConfirmDialog(null,"username or password n");
	                    
	                } else {
	                    JOptionPane.showMessageDialog(null, "Username or Password not Correct");
	                    txtUsername.setText(" ");
	                    lblPassword.setText("  ");
	                }
		            con.close();
		            
	            } catch (Exception ex) {
	                JOptionPane.showMessageDialog(null, ex.toString());
	            }
		            
		    
		    
			}
		});
		btnLOGIN.setBounds(143, 200, 89, 23);
		contentPane.add(btnLOGIN);
		
		JButton btnEXIT = new JButton("EXIT");
		btnEXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEXIT.setBounds(311, 200, 89, 23);
		contentPane.add(btnEXIT);
	}
}
