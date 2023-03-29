package buoi5;

import java.util.Scanner;

public class KhachHang {
	private String maSo,hoTen,diaChi,gioiTinh;
	private MyDate ngaySinh;
	
	public KhachHang() {
		maSo = new String();
		hoTen = new String();
		diaChi = new String();
		gioiTinh = new String();
		ngaySinh = new MyDate();
	}
	public KhachHang(String maSo, String hoTen, String diaChi , String gioiTinh ,MyDate ngaySinh) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh; 
	}
		
	public KhachHang(KhachHang k) {
		maSo = new String(k.maSo);
		hoTen = new String(k.hoTen);
		diaChi = new String(k.diaChi);
		gioiTinh = new String(k.gioiTinh);
		ngaySinh = new MyDate(k.ngaySinh);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap ma so cua khac hang :");
		maSo = sc.nextLine();
		System.out.println("Hay nhap ho va ten cua khach hang :");
		hoTen = sc.nextLine();
		System.out.println("Hay nhap dia chi cua khac hang :");
		diaChi = sc.nextLine();
		System.out.println("Hay nhap gioi tinh cua khac hang :");
		gioiTinh = sc.nextLine();
		System.out.println("Hay nhap ngay thang nam sinh cua khach hang:");
		ngaySinh.nhap();
	}
	
	public void in() {
		System.out.println("Ma so : " + maSo);
		System.out.println("Ho va ten khach hang : " + hoTen);
		System.out.println("Dia chi : " + diaChi);
		System.out.println("Gioi Tinh : " + gioiTinh);
		System.out.print("Ngay sinh : ");
		ngaySinh.in();
	}
	
}
