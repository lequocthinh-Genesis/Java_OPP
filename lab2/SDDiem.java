package buoi2;

import java.util.Scanner;

public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		//System.out.println("hoanh do cua a : " + a.giaTriX());
		A.hienThi();
		Diem B = new Diem();
		B.nhapDiem();
		B.hienThi();
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
		C.hienThi();
		System.out.println("BO = " + B.khoangCach());
		System.out.println("AB = " + A.khoangCach(B));
	}
}
