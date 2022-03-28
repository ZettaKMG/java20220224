package chap12.book.example.s120201;

import java.awt.*;

public class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		// ----- 스레드 실행 내용 -----
	}
}
