package BaiTapNam3;

import java.util.ArrayList;

public class HocArrayList {

	public static void main(String[] args) {
		ArrayList<String> ds=new ArrayList<>();
		ds.add("Huynh Cong Tuyen");
		ds.add("Dang Thanh Hao");
		ds.add("Ho Minh Nhat");
		ds.add("Dang Le Hoang");
		for (int i = 0; i < ds.size(); i++)
		{
			System.out.println(ds.get(i));
		}
		// chen vao 1 phan tu
		System.out.println("danh sach sau khi chen");
		ds.add(2, "Nguyen Van Rin");
		for (int i = 0; i < ds.size(); i++) {
			System.out.println(ds.get(i));
		}
		// sua 1 phan tu
		System.out.println("Danh sach sau khi sua:");
		ds.set(2,"Nguyen Van An");
		for (int i = 0; i < ds.size(); i++) {
			System.out.println(ds.get(i));
		}
		// xoa 1 phan tu
		System.out.println("danh sach sau khi xoa:");
		ds.remove(3);
		for (int i = 0; i < ds.size(); i++) {
			System.out.println(ds.get(i));
		}
		
		
		
	}

}
