package deliveryback.delivery.mgr;

import java.util.List;

import deliveryback.delivery.dto.ProductosDto;
import deliveryback.delivery.entity.Product;

public interface ProductManager {

	public String createProduct(ProductosDto productosDTO);

	public List<Product> searchProduct(String category);

	public Product searchOnlyProduct(String sku);
}
