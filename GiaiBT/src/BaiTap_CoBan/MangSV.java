package BaiTap_CoBan;

import java.util.Scanner;

public class MangSV {

	public static void main(String[] args) {
		Arr_MaxMin();
		// SortArray();
		//BangCuuChuong.Tinh();
	}

	public static void Arr_MaxMin() {
		int n;
		int ArrSv[] = new int[5];
		Scanner inp = new Scanner(System.in);
		int Max = ArrSv[0];
		int Min = ArrSv[0];
		for (int i = 0; i < 5; i++) {
			System.out.printf(" nhap diem sinh vien thu " + (i + 1) + ":");
			ArrSv[i] = inp.nextInt();
			if (ArrSv[i] >= Max)
			{
				Max = ArrSv[i];
			} 
//			else if(ArrSv[i]<Min)
//			{
//				Min = ArrSv[i];
//			}
			if(ArrSv[i]<=Min)
			{
				Min=ArrSv[i];
			}
		}
//		for(int i=0;i<5;i++) {
//			System.out.println();
//		}
		System.out.println(" diem cao nhat: " + Max);
		System.out.println(" diem thap nhat: " + Min);
	}

	public static void SortArray() {
		int temp = 0;
		int a[] = { 1, 4, 7, 2, 9 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("mang duoc sap xep thanh----");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
