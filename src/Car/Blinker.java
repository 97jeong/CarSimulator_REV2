package Car;

public class Blinker implements Car{

	Car car;
	MyCar mycar = MyCar.getInstance();
	
	int num;
	String blinker;
	
	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("1.왼쪽깜박이 켜기 | 2. 오른쪽깜박이 켜기 | 3. 비상깜박이 켜기 | 4. 깜박이 끄기");
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
			return true;
		}
		return false;
	}

	@Override
	public Car newInstance() {
		// TODO Auto-generated method stub
		switch(num) {
		case 1:
			this.blinker = "왼쪽깜박이 On";
			break;
		case 2:
			this.blinker = "오른쪽깜박이 On";
			break;
		case 3:
			this.blinker = "비상깜박이 On";
			break;
		case 4:
			this.blinker = "깜박이 Off";
			break;
		}
		
		car = mycar;
		mycar.setStrBlinker(blinker);
		return car;
	}

}
