package Car;

import java.util.Scanner;

public interface Car {
	
	Scanner sc = new Scanner(System.in);
	
	void showMenu();
	void selectMenu();
	boolean checkInput(String inputTest);
	Car newInstance();
	
	default int tranferInt(String inputTest) {
		if(inputTest.equals("R")) {
			return 7;
		}
		return Integer.parseInt(inputTest);
	}
}
