package Shop;
import vatTaxCalculator.*;

public class Product {
	private String countryId;
	private double price;
	private double priceVAT = 0;
	private String name;
	private int productId;
	private int quantity;
	
	public Product(String countryId, double price, String name, int productId, int quantity) throws NotSupportedCountryException {
		setCountryId(countryId);
		setPrice(price);
		setName(name);
		setProductId(productId);
		setQuantity(quantity);
		
		this.priceVAT = VatTaxCalculator.CalculateTax(price, countryId);
	}

	public double getPriceVAT() {
		return this.priceVAT;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		if(price < 0){
			throw new IllegalArgumentException("Price has to be greater than zero!");
		}
		
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
