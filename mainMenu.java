package invoicingSystem;

import java.util.Scanner;

public class mainMenu {

	public static void main(String[] args) {
		
		shop shop1 = new shop();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t\t\t========================== Welcome ==========================");
		
		boolean choice = true;
		while(choice) {
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
	    	  boolean choice1 = true;
	    	  while(choice1) {
	    		System.out.println("------------------------------------------------------------");
		        System.out.println("1. Load Data (Items and invoices)");
		        System.out.println("2. Set Shop Name");
		        System.out.println("3. Set Invoice Header (Tel / Fax / Email / Website)");
		        System.out.println("4. Go Back");
		        System.out.println("------------------------------------------------------------");
		        System.out.print("Enter Your Choice: ");
		        int userOp = sc.nextInt();
		        System.out.println("------------------------------------------------------------");
		    	 if(userOp == 1) {
		    		 System.out.println("Shop Name: " + shop1.getShopName());
		    		 System.out.println("Tel Number: " + shop1.getTelNumber());
		    		 System.out.println("Fax Number: " + shop1.getFax());
		    		 System.out.println("Email: " + shop1.getEmail());
		    		 System.out.println("Website: " + shop1.getWebsite());
		    		 choice1 = true;
		    	  }
	    	  if(userOp == 2) {
	    			System.out.print("Enter shop Name: ");
	    			shop1.setShopName(sc.next());
	    			choice1 = true;
	    	  }
	    	  else
	    	  if(userOp == 3) {
	    			System.out.print("Enter Tel: ");
	    			shop1.setTelNumber(sc.nextInt());
	    			
	    			System.out.print("Enter Fax: ");
	    			shop1.setFax(sc.nextInt());
	    			
	    			System.out.print("Enter Email: ");
	    			shop1.setEmail(sc.next());
	    			
	    			System.out.print("Enter Website: ");
	    			shop1.setWebsite(sc.next());
	    			choice1 = true;
	    	  }
	    	  else
	    	  if(userOp == 4) {
	    		  
	    		  choice1 = false;
	    			
	    	  }
	   }
	        break;
	      case 2:
	    	  boolean choice2 = true;
	    	  while(choice2) {
	    	  System.out.println("------------------------------------------------------------");
	          System.out.println("1. Add Items");
	    	  System.out.println("2. Delete Items");
	    	  System.out.println("3. Change Item Price");
	    	  System.out.println("4. Report All Items");
	    	  System.out.println("5. Go Back");
	    	  System.out.println("------------------------------------------------------------");
		      System.out.println("Enter Your Choice: ");
		      int userOp = sc.nextInt();
		      System.out.println("------------------------------------------------------------");
		      
		      
	    	  if(userOp == 1) {
					item itemOne = new item();
					System.out.print("Item Name: ");
					itemOne.itemName = sc.next();
					System.out.print("Item ID: ");
					itemOne.itemId = sc.nextInt();
					System.out.print("Item Unit Price: ");
					itemOne.unitPrice = sc.nextDouble();
					System.out.print("Item Quantity: ");
					itemOne.quantity = sc.nextInt();
					System.out.print("Item >> qty amount/price: ");
					itemOne.qtyAmountPerPrice = sc.nextDouble();
					//itemX.qtyAmountPrice = itemX.quantity * itemX.unitPrice;
					shop1.addItem(itemOne);
				  choice2 = true;
	    	
	    	  }
	    	  
	    	  if(userOp == 2) {
					System.out.print("Enter ID of the item to bo deleted: ");
					Integer deletedItem = sc.nextInt();
					shop1.deleteItem(deletedItem);
	    		  choice2 = true;
	    	  }
	    	  if(userOp == 3) {
	    		  System.out.print("Enter ID of the item to change its price: ");
	    		  Integer itemChangePriceId = sc.nextInt();
	    		  System.out.println("Enter the New Price of the item: ");
	    		  Integer itemNewPrice = sc.nextInt();
	    		  shop1.changePrice(itemChangePriceId, itemNewPrice);
	    		 choice2 = true;
	    	  }
		      
		      if(userOp == 4) {
		    	  
	    		  System.out.println("==================== Report Item ====================");
	    		  shop1.reportItem();
	    		 choice2 = true;
	    	  }
	    	  if(userOp == 5) {
	    		 choice1 = false;
	    	  }
	    	  
	   }
	        break;
	      case 3:
	    	  invoice invoice1 = new invoice();
	    	  System.out.println("======= New Invoice =======");
	    	  invoice1.createNewInvoice();
	    	  choice = true;

	        break;
	      case 4:
	    	  System.out.println("======= Statistics =======");

		        break;
	      case 5:
	    	  System.out.println("======= All Invoices =======");

		        break;
	      case 6:
	    	  System.out.println("======= Search (1) Invoice =======");

		        break;
	      case 7:
	    	  System.out.println("======= Program Statistics =======");

		        break;
	      case 8:
	    	  System.out.print("======= Are you sure you want to exit? press Y: ");
	    	  String userInput = sc.next();
	    	  if(userInput.equalsIgnoreCase("y")) {
	    		  System.out.println("Thank You");
	    		  choice = false;
	    	  }
		        break;

	    }
		
		
	}
	}


}
