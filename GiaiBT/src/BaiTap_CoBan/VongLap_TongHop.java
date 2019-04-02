package BaiTap_CoBan;

import java.util.Scanner;

public class VongLap_TongHop {

	public static void main(String[] args) {
		//Bai1();
		Bai2();
	}

	// 1. In ra màn hình tất cả hợp số nhỏ hơn 100
	// (hợp số là số có nhiều hơn 2 ước)
	public static void Bai1() {
		int n;
		int i;
		for (i = 2; i <= 100; i++) {
			int check = 0;

			for (n = 2; n < i; n++) {
				if (i % n == 0) {
					check = 1;
				}
			}
			if (check == 1)
				System.out.println(i);
		}
	}
	public static void Bai2() {
  	  int n;
  	  int dem=0;
  	  Scanner in=new Scanner(System.in);
  	  System.out.println("nhap vao n: ");
  	  n=in.nextInt();
  	  if(n<2) System.out.println("ban nhap sai.");
  	  for(int i=2;i<n/2;i++)
  	  {
  		  if(n%i==0)
  		  {
  			  dem++;
  		  }
  	 System.out.println(dem);
  	  }
    }

}
      
