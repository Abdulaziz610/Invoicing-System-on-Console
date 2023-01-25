package invoicingSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class rreport {
	
	ArrayList<invoice> invoiceL = new ArrayList<invoice>();
	Integer noOfItem;
	Integer noOfInvoices;
	Integer totalSales;
	
	public void getReport() {
		
		
		File file1 = new File("C:\\Users\\Lenovo\\eclipse-workspace\\invoicingSystem\\src\\invoicingSystem\\Report.txt");
		try {
			Scanner sc = new Scanner(file1);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine().toString());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void getAllReport() {
		File folderPath = new File("C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\invoicingSystem\\\\src\\\\invoicingSystem");
		File filesList[] = folderPath.listFiles();
		
		for (File file : filesList) {
			
			try {
				Scanner sc = new Scanner(file);

				while (sc.hasNext()) {
					System.out.println("\t" + sc.nextLine().toString());
				}
				sc.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
