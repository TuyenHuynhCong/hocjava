package business;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import model.Connect;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JTable;

public class Table extends JFrame {

	private JPanel contentPane;
	private JTextField txtScode;
	private JTextField txtFullName;
	private JTextField txtAddress;
	private JPasswordField txtpass;
	private JTable jtable;
	DefaultTableModel tbn= new DefaultTableModel();
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Table frame = new Table();
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
	public Table() {
		
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Scode = new JLabel("Scode");
		Scode.setBounds(73, 30, 69, 14);
		contentPane.add(Scode);
		
		JLabel Fullname = new JLabel("FullName");
		Fullname.setBounds(82, 69, 46, 14);
		contentPane.add(Fullname);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setBounds(82, 111, 46, 14);
		contentPane.add(lblClass);
		
		JLabel Address = new JLabel("Address");
		Address.setBounds(73, 151, 46, 14);
		contentPane.add(Address);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(82, 202, 46, 14);
		contentPane.add(lblPass);
		
		txtScode = new JTextField();
		txtScode.setBounds(170, 27, 86, 20);
		contentPane.add(txtScode);
		txtScode.setColumns(10);
		
		txtFullName = new JTextField();
		txtFullName.setBounds(180, 66, 86, 20);
		contentPane.add(txtFullName);
		txtFullName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(208, 148, 86, 20);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(235, 199, 59, 20);
		contentPane.add(txtpass);
		
		jtable = new JTable();
		jtable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Scode", "FullName", "Class", "Address"
			}
		));
		jtable.setBounds(49, 228, 653, 116);
		contentPane.add(jtable);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"16T1\t", "16T2\t", "16T3"}));
		comboBox.setBounds(170, 108, 66, 20);
		contentPane.add(comboBox);
		
		
		loadData();
	}
	
	

public void loadData(){
    loadData("select * from SinhVien");
}
public void loadData(String sql){
    try {
        Connect a=new Connect();
        Connection conn=a.getConnection();
        int number;
        Vector row,column;
        column=new Vector();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(sql);
        ResultSetMetaData metagata=rs.getMetaData();
        number=metagata.getColumnCount();// tra ve so cot
         for(int i=1;i<number;i++)
         {
             column.add(metagata.getColumnName(i));/// laay ra tieu de cua cac cot
         }
         tbn.setColumnIdentifiers(column);
         while(rs.next())
         {
             row=new Vector();
             for(int i=1;i<=number;i++)
             {
                 row.addElement(rs.getString(i));
             }
             //tbn.addColumn(column);
             tbn.addRow(row); 
            
             jtable.setModel(tbn);
         }
jtable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		 if(jtable.getSelectedRow()>=0)
           {
               txtScode.setText(jtable.getValueAt(jtable.getSelectedRow(),0 )+" ");
               txtFullName.setText(jtable.getValueAt(jtable.getSelectedRow(),1 )+" ");
               
               // .setSelectedItem(jtable.getModel().getValueAt(jtable.getSelectedRow(), 2));
                txtAddress.setText(jtable.getValueAt(jtable.getSelectedRow(),3 )+" ");
                  txtpass.setText(jtable.getValueAt(jtable.getSelectedRow(),0 )+" ");
               
           }
		
	}
});

                
    } catch (Exception ex) {
        System.out.println(ex.toString());
    }
}
}
