package buoi1;

import java.util.Scanner;

/*
 * Bài 7 : Viết chương trình nhập vào 1 chuỗi họ tên. Hiển thị ra tên của họ tên đó. Nên thiết kế 
 * chương trình gồm 1 hàm dùng để tách tên và hàm main.
 */
public class HoTen {
	public static void ten(String a) {
		a = a.trim();
		int p = a.lastIndexOf("/");
		String ten = a.substring(p+1);
		System.out.println("ten la: " + ten);
		 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nHay nhap ho va ten : ");
		String a = sc.nextLine();
		System.out.println("\nHo va ten vua nhap la :" + a);
		ten(a);
		
//		String a = "100";
//		int i  = Integer.parseInt(a);
//		System.out.println(i); 

	}

}
