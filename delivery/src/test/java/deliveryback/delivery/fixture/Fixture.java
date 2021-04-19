package deliveryback.delivery.fixture;

import deliveryback.delivery.dto.ProductosDto;

public class Fixture {

	
	public static ProductosDto crearProductoElectroOK() {
		ProductosDto newProduct = new ProductosDto();
		newProduct.setCategoryType("Electro");
		newProduct.setExpirationDate(null);
		newProduct.setName("Horno");
		newProduct.setPlugType("Italiano");
		newProduct.setPurcheValue(5000);
		newProduct.setSalesValue(10000);
		newProduct.setSku("SAD548654ASDAS");
		
		return newProduct;
	}
	
	public static ProductosDto crearProductoElectroFail() {
		ProductosDto newProduct = new ProductosDto();
		newProduct.setCategoryType("Electro");
		newProduct.setExpirationDate(null);
		newProduct.setName("Horno");
		newProduct.setPlugType("Italiano");
		newProduct.setPurcheValue(5000);
		newProduct.setSalesValue(5500);
		newProduct.setSku("SAD548654ASDAS");
		
		return newProduct;
	}
	
	public static ProductosDto crearProductoFoodOK() {
		ProductosDto newProduct = new ProductosDto();
		newProduct.setCategoryType("Comida");
		newProduct.setExpirationDate("13/05/2025");
		newProduct.setName("Atun");
		newProduct.setPlugType(null);
		newProduct.setPurcheValue(500);
		newProduct.setSalesValue(1000);
		newProduct.setSku("SAD548854ASDAS");
		
		return newProduct;
	}
	
	public static ProductosDto crearProductoFoodFail() {
		ProductosDto newProduct = new ProductosDto();
		newProduct.setCategoryType("Comida");
		newProduct.setExpirationDate("13/05/2025");
		newProduct.setName("Atun");
		newProduct.setPlugType(null);
		newProduct.setPurcheValue(500);
		newProduct.setSalesValue(550);
		newProduct.setSku("SAD548854ASDAS");
		
		return newProduct;
	}
	
	public static ProductosDto crearProductoBebidasOK() {
		ProductosDto newProduct = new ProductosDto();
		newProduct.setCategoryType("Bebida");
		newProduct.setExpirationDate("13/05/2025");
		newProduct.setName("Fanta");
		newProduct.setPlugType(null);
		newProduct.setPurcheValue(500);
		newProduct.setSalesValue(1000);
		newProduct.setSku("SAD548754ASDAS");
		
		return newProduct;
	}
	
	public static ProductosDto crearProductoBebidasFail() {
		ProductosDto newProduct = new ProductosDto();
		newProduct.setCategoryType("Bebida");
		newProduct.setExpirationDate("13/05/2025");
		newProduct.setName("Fanta");
		newProduct.setPlugType(null);
		newProduct.setPurcheValue(500);
		newProduct.setSalesValue(600);
		newProduct.setSku("SAD548754ASDAS");
		
		return newProduct;
	}
}
