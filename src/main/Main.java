package main;

public class Main {

	public static void main(String[] args) {
		NavesBuilder builder;
		Astillero astillero = new Astillero();
		
		builder = new CazasBuilder();
		astillero.construir(builder);
		builder.getNave().mostarDatos();
		
		builder = new CruceroBuilder();
		astillero.construir(builder);
		builder.getNave().mostarDatos();
	}

}
