package BaiTap_CoBan;

import java.util.Scanner;

public class PhepTinh {

	public static void main(String[] args) {
		float a,b;
		String  check;
		Scanner in =new Scanner(System.in);
		System.out.println("nhap so a: ");
		a=in.nextFloat();
		System.out.println("nhap so b: ");
		b=in.nextFloat();
		in.nextLine();// lam sach bo nho
		System.out.println("nhap pheo tinh (+ - * /):");
		check=in.nextLine();
		switch(check) {
		case "+" :
			System.out.print(a+b);
		break;
		case "-":
			System.out.print(a-b);;
			break;
		case  "*":
			System.out.print(a*b);
			break;
		case "/" :
			System.out.print(a/b);
			break;
			 
			
		}
		

	}
//	public static void  Ham_Cong() {
//		int a = 0;
//		int b = 0;
//		System.out.printf("ket qua phep Cong la: ",+ (a+b));
//	}
//	public static void Ham_Tru(){
//		int a = 0;
//		int b = 0;
//		System.out.printf("ket qua phep Tru la: ",+ (a-b));
//	}
//    public static void Ham_Tich() {
//    	int a = 0;
//		int b = 0;
//		System.out.printf("ket qua phep Nhan la: ",+ (a*b));
//    }
//    public static void Ham_Thuong() {
//    	System.out.println("ket qua phep Chia la:  ",+(a/b));
//    }
}
