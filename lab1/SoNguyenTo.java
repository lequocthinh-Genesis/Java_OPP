package buoi1;

import java.util.Scanner;

/*
 * Bài 6 : Viết chương trình nhập vào 1 số nguyên. Kiểm tra xem số đó có phải là số nguyên tố 
 * không? Hiển thị số nguyên đó ra màn hình dưới dạng số nhị phân.
 */
public class SoNguyenTo {
	public static void kiemTra(int x){
		if( x < 2) {
			System.out.println(x + "khong phai la so nguyen to ");
		}
		else {
			int mark = 1;
			for(int i = 2 ; i <= Math.sqrt(x) ; i++) {
				if(x % i == 0) {
					mark = 0;
					break;
				}
			}
			if(mark == 1) {
				System.out.println(x + " la so nguyen to");
			}
			else {
				System.out.println(x + " khong la so nguyen to");
			}
		}
	}
	public static void doiNhiPhan(int x) {
		int t = x;
		long rem,i=1,sum=0;
	    do
	    {
	        rem=x%2;
	        sum=sum + (i*rem);
	        x=x/2;
	        i=i*10;
	    }while(x>0);
	    System.out.println("dang nhi phan cua " + t + " la : " + sum);
	    
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		kiemTra(x);
		doiNhiPhan(x);

	}

}
