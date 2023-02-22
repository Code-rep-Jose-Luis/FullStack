package poo;

public class TiendaLicores extends Tienda{

	public TiendaLicores(){
		
	}

	@Override
	public void bienvenida() {
		super.bienvenida();
		System.out.println("Si eres menor de 18 años, fuera de aqui");
	}
	
}
