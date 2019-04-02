package XuLiChuoi;

import java.util.StringTokenizer;

public class TimKiemChuoi_Test {

	public static void main(String[] args) {
		String s1 = "Trumb";
		System.out.println(s1.length());// length là so luong ki tu co trong chuoi
		String s2="carlos  c buys a new car";//indexOf dem tu vi tri so :0;
		System.out.println("vi tri cua {l} :"+ s2.indexOf("l"));
		System.out.println("vi tri cua {c} :"+ s2.indexOf("c"));
		System.out.println("vi tri cua {r} :"+ s2.lastIndexOf("r"));
		int vt1=s2.lastIndexOf("a");
		System.out.println("vi tri cua {a}"+vt1);
		int vt2=s2.indexOf("w");
		if(vt2==-1)
		{
			System.out.println("k tim thay w");
		}
		else {
			System.out.println("tim thay w");
			System.out.println("vi tri cua w la: "+vt2);
		}
		StringTokenizer token = new StringTokenizer(s2);
		int dem=0;
//		while(token.hasMoreTokens())
//		{
//			String value=token.nextToken();
//			if(value.equals("c"))//equals: tim 1 ki tu tach biet
//			{
//				dem++;
//			}
//		}
//		System.out.println("tim thay "+dem+"{c}");
		while(token.hasMoreTokens())
		{
			String value1=token.nextToken();
			if(value1.contains("c"))//equals: tim 1 ki tu tach biet
			{
				dem++;
			}
		}
		System.out.println("tim thay "+dem+"{c}");
		System.out.println(java.time.LocalDateTime.now());
		java.time.LocalDateTime.now();
		 
	}
		
		

}
