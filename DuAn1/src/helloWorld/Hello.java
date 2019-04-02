/*
package helloWorld;




import java.util.Scanner;

import helloWorld.Class2;


public class Hello {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	       System.out.println(" Nhập n= ");
	       int n=in.nextInt();
	       // tính tổng các số chẵn bé hơn n
	      
	       int sum=0;
	       for(int i=2;i<=n;i+=2) sum+=i;
	       // hien thi ket qua ra man hinh
	       
	        System.out.println("Tổng là:  "+sum);
	        
	}

}
*/
package helloWorld ;

import java.util.Scanner;
public class Hello{
public static void main(String [] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("nhap n:");
	int n=in.nextInt();
	int sum=0;
	for(int i=2;i<=n;i+=2)
		sum+=i;
	System.out.println("Tong la: "+sum);
	
}
	
}



