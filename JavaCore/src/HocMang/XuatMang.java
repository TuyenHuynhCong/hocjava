package HocMang;

import java.util.Scanner;

public class XuatMang {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [] M;
		System.out.println("nhập số lượng phần tử cho mảng: ");
		int n=sc.nextInt();
		M = new int [n];
		for(int i=0;i <M.length;i++)
		{
			System.out.print("M["+i+"]= ");
			M[i]=sc.nextInt();
		}
		System.out.println("Mảng của ta là: ");
		for(int i=0;i<M.length;i++)
		{
			System.out.print(M[i]+" ");
		}
		System.out.println();
		M[2]=12;
		System.out.println("Mảng của ta là: ");
		for(int i=0;i<M.length;i++)
		{
			System.out.print(M[i]+" ");
		}
		

	}

}
