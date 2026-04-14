package in.cdac;

public class MenuItem {
	int itemId;
	String itemName;
	double price;
	MenuItem nextItem = null;
	
	public MenuItem(int itemId, String itemName, double price) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
