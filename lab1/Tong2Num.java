package buoi1;

import java.util.Scanner;

public class Tong2Num {
	/*
	 * Bài 4 : Viết chương trình nhập vào 2 số nguyên a và b. Tính tổng và hiển thị ra màn hình. Nếu 
		số nhập vào không đúng định dạng thì hiển thị thông báo lỗi, yêu cầu nhập lại.
	 */

	public int nhap(){
		Scanner sc = new Scanner(System.in);
		String s;
		int n;
		do {
			System.out.print("\nNhap 1 so nguyen:");
			s = sc.nextLine();
			try{ n = Integer.parseInt(s); }
			catch( NumberFormatException e) {
				n = Integer.MAX_VALUE;
				System.out.print("\nBan nhap sai dinh dang, nhap lai ");
			}
		}
		while(n == Integer.MAX_VALUE);
		return n;
	}
	public static void main(String[] args){
		Tong2Num t = new Tong2Num();
		int a = t.nhap();
		int b = t.nhap();
		System.out.print("Tong = " + (a + b));
	}
}
