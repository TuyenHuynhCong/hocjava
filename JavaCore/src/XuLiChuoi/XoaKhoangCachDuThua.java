package XuLiChuoi;

public class XoaKhoangCachDuThua {

	public static void main(String[] args) {
		
		String s= "  Huynh Cong Tuyen  ";
		System.out.println(s);
		System.out.println("Chieu Dai: "+s.length() );
		
		System.out.println(" sau khi su dung hàm trim() ");
		s=s.trim();
		System.out.println(s);
		System.out.println("chieu Dai: "+s.length());
	}

}
