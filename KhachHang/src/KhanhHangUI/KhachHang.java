package KhanhHangUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;


public class KhachHang extends JFrame{
	DefaultTableModel dtmKhachHang;
	JTable tblKhachHang;
	JButton btnFirt,btnLast,btnNext,btnPrevious;
	
	JTextArea txtThongTin;

	Connection conn=null;
	Statement statement=null;
	ResultSet result=null;
	
	int position=0;
	
	JTextField txtMa,txtTen,txtTuoi;
	JButton btnLuu;

	public KhachHang(String title)
	{
		super(title);
		addControls();
		addEvents();
		ketNoiCoSoDuLieu();
		hienThiToanBoKhachHang();
	}
	private void hienThiToanBoKhachHang() {
		try
		{
			String sql="select * from KhachHang";
			result=statement.executeQuery(sql);
			dtmKhachHang.setRowCount(0);
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			while(result.next())//trong khi còn dữ liệu để đọc
			{
				String ma=result.getString("MaKH");
				String ten=result.getString("TenKH");
				Date ns=result.getDate("NamSinh");
				Vector<Object>vec=new Vector<Object>();
				vec.add(ma);
				vec.add(ten);
				vec.add(sdf.format(ns));
				dtmKhachHang.addRow(vec);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	private void ketNoiCoSoDuLieu() {
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionUrl=
					"jdbc:sqlserver://tuyen:1433;databaseName=dbKhachHang;integratedSecurity=true;";
			conn= DriverManager.getConnection(connectionUrl);
			//statement=conn.createStatement();
			statement=conn.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			//chỉ di chuyển tới mà thôi (ko quay lui, ko di chuyển tới dòng bất kỳ)
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnLast.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try
				{
					result.last();
					txtThongTin.setText(result.getString(2));
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		btnFirt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try
				{
					result.first();
					txtThongTin.setText(result.getString(2));
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		btnNext.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try
				{
					position++;
					if(result.isLast()==true)
						position=1;
					result.absolute(position);
					txtThongTin.setText(result.getString(2));
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		btnPrevious.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try
				{
					position--;
					if(result.isFirst()==true)
						position=1;
					result.absolute(position);
					txtThongTin.setText(result.getString(2));
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		btnLuu.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyLuuKhachHang();
			}
		});
	}

	protected void xuLyLuuKhachHang() {
		try
		{
			String sql="insert into KhachHang "
					+ "values('"+txtMa.getText()+"','"+txtTen.getText()+"','"+txtTuoi.getText()+"','mn1')";
			int x=statement.executeUpdate(sql);
			if(x>0)
			{
				hienThiToanBoKhachHang();
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	private void addControls() {
		Container con=getContentPane();
		con.setLayout(new BorderLayout());
		JPanel pnMain=new JPanel();
		pnMain.setLayout(new BorderLayout());
		dtmKhachHang=new DefaultTableModel();
		dtmKhachHang.addColumn("Mã khách hàng");
		dtmKhachHang.addColumn("Tên khách hàng");
		dtmKhachHang.addColumn("Năm Sinh");
		tblKhachHang=new JTable(dtmKhachHang);
		JScrollPane scTable=new JScrollPane(tblKhachHang,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnMain.add(scTable,BorderLayout.CENTER);
		con.add(pnMain,BorderLayout.CENTER);
		JPanel pnNorth=new JPanel();
		pnNorth.setLayout(new BorderLayout());
		
		pnMain.add(pnNorth,BorderLayout.NORTH);
		btnFirt=new JButton("|<");
		btnPrevious=new JButton("<<");
		btnNext=new JButton(">>");
		btnLast=new JButton(">|");
		JPanel pnNorthOfNorth=new JPanel();
		pnNorthOfNorth.add(btnFirt);
		pnNorthOfNorth.add(btnPrevious);
		pnNorthOfNorth.add(btnNext);
		pnNorthOfNorth.add(btnLast);
		pnNorth.add(pnNorthOfNorth,BorderLayout.NORTH);
		
		txtThongTin=new JTextArea(5, 30);
		JScrollPane scThongTin=new JScrollPane(txtThongTin,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnNorth.add(scThongTin,BorderLayout.CENTER);
		
		JPanel pnThongTinChiTiet=new JPanel();
		pnThongTinChiTiet.setLayout(new BoxLayout(pnThongTinChiTiet, BoxLayout.Y_AXIS));
		pnMain.add(pnThongTinChiTiet,BorderLayout.SOUTH);
		
		JPanel pnMa=new JPanel();
		pnMa.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblMa=new JLabel("Mã:");
		txtMa=new JTextField(20);
		pnMa.add(lblMa);pnMa.add(txtMa);
		pnThongTinChiTiet.add(pnMa);
		
		JPanel pnTen=new JPanel();
		pnTen.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblTen=new JLabel("Tên:");
		txtTen=new JTextField(20);
		pnTen.add(lblTen);pnTen.add(txtTen);
		pnThongTinChiTiet.add(pnTen);
		
		JPanel pnNs=new JPanel();
		pnNs.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblNs=new JLabel("Năm sinh:");
		txtTuoi=new JTextField(20);
		pnNs.add(lblNs);pnNs.add(txtTuoi);
		pnThongTinChiTiet.add(pnNs);
		
		JPanel pnButtonChiTiet=new JPanel();
		pnButtonChiTiet.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnLuu=new JButton("Lưu");
		pnButtonChiTiet.add(btnLuu);
		pnThongTinChiTiet.add(pnButtonChiTiet);
		lblMa.setPreferredSize(lblNs.getPreferredSize());
		lblTen.setPreferredSize(lblNs.getPreferredSize());
	}
	public void showWindow()
	{
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
