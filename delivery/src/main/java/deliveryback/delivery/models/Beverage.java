package deliveryback.delivery.models;

public class Beverage implements Product{

	private String sku;
	private String name;
	private int salesValue;
	private int purcheValue;
	private String expirationDate;
	

	@Override
	public boolean ValidateCreate(int purcheValue, int salesValue) {
		//APLICAR LOGICA DE VALIDACION DE CREACION
		if(true) {
		
			return true;
		}
		return false;
	}


	public Beverage(String sku, String name, int salesValue, int purcheValue, String expirationDate) throws Exception {
		if(ValidateCreate(purcheValue,salesValue)) {
			this.sku = sku;
			this.name = name;
			this.salesValue = salesValue;
			this.purcheValue = purcheValue;
			this.expirationDate = expirationDate;
		}
		else {
			throw new Exception();
		}
	}
	
	
}
