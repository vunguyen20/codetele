package Loverpart1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class L5oveCollection {

	public static void main(String[] args) {
		ArrayList<String> usernames= new ArrayList<String>();
		//add phan tu vao ArrayList username
		usernames.add("Nguyen Dinh Vu ");
		usernames.add("Nguyen Hoang Linh Duy ");
		usernames.add("Dao Thanh Tu ");
		usernames.add(2,"Quang Tuan"); // add vao vi tri thu 3
		//Xuat cac phan tu trong ArrayList username ra
		System.out.println("Danh sach sinh vien: "+ usernames );
		
		//Check vi tri cua 1 phan tu trong username
		int pos = usernames.indexOf("Quang Tuan");
		System.out.println("Index of Quang Tuan: " + pos);
		
		//Check  ArrayList username co empty hay khong
		Boolean check = usernames.isEmpty();
		System.out.println("Check usernames co empty hay khong: "+ check );
	    
		//Check size cua usernames
		int size = usernames.size();
		System.out.println("Size cua usernames: " + size);
		
		//check phan tu Dao Thi Lua co trong ArrayList usernames hay khong
		Boolean checkelement= usernames.contains("Tran Thi Lua");
		System.out.println(checkelement);
		if(checkelement==false) {
			System.out.println("Phan tu khong co trong ArrayList username");
		}
		else System.out.println("Phan tu co trong ArrayList usernames");
		
		//Lay 1 phan tu o index thứ i ra.
		String item = usernames.get(2);
		System.out.println("This item: " + item);
		
		//Lay cac phan tu trong ArrayList username 
		//1st way
		for(int index=0; index<usernames.size();index++){
			System.out.println("Index "+ index+ ":"+ usernames.get(index) );
		}
		//2nd way
		for(String str: usernames){
			System.out.println("index: "+ str);
		}
		
		//3rd . dung iterator
		for(Iterator<String> it = usernames.iterator(); it.hasNext();)
			System.out.println(it.next());
		
		//replace an element
		usernames.set(1, "Tun a pheo");
		System.out.println("The ArrayList after replace"+ usernames);
		
		//remove 1 item o index 0
		usernames.remove(0);
		System.out.println(usernames);
		
		//converting ArrayList to Array
		String[] simpleArray=usernames.toArray(new String[usernames.size()]);
		System.out.println(Arrays.toString(simpleArray));
	}


}
