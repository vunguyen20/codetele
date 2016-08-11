package ioserializefile.Testkhachhang;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import ioserializefile.io.SerializefFile;
import ioserializefile.khachhang.KhachHang;

public class TestKhachHang {
		public static void testLuuFile(){
				ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
				dsKH.add(new KhachHang("KH01", "Trinh Dinh Trong"));
				dsKH.add(new KhachHang("KH02", "Trinh Dinh Thao"));
				dsKH.add(new KhachHang("KH03", "Trinh Dinh Tran"));
				dsKH.add(new KhachHang("KH04", "Trinh Dinh Long"));
				boolean kt = SerializefFile.luuFile(dsKH, "D:\\YOUNGWORLD\\myfile.txt");
				if(kt=true){
					System.out.println("Da luu file thang cong");
				}
				else {
					System.out.println("Luu file that bai");
				}		
		}
		
		
	public static void main(String[] args) {
		//testLuuFile();
		ArrayList<KhachHang>dsKH= SerializefFile.docFile("D:\\YOUNGWORLD\\myfile.txt");
		System.out.println("Danh sach khach hang");
		System.out.println("Ma\tTen");
		for(KhachHang kh: dsKH){
			System.out.println(kh.getMa()+"\t"+kh.getTen());
		}
	}

}
