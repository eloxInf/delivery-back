package deliveryback.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import deliveryback.delivery.dto.ProductosDto;
import deliveryback.delivery.entity.Product;
import deliveryback.delivery.mgr.imp.ProductManagerImp;

@RestController
public class ProductControllers {
	@Autowired
	private ProductManagerImp requestReplacementMgr;
	
	@RequestMapping(value = "v1/createProduct", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<String> createProduct(ProductosDto productosRequest) {
		
		return new ResponseEntity<String>(requestReplacementMgr.createProduct(productosRequest), HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "v1/searchProduct", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Product>> searchProduct(String category) {
		return new ResponseEntity<List<Product>>(requestReplacementMgr.searchProduct(category), HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "v1/searchOnlyProduct", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Product> searchOnlyProduct(String sku) {
		return new ResponseEntity<Product>(requestReplacementMgr.searchOnlyProduct(sku), HttpStatus.OK);
		
	}
}
