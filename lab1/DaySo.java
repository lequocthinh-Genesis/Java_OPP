package buoi1;

import java.util.Scanner;
/*
 * Bài 8 : Viết chương trình thực hiện các công việc sau: 
 *  Nhập vào 1 danh sách các số nguyên.
 *  Nhập vào 1 số nguyên x bất kỳ. Đếm xem trong danh sách có bao nhiêu số x.
 *  Sắp xếp danh sách theo thứ tự tăng dần.
 *  Hiển thị danh sách ra màn hình.
 */

public class DaySo {
	int n;
	int[] ds;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so phan tu :");
		n = sc.nextInt();
		ds = new int[n];
		for(int i = 0 ; i < ds.length ; i++) {
			System.out.println("nhap phan tu thu " + (i + 1));
			ds[i] = sc.nextInt();
		}
	}
	public void in() {
		for(int e : ds ) {
			System.out.print(e + " ");
		}
		System.out.println();
		
	}
	public void sapXep() {
		for(int i = 0; i < ds.length-1 ; i++) {
			for(int j = i + 1 ; j < ds.length ; j++) {
				if(ds[i] > ds[j]) {
					int t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
			}
		}
	}
	public int demsophantu(int x) {
		int c = 0;
		for(int i : ds) {
			if(i == x) {
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		DaySo d = new DaySo();
		d.nhap();
		d.in();
		d.sapXep();
		d.in();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so cam dem x = ");
		int x = sc.nextInt();
		System.out.print("Dem so x xuat hien : " + (d.demsophantu(x)));

	}

}
