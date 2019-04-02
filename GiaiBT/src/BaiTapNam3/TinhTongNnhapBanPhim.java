package BaiTapNam3;

import java.util.Scanner;

public class TinhTongNnhapBanPhim {

	public static void main(String[] args) {
		//tinh s= 1+ 1/1+1/2 +1/n
		Scanner nhap=new Scanner(System.in);
		System.out.println("nhap vao so nguyen n :");
		int n=nhap.nextInt();
		float s=0;
		for(int i=1;i<=n;i++)
		{
			s+=(float)1/i;
		}
		System.out.println("s= "+s);

	}

}
