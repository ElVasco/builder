package main;

public class CruceroBuilder implements NavesBuilder{

	private Nave nave = new Nave();
	
	@Override
	public void contruirMotores() {
		System.out.println("Creando motores");
		nave.agregarParte("motores","motoresPesados");
	}

	@Override
	public void construirCasco() {
		System.out.println("Creando Casco");
		nave.agregarParte("casco","cascoPesado");
	}

	@Override
	public void pintarNave() {
		System.out.println("Pintar nave");
		nave.agregarParte("pintura","PinturaSuperMolona");
	}
	
	public CruceroBuilder() {
		System.out.println("Tipo nave: Crucero");
	}

	public Nave getNave() {
		return nave;
	}

	public void setNave(Nave nave) {
		this.nave = nave;
	}

	
}
