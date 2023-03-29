package buoi5;

import java.util.Scanner;

public class HoaDon {
	private String maSo,tieuDe;
	private MyDate ngayLap;
	private KhachHang k;
	private ChiTiet c[];
	private int n; // so luong chi tiet tren
	public HoaDon() {
		maSo = new String();
		tieuDe = new String();
		ngayLap = new MyDate();
		k = new KhachHang();
		c = new ChiTiet[50];
		n = 0;
	}
	
	public HoaDon(String maSo, String tieuDe , MyDate ngayLap, KhachHang k, ChiTiet c[] , int n) {
		this.maSo = maSo;
		this.tieuDe = tieuDe;
		this.ngayLap = ngayLap;
		this.k = k;
		this.c = c;
		this.n = n;
	}
	
	public HoaDon(HoaDon h) {
		maSo = new String(h.maSo);
		tieuDe = new String(h.tieuDe);
		ngayLap = new MyDate(h.ngayLap);
		k = new KhachHang(h.k);
		n = h.n;
		for(int i = 0; i < n ; i++) {
			c[i] = new ChiTiet(h.c[i]);
		}
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so hoa don");
		maSo = sc.nextLine();
		System.out.println("Nhap tieu de hoa don");
		tieuDe = sc.nextLine();
		System.out.println("Nhap thong tin khach hang");
		k.nhap();
		System.out.println("Nhap ngay lap don");
		ngayLap.nhap();
		System.out.println("Nhap so chi tiet hoa don");
		n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			c[i] = new ChiTiet();
			c[i].nhap();
		}
	}
	
	public void in() {
		System.out.println("Hoa don ban vua nhap la");
		System.out.println("Ma so hoa don : " + maSo);
		System.out.println("Tieu de hoa don : " + tieuDe);
		System.out.print("Ngay lap don : ");
		ngayLap.in();
		System.out.println("Thong tin khach hang");
		k.in();
		System.out.println("Chi tiet hoa don : ");
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Hang hoa thu " + (i + 1));
			c[i].in();
		}
	}
	
	public int layTong() {
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			sum += c[i].laySoLuong() * c[i].layDonGia();
		}
		return sum;
	}
}
