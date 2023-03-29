package buoi4;

import java.util.Scanner;

public abstract class ConVat {
	private String giong,mau;
	private float canNang;
	public abstract void keu();
	public ConVat() {
		giong = new String(); 
		mau = new String();
		canNang = 0.0f;
	}
	
	public ConVat(String giong, String mauLong, float canNang) {
		this.giong = new String(giong);
		this.mau = new String(mauLong);
		this.canNang = canNang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap giong :");
		giong = sc.nextLine();
		System.out.println("Nhap mau :");
		mau = sc.nextLine();
		System.out.println("Nhap can nang :");
		canNang = sc.nextFloat();
	}
	
	public void in() {
		System.out.println("Giong : " + giong);
		System.out.println("Mau : " + mau);
		System.out.println("Can nang : " + canNang);
	}
	
	public String toString() {
		return ("Giong : ") + giong + ("\n") + ("Mau : ") + mau + ("\n") + ("Cang nang : ") + canNang;
	}
	
//	public class Bo extends ConVat{
//		public void keu() {
//			System.out.println("...Boooo...Boooo...Booo...");
//		}
//		
//		public Bo() {
//			giong = new String(); 
//			mau = new String();
//			canNang = 0.0f;
//		}
//	}
	
//	public class Heo extends ConVat{
//		public void keu() {
//			System.out.println("...Mapppp...Mapppp...Mapppp...");
//		}
//		
//		public Heo() {
//			giong = new String(); 
//			mau = new String();
//			canNang = 0.0f;
//		}
//	}
//	
//	public class De extends ConVat{
//		public void keu() {
//			System.out.println("...Pe...Pe...Pe...");
//		}
//		
//		public De() {
//			giong = new String(); 
//			mau = new String();
//			canNang = 0.0f;
//		}
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConVat b = new Bo();
	}
}
