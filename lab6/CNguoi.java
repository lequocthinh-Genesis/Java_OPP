package buoi6;

import java.util.Scanner;

public class CNguoi {
	private String id,hten,ngay;
	char phai;
	
	public CNguoi() {
		id = new String();
		hten = new String();
		ngay = new String();
		char phai = 'f';
	}
	
	public CNguoi(CNguoi c) {
		id = new String(c.id);
		hten = new String(c.hten);
		ngay = new String(c.ngay);
		phai = c.phai;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao id :");
		id = sc.nextLine();
		System.out.println("Nhap vao hten :");
		hten = sc.nextLine();
		System.out.println("Nhap vao ngay sinh theo dinh dang ngay/thang/nam :");
		ngay = sc.nextLine();
		System.out.println("Nhap vao gioi tinh m : Nam Hoac f : Nu ");
		phai = sc.next().charAt(0);
	}
	
	public void in() {
		System.out.println("Id : " + id);
		System.out.println("Ho va ten : " + hten);
		System.out.println("Ngay sinh : " + ngay);
		if( phai == 'm')  System.out.println("Gioi tinh : Nam" );
		else if(phai == 'f') System.out.println("Gioi Tinh : Nu");
		else System.out.println("Gioi Tinh khong xac dinh !!!!!!");
	}
	
	public static void main(String[] args) {
		CNguoi c = new CNguoi();
		c.nhap();
		System.out.println("\nCon Nguoi vua nhap la:");
		c.in();
		
		CNguoi t = new CNguoi(c);
		System.out.println("\nCon nguoi vua sao chep la :");
		t.in();
	}
	
}
