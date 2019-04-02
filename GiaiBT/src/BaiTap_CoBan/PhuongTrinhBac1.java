package BaiTap_CoBan;

import java.util.Scanner;
// ax+b=0

public class PhuongTrinhBac1 {
	static Scanner in= new Scanner(System.in);
	public static void main(String[] args) {
	pt1();	
	}
 public static void pt1() {
	float a,b;
	 //Scanner in= new Scanner(System.in);
     System.out.println("nhap a:");
     a=in.nextInt();
     System.out.println("nhap b:");
     b=in.nextInt();
	if(a<0) System.out.println("phuong trinh co nghiem: "+(b/a));
	else if(a==0) System.out.println("phuong trinh vo nghiem");
	else 
		System.out.println("phuong trinh co nghiem: "+(-b/a));
		
	}

}
