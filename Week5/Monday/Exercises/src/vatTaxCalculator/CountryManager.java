package vatTaxCalculator;

import java.util.HashMap;
import java.util.Map;

public class CountryManager {
	private static CountryManager countryManager = null;
	private HashMap<String, Country> list = new HashMap<>();
	private String defaultCountryId;
	
	private CountryManager(){
	}
	
	public static CountryManager getInstance(){
		if(countryManager == null){
			countryManager = new CountryManager();
		}
		
		return countryManager;
	}
	
	private void init(){
		for(Map.Entry<String, Country> entry : list.entrySet()){
			if(entry.getValue().isDefaultCountry()){
				this.defaultCountryId = entry.getValue().getIdCountry();
			}
		}
	}
	
	public void changeDefaultId(Country newCountry) throws NotSupportedCountryException{
		String id = newCountry.getIdCountry();
		
		Country defaultCountry = this.getCountry(defaultCountryId);
		
		remove(defaultCountry);
		list.put(defaultCountry.getIdCountry(), new Country(defaultCountry.getName(), defaultCountry.getIdCountry(), defaultCountry.getVatTax(), false));
		list.put(id, new Country(newCountry.getName(), newCountry.getIdCountry(), newCountry.getVatTax(), true));
		
		this.defaultCountryId = id;
	}
	
	public Country getCountry(String countryId) throws NotSupportedCountryException{
		
		if(!list.containsKey(countryId)){
			throw new NotSupportedCountryException();
		}
		return list.get(countryId);
	}
	
	public void add(Country country){
		list.put(country.getIdCountry(), country);
		
		init();
	}
	
	public void add(Country... countries){
		for(int i = 0 ; i < countries.length ; i++){
			list.put(countries[i].getIdCountry(), countries[i]);
		}
		
		init();
	}
	
	public void remove(Country country){
		if(list.containsKey(country.getIdCountry())){
			list.remove(country.getIdCountry());
		}
	}

	public String getDefaultCountryId() {
		return this.defaultCountryId;
	}

	public void setDefaultCountryId(String defaultCountryId) {
		this.defaultCountryId = defaultCountryId;
	}
}
