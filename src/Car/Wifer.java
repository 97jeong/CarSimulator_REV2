package Car;

public class Wifer implements Car{
	
	Car car;
	MyCar mycar = MyCar.getInstance();
	
	int num;
	String wifer;
	
	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. 와이펴 켜기 | 2. 와이퍼 끄기");
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
			return true;
		}
		return false;
	}

	@Override
	public Car newInstance() {
		// TODO Auto-generated method stub
		switch(num) {
		case 1:
			this.wifer = "와이퍼 On";
			break;
		case 2:
			this.wifer = "와이퍼 Off";
			break;
			
		}
		car = mycar;
		mycar.setStrWifer(wifer);
		return car;
	}
	
}
