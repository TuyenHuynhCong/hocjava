package BaiTap_CoBan;

import java.util.Scanner;

public class UCLN_2S0 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner in = new Scanner(System.in);
		System.out.println(" nhap a:");
		a = in.nextInt();
		System.out.println("nhap b:");
		b = in.nextInt();
		System.out.println("Uoc Chung Lon Nhat cua 2 so " + a + " va " + b + " la: " + UCLN(a, b));

	}

	public static int UCLN(int a, int b) {
		// int a;
		// int
		// while(a!=b)
		// if(a>b)x
		// a=a-b;
		// else {
		// b=b-a;
		// }
		// return a;
		// }
		int r;
		r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;

		}
		return b;
	}
}