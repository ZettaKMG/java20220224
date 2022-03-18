package chap09.book.example.s0904;

public class MessageListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
}
