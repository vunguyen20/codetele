package Loverpart1;

import java.util.Arrays;

public class L4overArray {

	public static void main(String[] args) {
		int [] a = new int [4];
		a[0] = 1;
		a[1]= 5;
		a[2]= 2;
		a[3] = 3;
		System.out.println("Mang cua ban la: " );
		for (int i=0; i < a.length; i++){
			System.out.print(a[i]+ "\t");
		}
		Arrays.sort(a);
		System.out.println("\nMang sau khi sap xep cua ban la:" );
		for (int i=0; i < a.length; i++){
			System.out.print(a[i]+ "\t");
		}
		
		System.out.println("\nCac so nguyen to trong mang la: " );
		
		for (int i=0; i < a.length; i++)
		{
			int dem=0;
			for (int j=1; j<=a[i] ; j++)
			{
				if(a[i]%j==0)
				{
					dem++;
				}
				if(dem==2)
					System.out.println(a[i]);
			}
			
				
			
		}
		
		

	}

}
