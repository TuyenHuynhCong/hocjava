package BaiTapNam3;

import java.util.Arrays;
import java.util.Scanner;

public class ThaoTacVoiMang {
	
	public static void NhapMang(int M[])
	{
		Scanner Nhap= new Scanner(System.in);
		for(int i=0;i<M.length;i++)
		{
			System.out.print("M["+i+"]=");
			M[i]=Nhap.nextInt();
		}
	}
	public static void XuatMang(int M[])
	{
		for(int i=0;i<M.length;i++)
		{
			System.out.print(M[i]+" ");
		}
		System.out.println();
	}
	public static void PhanTuMax(int M[])
	{
		int Smax=M[0];
		for(int i=0;i<M.length;i++)
		{
			if(Smax<=M[i])
			{
				Smax=M[i];
				//i++;
			}
		}
		System.out.println("Max = "+Smax);
		System.out.println();
	}
	public static void PhanTuMin(int M[])
	{
		int Smin=M[0];
		for(int i=0;i<M.length;i++)
		{
			if(Smin>=M[i])
			{
				Smin=M[i];
				//i++;
			}
		}
		System.out.println("Min = "+Smin);
		System.out.println();
	}
	public static void TongMang(int M[])
	{
		int s=0;
		for(int i=0;i<M.length;i++)
		{
			s+=M[i];
		}
		System.out.println("Tong s = "+s);
	}
	public static void TongSoChan(int M[])
	{
		int s=0;
		for(int i=0;i<M.length;i++)
		{
			if(M[i]%2==0)
			{
				s+=M[i];
			}
		}
		System.out.println("Tong so chan = "+s);
	}
	public static void main(String[] args) {
		Scanner Nhap =new Scanner(System.in);
		System.out.println(" Nhap vao So luong phan tu cua mang: ");
		int n=Nhap.nextInt();
		int M[]=new int[n];
		NhapMang(M);
		XuatMang(M);
		PhanTuMax(M);
		PhanTuMin(M);
		TongMang(M);	
		TongSoChan(M);
		Arrays.sort(M);
		System.out.println("Mang sau khi sap xep la: ");
		XuatMang(M);
		
	}

}