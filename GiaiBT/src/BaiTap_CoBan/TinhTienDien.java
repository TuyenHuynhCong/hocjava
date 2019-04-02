package BaiTap_CoBan;
import java.util.Scanner;

public class TinhTienDien {

   
    public static void main(String[] args) {
      Ham_TinhTienDien();
}
    public static void  Ham_TinhTienDien(){
    	  Scanner sc = new Scanner(System.in);
          int soDien;
          System.out.println("Nhap so dien: ");
          soDien = sc.nextInt();
          if(soDien<=50){
              System.out.println("Tien dien la: "+(soDien*1000));
          }
          else {
               
              System.out.println("Tien dien la: "+(50*1000 + (soDien-50)*1200));
               }
          }
          
    }