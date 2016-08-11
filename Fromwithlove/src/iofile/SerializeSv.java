package iofile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeSv implements Serializable {

	public static void main(String[] args) {
		SinhVien e = new SinhVien();

		e.setMaSV("D09Tha2");
		e.setTenSV("Nguyen Dinh Vu");
		e.setTuoiSV(25);
		e.setDiaChi("Le Cao Lang");
		try
		{
				FileOutputStream fileOut= new FileOutputStream("D:\\YOUNGWORLD\\myfile.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.writeObject(e);
				out.close();
				fileOut.close();
				System.out.println("Du lieu da duoc serialize duoc luu ");
		}catch( IOException i)
		{
			i.printStackTrace();
		}
	}

}
