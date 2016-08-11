package iofile;

import java.io.Serializable;

public class SinhVien implements Serializable {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private String maSV;
	private String tenSV;
	private int tuoiSV;
	private String diaChi;
	
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public int getTuoiSV() {
		return tuoiSV;
	}
	public void setTuoiSV(int tuoiSV) {
		this.tuoiSV = tuoiSV;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public SinhVien(){
		System.out.println("Constructor default");
	}
	
}
