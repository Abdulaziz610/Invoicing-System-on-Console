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
	Integer noOfItems = 0;
	Date InvoiceDate;
	
	public void invoiceHeader() {
		
	}
	public void createNewInvoice() {
		
		shop shop1 = new shop();
		Scanner sc = new Scanner(System.in);
		
		invoice invoice1 = new invoice();
		System.out.println("Enter the Customer First Name: ");
		invoice1.firstName = sc.next();
		System.out.println("Enter the Customer Middle Name: ");
		invoice1.middleName = sc.next();
		System.out.println("Enter the Customer Last Name: ");
		invoice1.lastName = sc.next();
		System.out.println("Enter the Customer phone Number: ");
		invoice1.phoneNumber = sc.nextInt();
		
		
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

            
       
            System.out.print("\nDo You Want To Add More Items? \nPress Y if yes, and N for No: ");  

            choice = sc.next().charAt(0);  


            
        }   
		while (choice == 'y' || choice == 'Y');  
		
		File filePath = new File("C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\invoicingSystem\\\\src\\\\invoicingSystem");
		File[] inFiles = filePath.listFiles();

		if (inFiles.length > 0) {
			for (File f : inFiles) {
				if (f.getName().endsWith(".txt")) {
					textFileCounter++;
				}
			}
		}

		// --------------------------------------------------
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		File fileStatistics = new File("C:\\Users\\Lenovo\\eclipse-workspace\\invoicingSystem\\src\\invoicingSystem\\Report.txt");
		File fileAllReport = new File("C:\\Users\\Lenovo\\eclipse-workspace\\invoicingSystem\\InvoiceFolder"+ invoiceId + ".txt");
		try {
			FileWriter fWrite = new FileWriter(fileStatistics);
			fWrite.write("No Of Items: " + noOfItems);
			fWrite.write("No of Invoices: " + textFileCounter);
			fWrite.write("Total Sales: " + totalAmount);
			fWrite.close();
			FileWriter fw = new FileWriter(fileAllReport);
			Date InvoiceDate = new Date(invoiceDate);
			fw.write("Invoice No: " + textFileCounter);
			fw.write("Invoice Date: " + dateFormat.format(InvoiceDate));
			fw.write("Customer First Name: " + firstName);
			fw.write("Customer Middle Name: " + middleName);
			fw.write("Customer Last Name: " + lastName);
			fw.write("No Of Items: " + noOfItems);
			fw.write("Total: " + totalAmount);
			//fw.write("Balance: " + balanceAmount);
			fw.close();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	   
	   

	
	
	}
	

}


