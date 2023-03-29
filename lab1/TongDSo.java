package buoi1;

public class TongDSo {
	/*
	 * Bài 3 : Viết chương trình nhận vào đối số dòng lệnh là 1 danh sách các số thực. Hiển thị số lớn 
nhất và tổng của các số thực có trong danh sách đó. Chú ý loại trừ các số thực nhập vào không 
đúng định dạng.
	 */

	public static void main(String[] args) {
		// args = {"7.5", "2.3", "20a1", "50"};
		// >        7.5    2.3      0     50.0
		double tong = 0, n, max = Double.MIN_VALUE;
		for(String e : args) {
			try { n = Double.parseDouble(e);}
			catch(NumberFormatException ex) { n = 0; }
			tong += n;
			if(max < n) max = n;
		}
		System.out.print("\n Tong = " + tong + ", Max = " + max);

	}

}
