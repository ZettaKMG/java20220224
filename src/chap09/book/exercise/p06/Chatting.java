package chap09.book.exercise.p06;

public class Chatting {
	void startChat(String chatId) {
//		class MyChat extends Chat{
//			@Override
//			void start() {
//				System.out.println("스타트메소드 재정의");
//			}
//		}
//		
//		Chat chat = new MyChat();
//		chat.start();
		// ----- 상속을 통한 코드 작성시 -----
		
		String nickName = null;
		nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}			
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
