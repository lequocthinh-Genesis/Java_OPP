package buoi3;

import java.util.Scanner;

public class Gach {
	private String maSo,mau;
	private int soLuong,chieuDai,chieuNgang;
	private long giaBan;
	
	public Gach() {
		maSo = new String();
		mau = new String();
		soLuong = 0;
		chieuDai = 0;
		chieuNgang = 0;
		giaBan = 0;
	}
	
	public Gach(String maSo, String mau, int soLuongGach, int chieuDaiGach, int chieuRongGach, long giaBan) {
		this.maSo = maSo;
		this.mau = mau;
		this.soLuong = soLuongGach;
		this.chieuDai = chieuDaiGach;
		this.chieuNgang = chieuRongGach;
		this.giaBan = giaBan;
	}
	
	public Gach(Gach g) {
		maSo = new String(g.maSo);
		mau = new String(g.mau);
		soLuong = g.soLuong;
		chieuDai = g.chieuDai;
		chieuNgang = g.chieuNgang;
		giaBan = g.giaBan;
	}
	
	public void nhapHopGach() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so gach :");
		maSo = sc.nextLine();
		System.out.println("Nhap mau gach :");
		mau = sc.nextLine();
		System.out.println("Nhap so luong vien gach trong hop :");
		soLuong = sc.nextInt();
		System.out.println("Nhap chieu dai cua vien gach :");
		chieuDai = sc.nextInt();
		System.out.println("Nhap chieu ngang cua vien gach :");
		chieuNgang = sc.nextInt();
		System.out.println("Nhap gia ban cua hop gach :");
		giaBan = sc.nextLong();
	}
	
	public void hienThi() {
		System.out.println("Ma so gach la : " + maSo);
		System.out.println("Mau cua gach la : " + mau);
		System.out.println("So luong vien gach trong hop la : " + soLuong);
		System.out.println("Chieu dai cua vien gach la : " + chieuDai + " cm");
		System.out.println("Chieu ngang cua vien  gach la : " + chieuNgang + " cm");
		System.out.println("gia ban cua hop gach la : " + giaBan);
	}

	public String toString() {
		return "Ma so : " + maSo + ";" + "mau : " + mau + ";" + "so luong : " + soLuong + ";" + "Dai : " + chieuDai + "cm" + ";" + "Ngang : " + "chieuNgang" + ";" + "gia : " + giaBan;
	}
	public float giaBanLe() {
		float gia = (giaBan / soLuong) + (giaBan / soLuong)*(20/100) ;
		return gia;
	}
	
	public float dienTichNen() {
		return chieuDai * chieuNgang * soLuong;
	}
	
	public int soLuongHop(int D, int N) {
		int soLuongHop =  (int) (D*N / (chieuDai*chieuNgang))/ soLuong;
		return soLuongHop;
	}
	
	
	
	
	
	
	
	
	

}
