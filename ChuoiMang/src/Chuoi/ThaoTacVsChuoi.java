package Chuoi;

public class ThaoTacVsChuoi {

	public static void main(String[] args) {
		String s = " 642 Ton Duc Thang";
		// kich thuoc chuoi
		System.out.println(" chieu dai cua chuoi la:"+s.length());
		// in hoa,in thuong,so;
		char [] arr=s.toCharArray();
		int InHoa=0;
		int InThuong=0;
		int SoChuSo=0;
		for(int i=0;i<arr.length;i++)
		{
			char c=arr[i];
			if(Character.isUpperCase(c))
			{
				InHoa++;
			}
			if(Character.isLowerCase(c))
			{
				InThuong++;
			}
			if(Character.isDigit(c))
			{
				SoChuSo++;
			}
		}
		System.out.println("so chu in hoa la:" +InHoa);
		System.out.println(" so chu in thuong la:"+ InThuong);
		System.out.println(" so chu so la:"+SoChuSo);
		
		String bh1="f:/giaitri/nhac/naocavang.mp3";
		 int vtcuoi=bh1.lastIndexOf("/");
		 String TenBaiHat=bh1.substring(vtcuoi+1);
		 System.out.println("ten bai hat: "+TenBaiHat);
		 int vtcuoiDauCham=bh1.lastIndexOf(".");
	 TenBaiHat=bh1.substring(vtcuoi+1,vtcuoiDauCham);
	 System.out.println("ten bai hat k co duoi.mp3: "+TenBaiHat);
	}

}
