package Chuoi;

public class ToiUuChuoi {

	public static void main(String[] args) {
		String s = "    Huynh   Cong    Tuyen   ";
		System.out.println(s);
       s=s.trim();
      // System.out.println(s);
       	String []arr =s.split(" ");
       	String sToiUu="";
       	for(String tu: arr)
       	{
       		if(tu.trim().length()!=0)
       		{
       			sToiUu+=tu + " ";
       		}
       		//sToiUu=sToiUu.trim();
       	}       		System.out.println(sToiUu);

       			
	}

}
