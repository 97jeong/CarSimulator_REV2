package Car;

public class WindowControl implements Car{
	Car car;
	MyCar mycar = MyCar.getInstance();
	
	int num;
	boolean isButton;
	boolean isOpen;
	String strWindows;
	
	public WindowControl() {
		this.isButton = false;
		this.isOpen = false;
		this.strWindows = "Closed";
	}
	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		if(isButton != true) {
			System.out.println("1. 창문 열기 | 2. 창문 닫기");	
		} else {
			System.out.println("1. 운전석 | 2. 보조석 | 3. 뒷창문 왼쪽 | 4. 뒷창문 오른쪽");
			selectMenu();
		}
	}
	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		System.out.print("선택> ");
		String inputTest = sc.nextLine();
		if(checkInput(inputTest) == true) {
			this.num  = tranferInt(inputTest);
			if(isButton != true) {
				isButton = true;
				showMenu();
			}
		} else {
			System.out.println("Input error! Retry");
			showMenu();
			selectMenu();
		}
	}
	@Override
	public boolean checkInput(String inputTest) {
		// TODO Auto-generated method stub
		if(isButton != true) {
			switch(inputTest) {
			case "1":
				this.isOpen = true;
				return true;
			case "2":
				this.isOpen = false;
				return true;
			}
			return false;
			
		} else {
			switch(inputTest) {
			case "1":
				
			case "2":
			case "3":
			case "4":
				return true;
			}
			return false;
		}
	}
	@Override
	public Car newInstance() {
		// TODO Auto-generated method stub
		car = mycar;
		if(isOpen == true) {
			this.strWindows = "Opened";
		} else {
			this.strWindows = "Closed";
		}
		mycar.setStrWindows(strWindows, num - 1);
		return car;
	}
	
}
