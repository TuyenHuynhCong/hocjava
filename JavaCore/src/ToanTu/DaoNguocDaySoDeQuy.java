package ToanTu;

import java.util.Scanner;

public class DaoNguocDaySoDeQuy {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.println("nhap vao so nguyen: ");
		int n=nhap.nextInt();
		//System.out.println(DaoSo(n));
		DaoSo(n);
	}
	public static void DaoSo(int n)
	{
		
		if(n<10) System.out.println(n);
		else
		{
			System.out.print(n%10);
			DaoSo(n/10);
			
		}
		
		
	}

}
