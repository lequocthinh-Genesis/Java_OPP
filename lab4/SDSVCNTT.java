package buoi4;

import java.util.Scanner;

public class SDSVCNTT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int i;
		System.out.println("nhap so sinh vien");
		n = sc.nextInt();
		SinhVienCNTT ds[] = new SinhVienCNTT[n];
		for(i = 0 ; i < n ; i++) {
			ds[i] = new SinhVienCNTT();
			System.out.println("nhap sinh vien thu " + (i + 1));
			ds[i].nhap();
		}
		
		System.out.println("nhap vao dia chi email");
		String email  ;
		sc.nextLine();
		email = sc.nextLine();
		System.out.println("\n email :" + email);
		for(SinhVienCNTT S : ds) {
			if( S.getEmail().equals(email)) {
				//ds[i].toString()
				System.out.println("\nTai khoan sinh vien can tim");
				System.out.println("\n" + S.layTkhoan() + " ,Diem TB : " + S.diemTB());
				break;
				//ds[i].in();
			}
		}
	}
}
