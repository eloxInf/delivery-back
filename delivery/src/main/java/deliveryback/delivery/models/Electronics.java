package deliveryback.delivery.models;

public class Electronics implements Product{

	private String sku;
	private String name;
	private int salesValue;
	private int purcheValue;
	@Override
	public boolean ValidateCreate(int purcheValue, int salesValue) {
		//APLICAR LOGICA DE VALIDACION DE CREACION
		if(true) {
		
			return true;
		}
		return false;
	}
	public Electronics(String sku, String name, int salesValue, int purcheValue) throws Exception{
		if(ValidateCreate(purcheValue,salesValue)) {
			this.sku = sku;
			this.name = name;
			this.salesValue = salesValue;
			this.purcheValue = purcheValue;
		}
		else {
			throw new Exception();
		}
	}

	
}
