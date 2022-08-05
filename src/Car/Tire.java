package Car;

public class Tire implements Car{

	Car car;
	MyCar mycar = MyCar.getInstance();
	
	int num;
	String tire;
	
	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("1.미쉐린 | 2. 금호 | 3. 한국타이어 | 4. 컨티넨탈");
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
			this.tire = "미쉐린";
			break;
		case 2:
			this.tire = "금호";
			break;
		case 3:
			this.tire = "한국타이어";
			break;
		case 4:
			this.tire = "컨티넨탈";
			break;
			
		}
		car = mycar;
		mycar.setStrTire(tire);
		return car;
	}

}
