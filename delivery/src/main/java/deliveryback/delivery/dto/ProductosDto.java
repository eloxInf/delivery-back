package deliveryback.delivery.dto;

public class ProductosDto {

	private String sku;
	private String name;
	private int salesValue;
	private int purcheValue;
	private String categoryType;
	private String expirationDate;
	
	private String plugType;
	
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
	/**
	 * @return the categoryType
	 */
	public String getCategoryType() {
		return categoryType;
	}
	/**
	 * @param categoryType the categoryType to set
	 */
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	/**
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}
	/**
	 * @return the plugType
	 */
	public String getPlugType() {
		return plugType;
	}
	/**
	 * @param plugType the plugType to set
	 */
	public void setPlugType(String plugType) {
		this.plugType = plugType;
	}
	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
}
