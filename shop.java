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
	
	public void changePrice() {
		
	}
	
	public void reportItem() {
		
	}


	public String getShopName() {
		return shopName;
	}


	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	
	
	

}
