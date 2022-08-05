package Car;

public class Gear implements Car{

	Car car;
	MyCar mycar = MyCar.getInstance();
	
	int num;
	int speed;
	String strGear;
	String strReverse;
	
	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. 1단 | 2. 2단 | 3. 3단 | 4. 4단 | 5. 5단 | 6. 6단 | R. 후진");
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		System.out.print("선택> ");
		String inputTest = sc.nextLine();
		if(checkInput(inputTest) == true) {
			this.num  = tranferInt(inputTest);
		} else {
			System.out.println("Input error! Retry");
			showMenu();
			selectMenu();
		}
	}

	@Override
	public boolean checkInput(String inputTest) {
		// TODO Auto-generated method stub
		switch(inputTest) {
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "R":
			return true;
		}
		return false;
	}

	@Override
	public Car newInstance() {
		// TODO Auto-generated method stub
		switch(num) {
		case 1:
			strGear = "1단";
			speed = (int)(Math.random() * 10) + 10;
			break;
		case 2:
			strGear = "2단";
			speed = (int)(Math.random() * 10) + 20;
			break;
		case 3:
			strGear = "3단";
			speed = (int)(Math.random() * 10) + 30;
			break;
		case 4:
			strGear = "4단";
			speed = (int)(Math.random() * 10) + 40;
			break;
		case 5:
			strGear = "5단";
			speed = (int)(Math.random() * 10) + 50;
			break;
		case 6:
			strGear = "6단";
			speed = (int)(Math.random() * 10) + 100;
			break;
		case 7:
			strGear = "R";
			
			break;
		}
		car = mycar;
		mycar.setStrGear(strGear);
		mycar.setSpeed(speed);
		return car;
	}

}
