package tw.luke.myproject.homework;

import java.util.Scanner;

public class HwTestEx2_2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n;
		//System.out.print("請輸入要的層數:");
		//int n = scn.nextInt();
		do {
			System.out.print("請輸入要的層數:");
			 n = scn.nextInt();
			for (int i = 1; i <= n; i++) {

				for (int j = (n - i); j >= 1; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}while(n!=0);
	}

}
