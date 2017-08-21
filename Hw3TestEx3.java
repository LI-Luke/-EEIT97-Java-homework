package tw.luke.myproject.homework;

public class Hw3TestEx3 {
	int[] number1 = new int[100000];
	int[] number2 = new int[42];
	int[] count = new int[42];

	public void produceNumber() {
		for (int i = 0; i < number1.length; i++) {
			int c = (int) (Math.random() * 42) + 1;
			number1[i] = c;
			// System.out.printf("number[%d]=%d\n", i, number1[i]);
		}
		for (int i = 0; i < number2.length; i++) {
			this.number2[i] = i + 1;
			// System.out.printf("number2[%d]=%d\n", i,number2[i]);
		}
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < number1.length; j++) {
				if (number2[i] == number1[j]) {
					count[i]++;
					// System.out.printf("%d count has %d\n", (number2[i]),
					// count[i]);
				}
			}
		}
		/*
		 * int sum=0; for(int i=0;i < count.length; i++){
		 * System.out.printf("%d count has %d\n", (number2[i]), count[i]);
		 * sum=sum+count[i]; }
		 */
		// System.out.printf("sum=%d\n", sum);
		for (int i = 0; i < count.length - 1; i++) {
			for (int j = i + 1; j < count.length; j++) {
				int d = 0;
				int k = 0;
				if (count[i] < count[j]) {
					d = count[i];
					count[i] = count[j];
					count[j] = d;
					k = number2[i];
					number2[i] = number2[j];
					number2[j] = k;
				}
				if (count[i] == count[j]) {
					if (number2[i] < number2[j]) {
						d = number2[i];
						number2[i] = number2[j];
						number2[j] = d;
					}
				}
			}
		}
		for (int k = 0; k < number2.length; k++) {
			System.out.printf("次數＝%d number=%d\n", count[k], number2[k]);
		}
	}

	public void sortNumber() {

	}

	public void print() {
		for (int k = 0; k < number2.length; k++) {
			System.out.printf("次數＝%d number=%d\n", count[k], number2[k]);
		}
	}

	public static void main(String[] args) {
		Hw3TestEx3 test = new Hw3TestEx3();
		System.out.println("原始樣子＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
		test.produceNumber();
		System.out.println("整理之後的樣子＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
		test.print();
	}

}
