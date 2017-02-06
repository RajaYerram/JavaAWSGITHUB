package com.prox.project1;

import java.util.Scanner;

public class StoreFront {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Press 1 for Adding Employee");
			System.out.println("Press 2 for Adding Items");
			System.out.println("Press 3 for CartCheckout");
			System.out.println("Press Any other number to Exit");
			int s1 = s.nextInt();
			if (s1 == 1 || s1 == 2 || s1 == 3) {
				switch (s1) {
				case 1:
					System.out.println("Enter Employee name");
					String name = s2.nextLine();
					System.out.println("Enter Employee id");
					int id = s.nextInt();
					System.out.println("Enter Salary per Day");
					int salary = s.nextInt();
					new Employee(id, name, salary);
					System.out.println("\n");
					break;
				case 2:
					System.out.println("Enter item ID:");
					int itemID = s.nextInt();
					System.out.println("Enter item name:");
					String itemName = s2.nextLine();
					System.out.println("Enter item Manufacturer:");
					String itemManufacturer = s2.nextLine();
					System.out.println("Enter buying cost:");
					int buyCost = s.nextInt();
					System.out.println("Enter selling cost:");
					int sellCost = s.nextInt();
					new Items(itemID, itemName, itemManufacturer, buyCost, sellCost);
					System.out.println("\n");
					break;
				case 3:
					System.out.println("Enter ItemId");
					int itemid = s.nextInt();
					System.out.println("Enter quantity");
					int quantity = s.nextInt();
					new CartCheckout(itemid, quantity);
					System.out.println("\n");
					break;
				default:
					flag = true;
				}
			} else
				break;
		}
		s.close();
		s2.close();
	}

}
