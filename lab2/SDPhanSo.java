package buoi2;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSo a = new PhanSo(3,7);
		PhanSo b = new PhanSo(4,9);
		a.hienThi();
		b.hienThi();
		
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		x.nhapPhanSo();
		x = x.donGianPhanSo(x);
		PhanSo z = new PhanSo();
		z = x.giaTriNghichDao();
		z = z.donGianPhanSo(z);
		System.out.println("Gia tri nghich dao cua x la : ");
		z.hienThi();
		System.out.println("Gia tri ban dau cua x la : ");
		x.hienThi();
		y.nhapPhanSo();
		y.hienThi();
		
		System.out.print("Tong cua 2 phan so x + y = ");
		PhanSo sum = new PhanSo();
		sum = x.cong(y);
		sum = sum.donGianPhanSo(sum);
		sum.hienThi();
		//danh sach phan so
		PhanSo ds[];
		System.out.println("Nhap vao so phan tu cua danh sach phan so :");
		int n = sc.nextInt();
		ds = new PhanSo[n];
		for(int i = 0; i < n ; i++) {
			ds[i] = new PhanSo();
		}
		for(int i = 0; i < n ; i++) {
			System.out.println("Nhap vao phan so thu " + (i+1));
			ds[i].nhapPhanSo();
		}
		System.out.println("Cac phan tu cua danh sach phan so :");
		for(int i = 0; i < n ; i++) {
			ds[i] = ds[i].donGianPhanSo(ds[i]);
			ds[i].hienThi();
		}
		//tinh tong cac phan tu cua danh sach phan so
		PhanSo tong = new PhanSo(0,1);
		for(int i = 0; i < n ; i++) {
			tong = tong.cong(ds[i]);
		}
		System.out.println("Tong cac phan so trong danh sach la :");
		tong = tong.donGianPhanSo(tong);
		tong.hienThi();
		//tim gia tri lon nhat trong danh sach phan so
		PhanSo max = new PhanSo();
		max = ds[0];
		for(int i = 0; i < n  ; i++) {
			if(  ds[i].giaTriThuc() > max.giaTriThuc() ) {
				max = ds[i];
			}
		}
		System.out.println("Gia tri lon nhat cua danh sach phan so la :");
		max.hienThi();
		//sap xep danh sach phan so
		PhanSo swap = new PhanSo();
		swap = ds[0];
		for(int i = 0; i < n - 1 ; i++) {
			for(int j = i+1 ; j < n ; j++) {
				if( ds[i].giaTriThuc() > ds[j].giaTriThuc()) {
					swap = ds[i];
					ds[i] = ds[j];
					ds[j] = swap;
				}
			}
		}
		System.out.println("Danh sach phan so theo thu tu tang dan la :");
		for(int i = 0; i < n ; i++) {
			ds[i].hienThi();
		}
	}
}
