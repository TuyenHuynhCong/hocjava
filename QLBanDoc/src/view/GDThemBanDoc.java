/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BanDocDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.BanDoc;

public class GDThemBanDoc extends javax.swing.JFrame implements ActionListener {

	private BanDoc banDoc;

	
	public GDThemBanDoc() {
		initComponents();
		setLocationRelativeTo(null);
		ArrayList<BanDoc> list = new BanDocDAO().selectQuery();
		btnAdd.addActionListener(this);
		btnCancel.addActionListener(this);
		btnReset.addActionListener(this);
		banDoc = null;
		txtID.setEditable(false);

		int id = 1;
		boolean bb;
		while (true) {
			bb = false;
			for (BanDoc b : list) {
				if (id == b.getId()) {
					bb = true;
					break;
				}
			}
			if (!bb)
				break;
			++id;
		}
		txtID.setText(id + "");
	}

	
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		btnAdd = new javax.swing.JButton();
		btnCancel = new javax.swing.JButton();
		btnReset = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		txtAddress = new javax.swing.JTextField();
		txtPhoneNumer = new javax.swing.JTextField();
		txtKindOfReader = new javax.swing.JTextField();
		txtDateOfBirth = new javax.swing.JTextField();
		txtStartDate = new javax.swing.JTextField();
		txtEndDate = new javax.swing.JTextField();
		txtName = new javax.swing.JTextField();
		txtID = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel1.setText("THÊM MỚI BẠN ĐỌC");

		btnAdd.setText("Add");

		btnCancel.setText("Cancel");

		btnReset.setText("Reset");

		jLabel2.setText("ID:");

		jLabel3.setText("Họ Và Tên:");

		jLabel4.setText("Địa Chỉ:");

		jLabel5.setText("SĐT:");

		jLabel6.setText("Loại Bạn Đọc:");

		jLabel7.setText("Ngày Sinh: ");

		jLabel8.setText("Ngày Gia Hạn: ");

		jLabel9.setText("Ngày Hết Hạn: ");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(155, 155, 155).addComponent(jLabel1))
						.addGroup(layout.createSequentialGroup().addGap(83, 83, 83)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 72,
														Short.MAX_VALUE)
												.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(0, 0, Short.MAX_VALUE))
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup().addGap(18, 18, 18)
																.addComponent(txtStartDate))
														.addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
																.addComponent(txtDateOfBirth))
														.addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
																.addComponent(txtKindOfReader))
														.addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
																.addComponent(txtPhoneNumer))
														.addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
																.addGroup(layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(txtName).addComponent(txtAddress)
																		.addComponent(txtID)))))))
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(83, 83, 83).addComponent(jLabel9))
								.addGroup(layout.createSequentialGroup().addGap(50, 50, 50).addComponent(btnAdd,
										javax.swing.GroupLayout.PREFERRED_SIZE, 80,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(18, 18, 18)
												.addComponent(txtEndDate))
										.addGroup(layout.createSequentialGroup().addGap(30, 30, 30)
												.addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62,
														Short.MAX_VALUE)
												.addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(10, 10, 10)))))
				.addGap(54, 54, 54)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap().addComponent(jLabel1).addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2)
						.addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(27, 27, 27)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3)
						.addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(28, 28, 28)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4)
						.addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(29, 29, 29)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5)
						.addComponent(txtPhoneNumer, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(22, 22, 22)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6)
						.addComponent(txtKindOfReader, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(26, 26, 26)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel7)
						.addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(21, 21, 21)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8)
						.addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(30, 30, 30)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9)
						.addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnAdd)
						.addComponent(btnCancel).addComponent(btnReset))
				.addGap(23, 23, 23)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GDThemBanDoc.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GDThemBanDoc.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GDThemBanDoc.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GDThemBanDoc.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GDThemBanDoc().setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnAdd)) {
			btnAddClick();
		} else if (e.getSource().equals(btnCancel)) {
			btnCancelClick();
		} else
			btnResetClick();
	}

	public void btnAddClick() {
		banDoc = new BanDoc();
		try {

			banDoc.setId(Integer.parseInt(txtID.getText()));
			banDoc.setName(txtName.getText());
			banDoc.setAddress(txtAddress.getText());
			banDoc.setKindOfReader(txtKindOfReader.getText());
			banDoc.setPhoneNumber(txtPhoneNumer.getText());
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			banDoc.setDateOfBirth(sdf.parse(txtDateOfBirth.getText()));
			banDoc.setStartDate(sdf.parse(txtStartDate.getText()));
			banDoc.setEndDate(sdf.parse(txtEndDate.getText()));
			if (new BanDocDAO().addNewReader(banDoc)) {
				JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
			} else
				JOptionPane.showMessageDialog(rootPane, "Thêm thất bại!");
			new GDTrangChu().setVisible(true);
			this.dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void btnCancelClick() {
		new GDTrangChu().setVisible(true);
		this.dispose();
	}

	public void btnResetClick() {
		txtAddress.setText("");
		txtName.setText("");
		txtDateOfBirth.setText("");
		txtStartDate.setText("");
		txtKindOfReader.setText("");
		txtPhoneNumer.setText("");
		txtEndDate.setText("");
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnAdd;
	private javax.swing.JButton btnCancel;
	private javax.swing.JButton btnReset;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JTextField txtAddress;
	private javax.swing.JTextField txtDateOfBirth;
	private javax.swing.JTextField txtEndDate;
	private javax.swing.JTextField txtID;
	private javax.swing.JTextField txtKindOfReader;
	private javax.swing.JTextField txtName;
	private javax.swing.JTextField txtPhoneNumer;
	private javax.swing.JTextField txtStartDate;
	// End of variables declaration//GEN-END:variables
}
