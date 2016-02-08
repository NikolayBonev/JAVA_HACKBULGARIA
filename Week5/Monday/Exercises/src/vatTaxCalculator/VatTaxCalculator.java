package vatTaxCalculator;

public class VatTaxCalculator {
	private static CountryManager countryMng = CountryManager.getInstance();
	
	public static double CalculateTax(double price, String countryId) throws NotSupportedCountryException {
		Country country = countryMng.getCountry(countryId);
		return price * country.getVatTax() + price;
	}
	
	public static double CalculateTax(double price) throws NotSupportedCountryException {
		return CalculateTax(price, countryMng.getDefaultCountryId());
	}
}