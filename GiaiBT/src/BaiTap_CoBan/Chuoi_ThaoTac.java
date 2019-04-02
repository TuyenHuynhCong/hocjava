package BaiTap_CoBan;

public class Chuoi_ThaoTac {

	public static void main(String[] args) {
		String s="Xin chao tat ca cac ban";
		// dùng để chức kí tự a có trong chuỗi string
		int dem=0;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)=='a') dem++;
		System.out.println(" so luong ki tu a co trong chuoi la= "+dem);
		// kiem tra chuoi co chua tu chao
		int index=s.indexOf("chao");
		if(index>=0)
				System.out.println("vi tri từ chào:" +index);
		else System.out.println("chuoi khong co tu chao");
		//Start =xin
		if(s.startsWith("Xin")==true) System.out.println("chuoi bat dau bang tu Xin");
		else System.out.println("chuoi k bat dau bang tu xin");
		//end=ban
		if(s.endsWith("ban")==true) System.out.println("chuoi ket thuc bang tu ban");
		else System.out.println("chuoi k ket thuc bang tu ban");

	}

}
