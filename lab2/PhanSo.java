package buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tu,mau;
	public PhanSo() {
		tu = 0;
		mau = 1;
	}
	public PhanSo(int tu , int mau) {
		this.tu = tu;
		this.mau = mau;
	}
	public PhanSo(PhanSo p) {
		tu = p.tu;
		mau = p.mau;
	}
	
	public void nhapPhanSo(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tu so :");
		tu = sc.nextInt();
		do {
			System.out.print("Nhap mau so :");
			mau = sc.nextInt();
		}
		while(mau == 0);
		System.out.println();
	}
	public void hienThi() {
		if(tu == 0) {
			System.out.println("0");
		}
		else if(mau == 1) {
			System.out.println(tu);
		}
		else {
			System.out.println(tu + "/" + mau);
		}
	}
	public String toString() {
		if(tu == 0) {
			return "0";
		}
		else if(mau == 1) {
			return tu + " ";
		}
		return (tu + "/" + mau);
	}
	public void nghichDao() {
		if(tu == 0) {
			System.out.println("do tu bang 0 nen khong ton tai phan so nghich dao");
		}
		else {
			int swap = tu;
			tu = mau;
			mau = swap;
		}
	}
	public PhanSo giaTriNghichDao() {
		return new PhanSo(mau,tu);
	}
	public double giaTriThuc() {
		return (double )tu/mau;
	}
	public boolean lonHon(PhanSo a) {
		return giaTriThuc() > a.giaTriThuc();
	}
	public PhanSo cong(PhanSo a) {
		PhanSo p = new PhanSo();
		p.tu = (tu * a.mau) + (a.tu * mau);
		p.mau = mau * a.mau;
		return p;
	}
	public PhanSo tru(PhanSo a) {
		PhanSo p = new PhanSo();
		p.tu = (tu * a.mau) - (a.tu * mau);
		p.mau = mau * a.mau;
		return p;
	}
	public PhanSo nhan(PhanSo a) {
		PhanSo p = new PhanSo();
		p.tu = tu * a.tu;
		p.mau = mau * a.mau;
		return p;
	}
	public PhanSo chia(PhanSo a) {
		PhanSo p = new PhanSo();
		p.tu = tu * a.mau;
		p.mau = mau * a.tu;
		return p;
	}
	public PhanSo cong(int a) {
		PhanSo p = new PhanSo();
		p.tu = tu  + (a * mau);
		p.mau = mau;
		return p;
	}
	public PhanSo tru(int a) {
		PhanSo p = new PhanSo();
		p.tu = tu  - (a * mau);
		p.mau = mau;
		return p;
	}
	public PhanSo nhan(int a) {
		PhanSo p = new PhanSo();
		p.tu = tu * a;
		p.mau = mau;
		return p;
	}
	public PhanSo chia(int a) {
		PhanSo p = new PhanSo();
		p.tu = tu;
		p.mau = mau * a;
		return p;
	}
	public PhanSo donGianPhanSo(PhanSo a) {
		int max;
		PhanSo b = new PhanSo();
		if(a.tu > a.mau) max = a.tu;
		else max = a.mau;
		for(int i = 1; i <= max ; i++) {
			if( a.tu % i == 0 && a.mau % i == 0) {
				b.tu = a.tu/i;
				b.mau = a.mau/i;
			}
		}
		return b;
	}
}
