package main;

//En esta interfaz definimos las diferentes faces 
//para la creacion de un tipo de objeto
public interface NavesBuilder {

	void contruirMotores();
	void construirCasco();
	void pintarNave();
	Nave getNave();
}
