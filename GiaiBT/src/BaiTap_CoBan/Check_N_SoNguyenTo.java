package BaiTap_CoBan;

import java.util.Scanner;

public class Check_N_SoNguyenTo {

	public static void main(String[] args) {
		{
			int N;
			int dem = 0;
			Scanner in = new Scanner(System.in);
			System.out.println("nhap N:");
			N = in.nextInt();
			if (N < 2) {
				System.out.println("ban nhap sai");
				System.exit(N);
			}
			for (int i = 2; i <= N / 2; i++)
				if (N % i == 0)
					dem++;
			if (dem == 0)
				System.out.println(N + " la so nguyen to");
			else
				System.out.println(N+" khong phai la so nguyen to");
		}

	}

}
