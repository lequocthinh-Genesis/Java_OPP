package buoi4;

public class SDDiemMau {
	public static void main(String[] args) {
		DiemMau a = new DiemMau(5,10,"trang");
		a.in();
		DiemMau b = new DiemMau();
		b.nhap();
		b.in();
		b.doiDiem(10, 8);
		System.out.println("Toa do diem b sau khi doi");
		b.in();
		b.ganMau("vang");
		System.out.println("Mau cua diem b sau khi gan mau");
		b.in();
		
	}
}
