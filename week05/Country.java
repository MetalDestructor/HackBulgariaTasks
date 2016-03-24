package week5;

public class Country {
	private final String mCountryId;
	private final String mName;
	private final boolean mIsDefault;
	private final double mVatTax;

	public Country(String countryId, String name, boolean isDefault, double vatTax) {
		if (vatTax < 0 || vatTax > 1){
			throw new IllegalArgumentException("Invalid Vat Tax");
		}
		mCountryId = countryId;
		mName = name;
		mIsDefault = isDefault;
		mVatTax = vatTax;
	}
	
	public String getCountryId(){
		return this.mCountryId;
	}
	
	public String getName(){
		return this.mName;
	}
	
	public boolean getIsDefault(){
		return this.mIsDefault;
	}
	
	public double getVatTax(){
		return this.mVatTax;
	}
}

