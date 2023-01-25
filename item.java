package invoicingSystem;

import java.io.Serializable;

public class item implements Serializable{
	
	 String itemName;
	 Integer itemId;
	 Integer quantity;
	 double unitPrice;
	 double qtyAmountPerPrice;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	public double getQtyAmountPerPrice() {
		return qtyAmountPerPrice;
	}
	public void setQtyAmountPerPrice(double qtyAmountPerPrice) {
		this.qtyAmountPerPrice = qtyAmountPerPrice;
	}
	
	
	
	


	
 
	
	
	
	
	
	
	
	
	
	
	
}
