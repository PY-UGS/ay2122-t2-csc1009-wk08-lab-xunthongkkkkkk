import java.util.Scanner;
public class BankDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		double amount = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input your account number : ");
		int accountNum = Integer.parseInt(input.nextLine());
		CheckingAccount account = new CheckingAccount(0, accountNum);
		
		System.out.println("\nChoose a service that you would like to do : ");
		System.out.println("1. Deposit \n2. Withdraw \n3. Quit \n");
		choice = Integer.parseInt(input.nextLine());
		
		while (choice != 3) {
			if (choice == 1) {
				System.out.println("Please enter the amount to deposit : $");
				amount = Double.parseDouble(input.nextLine());
				account.deposit(amount);
				System.out.println("The balance after deposit is : $" + account.getBalance());
			}
			else if (choice == 2) {
				System.out.println("Please enter the amount to deposit : $");
				amount = Double.parseDouble(input.nextLine());
				try {
					account.withdraw(amount);
					System.out.println("The balance after withdraw is : $" + account.getBalance());
				} catch (InsufficientFundsException e) {
					System.out.println("Sorry, but your account is short by : $" + (amount - account.getBalance()));
				}
			}
			else {
				System.out.println("Sorry, but the choice you entered is invalid.");
			}
			System.out.println("\nChoose a service that you would like to do : ");
			System.out.println("1. Deposit \n2. Withdraw \n3. Quit \n");
			choice = Integer.parseInt(input.nextLine());
		}
	}

}
