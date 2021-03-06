package deliveryback.delivery.mgr;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import deliveryback.delivery.constant.Constant;
import deliveryback.delivery.dto.ProductosDto;
import deliveryback.delivery.entity.Product;
import deliveryback.delivery.fixture.Fixture;
import deliveryback.delivery.mgr.imp.ProductManagerImp;

@RunWith(MockitoJUnitRunner.class)
public class ManagerImplTest {

	@InjectMocks
	private ProductManagerImp productManagerImp;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void createBeverageOK() {
		ProductosDto newProduct = Fixture.crearProductoBebidasOK();
		String resp =  productManagerImp.createProduct(newProduct);
		Assert.assertEquals("OK", resp);
	}
	
	@Test
	public void createFoodOK() {
		ProductosDto newProduct = Fixture.crearProductoFoodOK();
		String resp =  productManagerImp.createProduct(newProduct);
		Assert.assertEquals("OK", resp);
	}
	
	@Test
	public void createElectoOK() {
		ProductosDto newProduct = Fixture.crearProductoElectroOK();
		String resp =  productManagerImp.createProduct(newProduct);
		Assert.assertEquals("OK", resp);
	}
	
	@Test
	public void createBeverageFail() {
		ProductosDto newProduct = Fixture.crearProductoBebidasFail();
		String resp =  productManagerImp.createProduct(newProduct);
		Assert.assertEquals("Fail", resp);
	}

	@Test
	public void createFoodFail() {
		ProductosDto newProduct = Fixture.crearProductoFoodFail();
		String resp =  productManagerImp.createProduct(newProduct);
		Assert.assertEquals("Fail", resp);
	}
	
	@Test
	public void createElectroFail() {
		ProductosDto newProduct = Fixture.crearProductoElectroFail();
		String resp =  productManagerImp.createProduct(newProduct);
		Assert.assertEquals("Fail", resp);
	}
	
	@Test
	public void searchCategoryOK() {
		ProductosDto newProduct = Fixture.crearProductoBebidasOK();
		String resp =  productManagerImp.createProduct(newProduct);
		newProduct = Fixture.crearProductoFoodOK();
		resp =  productManagerImp.createProduct(newProduct);
		newProduct = Fixture.crearProductoElectroOK();
		resp =  productManagerImp.createProduct(newProduct);
		List<Product> response = productManagerImp.searchProduct(Constant.NAME_FOOD);
		Assert.assertNotNull(response);
	}
	
	@Test
	public void searchCategoryFail() {
		ProductosDto newProduct = Fixture.crearProductoBebidasOK();
		String resp =  productManagerImp.createProduct(newProduct);
		newProduct = Fixture.crearProductoFoodOK();
		resp =  productManagerImp.createProduct(newProduct);
		newProduct = Fixture.crearProductoElectroOK();
		resp =  productManagerImp.createProduct(newProduct);
		List<Product> response = productManagerImp.searchProduct("Otro");
		Assert.assertTrue(response.isEmpty());
	}
	
	@Test
	public void searchProductOK() {
		ProductosDto newProduct = Fixture.crearProductoBebidasOK();
		String resp =  productManagerImp.createProduct(newProduct);
		newProduct = Fixture.crearProductoFoodOK();
		resp =  productManagerImp.createProduct(newProduct);
		newProduct = Fixture.crearProductoElectroOK();
		resp =  productManagerImp.createProduct(newProduct);
		Product response = productManagerImp.searchOnlyProduct("SAD548654ASDAS");
		Assert.assertSame("Horno", response.getName());
	}
	
	@Test
	public void searchProductFail() {
		ProductosDto newProduct = Fixture.crearProductoBebidasOK();
		String resp =  productManagerImp.createProduct(newProduct);
		newProduct = Fixture.crearProductoFoodOK();
		resp =  productManagerImp.createProduct(newProduct);
		newProduct = Fixture.crearProductoElectroOK();
		resp =  productManagerImp.createProduct(newProduct);
		Product response = productManagerImp.searchOnlyProduct("SAD548654ASDA");
		Assert.assertNull(response);
	}
}
