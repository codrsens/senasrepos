
public class ItemToPurchase {
/*
 * Private fields
 * String itemName - Initialized in default constructor to "none"
 * int itemPrice - Initialized in default constructor to 0
 * int itemQuantity - Initialized in default constructor to 0
 * 
 * Default constructor - one that does not take any parameters
 * 	eg. ItemToPurchase() -> is a default constructor
 */
	
	String itemName;
	int itemPrice;
	int itemQuantity;
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	
	
	ItemToPurchase(String itemName) {
		
	}
}