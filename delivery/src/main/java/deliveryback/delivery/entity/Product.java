package deliveryback.delivery.entity;

public abstract class Product {

	private String sku;
	private String name;
	private int salesValue;
	private int purcheValue;
	private Boolean isValid;

	/**
	 * @return the isValid
	 */
	public Boolean getIsValid() {
		return isValid;
	}

	/**
	 * @param isValid the isValid to set
	 */
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	public void ValidateCreate(double taxes) {
		if (salesPorc(salesValue, purcheValue) > (taxes) ) {
			isValid = true;
		} else {
			isValid = false;
		}
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

	private double salesPorc(int salesValue, int purcheValue) {
		return (salesValue - purcheValue)/purcheValue;
	}
}
