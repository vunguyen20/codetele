package classInheritancePolymorphism;

public class TestKhachHang {

	public static void main(String[] args) {
		KhachHang vu= new KhachHang();
		vu.setMa("ndv");
		vu.setTen("Nguyen Dinh Vu");
		vu.setTuoi(25);
		vu.setDiaChi("Le Cao Lang");
		
		KhachHang Tu = new KhachHang();
		Tu.setMa("Tu");
		Tu.setTen("Dao Thanh Tu");
		Tu.setTuoi(24);
		Tu.setDiaChi("cmt8");
		
	System.out.println(vu);
	System.out.println(Tu.getDiaChi());
	
		KhachHangThuongXuyen Tuan = new KhachHangThuongXuyen();
			Tuan.setMa("001");
			Tuan.setTen("Quang Tuan");
			Tuan.setTuoi(27);
			Tuan.setDiaChi("Dong Nai");
			Tuan.setSoDt("012349323");
			//System.out.println("Tuan"+ KhachHangThuongXuyen.getSoDt());
			System.out.println("so dt của Tuan: "+ Tuan.getSoDt());
	}

}
