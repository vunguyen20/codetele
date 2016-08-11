package Loverpart1;

import java.util.Scanner;

public class L2oveswitchcase {

	public static void main(String[] args) {
		int thang = 0;
		int nam=0;
		int ngay=0;
	
		System.out.println("Please input thang : ");
		Scanner keyboard = new Scanner(System.in);
		thang = keyboard.nextInt();
		switch( thang  ){
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				ngay =31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				ngay=30;
				break;
			case 2:
				System.out.println("Hay nhap nam:");
				nam=keyboard.nextInt();
				if (nam%4==0 & nam%100!=0 || nam %400==0 ){
					ngay=29;
				}
				else
					ngay=28;
				break;
			default :
				System.out.println("Nhap sida qua");
		}
		System.out.println("Co: "+ ngay+ " ngay");
		
	
		
	}

}
