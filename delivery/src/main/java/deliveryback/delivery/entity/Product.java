package deliveryback.delivery.entity;

public abstract class Product {

	private String sku;
	private String name;
	private int salesValue;
	private int purcheValue;
	private Boolean isValid;
	
	
	public void ValidateCreate(double taxes) {
		if(purcheValue-salesValue > taxes*purcheValue) {
			isValid = true;
		}
		isValid = false;
	}

	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the salesValue
	 */
	public int getSalesValue() {
		return salesValue;
	}

	/**
	 * @param salesValue the salesValue to set
	 */
	public void setSalesValue(int salesValue) {
		this.salesValue = salesValue;
	}

	/**
	 * @return the purcheValue
	 */
	public int getPurcheValue() {
		return purcheValue;
	}

	/**
	 * @param purcheValue the purcheValue to set
	 */
	public void setPurcheValue(int purcheValue) {
		this.purcheValue = purcheValue;
	}
	
	
}
