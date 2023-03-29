package buoi3;

import buoi2.Diem;

public class SDDoanThang {
	public static void main(String[] args) {
		Diem a = new Diem(5,3);
		Diem b = new Diem(20,35);
		DoanThang AB = new DoanThang(a,b);
		AB.tinhTien(5, 3);
		DoanThang CD = new DoanThang();
		CD.nhap();
		System.out.println("Do dai doan thang CD la : " + CD.doDai());
		System.out.println("Goc cua CD voi truc hoanh la : " + CD.gocDoanThangVoiTrucHoanh());
		
		

	}
}
