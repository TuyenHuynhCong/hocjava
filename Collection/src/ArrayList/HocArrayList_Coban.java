package ArrayList;

import java.util.ArrayList;

public class HocArrayList_Coban {

	public static void main(String[] args) {
		// ArrayList ds = new ArrayList();
		// ds.add("x");
		// ds.add(9+"");
		ArrayList ds2 = new ArrayList();
		ds2.add("Huynh");
		ds2.add("Cong");
		ds2.add("Tuyen");
		ds2.add(2, "Luc");
		for (int i = 0; i < ds2.size(); i++) {
			String x = (String) ds2.get(i);
			System.out.print(x + " ");
		}
		System.out.println("\n=====================");
		for (Object t : ds2) {
			System.out.println(ds2 + " ");
		}
		ArrayList<Double> ds3 = new ArrayList<Double>();
		for (double i = 0; i < 10; i++) {
			ds3.add(i * 3.0);
		}
		System.out.println("gia tri danh sach 3 la:");
		for (double j : ds3) {
			System.out.println(j);
		}
		ArrayList<Float> ds4 = new ArrayList<Float>();
		ds4.add(1.5f);
		ds4.add(1.8f);
		System.out.println(" gia tri danh sach 4 la:");
		for (int  i = 0; i < ds4.size(); i++) {
			Float y = ds4.get(i);
			System.out.println(y);
		}
		System.out.println("so phan tu ds 4= " + ds4.size());
		ds4.add(123.14f);
		System.out.println("so phan tu ds 4 sau khi dc them = " + ds4.size());
        ds4.remove(0);
        System.out.println("so phan tu ds 4 sau khi xoa = " + ds4.size());
        ds4.set(0,45.2f);
        System.out.println(" ds4 sau khi dc sua:");
        for (int  i = 0; i < ds4.size(); i++) {
			Float y = ds4.get(i);
			System.out.println(y);
		}
        
	}

}
