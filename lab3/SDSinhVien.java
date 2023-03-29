package buoi3;

import java.util.Scanner;

public class SDSinhVien {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		SinhVien a = new SinhVien();
//		a.nhap();
//		a.dangKy("LTHDT");
//		a.in();
//		a.nhapDiem();
//		System.out.println("Diem TB : " + a.diemTB());
		
		int n;
		System.out.print("\nNhap so sinh vien: ");
		n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		int j;
		for(int i = 0 ; i < n ; i++) {
			ds[i] = new SinhVien();
			System.out.println("\nNhap sinh vien thu " + (i+1) + ":");
			ds[i].nhap();
			System.out.printf("\nNhap so mon hoc can them cua hoc ki nay :\n");
			int number = sc.nextInt();
			sc.nextLine();
			for(j = 1 ; j <= number ; j++){
				System.out.println("\nNhap mon hoc thu " + j + ":");
				String monhoc = sc.nextLine();
				ds[i].dangKy(monhoc);
			}
			ds[i].nhapDiem();
		}
		System.out.println("Danh sach sinh vien vua nhap:");
		for(int i = 0; i< n;i++)
			System.out.println("Sinh vien thu " + (i + 1) + ":" + "\n" + ds[i].toString() + "diem TB: " + ds[i].diemTB());	

		System.out.println("Danh sach sinh vien bi canh bao hoc vu :");
		for(int i = 0 ; i < n ; i++ ) {
			if( ds[i].diemTB() <= 1) {
				ds[i].in();
			}
		}
		
		System.out.println("Sinh vien co diem trung binh cao nhat la :");
		int m = 0;
		float num = 0;
		for(int i = 0 ; i < n ; i++ ) {
			if( ds[i].diemTB() > num) {
				num = ds[i].diemTB();
				m = i;
			}
		}
		//ds[k].in();
		ds[m].in();
		
		//sap xep danh sach sinh vien theo thu tu alphabet
		System.out.println("Danh sach sinh vien theo thu tu la :");
		for(int i = 0; i < n - 1 ;  i++) {
			for(int  t  = i+1 ; t < n ; t++) {
				if(ds[i].ten().compareTo(ds[t].ten()) > 0) {
					SinhVien b = ds[i];
					ds[i] = ds[t];
					ds[t] = b;
				}
			}
		}
		for(int i = 0 ;  i < n ; i++) {
			ds[i].in();
		}
		
	}
}
