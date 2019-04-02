
package BaiTap_CoBan;

import java.util.Scanner;
public class Baitap1 {

    
    public static void main(String[] args) {
       

		Scanner in = new Scanner(System.in);
		
		System.out.println("+-------------------------+");
		System.out.println("1.Giải phương trình bậc nhất.");
		System.out.println("2.Giải phương trình bậc hai.");
		System.out.println("3.Tính tiền điện.");
		System.out.println("4.Kết thúc.");
		System.out.println("+--------------------------+");
		System.out.println("Chọn chức năng:_");
		
		int luachon = in.nextInt();
		
		switch (luachon) {
		case 1: 
			GiaiPTB1();
			break;
		case 2:
			GiaiPTB2();
			break;
		case 3:
			tienDien();
			break;
		case 4:
			System.out.println("Kết thúc");
			break;
		default:
			System.out.println("moi ban nhap lai: ");
			break;
		}
 
    }
    

    static void GiaiPTB1 (){
        Scanner sc = new Scanner(System.in);
            System.out.printf("nhap a: ");
            double a = sc.nextDouble();
            System.out.printf("nhap b: ");
            double b = sc.nextDouble();
            if( a == 0){
                if( b == 0){
                    System.out.println("pt vo so nghiem");
                }
                else{
                    System.out.println("pt vo nghiem");
                }
            }
            else{
                System.out.println("pt co nghiem x= "+(-b/a));
            }
    }
     static void GiaiPTB2(){
        Scanner sc = new Scanner(System.in);
            System.out.printf("nhap a: ");
            double a = sc.nextDouble();
            System.out.printf("nhap b: ");
            double b = sc.nextDouble();
            System.out.printf("nhap c: ");
            double c = sc.nextDouble();
            if( a==0){
                if(b==0){
                   if(c==0){
                    System.out.print("\npt vo so nghiem");
                }
                else{
                    System.out.print("\npt vo nghiem");
                }
            }
            else{
                System.out.print("\npt co nghiem x = "+(-c/b));
            }
        }
        else if( a != 0){
            double denta = b*b-4*a*c;
            if( denta < 0){
                System.out.print("\npt vo nghiem");
            }
            if(denta == 0){
                System.out.print("\npt co nghiem kep x = "+(-b/2*a));
            }
            if( denta > 0){
                System.out.print("\npt co hai nghiem ");
                double x1=(-b+Math.sqrt(denta))/(2*a);
                double x2=(-b-Math.sqrt(denta))/(2*a);
                System.out.print("x1 = "+x1+" va x2 = "+x2);
                
            }
        }
}
    static void tienDien(){
        Scanner sc= new Scanner(System.in);
            System.out.print(" nhap so dien: ");
            int sodien = sc.nextInt();
            if( sodien <= 50){
                System.out.println("so tien dien: "+(sodien*1000));
            }
            else{
                System.out.println("so tien dien: "+((50*1000)+(sodien-50)*1200));
            }
    }
    }