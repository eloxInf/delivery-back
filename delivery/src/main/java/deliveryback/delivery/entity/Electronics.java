package deliveryback.delivery.entity;

import deliveryback.delivery.constant.Constant;
import deliveryback.delivery.dto.ProductosDto;

public class Electronics implements Category{
	
	// Tipo Echufe
	private String plugType;

	/**
	 * @return the plugType
	 */
	public String getPlugType() {
		return plugType;
	}

	public Electronics(ProductosDto productosDTO) {
		this.plugType = productosDTO.getPlugType();
	}

	@Override
	public boolean isCategory(String category) {
		if(category.equals(Constant.NAME_ELECTRONICS)) {
			return true;
		}
		return false;
	}
	
}
