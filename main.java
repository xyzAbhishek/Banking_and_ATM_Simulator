
// Create accounts, deposit money, withdraw money, check balances, and view transaction history.

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
class main{

	public static void  main(String[] args) {
		Scanner sc = new Scanner(System.in);
//Account Details
		// System.out.println("Enter the account Holder name : ");
		// String name = sc.next();
		// System.out.println("Enter the account Holder account number : ");
		// double number = sc.nextDouble();
		// User_Details UserDetialsObject = new User_Details();
		// UserDetialsObject.user_details(name,number);

// Desposit
// 		System.out.println("Enter Deposit amount");
// 		withdraw WithDraw_Amount = new withdraw();
// 		double Principle = sc.nextDouble();
// 		WithDraw_Amount.Deposit(Principle);

// //withdrawl
// 		System.out.println("Enter withdrawl amount");
// 		double withdraw_Amount = sc.nextDouble();
// 		WithDraw_Amount.withdraw(withdraw_Amount);

		System.out.println("Welcome to our Bank and ATM Simulator!!");
		System.out.println("Please Follow the following instructions!! \nUse numbers 1,2,3,4,5 for the specific purposes\n1.For Entry of a any Account Holder\n2.To Deposit the amount\n3.To Check Balance\n4.To WithDraw Amount\n5.To see the transation History");
			transaction_history Balance = new transaction_history();
			User_Details UserDetialsObject = new User_Details();
			byte choice = 0;
		while (choice!=6){	
		   System.out.println();
		   System.out.println("Enter your choice :");
		   choice = sc.nextByte();
		switch (choice) {
			case 1:
			System.out.println("Enter the account Holder name : ");
			String name = sc.next();
			System.out.println("Enter the account Holder account number : ");
			double number = sc.nextDouble();
			UserDetialsObject.user_details(name,number);
				break;
			case 2:
			System.out.println("Enter Deposit amount");
			double Principle = sc.nextDouble();
			Balance.Deposit(Principle);
				break;
			case 3:
				Balance.displayBalance();
				break;
			case 4:
			System.out.println("Enter withdrawl amount");
			double withdraw_Amount = sc.nextDouble();
			Balance.withdraw(withdraw_Amount);
				break;
			case 5:
				Balance.Stored_History();
				break;
			case 6:
				break;
			default:
				System.out.println("Invalid operation");
				break;
		}
		}
	}
}