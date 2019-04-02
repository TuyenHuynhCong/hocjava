package IfElse;

import java.util.Scanner;

public class MaxMin3So {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap so a: ");
			int a=sc.nextInt();
		System.out.println("nhap so b: ");
			int b=sc.nextInt();
		System.out.println("nhap so c: ");
			int c=sc.nextInt();
			if(a>=b)// neu a >b - ss a vs c
			{
				if(a>=c)
				{
					System.out.println("max ="+a);
				}
				else
				{
					System.out.println("max ="+c);
				}
			}
			else
			{
				if(b>=c)
				{
					System.out.println("max ="+b);
				}
				else
				{
					System.out.println("max ="+c);
				}
			}
			if(a<=b)// neu a >b - ss a vs c
			{
				if(a<=c)
				{
					System.out.println("min ="+a);
				}
				else
				{
					System.out.println("min ="+c);
				}
			}
			else
			{
				if(b<=c)
				{
					System.out.println("min ="+b);
				}
				else
				{
					System.out.println("min ="+c);
				}
			}
			
	}	

}
