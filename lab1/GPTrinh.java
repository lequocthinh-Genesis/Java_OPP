package buoi1;

import java.util.Scanner;

public class GPTrinh {
	/*
	 * Bài 5 : Viết chương trình giải phương trình bậc 2 trong đó gồm 2 hàm static giải phương trình 
	 * bậc 1 (2 tham số) và giải phương trình bậc 2 (3 tham số).
	 */
	public static void gptb1(double a , double b) {
		if( a == 0) {
			if(b == 0) {
				System.out.print("\nPhuong trinh da cho co vo so nghiem\n");
			}
			else {
				System.out.print("\nPhuong trinh da cho vo nghiem\n");
			}
		}
		else {
			System.out.println("\nPhuong trinh da cho co nghiem x = " + (-b/a));
		}
	}
	public static void gptb2(double a , double b, double c) {
		if( a == 0) gptb1( b , c);
		else {
			double delta = (b * b) - (4 * a * c); 
			if(delta < 0) {
				System.out.println("\nPhuong trinh da cho vo nghiem");
			}
			else if(delta == 0) {
				System.out.println("\nPhuong trinh da cho co nghiem kep x = " + (-b/(2*a)));
			}
			else {
				System.out.println("\nPhuong trinh da cho co hai nghiem phan biet :");
				System.out.println("\nx1 = " + ((-b + delta) / (2*a)));
				System.out.println("\nx2 = " + ((-b - delta) / (2*a)));
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap he so a = ");
		double a = sc.nextDouble();
		System.out.print("Nhap he so b = ");
		double b = sc.nextDouble();
		System.out.print("Nhap he so c = ");
		double c = sc.nextDouble();
		gptb2(a,b,c);
		//thu cho a = 6, b = 8, c = 2 roi so sanh voi bam may
	}

}
