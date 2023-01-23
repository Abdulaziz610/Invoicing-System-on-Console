package invoicingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class invoice {
	String firstName;
	String middleName;
	String lastName;
	Integer phoneNumber;
	
	Integer invoiceDate;
	Integer noOfItem;
	
	double totalAmount;
	double paidAmount;
	double balanceAmount;
	


	public void invoiceHeader() {
		
        System.out.println("--------------------Invoice Header -----------------");  
        System.out.println("\t\t\t\t\tTel: 99999999");  
        System.out.println("\t\t\t\t\tFax: 24524528"); 
        System.out.println("\t\t\t\t\tEmail: grocerystore@grocerystore.com");  
        System.out.println("\t\t\t\t\tWebsite: www.grocerystore.com");  
        
		 
	
	}
	public void createNewInvoice() {
		
		shop shop1 = new shop();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter shop Name: ");
		shop1.setShopName(sc.next());
		
		
		
		invoice invoice1 = new invoice();
		System.out.println("Enter the Customer First Name: ");
		invoice1.firstName = sc.next();
		System.out.println("Enter the Customer Middle Name: ");
		invoice1.middleName = sc.next();
		System.out.println("Enter the Customer Last Name: ");
		invoice1.lastName = sc.next();
		System.out.println("Enter the Customer phone Number: ");
		invoice1.lastName = sc.next();
		
		item item1 = new item();
		char choice;
		do   
        {  
            // read input values  
            System.out.println("Enter Product Details: ");  
            System.out.print("Item Id: ");  
            item1.setItemId(sc.nextInt());
            
            System.out.print("Item Name: ");  
            item1.setItemName(sc.next()); 
            
            System.out.print("Item Quantity: ");  
            item1.setQuantity(sc.nextInt());

            
            System.out.print("Item Price per unit: ");  
            item1.setQtyAmountPerPrice(sc.nextInt()); 

            
         
            shop1.addItem();   
            // ask for continue shopping?  
            System.out.print("Do You Want To Add More Items? \nPress Y if yes, and N for No.");  
            //reads a character Y or N  
            choice = sc.next().charAt(0);  
            //read remaining characters, don't store (no use)  
            sc.next();  
        }   
		while (choice == 'y' || choice == 'Y');  
		
		}

}


