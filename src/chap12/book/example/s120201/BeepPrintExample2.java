package chap12.book.example.s120201;

public class BeepPrintExample2 {
	public static void main(String[] args) { // 메인 스레드
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start(); // BeepRunnable
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
