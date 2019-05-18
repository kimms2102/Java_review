package java20190518_question;

public class Main_Answer {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.setBalance(10000);
		System.out.println("ÇöÀçÀÜ°í"+account.getBalance());
		account.setBalance(-100);
		System.out.println("ÇöÀçÀÜ°í"+account.getBalance());
		account.setBalance(2000000);
		System.out.println("ÇöÀçÀÜ°í"+account.getBalance());
		account.setBalance(300000);
		System.out.println("ÇöÀçÀÜ°í"+account.getBalance());

	}

}
