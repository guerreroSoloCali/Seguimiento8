package model;

import java.util.ArrayList;

import java.util.Collections;

public class PaisData {
	
private ArrayList<Pais> pais;

	
	//ArrayList del pais
	public PaisData() {
		
		pais = new ArrayList<>();
	}
	
	
	//Metodo pa imprimir 
	public void imprimir() {
		
		for(Pais p : pais)
			System.out.print(p.toString()+"\n");
	}
	
	//Metodo creado pa limpiar
	public void limpiarData() {
		
		pais.clear();
	}
	
	//Metodo pa ordenar
	public void orden() {
		
		Collections.sort(pais);
	}
	
	
	//Metodo pa añadir
	public void agregarPais(Pais p) {
		
		pais.add(p);
	}
	
	
	
}
