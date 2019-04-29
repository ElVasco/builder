package main;

public class CazasBuilder implements NavesBuilder{

	private Nave nave = new Nave();
	
	@Override
	public void contruirMotores() {
		System.out.println("Creando motores");
		nave.agregarParte("motores","motoresLigeros");
	}

	@Override
	public void construirCasco() {
		System.out.println("Creando Casco");
		nave.agregarParte("casco","cascoLigeros");
	}

	@Override
	public void pintarNave() {
		System.out.println("Pintar nave");
		nave.agregarParte("pintura","PinturaMolona");
	}
	
	public CazasBuilder() {
		System.out.println("Tipo nave: Caza");
	}

	public Nave getNave() {
		return nave;
	}

	public void setNave(Nave nave) {
		this.nave = nave;
	}

	
}
