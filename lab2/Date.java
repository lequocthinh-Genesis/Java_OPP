package buoi2;

import java.util.Scanner;

public class Date {
	private int ngay,thang,nam;
	public Date() {
		ngay = 1;
		thang = 1;
		nam = 2021; 
	}
	
	public Date(int d , int m, int y) {
		ngay = d;
		thang = m;
		nam = y;
	}
	
	public Date(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	
	public void nhap(){
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap ngay");
			ngay = sc.nextInt();
			System.out.println("nhap thang");
			thang = sc.nextInt();
			System.out.println("nhap nam");
			nam = sc.nextInt();
		}
		while(!hopLe());
	}
	public boolean hopLe() {
		int maxDayInMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean h = false;
		if((nam % 4 == 0) && (nam % 100 != 0) || nam % 400 == 0) {
			maxDayInMonth[2] = 29;
		}
		if(nam > 0 && thang > 0 && thang < 13 && ngay > 0 && ngay <= maxDayInMonth[thang]) {
			h = true;
		}
		return h;
	}
	
	public void in(){
		System.out.println(ngay + "/" + thang + "/" + nam);
	}
	
	public String toString() {
		return (ngay + "/" + thang + "/" + nam);
	}
	
	public Date ngayHomSau() {
		Date d = new Date(ngay, thang, nam);
		d.ngay++;
		if(!d.hopLe()) {
			d.ngay = 1;
			d.thang++;
			if(d.hopLe()) {
				d.thang = 1;
				d.nam++;
			}
		}
		return d;
	}
	public Date cong(int n) {
		Date d = new Date(ngay, thang, nam);
		for(int i = 0; i < n ; i++) {
			d = d.ngayHomSau();
		}
		return d;
	}
}
