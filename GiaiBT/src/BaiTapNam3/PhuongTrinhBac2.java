package BaiTapNam3;

import java.util.Scanner;
import java.lang.Math.*;

public class PhuongTrinhBac2 {

	public static void main(String[] args) {
		// pt2 :Ax2 + Bx + C =0;
		double a,b,c ,delta;
		Scanner Nhap =new Scanner(System.in);
		System.out.println("nhap vao he so A : ");
		 	 a=Nhap.nextDouble();
		System.out.println("nhap vao he so B : ");
			 b=Nhap.nextDouble();
		System.out.println("nhap vao he so C : ");
			 c=Nhap.nextDouble();
			 delta = b*b - 4*a*c;
			 double x=(-b)/2*a;
			 //double x1=(-b)+ sqrt(delta)/2*a;
			// (-b+sqrt(delta))/(2*a);
			 double x1 = ((-b)+Math.sqrt(delta)/(2*a));
			 double x2 = ((-b)-Math.sqrt(delta)/(2*a));
					 
		if(delta<0)
		{
			System.out.println("phuong trinh vo nghiem!!!");
		}
		else if(delta==0)
		{	
			System.out.println("Phuong Trinh Co nghiem Kep x= "+x);
		}
		else
		{
			System.out.println("phuong trinh co 2 nghiem phan biet: ");
			System.out.println("x1 = "+x1);
			System.out.println("x2 = "+x2);
		}
		//System.out.println("max cua 2 so a, b,"+Math.max(a, b));
			
	}

}
