package vatTaxCalculator;

final public class Country {
	private final String name;
	private final String idCountry;
	private final double vatTax;
	private final boolean defaultCountry;
	
	public Country(String name, String idCountry, double vatTax, boolean defaultCountry) {
		this.name = name;
		this.idCountry = idCountry;
		this.defaultCountry = defaultCountry;
		
		if(vatTax > 1 || vatTax < 0){
			throw new IllegalArgumentException("VatTax has to be between 0 and 1!");
		}
		
		this.vatTax = vatTax;
	}

	public String getName() {
		return this.name;
	}

	public String getIdCountry() {
		return this.idCountry;
	}

	public double getVatTax() {
		return this.vatTax;
	}

	public boolean isDefaultCountry() {
		return this.defaultCountry;
	}
	
}
