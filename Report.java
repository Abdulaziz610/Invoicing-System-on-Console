package invoicingSystem;
import java.io.Serializable;
import java.util.ArrayList;


public class Report implements Serializable{
	
	ArrayList<invoice> invoice1 = new ArrayList<invoice>();
	
	public void report() {
		for(invoice invArr : invoice1) {
			System.out.println("========== Invoice Details ==========");
			System.out.println("Customer First Name: " +invArr.firstName);
			System.out.println("Customer Middle Name: " +invArr.middleName);
			System.out.println("Customer Last Name: " +invArr.lastName);
			System.out.println("Customer Number: " +invArr.phoneNumber);
			System.out.println("Customer number of items: " +invArr.noOfItem);
			System.out.println("Customer Total Amount: " +invArr.totalAmount);
			System.out.println("Customer Paid Amount: " +invArr.paidAmount);
			System.out.println("Customer Name: " +(invArr.balanceAmount));
		}
	}
	public void reportAll() {
		System.out.println("========== All Invoice Details ==========");
		for(invoice invArr : invoice1) {
			System.out.println("========== Invoice Details ==========");
			System.out.println("Customer First Name: " +invArr.firstName);
			System.out.println("Customer Middle Name: " +invArr.middleName);
			System.out.println("Customer Last Name: " +invArr.lastName);
			System.out.println("Customer Number: " +invArr.phoneNumber);
			System.out.println("Customer number of items: " +invArr.noOfItem);
			System.out.println("Customer Total Amount: " +invArr.totalAmount);
			System.out.println("Customer Paid Amount: " +invArr.paidAmount);
			System.out.println("Customer Name: " +(invArr.balanceAmount));
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

	
	
	
	
	
	
	

