package BaiTapNam3;

import java.util.Collection;
import java.util.HashMap;

import com.sun.crypto.provider.HmacMD5;

public class Hoc_vd_Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hMap= new HashMap<>();
		hMap.put(1,"Chuc");
		hMap.put(2,"Mung");
		hMap.put(3,"Nam");
		hMap.put(4,"Moi");
		Collection<String>ds= hMap.values();
		{
			for (String Ten : ds) {
				System.out.println(Ten);
			}
		}
		Collection<Integer> key=hMap.keySet();
		for (Integer so : key) {
			System.out.println(so);
		}
		// xoa 1 key
		hMap.remove(3);
		System.out.println("danh sach sau khi xoa");
		//Collection<String>ds= hMap.values();
		{
			for (String Ten : ds) {
				System.out.println(Ten);
			}
		}
		//Collection<Integer> key=hMap.keySet();
		for (Integer so : key) {
			System.out.println(so);
		}
		if(hMap.containsKey(4)==true)
		{
			hMap.put(4,"Ban");
			System.out.println(hMap.get(4));
		}
	}

}
