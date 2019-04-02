package BaiTap_CoBan;

import java.util.Scanner;

public class Sum_SoLe_1denN {

	public static void main(String[] args) {
		int n;
		int i;
		int dem=0;
		Scanner in=new Scanner(System.in);
		System.out.println("nhap n:");
		n=in.nextInt();
		
		for( i=1;i<=n;i+=2)
			if(i%2!=0) 
		     dem+=i;
			
				System.out.println("sum="+dem);
		}
	}

				
//		else
//				{
//					for(i=1;i<=n-1;i+=2) 
//						if(n%2!=0)
//						dem+=i;
//						System.out.println("sum="+dem);
//					
//				}
//
//	}

	
