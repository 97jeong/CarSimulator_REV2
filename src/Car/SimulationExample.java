package Car;

public class SimulationExample {
	public static void main(String[] args) {
		Car car = MyCar.getInstance();
		
		long sTime = System.currentTimeMillis();
		while(MyCar.getInstance().isOn) {
			car.showMenu();
			car.selectMenu();
			if(car.newInstance() != null) {
				car = changeInstance(car.newInstance());	
			}
		}
		long eTime = System.currentTimeMillis();
		int oTime = (int)((eTime - sTime) / 1000);
		System.out.print("운행시간: " + oTime + "초   ");
		System.out.println("안녕히 계세요");
	}
	
	public static Car changeInstance(Car newInstance) {
		Car car = newInstance;
		return car;
	}
}
