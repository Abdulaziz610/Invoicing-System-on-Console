package invoicingSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class invoice implements Serializable{
	String firstName;
	String middleName;
	String lastName;
	Integer phoneNumber;
	Integer invoiceDate;
	Integer noOfItem;
	Integer textFileCounter;
	Integer invoiceId;
	double totalAmount;
	double paidAmount;
	double balanceAmount;
	Integer noOfItems;
	int noOfInvoice = 0;
	Date InvoiceDate;
	ArrayList<invoice> invoice1 = new ArrayList<invoice>();
	public void invoiceHeader() {
		
	}
	public void createNewInvoice() {
		noOfInvoice++;
		shop shop1 = new shop();
		
		Scanner sc = new Scanner(System.in);
		
		invoice invoice2 = new invoice();
		System.out.print("Enter the Customer First Name: ");
		invoice2.firstName = sc.next();
		System.out.print("Enter the Customer Middle Name: ");
		invoice2.middleName = sc.next();
		System.out.print("Enter the Customer Last Name: ");
		invoice2.lastName = sc.next();
		System.out.print("Enter the Customer phone Number: ");
		invoice2.phoneNumber = sc.nextInt();
		System.out.print("Enter Number Of Items: ");
		invoice2.noOfItems = sc.nextInt();
		System.out.print("Enter Total Amount: ");
		invoice2.totalAmount = sc.nextDouble();
		System.out.print("Enter Paid Amount: ");
		invoice2.paidAmount = sc.nextDouble();
		invoice2.balanceAmount = invoice2.totalAmount - invoice2.paidAmount;
		
		
		char choice;
		
		do   
        {  
			item item1 = new item();

            System.out.println("=============== Enter Product Details ===============");  
            System.out.print("Item Id: ");  
            item1.setItemId(sc.nextInt());
            
            System.out.print("Item Name: ");  
            item1.setItemName(sc.next()); 
            
            System.out.print("Item Quantity: ");  
            item1.setQuantity(sc.nextInt());

            
            System.out.print("Item Price per unit: ");  
            item1.setQtyAmountPerPrice(sc.nextInt()); 

            item1.setQtyAmountPerPrice(item1.unitPrice * item1.quantity);
			System.out.println("quantity Price : " + item1.getQtyAmountPerPrice());
       
            System.out.print("\nDo You Want To Add More Items? \nPress Y if yes, and N for No: ");  

            choice = sc.next().charAt(0);  

           
            
        }   
	
		while (choice == 'y' || choice == 'Y');  
		invoice1.add(invoice2);
		
	}
	
	
		public void report() {
			for(invoice invArr : invoice1) {
				System.out.println("========== Invoice Details ==========");
				System.out.println("Customer First Name: " + invArr.firstName);
				System.out.println("Customer Middle Name: " + invArr.middleName);
				System.out.println("Customer Last Name: " + invArr.lastName);
				System.out.println("Customer Number: " + invArr.phoneNumber);
				System.out.println("Customer Number of items: " + invoice1.size());
				System.out.println("Customer Total Amount: " + invArr.totalAmount);
				System.out.println("Customer Paid Amount: " + invArr.paidAmount);
				System.out.println("Customer BalanceAmount: " + (invArr.balanceAmount));
			}
		}
		public void reportAll() {
			System.out.println("========== All Invoice Details ==========");
			for(invoice invArr : invoice1) {
				System.out.println("========== Invoice Details ==========");
				System.out.println("Customer First Name: " + invArr.firstName);
				System.out.println("Customer Middle Name: " + invArr.middleName);
				System.out.println("Customer Last Name: " + invArr.lastName);
				System.out.println("Customer Number: " + invArr.phoneNumber);
				System.out.println("Customer Number of items: " + invoice1.size());
				System.out.println("Customer Total Amount: " + invArr.totalAmount);
				System.out.println("Customer Paid Amount: " + invArr.paidAmount);
				System.out.println("Customer BalanceAmount: " +(invArr.balanceAmount));
			}
		}
		public void search(int invoiceNo) {
			if(invoice1.size() > 0) {
				for(int i = 0 ; i < invoice1.size(); i++) {
					if(invoiceNo == invoice1.get(i).invoiceId ) {
						System.out.println("-------------Invoice Detail-------------");
						System.out.println("Invoice number : " + invoice1.get(i).invoiceId);
						System.out.println("Customer First Name: " + invoice1.get(i).firstName  );
						System.out.println("Customer Middle Name: " + invoice1.get(i).middleName);
						System.out.println("Customer Last Name: " + invoice1.get(i).lastName);
						System.out.println("Customer Number: " + invoice1.get(i).phoneNumber);
						System.out.println("Customer number of items: " + invoice1.get(i).noOfItems);
						System.out.println("Customer Total Amount: " + invoice1.get(i).totalAmount);
						System.out.println("Customer Paid Amount: " + invoice1.get(i).paidAmount);
						System.out.println("Customer Balance Amount: " + invoice1.get(i).balanceAmount);
				}
				
			}
			
		
			}

	   
	   

	
	
	}
	

}


