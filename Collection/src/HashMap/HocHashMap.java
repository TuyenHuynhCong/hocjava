package HashMap;

import java.util.HashMap;

public class HocHashMap {

	public static void main(String[] args) {
    HashMap<Integer, String> ds=new HashMap<Integer,String>();
    ds.put(111, "huynh cong tuyen");
    ds.put(112, "dang le hoang");
    ds.put(113, "ho minh nhat");
    String nv=ds.get(111);
    System.out.println(nv);
    System.out.println(" in tat ca danh sach: ");
    for(String ten:ds.values())
    	System.out.println(ten);
	}

}
