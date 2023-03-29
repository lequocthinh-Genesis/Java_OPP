package buoi5;

import java.util.Scanner;

public class HangHoa {
	private String maSo,ten,nsx;
	public HangHoa() {
		maSo = new String();
		ten = new String();
		nsx = new String();
	}
	public HangHoa(String maSo, String ten, String nsx) {
		this.maSo = maSo;
		this.ten = ten;
		this.nsx = nsx;
	}
	public HangHoa(HangHoa h) {
		maSo = new String(h.maSo);
		ten = new String(h.ten);
		nsx = new String(h.nsx);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap ma so hang hoa :");
		maSo = sc.nextLine();
		System.out.println("Hay nhap ten hang hoa :");
		ten = sc.nextLine();
		System.out.println("Hay nhap nha san xuat hang hoa :");
		nsx = sc.nextLine();
	}
	
	public void in() {
		System.out.println("Ma so hang hoa : " + maSo);
		System.out.println("Ten hang hoa : " + ten);
		System.out.println("Nha san xuat : " + nsx);
	}
	
}
