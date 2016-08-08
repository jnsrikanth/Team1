package sample.java.project1;

import java.util.Scanner;

public class Machine {
	

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double item1 = 12;
		double item2 = 12;
		double item3 = 12;
		double item4 = 8;
		double item5 = 8;
		double item6 = 10;
		boolean b = true;
		while (b) {

			System.out.println(
					"1. Cappucino Rs. 12\n2.Latte Rs. 12\n3. Mochacino Rs. 12\n4. Green Tea Rs. 8\n5. Lemon Tea Rs. 8\n6. Milk Rs. 10");

			System.out.print("Enter an item number: ");
			int item = keyboard.nextInt();

			System.out.print("Enter the amount paid: ");
			double paid = keyboard.nextDouble();

			if (item == 1 || item == 2 || item == 3) {
				if (paid >= item1) {
					System.out.println("Thank you for buying item " + item + ", your change is Rs. " + (paid - item1)
							+ ". Please come again!");
				}
				if (paid < item1) {
					System.out.println("Please insert Rs. " + (item1 - paid));
				}
			}

			else if (item == 4 || item == 5) {
				if (paid >= item4) {
					System.out.println("Thank you for buying item " + item + ", your change is Rs. " + (paid - item4)
							+ ". Please come again!");
				}
				if (paid < item4) {
					System.out.println("Please insert Rs. " + (item4 - paid));
				}
			} else if (item == 6) {
				if (paid >= item6) {
					System.out.println("Thank you for buying item " + item + ", your change is Rs. " + (paid - item6)
							+ ". Please come again!");
				}
				if (paid < item6) {
					System.out.println("Please insert Rs. " + (item6 - paid));
				}
			} else
				System.out.println("Invalid Choice!");

			System.out.println("do you want to buy more: 1:yes \n 2:no");
			Scanner sn = new Scanner(System.in);

			int c = sn.nextInt();
			if (c == 2) {
				b = false;
			} else {
				// do nothing
			}

		}

	}

}
