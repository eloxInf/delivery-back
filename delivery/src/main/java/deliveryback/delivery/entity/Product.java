package deliveryback.delivery.entity;

import deliveryback.delivery.constant.Constant;
import deliveryback.delivery.dto.ProductosDto;

public class Product {

	private String sku;
	private String name;
	private int salesValue;
	private int purcheValue;
	private boolean isValid;
	private Category category;

	private void ValidateCreate(double taxes) {
		if (salesPorc(salesValue, purcheValue) > (taxes) ) {
			isValid = true;
		} else {
			isValid = false;
		}
	}

	private double salesPorc(int salesValue, int purcheValue) {
		return (salesValue - purcheValue)/purcheValue;
	}

	public Product(ProductosDto productosDTO) {
		super();
		this.sku = productosDTO.getSku();
		this.name = productosDTO.getName();
		this.salesValue = productosDTO.getSalesValue();
		this.purcheValue = productosDTO.getPurcheValue();
		switch (productosDTO.getCategoryType()) {
		case Constant.NAME_FOOD:
			ValidateCreate(Constant.TAXES_FOOD);
			this.category = new Food(productosDTO);
		case Constant.NAME_ELECTRONICS:
			ValidateCreate(Constant.TAXES_ELECTRONICS);
			this.category = new Electronics(productosDTO);
		case Constant.NAME_BEVERAGE:
			ValidateCreate(Constant.TAXES_BEVERAGE);
			this.category = new Beverage(productosDTO);
		default:
			this.isValid = false;
			this.category = new Other();
		}

	}

	/**
	 * @return the isValid
	 */
	public boolean isValid() {
		return isValid;
	}

	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the salesValue
	 */
	public int getSalesValue() {
		return salesValue;
	}

	/**
	 * @return the purcheValue
	 */
	public int getPurcheValue() {
		return purcheValue;
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	public boolean isProduct(String sku) {
		if (sku == this.sku) {
			return true;
		}
		return false;
	}
	
	
	
}
