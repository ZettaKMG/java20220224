package chap12.book.example.s120202;

public class BeepPrintExample3 {
	public static void main(String[] args) { // 메인 스레드
		Thread thread = new BeepThread();
		thread.start(); // BeepThread
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
