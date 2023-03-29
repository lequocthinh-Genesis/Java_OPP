package buoi5;

import java.util.Scanner;

public class SDHoaDon {

	public static void main(String[] args) {
		HoaDon h1 = new HoaDon();
		h1.nhap();
		h1.in();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so hoa don");
		int n = sc.nextInt();
		HoaDon h[];
		h = new HoaDon[n];
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Nhap hoa don thu " + (i + 1) + " :");
			h[i] = new HoaDon();
			h[i].nhap();
		}
		for(int i = 0 ; i < n ; i++) {
			h[i].in();
			System.out.println("Tong gia tri cua hoa don thu " + (i+1) + " la : " + h[i].layTong() + " Nghin VND.");
		}
//		MyDate d = new MyDate(5,4,2001);
//		String maso = "b1910453";
//		String name = "Thinh";
//		String diachi = "Can Tho";
//		String gioitinh = "Nam";
//		KhachHang k = new KhachHang(maso, name,diachi , gioitinh , d);
//		k.in();
//		ChiTiet c[];
//		c = new ChiTiet[2];
//		int i = 1;
//		for(i = 0 ; i < 2 ; i++) {
//			c[i] = new ChiTiet();
//			c[i].nhap();
//		}
//		
//		String namehh = "Diem A LTHDT";
//		
//		HoaDon h1 = new HoaDon(maso, namehh , d, k, c , i);
//		h1.in();

	}

}
