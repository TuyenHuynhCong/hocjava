package BaiTap_HuongDoiTuong;

import java.util.Scanner;

class SanPham{
	public String TenSP;
	int SoLuong;
	float GiaBan;
	public void nhapTin() {
	 Scanner scan= new Scanner(System.in);
	 System.out.println(" ten san pham :");
	 TenSP =scan.nextLine();
	 System.out.println(" so luong:");
	 SoLuong=scan.nextInt();
	 System.out.println("Gia Ban:");
	 GiaBan=scan.nextFloat();
	}
	public void hienThi() {
		System.out.printf("\t% 1$ -15s| %10d|%12.2f|%12.2f",TenSP,SoLuong,GiaBan,tinhTien());
		System.out.println();
	}
	public float tinhTien() {
		return SoLuong*GiaBan;
	}
}
public class BanHang {
	SanPham ds[];
	// nhap danh sach vao cac mat hang da ban
	public void nhapTin() {
		for(int k=0;k<ds.length;k++) {
			System.out.println("---- San pham thu "+(k+1));
			ds[k]=new SanPham();
			ds[k].nhapTin();
		}
	}
public void hienThi() {
	for(int k=0;k<ds.length;k++) {
		ds[k]=new SanPham();
		ds[k].hienThi();
	}
}
	public static void main(String[] args) {
	 BanHang bh=new BanHang();
	 int n;
	 Scanner scan=new Scanner(System.in);
	 System.out.printf("so san pham n:");
	 n=scan.nextInt();
	 bh.ds=new SanPham [n];
	 bh.nhapTin();
	 System.out.println();
	 System.out.printf("\t%12s %10s %14s %14s","Ten san pham","so luong","gia ban","thanhtien");
	 System.out.println("\n");
	 bh.hienThi();

	}

}
