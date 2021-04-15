package deliveryback.delivery.entity;

import deliveryback.delivery.constant.Constant;
import deliveryback.delivery.dto.ProductosDto;

public class Electronics extends Product{
	
	// Tipo Echufe
	private String plugType;
	
	public Electronics(ProductosDto productosRequest){	
		this.setName(productosRequest.getName());
		this.setSku(productosRequest.getSku());
		this.setSalesValue(productosRequest.getSalesValue());
		this.setPurcheValue(productosRequest.getPurcheValue());
		this.setPlugType(productosRequest.getPlugType());
		this.setPlugType(plugType);
		
		this.ValidateCreate(Constant.TAXES_ELECTRONICS);
		
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
	
}
