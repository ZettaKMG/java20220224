package chap08.book.example.s080504;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);	// 자동 타입 변환: Vehicle = bus;
		driver.drive(taxi);	// 자동 타입 변환: Vehicle = taxi;
	}
}
