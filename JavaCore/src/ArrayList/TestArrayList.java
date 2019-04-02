package ArrayList;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> ds=new ArrayList<>();
		ds.add("Ronaldo");
		ds.add("Messi");
		ds.add("Zidane");
		ds.add("Robben");
		ds.add("Kaka");
		for(int i=0;i<ds.size();i++)
		{
			System.out.println(ds.get(i));
		}
		
		System.out.println("danh sach sau khi chen: ");
		ds.add(2,"Cong Phuong");
		for(int i=0;i<ds.size();i++)
		{
			System.out.println(ds.get(i));
		}
		System.out.println("danh sach sau khi Sua: ");
		ds.set(2,"Cong Tuyen");
		for(int i=0;i<ds.size();i++)
		{
			System.out.println(ds.get(i));
		}
		System.out.println("danh sach sau khi Xoa: ");
		ds.remove(1);
		for(int i=0;i<ds.size();i++)
		{
			System.out.println(ds.get(i));
		}
		
	}

}
