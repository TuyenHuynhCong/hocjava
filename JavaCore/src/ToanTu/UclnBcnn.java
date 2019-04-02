package ToanTu;

import java.util.Scanner;

public class UclnBcnn {

	public static void main(String[] args) {
		Scanner Nhap=new Scanner(System.in);
		System.out.println("chuong trinh tim UCLN VA BCNN--");
		System.out.println("moi nhap so a : ");
		int a=Nhap.nextInt();
		System.out.println("moi nhap so b : ");
		int b=Nhap.nextInt();
		System.out.println("UCLN = "+USCLN(a, b));
		System.out.println("BCNN = "+((a*b)/USCLN(a, b))); // tich a va b chia cho ucln

	}
	public static int USCLN(int a , int b) {
			while(a!=b)
			{
				if(a>b)
				{
					a=a-b; //a-=b;
				}
				else 
				{
					b=b-a;
				}
			}
		
		return a;
	}

}
