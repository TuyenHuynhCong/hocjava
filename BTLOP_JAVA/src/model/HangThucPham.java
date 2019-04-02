package model;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {

	private LocalDate ngaySX,ngayHH;
    private String nhaCungCap;
	public LocalDate getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(LocalDate ngaySX) {
		this.ngaySX = ngaySX;
	}
	public LocalDate getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(LocalDate ngayHH) {
		this.ngayHH = ngayHH;
	}
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public HangThucPham(LocalDate ngaySX, LocalDate ngayHH, String nhaCungCap) {
		super();
		this.ngaySX = ngaySX;
		this.ngayHH = ngayHH;
		this.nhaCungCap = nhaCungCap;
	}
	@Override
	public String toString() {
		return super.toString()+"HangThucPham [ngaySX=" + ngaySX + ", ngayHH=" + ngayHH + ", nhaCungCap=" + nhaCungCap + "]";
	}
	
    
    
    
}
