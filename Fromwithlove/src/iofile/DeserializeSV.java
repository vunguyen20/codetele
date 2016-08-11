package iofile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeSV {

	public static void main(String[] args) throws FileNotFoundException {
		SinhVien e = null;
		try {
			FileInputStream fileIn= new FileInputStream("D:\\JAVA\\myfile.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e= (SinhVien) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			// TODO Auto-generated catch block
			i.printStackTrace();
		} catch(ClassNotFoundException c){
			System.out.println("Khong tim thay file ");
			c.printStackTrace();
			return;
		}
		System.out.println("Ma SV: " + e.getMaSV());
		System.out.println("Ten SV: " + e.getTenSV());
		System.out.println("Tuoi SV: " + e.getTuoiSV());
		System.out.println("Ma SV: " + e.getDiaChi());
	}

}
