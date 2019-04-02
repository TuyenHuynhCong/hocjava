package model;

public class HangHoa {

	private String maHang;
	private String tenHang;
	private int soLuongTon;
	private double vAT,donGia;
	public HangHoa()
	{
		
	}
	public String getTenHang() {
		return tenHang;
	}
	
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) throws Exception {
		if(soLuongTon<0) throw new Exception(" Loi so luong ton");
		else
			this.soLuongTon=soLuongTon;
	}
	public double getvAT() {
		return vAT;
	}
	public void setvAT(double vAT) {
		this.vAT = vAT;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) throws Exception {
		if(donGia<0) throw new Exception(" loi don gia");
	}
	public String getMaHang() {
		return maHang;
	}
	public HangHoa(String maHang, String tenHang, int soLuongTon, double vAT, double donGia) throws Exception {
		if(maHang=="") throw new Exception(" Loi Ma Hang");
		this.maHang = maHang;
		if(tenHang=="")  throw new Exception(" Loi Ten Hang");
		this.tenHang = tenHang;
		this.soLuongTon = soLuongTon;
		vAT = vAT;
		this.donGia = donGia;
	}
	@Override
	public String toString() {
		return maHang+" ,"+tenHang+","+soLuongTon+","+donGia;
	}
	

	

}
