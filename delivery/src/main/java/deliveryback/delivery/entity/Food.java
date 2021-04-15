package deliveryback.delivery.entity;

import deliveryback.delivery.constant.Constant;
import deliveryback.delivery.dto.ProductosDto;

public class Food extends Product{

	private String expirationDate;
	
	public Food(ProductosDto productosRequest){	

		this.setName(productosRequest.getName());
		this.setSku(productosRequest.getSku());
		this.setSalesValue(productosRequest.getSalesValue());
		this.setPurcheValue(productosRequest.getPurcheValue());
		this.setExpirationDate(productosRequest.getExpirationDate());
		
		this.ValidateCreate(Constant.TAXES_FOOD);
		
	}

	/**
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	
	
	
}
