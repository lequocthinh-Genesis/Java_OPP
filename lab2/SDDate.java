package buoi2;

import java.util.Scanner;

public class SDDate {
	public static void main(String[] args) {
		Date d = new Date(8,3,2021);
		d.in();
		Date d2 = new Date();
		d2.nhap();
		d2.in();
		System.out.println("ngay hom sau la");
		d2 = d2.ngayHomSau();
		d2.in();
		// nhap danh sach doi tuong
		Date ds[];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap sp ngay  = ");
		n = sc.nextInt();
		ds = new Date[n];
		// cap phat bo nho cho cac doi tuong
		for(int i = 0; i < n ; i++) {
			ds[i] = new Date();
		}
		for(int i = 0; i < n ; i++) {
			System.out.print("\nnhap ngay thu " + (i - 1) + ";");
			ds[i].nhap();
		}
		System.out.println("Danh sach ngay vua nhap :");
		for(int i = 0; i < n ; i++) {
			ds[i].in();
		}
		System.out.println("nhap so ngay can them :");
		int m = sc.nextInt();
		for(int i = 0; i < n ; i++) {
			ds[i] = ds[i].cong(m);
		}
		for(int i = 0; i < n ; i++) {
			ds[i].in();
		}
	}
}
