package main;

public class Astillero {

	public void construir(NavesBuilder builder) {
		builder.contruirMotores();
		builder.construirCasco();
		builder.pintarNave();
	}

}
