package main.java.bo;

public class Item {
	
	private String category;
	private Double price;
	private Double salesTaxPercentage;
	private boolean isImported;
	
	public Item(String category, Double price, Double salesTaxPercentage, boolean isImported) {
		super();
		this.category = category;
		this.price = price;
		this.salesTaxPercentage = salesTaxPercentage;
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

	public Double getSalesTaxPercentage() {
		return salesTaxPercentage;
	}

	public void setSalesTaxPercentage(Double salesTaxPercentage) {
		this.salesTaxPercentage = salesTaxPercentage;
	}

	public boolean isImported() {
		return isImported;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	
	

}
