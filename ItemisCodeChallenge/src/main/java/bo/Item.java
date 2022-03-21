package main.java.bo;

public class Item {
	
	private String category;
	private Double price;
	private boolean isExemptFromBasicSalesTax;
	private boolean isImported;
	
	public Item(String category, Double price, boolean isExempt, boolean isImported) {
		super();
		this.category = category;
		this.price = price;
		this.isExemptFromBasicSalesTax = isExempt;
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

	public boolean isExemptFromBasicSalesTax() {
		return isExemptFromBasicSalesTax;
	}

	public void setExemptFromBasicSalesTax(boolean isExemptFromSalesTax) {
		this.isExemptFromBasicSalesTax = isExemptFromSalesTax;
	}

	public boolean isImported() {
		return isImported;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	
	

}
