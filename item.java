package invoicingSystem;

public class item {
	
	private String itemName;
	
	private Integer itemId;
	private Integer quantity;
	private double unitPrice;
	private double qtyAmountPerPrice;
	
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
	
	
	
	
	
	public static void outputFormat() {
		System.out.println("=========================================================");
		System.out.println("item Name: ");
		System.out.println("item ID: ");
		System.out.println("Quantity: ");
		System.out.println("item Price: ");
		System.out.println("Quantity Amount/Price: ");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
