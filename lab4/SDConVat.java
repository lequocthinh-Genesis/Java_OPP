package buoi4;

import java.util.Scanner;

public class SDConVat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConVat b = new Bo();
		ConVat ds[];
		System.out.println("Nhap so dong vat :");
		int n = sc.nextInt();
		ds = new ConVat[n];
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Ban muon nhap dong vat nao ?");
			System.out.println("1:Bo\t2:Heo\t3:De\t4:Ga");
			int c = sc.nextInt();
			if(c == 1) ds[i] = new Bo();
			else if(c == 2) ds[i] = new Heo();
			else if(c == 3) ds[i] = new De();
			else ds[i] = new Ga();
			ds[i].nhap();
		}
		for(ConVat d : ds) {
			System.out.println(d);
			System.out.println("Tieng keu cua con vat");
			d.keu();
		}
	}

}
