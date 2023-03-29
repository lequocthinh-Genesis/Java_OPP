package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien{
	private String tkhoan, mkhau, email;
	public SinhVienCNTT() {
		super();
		tkhoan = new String();
		mkhau = new String();
		email = new String();
	}
	
	public SinhVienCNTT(SinhVienCNTT s) {
		super(s);
		tkhoan = new String(s.tkhoan);
		mkhau = new String(s.mkhau);
		email = new String(s.email);
	}
	
	public void nhap(){
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap tai khoan");
		tkhoan = sc.nextLine();
		System.out.println("\nNhap mat khau");
		mkhau = sc.nextLine();
		System.out.println("\nNhap email");
		email = sc.nextLine();
	}
	
	public String toString() {
		return super.toString() + (",tai khoan : ") + tkhoan + (",Email : ") + email;
	}
	
	public void doiMatKhau(String m1) {
		mkhau = new String(m1);
	}
	
	public String getEmail(){
		return email;
	}
	
	public String layTkhoan(){
		return tkhoan;
	}
	
}
