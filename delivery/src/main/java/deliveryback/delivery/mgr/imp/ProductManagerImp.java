package deliveryback.delivery.mgr.imp;

import java.util.ArrayList;
import java.util.List;

import deliveryback.delivery.dto.ProductosDto;
import deliveryback.delivery.entity.Product;
import deliveryback.delivery.mgr.ProductManager;

public class ProductManagerImp implements ProductManager {

	private List<Product> list;

	@Override
	public String createProduct(ProductosDto productosDTO) {
		list = new ArrayList<Product>();
		Product productInfo = evaluateCategory(productosDTO);
		if (productInfo.isValid()) {
			list.add(productInfo);
			return "OK";
		}
		return "Fail";
	}

	private Product evaluateCategory(ProductosDto productosDTO) {
		return new Product(productosDTO);
	}

	@Override
	public Product searchOnlyProduct(String sku) {
		for(Product a : list) {
			if(a.isProduct(sku)) {
				return a;
			}
		}
		return null;
	}

	@Override
	public List<Product> searchProduct(String category) {
		List<Product> listResponse = new ArrayList<Product>();
		for(Product a : list) {
			if(a.getCategory().isCategory(category)) {
				listResponse.add(a);
			}
		}
		return listResponse;

	}
}
