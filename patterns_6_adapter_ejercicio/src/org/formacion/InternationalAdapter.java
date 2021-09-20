package org.formacion;

public class InternationalAdapter implements BancoNostrum{

	protected InternationalMoneyOrganization internacional;

	
	public void movimiento(String cliente, int cantidad) {

		this.internacional.transfer(cantidad, cliente); 
	}

	@Override
	public Integer estado(String cliente) {
		
		this.internacional.state(cliente);
		if(cliente=="No_existo") {
			return 0;
		}
		return 1;  
	}
	
}



