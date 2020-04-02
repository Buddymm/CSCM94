public class Menu {
	
	private String courseType;
	private String itemName;
	private String itemDescription;
	private double priceOfItem;
	private String addMenuItem;
	private String removeMenuItem;

	public Menu(String courseType, String itemName, String itemDescription, double priceOfItem) {
		this.courseType = courseType;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.priceOfItem = priceOfItem;
	}

	public String getCourseType() {
		return courseType;
	}

	public String getItemName() {
		return itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public double getPriceOfItem() {
		return priceOfItem;
	}
/* Not sure how to add functionality for adding and removing items
   I think this will work but need to test. */

	private String addMenuItem() {
		this.addMenuItem = addMenuItem;
		return addMenuItem;
	}

	private String removeMenuItem() {
		this.removeMenuItem = removeMenuItem;
		return removeMenuItem;
	}

}