package BaiTap_CoBan;

import java.util.Scanner;

public class PhuongTrinhBac2 {

	public static void main(String[] args) {
		  
 pt2();
	}
	public static void pt2() {
		float x1,x2,a,b,c,delta;
        Scanner in=new Scanner(System.in);
        System.out.printf(" a =");
        a=in.nextFloat();
        System.out.printf(" b =");
        b=in.nextFloat();
        System.out.printf(" c =");
        c=in.nextFloat();
        if(a==0)
            if(b==0)
            
                if(c==0) System.out.println(" phuong trinh vo so nghiem");
                else
                    System.out.println("phuong trinh vo nghiem");
                    
                
                else 
                System.out.println("phuong trinh co nghiem" + (-c/b));
                
            
        else{
        
                delta=b*b -4*a*c;
        if(delta<0) System.out.println("phuong trinh vo nghiem");
        else 
            if(delta==0)
            {
                x1=x2=(-b/2*a);
                System.out.println("phuong trinh co nghiem duy nhat:"+x1);                      
            }
            else 
            {
                x1=(float)(-b+Math.sqrt(delta))/2*a;
                x2=(float)(-b-Math.sqrt(delta))/2*a;
                System.out.println("phuong trinh co 2 nghiem phan biet: x1="+x1+"x2="+x2);
                
            }
        }
    }
	}

	
