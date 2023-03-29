package buoi5;

import java.util.Scanner;

public class KhachHangVIP extends KhachHang{
	private float tiLe;
	private MyDate ngayBD;
	public KhachHangVIP() {
		super();
		tiLe = 0.1f;
		ngayBD = new MyDate();
	}
	
	public KhachHangVIP(KhachHangVIP k) {
		super((KhachHang)k);
		tiLe = k.tiLe;
		ngayBD = new MyDate(k.ngayBD);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap thong tin cua khach hang VIP :");
		super.nhap();
		System.out.println("Nhap ti le :");
		tiLe = sc.nextFloat();
		System.out.println("Nhap ngay bat dau la thanh vien VIP :");
		ngayBD.nhap();
	}
	
	public void in() {
		System.out.println("Thong tin cua khach hang VIP :");
		super.in();
		System.out.println("Ti le VIP :" + tiLe);
		System.out.println("Ngay bat dau la thanh vien VIP :");
		ngayBD.in();
	}
	public float layTiLe() {
		return tiLe;
	}
	public static void main(String[] args) {
		KhachHangVIP k = new KhachHangVIP();
		k.nhap();
		k.in();
		KhachHangVIP b = new KhachHangVIP(k);
		System.out.println("Khach hang da sao chep la :");
		b.in();
	}
}
