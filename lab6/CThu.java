package buoi6;

import java.util.Scanner;

public class CThu extends CNguoi{
	int so;
	String vtri,mua,clbo;
	long bthang;
	
	public CThu() {
		super();
		so = 0;
		vtri = new String();
		mua = new String();
		clbo = new String();
		bthang = 0;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao thong tin cau thu :");
		super.nhap();
		System.out.println("Nhap vao so ao cua cau thu : ");
		so = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao vi tri cua cau thu bang chu viet thuong khong dau co khoang trang : ");
		vtri = sc.nextLine();
		System.out.println("Nhap vao mua tham gia cua cau thu : ");
		mua = sc.nextLine();
		System.out.println("Nhap vao cau lac bo cua cau thu : ");
		clbo = sc.nextLine();
		System.out.println("Nhap vao so bang thang cua cau thu : ");
		bthang = sc.nextInt();
	}
	
	public void in() {
		System.out.println("Thong tin cua cau thu :");
		super.in();
		System.out.println("So ao cua cau thu : " + so);
		System.out.println("Vi tri cua cau thu : " + vtri);
		System.out.println("Mua tham gia cua cau thu : " + mua);
		System.out.println("Cau lac bo cua cau thu : " + clbo);
		System.out.println("So bang thang cua cau thu : " + bthang);
	}
	
	public Long tinhLuong() {
		long luong,luongcoban = 7000000,luongtang = 0;
		if(vtri.compareTo("thu mon") == 0) luongtang = 3000000;
		else if(vtri.compareTo("hau ve") == 0) luongtang = 4000000;
		else if(vtri.compareTo("trung ve") == 0) luongtang = 4500000;
		else if(vtri.compareTo("tien ve") == 0) luongtang = 5000000;
		else if(vtri.compareTo("tien dao") == 0) luongtang = 7000000;
		long luongchuathue = (luongcoban + luongtang + (bthang*500000));
		long thue = 10*luongchuathue/100;
		System.out.println("Thue : " + thue + " Luong chua thue : " + luongchuathue);
		luong = (luongcoban + luongtang + (bthang*500000) ) -  thue;
		return luong;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so cau thu :");
		int n = sc.nextInt();
		CThu c[];
		c = new CThu[n];
		int i;
		for(i = 0 ; i < n ; i++) {
			c[i] = new CThu();
			c[i].nhap();
		}
		System.out.println("Danh sach cau thu vua nhap la :");
		for(i = 0 ; i < n ; i++) {
			c[i].in();
		}
		System.out.println("Danh Sach tien luong cua tung cau thu la :");
		for(i = 0 ; i < n ; i++) {
			c[i].in();
			System.out.println("Luong cua cau thu la : " + c[i].tinhLuong());
		}

	}

}
