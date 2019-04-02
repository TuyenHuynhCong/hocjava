package HashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class HocHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"Co");
		map.put(2,"Cong");
		map.put(3,"Mai");
		map.put(4,"Sac");
		map.put(5,"Co");
		map.put(6,"Ngay");
		map.put(7,"Nen");
		map.put(8,"Kim");
		//lay ten su dung values
		 Collection<String>dsTen= map.values();
		 for(String Ten:dsTen)
		 {
			 System.out.println(Ten);
		 }
		//lay so su dung keyset
		 Collection<Integer> dsKey= map.keySet();
		 for(int so:dsKey)
		 {
			 System.out.println(so);
		 }
		 //xoa
		 map.remove(2);
		 System.out.println("danh sach sau khi xoa");
		 for(String Ten:dsTen)
		 {
			 System.out.println(Ten);
		 }
		 System.out.println("danh sach sau khi chen");
		 if(map.containsKey(9)==false)
		 {
			 map.put(9,"Cong");
		 }
		 for(String Ten:dsTen)
		 {
			 System.out.print(Ten+" ");
		 }
		 System.out.println();
		 System.out.println("show k can for");
		 String ten=map.get(4);
		 System.out.println(ten);
	}

}
