package BaiTapNam3;

import java.util.Scanner;

public class TinhTongCacChuSoCua1SoNguyen {

	public static void main(String[] args) {
		
		Scanner nhap= new Scanner(System.in);
		System.out.println("Nhap So Nguyen: ");
		int n=nhap.nextInt();
		int Tong=0;
		while(n>0)
		{
			Tong+=n%10;
			
			n=n/10;
			System.out.println(n);
		}
		System.out.println(Tong);
		
	}

}
