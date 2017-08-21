package tw.luke.myproject.homework;
import java.util.Scanner;
/*題目:
 宣告兩個變數，溫度和index
 給使用者輸入溫度及index
 當index=1時，°C->°F
 當index=2時，°F->°C
 */
public class HwTtestEx1 {
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("==========The is Celsius and Fahrenheit conversion program==========");//讓使用者瞭解這是攝氏和華氏的換算程式
		System.out.print("Please input Number ");
		System.out.print("(input  1 is Celsius or 2 is Fahrenheits):");
		int index = scn.nextInt();//讓使用者自行輸入 1 or 2的值，輸入1=攝氏溫度、輸入2=攝氏溫度
		double temperature =0;//宣告一個溫度的變數
		if (index == 1)//如果使用者輸入1就會進入攝氏轉換華氏的程式碼
		{
			System.out.print("Please input  Celsius temperature:");
			temperature = scn.nextDouble();//讓使用者自行輸入攝氏溫度
			double Fahrenheit = (temperature * 9 / 5 + 32);//宣告一個華氏變數，讓它代入攝氏換華氏公式。
			System.out.println("Now Celsius is " + temperature + "°C" + " Conversion Fahrenheit is " + Fahrenheit + "°F");//印出使用者輸入的攝氏溫度，及轉換成華氏溫度。
		} else if (index == 2)//如果使用者輸入2就會進入華氏轉換攝氏的程式碼
		{
			System.out.print("Please input  Fahrenheits temperature:");
			temperature = scn.nextDouble();//讓使用者自行輸入華氏溫度
			double Celsius = ((temperature - 32) * 5 / 9);//宣告一個攝氏變數，讓它代入華氏換攝氏公式。
			System.out.println("Now Fahrenheit is " + temperature + "°F" + " Conversion Celsius is " + Celsius + "°C");//印出使用者輸入的華氏溫度，及轉換成攝氏溫度。
		} else//如果使用者輸入非1或2的數字就會執行底下程式碼
		{
			System.out.println("Input Error Number!!!");
		}
		System.out.println("Finish");
	}
}
