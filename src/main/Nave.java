package main;

import java.util.HashMap;
import java.util.Map;

public class Nave {

	private String tipo;
	private Map<String, Object> partes = new HashMap<String, Object>();
	
	public void agregarParte(String nombreParte, Object parte) {
		partes.put(nombreParte, parte);
	}

	public void mostarDatos() {
		for(String key : partes.keySet()) {
			System.out.println(key + " : " + partes.get(key));
		}
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Map<String, Object> getPartes() {
		return partes;
	}

	public void setPartes(Map<String, Object> partes) {
		this.partes = partes;
	}
}
