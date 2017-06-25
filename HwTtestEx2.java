package tw.luke.myproject.homework;

public class HwTtestEx2 {

	public static void main(String[] args) {
		double temperature = 100;
		int index = 1;
		double Fahrenheit=(temperature*9 / 5 + 32);
		double Celsius=((temperature-32) * 5 / 9);
		if (index == 1) {
			System.out.println("Now Celsius is " + temperature + "°C" + " Conversion Fahrenheit is "
					+ Fahrenheit+ "°F");
		} else if (index == 2) {
			System.out.println("Now Fahrenheit is " + temperature + "°F" + " Conversion Celsius is "
					+ Celsius + "°C");
		} else {
			System.out.println("Input Error Number!!!");
		}
		System.out.println("Finish");
	}

}
