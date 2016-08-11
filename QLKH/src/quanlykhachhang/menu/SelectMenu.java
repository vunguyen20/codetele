package quanlykhachhang.menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import quanlykhachhang.iofile.SerializeFile;
import quanlykhachhang.khachhang.KhachHang;

public class SelectMenu {
	static ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();

	public static void menu() {
		System.out.println("CHUONG TRINH QUAN LY KHACH HANG");
		System.out.println("1. Nhap thong tin.");
		System.out.println("2. Xuat thong tin");
		System.out.println("3. Luu thong tin");
		System.out.println("4. Tim kiem ");
		int chon = 0;
		chon = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1: {
			nhapthongtin();

			break;
		}
		case 2: {
			xuatthongtin();
			break;
		}
		case 3: {
			luukhachhang();
			break;
		}
		case 4: {
			timkiem();
		}
		case 5: {
			thongke();
		}
		case 6: {
			xuLySapXep() ;
		}
		case 7: {
				xulydocFile();
		}
		case 8: {
			thoat();
		}
		}
	}

	public static void nhapthongtin() {
		KhachHang kh = new KhachHang();
		System.out.println("Nhap ma khach hang");
		kh.setMa(new Scanner(System.in).nextLine());
		System.out.println("Nhap ten khach hang");
		kh.setTen(new Scanner(System.in).nextLine());
		System.out.println("Nhap so dt khach hang");
		kh.setPhone(new Scanner(System.in).nextLine());
		dsKH.add(kh);
		System.out.println("Hay luu truoc nhung gi ban vua lam, nhap phim 3");
	}

	public static void xuatthongtin() {
		System.out.println("Danh sach khach hang: ");
		System.out.println("Ma\tTen\tPhone");
		for (KhachHang kh : dsKH) {
			System.out.println(kh.getMa() + "\t" + kh.getTen() + "\t" + kh.getPhone());
		}
	}

	private static void luukhachhang() {
		boolean kt = SerializeFile.luuFile(dsKH, "D:\\YOUNGWORLD\\myfile1.txt");
		if (kt = true) {
			System.out.println("Da luu file thang cong");
		} else {
			System.out.println("Luu file that bai");
		}
	}

	private static void timkiem() {
		String phone="090";
		System.out.println("===============================");
		System.out.println("Khách hàng có đầu số 090:");
		System.out.println("Mã\tTên\tPhone");
			for (KhachHang kh : dsKH) {
				if (kh.getPhone().startsWith(phone)){
							System.out.println(kh);
						}
					}
					System.out.println("===============================");
	}
	
	private static void thongke(){
		int  phone1=0;
		System.out.println("Khach hang co dau so 098");
		System.out.println("Mã\tTên\tPhone");
		for(KhachHang kh: dsKH){
			if(kh.getPhone().startsWith("098"))
				phone1++;
		}
		System.out.println(phone1);
	}
	private static void thoat(){
		System.out.println("ban co muon thoat khoai chuong trinh. ");
		System.exit(1);
	}
	private static void xuLySapXep() {
		Collections.sort(dsKH);
		System.out.println("Đã sắp xếp số điện thoại xong rồi");
	}
	public static void xulydocFile(){
		dsKH= SerializeFile.docFile("D:\\YOUNGWORLD\\myfile1.txt");
		System.out.println("Doc file thanh cong");
	}

	
	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}

}