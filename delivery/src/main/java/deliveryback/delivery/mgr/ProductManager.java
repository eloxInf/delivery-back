package deliveryback.delivery.mgr;



import java.util.List;

import deliveryback.delivery.dto.ProductosDto;

public interface ProductManager {
	
	public String createProduct(ProductosDto productosDTO);
	
	public List<ProductosDto> searchProduct(String category);
	

}
