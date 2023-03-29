package buoi3;

import buoi2.Diem;

public class DoanThang {
	private Diem d1,d2;
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	
	public DoanThang(Diem a1, Diem b1) {
		d1 = new Diem(a1);
		d2 = new Diem(b1);
	}
	
	public DoanThang(int ax, int ay,int bx, int by ) {
		d1 = new Diem(ax,ay);
		d2 = new Diem(bx,by);
	}
	
	public DoanThang(DoanThang d) {
		d1 = new Diem(d.d1);
		d2 = new Diem(d.d2);
	}
	
	public void nhap() {
		System.out.println("Nhap toa do a :");
		d1.nhapDiem();
		System.out.println("Nhap toa do b :");
		d2.nhapDiem();
	}
	
	public void in() {
		System.out.println("[" + d1 + "," + d2 + "]");
	}
	
	public String toString() {
		return("[" + d1 + "," + d2 + "]");
	}

	public void tinhTien(int dx , int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	
	public Diem trungDiem() {
		return new Diem((d1.giaTriX() + d2.giaTriY())/2, ((d1.giaTriX() + d2.giaTriY())/2));
	}
	
	public double doDai() {
		return d1.khoangCach(d2);
	}
	
	public double gocDoanThangVoiTrucHoanh() {
		Diem a = new Diem(d1.giaTriX() , 0);
		Diem b = new Diem(d2.giaTriX() , 0);
		double AC = a.khoangCach(b);
		double AB = d1.khoangCach(d2);
		return Math.toDegrees(Math.acos(AC/AB));
	}
}
