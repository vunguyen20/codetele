package classInheritancePolymorphism;

public class KhachHang {
			public String ma;
			public String ten;
			public int tuoi;
			public String diaChi;
			
			public String getMa(){
				return this.ma;
			}
			public void setMa(String ma){
				this.ma=ma;
			}
			
			public String getTen(){
				return this.ten;
			}
			public void setTen(String ten){
				this.ten=ten;
			}
			
			public int getTuoi(){
				return this.tuoi;
			}
			public void setTuoi(int tuoi){
				this.tuoi=tuoi;
			}
			
			public String getDiaChi(){
				return this.diaChi;
			}
			public void setDiaChi(String diaChi){
				this.diaChi=diaChi;
			}
			
			public KhachHang(){
				System.out.println("Ham contructor mac dinh");
			}
			/*public KhachHang(String ma, String ten,int tuoi, String diaChi){
				this.ma=ma;
				this.ten=ten;
				this.tuoi=tuoi;
				this.diaChi=diaChi;
			}*/
		
			
}
