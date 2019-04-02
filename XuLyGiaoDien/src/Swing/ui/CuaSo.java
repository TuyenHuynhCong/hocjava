package Swing.ui;

import java.awt.Color;
import java.awt.Container;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CuaSo extends JFrame {
	public CuaSo(String tieude) {
		//super(tieude);
		this.setTitle(tieude);
		addControls();
	}
    public void addControls()
    {
    	// lay lop chua cua so ra.
    	Container con = getContentPane();
    	// taoj 1 lop chua control
    	JPanel pn= new JPanel();
    	pn.setBackground(Color.GRAY);
    JButton bt= new JButton("Huynh Cong Tuyen");
    	pn.add(bt);
    	// dua pane len giao dien
    	con.add(pn);
    }
	public  void showWindow() {
		this.setSize(500, 400);//kich thuoc
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//tat bang dau X
		this.setLocationRelativeTo(null);//hien giua man hinh
		this.setResizable(false);//k cho phep thay doi kich co
		this.setVisible(true);//xuat man hinh 
	}
}
