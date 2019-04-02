package Hello;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("tuyển");
		Scanner	 sc= new Scanner(System.in);
		System.out.println(" nhap so: ");
		int a = sc.nextInt();
		System.out.println("la "+ a);
		System.out.println(" nhap chuoi: ");
		Scanner scs=new Scanner(System.in);
		String b =scs.nextLine();
		System.out.println("chuoi la "+b);
		System.out.println("nhap so double: ");
		double c=sc.nextDouble();
		System.out.println("so double la : "+c);
		
	}
}
