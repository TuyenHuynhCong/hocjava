package WHILE;

import java.util.Scanner;

public class TangBienI {

	public static void main(String[] args) {
		Scanner nhap=new Scanner(System.in);
		System.out.println("Enter n : ");
		int n=nhap.nextInt();
		System.out.println("ket qua :");
		while(n<10)
		{
			System.out.println(n);
			n+=1;
		}

	}

}
