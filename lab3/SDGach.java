package buoi3;

import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gach ds[];
		System.out.println("Nhap vao so phan tu cua danh sach Gach :");
		int n = sc.nextInt();
		ds = new Gach[n];
		int i;
		for( i = 0; i < n ; i++) {
			ds[i] = new Gach();
		}
		for(i = 0; i < n ; i++) {
			System.out.println("Nhap vao thong tin loai gach thu " + (i + 1));
			ds[i].nhapHopGach();
		}
		for(i = 0; i < n ; i++) {
			System.out.println("Thong tin loai gach thu " + (i + 1));
			ds[i].hienThi();
		}
		
	}

}
