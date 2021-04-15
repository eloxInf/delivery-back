package deliveryback.delivery.entity;

public abstract class Product {

	private String sku;
	private String name;
	private int salesValue;
	private int purcheValue;
	
	public boolean ValidateCreate(int purcheValue, int salesValue, double taxes) {
		//APLICAR LOGICA DE VALIDACION DE CREACION
		if(purcheValue-salesValue > taxes*purcheValue) {
			return true;
		}
		return false;
	}
}
