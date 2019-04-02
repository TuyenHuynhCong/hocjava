package model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import business.Table;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
	PreparedStatement pst;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(93, 63, 59, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(93, 120, 59, 14);
		contentPane.add(lblPassword);
		
		username = new JTextField();
		username.setBounds(243, 60, 86, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
		            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		            String url="jdbc:sqlserver://ADMIN\\SQLEXPRESS;databaseName=UED;user=tuyen;password=1234";
		            Connection con=DriverManager.getConnection(url);
		            String sql="Select * from HocSinh where Scode=? and Pass=?";
		            PreparedStatement pst=con.prepareStatement(sql);
		            pst.setString(1,username.getText());
		            pst.setString(2,password.getText());
		            ResultSet rs=pst.executeQuery();
		            
		            if (rs.next()) {
		            	JOptionPane.showMessageDialog(null,"thanh cong");
		            	
	 
	Table.main(null);
	                     
	                } else {
	                    JOptionPane.showMessageDialog(null, "Username or Password not Correct");
	                }
		            con.close();
		            
	            } catch (Exception ex) {
	                JOptionPane.showMessageDialog(null, ex.toString());
	            }
			}
			
		});
		btnLogin.setBounds(56, 162, 89, 23);
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
		});// de ta chạy thử :)
		
		btnExit.setBounds(321, 162, 89, 23);
		contentPane.add(btnExit);
		
		password = new JPasswordField();
		password.setBounds(242, 117, 87, 20);
		contentPane.add(password);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username.setText(null);
				password.setText(null);
				
			}
		});
		btnReset.setBounds(181, 162, 89, 23);
		contentPane.add(btnReset);
		
		JLabel lblStudentManagement = new JLabel("STUDENT MANAGEMENT");
		lblStudentManagement.setForeground(Color.RED);
		lblStudentManagement.setFont(new Font("Trajan Pro", Font.PLAIN, 18));
		lblStudentManagement.setBounds(108, 11, 248, 26);
		contentPane.add(lblStudentManagement);
	}
}
