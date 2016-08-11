package Loverpart1;

public class L3earnstring {

	public static void main(String[] args) {
		String s = "     How     to    i    get     there    ";
		String s1 = "there123";
		int len=s.length();
		String s2= s.concat(s1);
		System.out.println("Chieu dai chuoi s la: "+ len); //chieu dai chuoi s
		System.out.println("Chuoi s2: " + s2);// Noi chuoi s1 vao chuoi s thanh chuoi s2
		char v= s.charAt(5);
		System.out.println("Ky tu thu 6 cua chuoi s la: "+ v);
		String s3= "sida";
		s1.compareTo(s3);
		
		int vtdt= s.indexOf(s1);
		System.out.println("Vi tri dau tien cua chuoi s1 trong chuoi s la: "+ vtdt);
		
		String s4 ="C://system/tinhdonphuong.mp3 ";
		int vitridaucham= s4.lastIndexOf(".");
		String s5=s4.substring(11,vitridaucham);
		System.out.println("Chuoi s5: "+ s5);
		
		s = s.trim();
		String []catchuoi =  s.split(" ");
		String toiuuchuoi="";
		for(String tu: catchuoi){
			if (tu.trim().length()!=0)
			toiuuchuoi += tu + " ";	
		}
		toiuuchuoi=toiuuchuoi.trim();
		
		System.out.println(toiuuchuoi);
		
		
		
		
	}

}
