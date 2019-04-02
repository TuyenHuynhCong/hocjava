package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class NhapMang {

	public static void main(String[] args) {
        int n;
        int a[];
        Scanner input=new Scanner(System.in);
        System.out.print("nhap kich thuoc cua mang: ");
        n=input.nextInt();
        a=new int [n];
        for(int i=0;i<a.length;i++)
        {
        	System.out.printf("phan tu thu %d :",(i+1));
        	a[i]=input.nextInt();
        }
        System.out.println("mang cua ban la:");
        for(int i:a)
        {
        	System.out.print(i+" ");
        }
        A_Sort(a);
        A_Min(a);
        A_Max(n,a);
        A_Sum_Chan(n, a);
	}
	public static void A_Sort(int a[])
	{
		Arrays.sort(a);
		System.out.println("\nmang sau khi dc sap xep la:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void A_Min(int a[])
	{  
		//Arrays.sort(a);
		System.out.println("\nphan tu nho nhat cua mang la:");
		System.out.println(a[0]);
		
	}
	public static void A_Max(int n,int a[])
	{
		System.out.println("max:");
		System.out.println(a[n-1]);
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[n-1]);
//		}
	}
	public static void A_Sum_Chan(int n,int a[])
	{
		int dem=0;
		int S=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				dem++;
				S+=a[i];
			}
		}
		System.out.print("sum:"+S/dem);
	}
}
