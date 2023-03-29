package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {
	private String mSo,hten;
	private Date namSinh;
	private int soHP;
	private String tenHP[],diem[];
	public SinhVien() {
		mSo = new String();
		hten = new String();
		namSinh = new Date();
		soHP = 0;
		tenHP = new String[80];
		diem = new String[80];
	}
	
	public SinhVien(String MS, String HT, Date NS, int SHP, String THP[], String D[]) {
		this.mSo = MS;
		this.hten = HT;
		this.namSinh = NS;
		this.soHP = SHP;
		this.tenHP = THP;
		this.diem = D;
	}
	
	public SinhVien(SinhVien S) {
		mSo = new String(S.mSo);
		hten = new String(S.hten);
		namSinh = new Date(S.namSinh);
		soHP = S.soHP;
		tenHP = new String[S.tenHP.length];
		diem = new String[S.diem.length];
		for(int i = 0 ; i < soHP; i++) {
			tenHP[i] = new String(S.tenHP[i]);
			diem[i] = new String(S.diem[i]);
		}
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap MSSV");
		mSo = sc.nextLine();
		System.out.println("nhap ho ten");
		hten = sc.nextLine();
		System.out.println("nam sinh");
		namSinh.nhap();
	}
	
	public void in() {
		System.out.println("[" + mSo + "," + hten + "," + namSinh + "]");
		for(int i = 0; i < soHP ; i++) {
			System.out.println(tenHP[i] + ":" + diem[i]);
		}
	}
	public String toString() {
		String t = ("[" + mSo + "," + hten + "," + namSinh + "]" + "\n");
		for(int i = 0; i < soHP ; i++) {
			t += (tenHP[i] + ":" + diem[i] + "\n");
		}
		return t;
	}
	
	public void dangKy(String ten) {
		if( soHP < tenHP.length - 1) {
			tenHP[soHP] = new String(ten);
			soHP++;
		}
		else {
			System.out.println("Khong the them mon hoc");
		}
	}
	
	public void xoaHP(String ten) {
		int i = 0;
		for(; i < soHP ; i++) {
			if(ten.equals(tenHP[i])) break;
		}
		if(i < soHP) {
			for(int j = i; j < soHP ; j++) {
				tenHP[j] = tenHP[j + 1];
				diem[j] = diem[j + 1];
			}
			soHP--;
		}
		
	}
	
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		int i;
		for(i = 0; i < soHP ; i++) {
			System.out.println("Nhap diem mon hoc " + tenHP[i] + ":");
			diem[i] = sc.nextLine();
		}
	}
	
	public float diemTB() {
		float d = 0f;
		for (int i = 0; i < soHP; i++) {
			// dung if else
			if (diem[i].equals("A"))  // equals (0; 1)
				d += 4;
			else if (diem[i].equals("B"))
				d += 3;
			else if (diem[i].equals("C"))
				d += 2;
			else if (diem[i].equals("D"))
				d += 1;
		/** Hoac dung switch case
		 * switch (diem[i]){
			 * 	case ('A'):{
			 * 		d += 4;
			 * 		break;
			 * 	}
			 * 	case ('B'):{
			 * 		d += 3;
			 * 		break;
			 * 	}
			 * 	case ('C'):{
			 * 		d += 2;
			 * 		break;
			 * 	}
			 * 	case ('D'):{
			 * 		d += 1;
			 * 		break;
			 * 	}
		 * }
		 */
		}
		return d / soHP;
	}
	
	public String ten() {
		hten = hten.trim();
		int p = hten.lastIndexOf(" ");
		String ten = hten.substring(p+1);
		//System.out.println("ten la: " + ten);
		return ten;
	}
	
}
