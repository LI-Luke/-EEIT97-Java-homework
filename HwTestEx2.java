package tw.luke.myproject.homework;

import java.util.Scanner;

public class HwTestEx2 {

	public static void main(String[] args) {
		int a = 0;
		Scanner scn = new Scanner(System.in);
		do {
			System.out.print("請輸入要印出的*數量：");
			a = scn.nextInt();
			for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();

			}
			if (a != 0) {
				for (int k = 1; k <= a + 1; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
			for (int i = a; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();

			}
		} while (a != 0);

	}

}
