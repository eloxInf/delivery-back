package deliveryback.delivery.entity;

import deliveryback.delivery.constant.Constant;
import deliveryback.delivery.dto.ProductosDto;

public class Food implements Category {

	private String expirationDate;

	/**
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}	

	public Food(ProductosDto productosDTO) {
		this.expirationDate = productosDTO.getExpirationDate();
	}



	@Override
	public boolean isCategory(String category) {
		if(category.equals(Constant.NAME_FOOD)) {
			return true;
		}
		return false;
	}

}
