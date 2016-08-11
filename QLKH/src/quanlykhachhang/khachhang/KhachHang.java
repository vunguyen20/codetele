package quanlykhachhang.khachhang;

import java.io.Serializable;

public  class KhachHang implements Serializable,Comparable<KhachHang>{
		private String ma;
		private String ten;
		private String phone;
		public String getMa() {
			return ma;
		}
		public void setMa(String ma) {
			this.ma = ma;
		}
		public String getTen() {
			return ten;
		}
		public void setTen(String ten) {
			this.ten = ten;
		}
		
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public KhachHang(){
			super();
		}
		public KhachHang(String ma,String phone,String ten){
			this.ma=ma;
			this.phone=phone;
			this.ten=ten;
		}
		public String toString() {
			return this.ma +";"+ this.ma+";"+ this.phone;
		}
		@Override
		public int compareTo(KhachHang arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
}	
