package HocS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class GiaoDienLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JLabel lblLogin;
	private JPasswordField txtPassword;
	Connection conn = null;
    ResultSet rs;
    PreparedStatement pst;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDienLogin frame = new GiaoDienLogin();
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
	public GiaoDienLogin() {
		setTitle("Học kết nối sql ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(229, 78, 86, 20);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		lblLogin = new JLabel("LOGIN SYSTEM");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLogin.setBounds(147, 23, 168, 14);
		contentPane.add(lblLogin);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(102, 81, 73, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(102, 126, 73, 14);
		contentPane.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(229, 123, 86, 20);
		contentPane.add(txtPassword);
		
		JButton btnLogin_1 = new JButton("LoGin");
		btnLogin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin_1.setBounds(102, 184, 89, 23);
		contentPane.add(btnLogin_1);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try{
			            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			            String url="jdbc:sqlserver://localhost:1433;databaseName=HocSinh;user=tuyen;password=1234";
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
			            
//			            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"+"databaseName=QuanLySinhVien;", "nguyenvanlinh", "04101998");
//			        }catch(Exception ex){
//			            JOptionPane.showMessageDialog(null,ex.toString());
//			        }
//			        return con;
//			    }
			
//				String password=txtPassword.getText();
//				String username=txtUserName.getText();
//				if(password.contains("1234")&& username.contains("tuyen"))
//				{
//					txtPassword.setText(null);
//					txtUserName.setText(null);
//					GiaoDienAfterLogin.main(null);
//				}
//				else
//				{
//					JOptionPane.showMessageDialog(null, "Connection failed",username, JOptionPane.ERROR_MESSAGE);txtPassword.setText(null);
//					txtPassword.setText(null);
//					txtUserName.setText(null);
//				}
			
		
		btnLogin.setBounds(44, 197, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUserName.setText(null); 
				txtPassword.setText(null);
			}
		});
		btnReset.setBounds(182, 197, 89, 23);
		contentPane.add(btnReset);
		
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
		btnExit.setBounds(308, 197, 89, 23);
		contentPane.add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(122, 169, 207, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(75, 57, 1, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(102, 57, 230, 2);
		contentPane.add(separator_2);
	}

		});
		}
}