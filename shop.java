package invoicingSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class shop implements Serializable{
	private String shopName;
	
	List<item> itemOne = new ArrayList<item>(); 
		
	
	public void addItem(item addItem) {
		itemOne.add(addItem);
		
	}
	
	public void deleteItem(int deletedItemId) {
		if(itemOne.size() > 0) {
			for(item delItem: itemOne) {
				itemOne.remove(deletedItemId);
				System.out.println("Deleted Successfully");
			}
		}
		
	}
	
	public void changePrice(int itemId, double newPrice) {
		for(item chItem: itemOne) {
			chItem.unitPrice = newPrice;
			System.out.println("Price Changed Successfully");
		}
		
	}
	
	public void reportItem() {
		for(item reportItem: itemOne) {
			System.out.println("=========================================================");
			System.out.printf("item Name: ", reportItem.itemName);
			System.out.printf("item ID: ", reportItem.itemId);
			System.out.printf("Quantity: ", reportItem.quantity);
			System.out.printf("item Price: ", reportItem.unitPrice);
			System.out.printf("Quantity Amount/Price: ",reportItem.qtyAmountPerPrice);
			
			
			}
	}


	public String getShopName() {
		return shopName;
	}


	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	
	
	

}
