package herencia.ejercicio02;

public class TiendaLicores extends Tienda implements IServir {
	
	
	@Override
	public void bienvenida() {
		super.bienvenida();
		System.out.println("Si eres menor de 18 años, fuera de aqui");
	}

	@Override
	public void colocar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double cuenta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int contador() {
		// TODO Auto-generated method stub
		return 0;
	}


}
