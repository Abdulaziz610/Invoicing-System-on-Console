package invoicingSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

            
         
            shop1.itemOne.add(item1);
            // ask for continue shopping?  
            System.out.print("Do You Want To Add More Items? \nPress Y if yes, and N for No.");  
            //reads a character Y or N  
            choice = sc.next().charAt(0);  
            //read remaining characters, don't store (no use)  
            sc.next();
            
        }   
		while (choice == 'y' || choice == 'Y');  
		
		
	
	try{
	       FileOutputStream file = new FileOutputStream("shop.txt");
	       ObjectOutputStream out = new ObjectOutputStream(file);
	       out.writeObject(shop1);
	       out.close();
	       file.close();
	       System.out.println("Serialized and saved");
	   }catch (Exception e){
	     e.printStackTrace();
	   }
	//--------------------------------------------------------
	   
	   
	   
	    // Deserialization
	    try
	    {
	        // Reading the object from a file
	        FileInputStream file = new FileInputStream("shop.txt");
	        ObjectInputStream in = new ObjectInputStream(file);
	        // Method for deserialization of object
	        invoice object1 = (invoice) in.readObject();
	        in.close();
	        file.close();
	        System.out.println("\nObject has been Deserialized ");
	        System.out.println("Pateint First Name: " + object1.firstName);
	        System.out.println("Pateint Middle Name: " + object1.middleName);
	        System.out.println("Pateint Last Name: " + object1.lastName);
	        System.out.println("Patient Phone Number: " + object1.phoneNumber);

	    }
	    catch(IOException ex)
	    {
	        System.out.println("IOException is caught");
	    }
	    catch(ClassNotFoundException ex)
	    {
	        System.out.println("ClassNotFoundException is caught");
	    }
	
	
	}
	

}


