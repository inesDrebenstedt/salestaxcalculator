package main.java.bo;

public class Item {
	
	private String category;
	private Double price;
	private boolean isImported;
	
	public Item(String category, Double price, boolean isImported) {
		super();
		this.category = category;
		this.price = price;
		this.isImported = isImported;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isImported() {
		return isImported;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	
	

}
