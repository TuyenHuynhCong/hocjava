package Mang;

import java.util.Arrays;

public class XuLyMang {

	public static void main(String[] args) {
		int m[] = new int[4];
		m[0] = 4;
		m[1] = 2;
		m[2] = 9;
		m[3] = 5;
		System.out.println(" mang cua ban la:");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "\t");

		}
		System.out.println();
		Arrays.sort(m);
		System.out.println("mang sau khi dc sap xep la:");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "\t");
		}
		System.out.println("\nmin:");
		System.out.print(m[0]);
		System.out.println("\nmax:");
		System.out.println(m[3]);
		System.out.println("\ncac so nguyen to la:");
		for (int i = 0; i < m.length; i++) {
			int dem = 0;
			for (int j = 1; j <= m[i]; j++) {
				if (m[i] % j == 0) {
					dem++;
				}

			}
			if (dem == 2)
				System.out.print(m[i] + "  ");
		}

	}

}
