package invoicingSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class shop implements Serializable{
	private String shopName;
	private String email;
	private String website;
	
	
	List<item> itemOne = new ArrayList<item>(); 
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Integer getFax() {
		return fax;
	}

	public void setFax(Integer fax) {
		this.fax = fax;
	}

	public Integer getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(Integer telNumber) {
		this.telNumber = telNumber;
	}

	public List<item> getItemOne() {
		return itemOne;
	}

	public void setItemOne(List<item> itemOne) {
		this.itemOne = itemOne;
	}


	private Integer fax;
	private Integer telNumber;

	
	
	
		
	
	public void addItem(item addItem) {
		itemOne.add(addItem);
		
	}
	
	public void deleteItem(int deletedItemId) {
		for (int i = 0; i < itemOne.size(); i++) {
			item item1 = itemOne.get(i);
			if (item1.itemId.equals(deletedItemId)) {
				itemOne.remove(i);
				System.out.println("Item  has been Deleted ");
				break;
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
			System.out.println("item Name: "+ reportItem.itemName);
			System.out.println("item ID: "+ reportItem.itemId);
			System.out.println("Quantity: "+ reportItem.quantity);
			System.out.println("item Price: "+ reportItem.unitPrice);
			System.out.println("Quantity Amount/Price: "+reportItem.qtyAmountPerPrice);
			
			
			}
	}


	public String getShopName() {
		return shopName;
	}


	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	
	
	

}
