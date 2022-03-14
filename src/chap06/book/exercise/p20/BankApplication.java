package chap06.book.exercise.p20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int size = 0;

	public static void main(String[] args) {
		boolean run = true;

//		accountArray[0] = new Account("111-111", "hong", 10000);
//		accountArray[1] = new Account("222-222", "kim", 20000);
//		accountArray[2] = new Account("333-333", "lee", 20000);
//		size = 3;

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		// 작성 위치
		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("계좌주:");
		String owner = scanner.next();
		System.out.print("초기입금액:");
		int money = scanner.nextInt();

		accountArray[size] = new Account(ano, owner, money);
		size++;

		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	// 계좌목록보기
	private static void accountList() {
		// 작성 위치
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");

		for (int i = 0; i < size; i++) {
			System.out.print(accountArray[i].getAno() + "\t" + accountArray[i].getOwner());
			System.out.println("\t" + accountArray[i].getBalance());
		}
	}

	// 예금하기
	private static void deposit() {
		// 작성 위치
		System.out.print("계좌번호:");
		String ano = scanner.next();

		Account account = findAccount(ano);

		System.out.print("예금액:");
		int money = scanner.nextInt();
		int balance = account.getBalance();
		account.setBalance(balance + money);

		System.out.println("결과: 예금이 성공되었습니다.");
	}

	// 출금하기
	private static void withdraw() {
		// 작성 위치
		System.out.print("계좌번호:");
		String ano = scanner.next();

		Account account = findAccount(ano);

		System.out.print("출금액:");
		int money = scanner.nextInt();
		int balance = account.getBalance();
		account.setBalance(balance - money);

		System.out.println("결과: 출금이 성공되었습니다.");
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		// 작성 위치
		Account account = null;
		for (int i = 0; i < size; i++) {
			if (accountArray[i].getAno().contentEquals(ano)) {
				account = accountArray[i];
				break;
			}
		}

		return account;
	}
}
