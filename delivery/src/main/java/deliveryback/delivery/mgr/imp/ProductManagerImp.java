package deliveryback.delivery.mgr.imp;

import java.util.ArrayList;
import java.util.List;

import deliveryback.delivery.dto.ProductosDto;
import deliveryback.delivery.entity.Beverage;
import deliveryback.delivery.entity.Electronics;
import deliveryback.delivery.entity.Food;
import deliveryback.delivery.entity.Product;
import deliveryback.delivery.mgr.ProductManager;

public class ProductManagerImp implements ProductManager {

	@Override
	public String createProduct(ProductosDto productosDTO) {
		
		Product productInfo = EvaluateCategory(productosDTO);
		
		// Guardado de informacion?
		
		if (productInfo.getIsValid()) {
			return "OK";
		}
		else {
			return "Fail";
		}
			
	}

	@Override
	public List<ProductosDto> searchProduct(String category) {
		// TODO Auto-generated method stub
		List<ProductosDto> list = new ArrayList<ProductosDto>();
		
		return list;
		
	}
	
	
	
	private Product EvaluateCategory(ProductosDto productosDTO) {
		
		switch (productosDTO.getCategoryType()) {
		case "Comida":
			return new Food(productosDTO);
		case "Electro":
			return new Electronics(productosDTO);
		case "Bebida":
			return new Beverage(productosDTO);
		default:
			// Validar exception
			return null;
		}
			
	}

}
