package BaiTap_CoBan;

import java.util.Scanner;

public class Mang_CoBan {

	public static void main(String[] args) {
      int n;
      int[] arr;
      Scanner input= new Scanner(System.in);
      System.out.print("moi ban nhap kich thuoc cua mang: ");
      n=input.nextInt();
      arr =new int [n];
      for(int i=0;i<arr.length;i++)
      {
    	  System.out.printf(" phan tu thu %d:",(i+1));
    	  arr[i]=input.nextInt();
      }
      for(int j:arr)
    	  System.out.print("  "+j);
      System.out.println();
      SapXep(arr);
      Arr_Min(arr);
      TBC_3(arr);
	}
	public static void SapXep(int [] arr)
	{
		int tam=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					tam=arr[i];
					arr[i]=arr[j];
					arr[j]=tam;
				}
			}
		}
		System.out.println("mang sau khi dc sap xep la: ");
		for(int j:arr)
			System.out.printf(" "+j);
		System.out.println();
			
	}
    public static void Arr_Min(int [] arr)
    {
    	int check=arr[0];
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]<check)
    		{
    			check=arr[i];
    		}
    	}
    	System.out.println("min:" +check);
    	
    }
    public static void TBC_3(int [] arr)
    {
    	float s=0;
    	int dem=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]%3==0)
    		{
    			s+=arr[i];
    			dem++;
    		}
    	}
    	System.out.println("sum:"+ (s/dem) );
    }
}
