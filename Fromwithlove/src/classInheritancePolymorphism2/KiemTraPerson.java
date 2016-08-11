package classInheritancePolymorphism2;

import java.util.Scanner;

public class KiemTraPerson {

	public static void main(String[] args) {
		GiaoVien Ly = new GiaoVien();
		HocSinh vu= new HocSinh();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin cua giao vien");
		System.out.println("Nhap ten giao vien");
		Ly.setTen(sc.nextLine());
		System.out.println("Nhap so cmnd: ");
		Ly.setCmnd(sc.nextLine());
		System.out.println("Nhap so nam giang day");
		Ly.setSoNamGiangDay(sc.nextInt());
		
		System.out.println(Ly.getCmnd());
		System.out.println(Ly.getSoNamGiangDay());
		System.out.println(Ly.getTen());
		
		
	

	}

}
