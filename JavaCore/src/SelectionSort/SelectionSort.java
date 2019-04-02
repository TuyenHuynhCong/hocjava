package SelectionSort;

import java.util.Scanner;

import BubbleSort.BubbleSort;
import HocMang.XuatMang;


public class SelectionSort {
	
	public static void Selection_Sort(int M[])
	{
		for (int i = 0; i < M.length-1; i++) {
			int min=M[i];
			int min_pos=i;
		for(int j=i+1;j<M.length;j++)
		{
			if(M[j]<min)
			{
				min=M[j];
				min_pos=j;
			}
			int temp=M[min_pos];
			M[min_pos]=M[i];
			M[i]= temp;
		}
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao so luong phan tu: ");
		int n=sc.nextInt();
		int M[]= new int [n];
		BubbleSort.NhapMang(M);
		BubbleSort.XuatMang(M);
		Selection_Sort(M);
		BubbleSort.XuatMang(M);
	}

}
