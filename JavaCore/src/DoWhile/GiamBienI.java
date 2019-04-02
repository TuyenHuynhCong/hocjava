package DoWhile;

import java.util.Scanner;

public class GiamBienI {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.println("nhap: ");
		int n = nhap.nextInt();
		do {
			System.out.println(n);
			n-=1;
		}while(n>10);

	}

}
