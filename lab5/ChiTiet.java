package buoi5;

import java.util.Scanner;

public class ChiTiet {
	private HangHoa h;
	private int soLuong, donGia;
	public ChiTiet() {
		h = new HangHoa();
		soLuong = 0;
		donGia = 0;
	}
	public ChiTiet(HangHoa h, int soLuong, int donGia) {
		this.h = h;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
		
	public ChiTiet(ChiTiet c) {
		h = new HangHoa(c.h);
		soLuong = c.soLuong;
		donGia = c.donGia;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap chi tiet hang hoa :");
		h.nhap();
		System.out.println("Hay nhap so luong hang hoa ");
		soLuong = sc.nextInt();
		System.out.println("Hay nhap gia cua hang hoa");
		donGia = sc.nextInt();
	}
	
	public void in() {
		System.out.println("Chi tiet hang hoa :");
		h.in();
		System.out.println("So luong hang hoa : " + soLuong);
		System.out.println("Gia cua hang hoa : " + donGia);
	}
	
	public int laySoLuong() {
		return soLuong;
	}
	
	public int layDonGia() {
		return donGia;
	}
}
