package BaiTap_CoBan;

import java.util.Scanner;
// ax+b=0

public class Menu {
	static Scanner in= new Scanner(System.in);
	public static void main(String[] args) {
		int choice;
		do {
		//int choice = in.nextInt();
		System.out.println("1. Phuong trinh bac 1");
		System.out.println("2. Phuong trinh bac 2");
		System.out.println("3. Tinh tien dien");
		System.out.println("4. Thoat");
		choice = in.nextInt();
		
			
			switch(choice) {
			case 1:{
				PhuongTrinhBac1.pt1();
				break;
			}
			case 2:
				PhuongTrinhBac2.pt2();
				break;
			case 3:
				TinhTienDien.Ham_TinhTienDien();
			case 4:
				System.exit(1);
				break;
			default:
				System.out.println();
			}
		}while(choice != 4);
        
         
	}
    
}

