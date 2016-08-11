package Loverpart1;



public class L6overclass {
	public String name;
	private int bornYear;
	private int DieYear;

	public L6overclass (String name, int bornYear,int DieYear){
		this.name=name;
		this.bornYear=bornYear;
		this.DieYear=DieYear;
	}
	public  L6overclass (String name, int bornYear){
		this.name=name;
		this.bornYear=bornYear;
	}
	public static void main(String[] args) {
		
		L6overclass edison = new L6overclass("Thomas Edison", 1847, 1931);
		
		System.out.println("info");
		System.out.println("name: " + edison.name);
		System.out.println("Born year: " + edison.bornYear);
		System.out.println("Die  year: " + edison.DieYear);
		
		L6overclass BillGate = new L6overclass("Bill Gate", 1946);
		System.out.println("info");
		System.out.println("name: " + BillGate.name);
		System.out.println("Born year: " + BillGate.bornYear);
	}

}
