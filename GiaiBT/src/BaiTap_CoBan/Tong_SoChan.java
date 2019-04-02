package BaiTap_CoBan;
import java.util.Scanner;

public class Tong_SoChan {

	public static void main(String[] args) {
		
		  
		        int N;
		        Scanner in =new Scanner(System.in);
		                System.out.println("nhap N:");
		                N=in.nextInt();
		        int Sum=0;
		        for(int i=2;i<=N;i+=2) Sum+=i;
		        System.out.println("Sum="+ Sum);
	}

}
