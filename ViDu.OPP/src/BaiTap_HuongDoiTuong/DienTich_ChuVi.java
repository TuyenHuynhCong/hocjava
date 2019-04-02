package BaiTap_HuongDoiTuong;

import java.util.Scanner;

public class DienTich_ChuVi {
	private Float chieuDai;
	private Float chieuRong;

	public DienTich_ChuVi() {

	}

	public void setChieuDai(Float chieuDai) {
		this.chieuDai = chieuDai;
	}

	public Float getChieuDai() {
		return this.chieuDai;
	}

	public void setChieuRong(Float chieuRong) {
		this.chieuRong = chieuRong;
	}

	public Float getChieuRong() {
		return this.chieuRong;
	}

	public DienTich_ChuVi(Float chieuDai, Float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	@Override
	public String toString() {
		return "DienTich_ChuVi [chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + "]";
	}

	public float TinhDienTich() {
		return this.chieuDai * this.chieuRong;
	}

	public float TinhChuVi() {
		return (this.chieuDai + this.chieuRong) / 2f;
	}

	public void Nhap() {
		Scanner input = new Scanner(System.in);
		System.out.println("nhap chieu dai: ");
		chieuDai = input.nextFloat();
		System.out.println("nhap chieu rong:");
		chieuRong = input.nextFloat();

	}

	public static void main(String[] args) {
		DienTich_ChuVi vd = new DienTich_ChuVi();
		vd.Nhap();

		System.out.println("  chu vi=" + vd.TinhChuVi());
		System.out.println("\ndien tich=" + vd.TinhDienTich());

	}

}
