package view;

import java.util.Scanner;

import model.HangHoa;

public class TestHangHoa {

	public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        
		try {
			HangHoa tivi=new HangHoa("001","tivi LG",0, 0.15,1000000);
			System.out.println(tivi);
		} catch (Exception e) {
         System.out.println(e.getMessage());
		}

}
}
