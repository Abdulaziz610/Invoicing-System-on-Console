package invoicingSystem;

import java.util.Scanner;

public class mainMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("========================== Welcome ==========================");
		
		
		System.out.println("1-Shop Settings");
		System.out.println("2-Manage Shop Items");
		System.out.println("3-Create New Invoice");
		System.out.println("4-Report: Statistics");
		System.out.println("5-Report: All Invoices");
		System.out.println("6-Search (1) Invoice");
		System.out.println("7-Program Statistics");
		System.out.println("8-Exit");
		
		System.out.print("\nChoose your option from the menu: ");
		int option = sc.nextInt();
	  
	    switch (option) {
	      case 1:
	        System.out.println("\n1. Load Data (Items and invoices)");
	        System.out.println("2. Set Shop Name");
	        System.out.println("3. Set Invoice Header (Tel / Fax / Email / Website)");
	        System.out.println("4. Go Back");
	       
	        break;
	      case 2:
	          System.out.println("\n1. Add Items");
	    	  System.out.println("2. Delete Items");
	    	  System.out.println("3. Change Item Price");
	    	  System.out.println("4. Report All Items");
	    	  System.out.println("5. Go Back");
	        break;

	    }
		
		
	}

}
