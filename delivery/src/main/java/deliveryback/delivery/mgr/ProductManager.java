package deliveryback.delivery.mgr;

import deliveryback.delivery.dto.ProductosRequest;

public interface ProductManager {
	
	public void createProduct(ProductosRequest productosDTO);
	
	public void searchProduct(String category);
	

}
