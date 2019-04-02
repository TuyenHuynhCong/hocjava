package BubbleSort;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.SWAP;


public class BubbleSort {
	
	public static void NhapMang(int M[])
	{	
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<M.length;i++)
		{
			System.out.print("M["+i+"]=");
			M[i]=sc.nextInt();
		}
	}
	public static void XuatMang(int M[])
	{
		for (int i = 0; i < M.length; i++) {
			System.out.print(M[i]+" ");
		}
		System.out.println();
	}
	public static void Bubble_Sort(int M[])
	{
		int temp=0;
		for(int i=0;i<M.length-1;i++)
		{
			for (int j = M.length-1; j >i; j--) {
				if(M[j]<M[j-1])
				{
					temp=M[j-1];
					M[j-1]=M[j];
					M[j]=temp;
					
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao so luong phan tu: ");
		int n=sc.nextInt();
		int M[]= new int [n];
		NhapMang(M);
		XuatMang(M);
		System.out.println("Mang sau khi sap xep la: ");
		Bubble_Sort(M);
		XuatMang(M);
	}

}
