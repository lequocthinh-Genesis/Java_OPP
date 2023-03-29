package buoi5;

import java.util.Scanner;

//import buoi2.Date;

public class MyDate {
	private int day,month,year;
	public MyDate() {
		day = 1;
		month = 1;
		year = 2021;
	}
	
	public MyDate(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}
	
	public MyDate(MyDate d) {
		day = d.day;
		month = d.month;
		year = d.year;
	}
	
	public void nhap() {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap ngay");
			day = sc.nextInt();
			System.out.println("nhap thang");
			month = sc.nextInt();
			System.out.println("nhap nam");
			year = sc.nextInt();
		}
		while(!hopLe());
	}
	
	public boolean hopLe() {
		int maxDayInMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean h = false;
		if((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
			maxDayInMonth[2] = 29;
		}
		if(year > 0 && month > 0 && month < 13 && day > 0 && day <= maxDayInMonth[month]) {
			h = true;
		}
		return h;
	}
	
	public void in(){
		System.out.println(day + "/" + month + "/" + year);
	}
	
	public String toString() {
		return (day + "/" + month + "/" + year);
	}
	
	public MyDate ngayHomSau() {
		MyDate d = new MyDate(day, month, year);
		d.day++;
		if(!d.hopLe()) {
			d.day = 1;
			d.month++;
			if(d.hopLe()) {
				d.month = 1;
				d.year++;
			}
		}
		return d;
	}
	public MyDate cong(int n) {
		MyDate d = new MyDate(day, month, year);
		for(int i = 0; i < n ; i++) {
			d = d.ngayHomSau();
		}
		return d;
	}
}
