package Car;

public class MyCar implements Car{
	
	private static final MyCar mycar = new MyCar();
	
	public int num;
	Car car;
	boolean isOn;
	
	int speed;
	String strTire;
	String strGear;
	String strWifer;
	String strBlinker;
	String[] strWindows = new String[4];
	
	
	private MyCar() {
		this.isOn = true;
		this.num = 0;
		this.speed = 0;
		this.strTire = "미쉐린";
		this.strGear = "P";
		this.strWifer = "와이퍼 Off";
		this.strBlinker = "깜빡이 Off";
		for(int i = 0; i < strWindows.length; i++) {
			strWindows[i] = "Closed";
		}
	}
	
	public static MyCar getInstance(){
        return mycar;
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
	public Car newInstance() {
		// TODO Auto-generated method stub
		switch(num) {
		case 1:
			this.car = new Gear();
			return car;
		case 2:
			showSpeed();
			break;
		case 3:
			this.car = new Tire();
			return car;
		case 4:
			this.car = new WindowControl();
			return car;
		case 5:
			this.car = new Wifer();
			return car;
		case 6:
			this.car = new Blinker();
			return car;
		case 7:
			showInfo();
			break;
		case 8:
			this.speed = 0;
			this.strGear = "P";
			break;
			
		case 9:
			this.isOn = false;
			break;
			
		}
		return null;
	}

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("1.기어변속 | 2. 현재속도 | 3. 타이어교체 | 4. 창문 | 5. 와이퍼선택 | 6. 깜박이선택 | 7. 현재상태 | 8. 급브레이크 | 9. 종료");
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
		case "7":
		case "8":
		case "9":
			return true;
		}
		return false;
	}
	
	public void showSpeed() {
		if(this.strGear.equals("R")) {
			System.out.println("현재속도: " + this.strGear);
		} else if(this.strGear.equals("P")) {
			System.out.println("현재속도: " + this.speed);
		} else {
			System.out.println("현재속도: " + this.speed + "km");	
		}
	}
	public void showInfo() {
		System.out.println("------------- MyCar Infomation ------------------");
		showSpeed();
		System.out.println("타이어 종류: " + this.strTire);
		for(int i = 0; i < strWindows.length; i++) {
			switch(i) {
			case 0:
				System.out.println("운전석 창문: " + this.strWindows[i]);
				break;
			case 1:
				System.out.println("보조석 창문: " + this.strWindows[i]);
				break;
			case 2:
				System.out.println("뒷창문 왼쪽: " + this.strWindows[i]);
				break;
			case 3:
				System.out.println("튓창문 오른쪽: " + this.strWindows[i]);
				break;
			}
		}
		System.out.println("기어 변속 상태: " + this.strGear);
		System.out.println("와이퍼 상태: " + this.strWifer);
		System.out.println("깜박이 상태: " + this.strBlinker);
	}
	
	public void setStrTire(String strTire) {
		this.strTire = strTire;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setStrGear(String strGear) {
		this.strGear = strGear;
	}

	public void setStrWifer(String strWifer) {
		this.strWifer = strWifer;
	}

	public void setStrBlinker(String strBlinker) {
		this.strBlinker = strBlinker;
	}

	public void setStrWindows(String strWindows, int index) {
		this.strWindows[index] = strWindows;
	}

	public boolean isOn() {
		return isOn;
	}

}
