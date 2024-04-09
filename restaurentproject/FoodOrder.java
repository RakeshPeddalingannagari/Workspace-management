package restaurentproject;

import java.util.Scanner;

public class FoodOrder {
	int burger=120;
	int pizza=100;
	int icecream=80;
	int coldrink=50;
	int coffee=40;
	int ch;
	int quantity;
	static int total;
	String again;
	
	Scanner sc=new Scanner(System.in);

	public void displayMenu() {
		System.out.println("******welcome to our cafe******");
		System.out.println("******************");
		System.out.println("      1.burger          120/-     ");
		System.out.println("      2.pizza           100/-     ");
		System.out.println("      3.icecream         80/-   ");
		System.out.println("      4.coldrink         50/-     ");
		System.out.println("      5.coffee           40/-      ");
		System.out.println("      6.exit              ");
		System.out.println("******************");
	}
	
	public void generateBill() {
		System.out.println();
		System.out.println("Thanks for ordering");
		System.out.println("your bill is: "+total+" ");
	}
	
	public void order() {
		
		System.out.println("enter the choice");
		ch=sc.nextInt();
		switch (ch) {
		case 1: {
			System.out.println("you are selected burger");
			System.out.println();
			System.out.println("enter the quantity");
			quantity=sc.nextInt();
			total=total+quantity*burger;
			break;
			
		}
		case 2: {
			System.out.println("you are selected pizza");
			System.out.println();
			System.out.println("enter the quantity");
			quantity=sc.nextInt();
			total=total+quantity*pizza;
			break;
			
		}
		case 3: {
			System.out.println("you are selected coffee");
			System.out.println();
			System.out.println("enter the quantity");
			quantity=sc.nextInt();
			total=total+quantity*icecream;
			break;
		}
		case 4: {
			System.out.println("you are selected coldrink");
			System.out.println();
			System.out.println("enter the quantity");
			quantity=sc.nextInt();
			total=total+quantity*coldrink;
			
		}
		case 5: {
			System.out.println("you are selected coffee");
			System.out.println();
			System.out.println("enter the quantity");
			quantity=sc.nextInt();
			total=total+quantity*coffee;
			break;
			
		}
		case 6:{
			System.exit(1);
			break;
		}
		default:
			break;
		}
		System.out.println();
		
		System.out.println("Do you wish to order anything else(Y/N)");
		again=sc.next();
		if(again.equalsIgnoreCase("Y")) {
			order();
		}
		else if(again.equalsIgnoreCase("N")) {
			generateBill();
		}
	}

	

}
