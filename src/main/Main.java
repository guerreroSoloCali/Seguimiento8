package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;



import model.Medalla;
import model.Pais;
import model.PaisData;

public class Main {
	
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		start();
	}
	
	public static void start() {
		
		String[] split =null;
		String string = "";
		
		try {
			
			FileInputStream file = new FileInputStream(new File("src/data/in.txt"));
			BufferedReader reader = new BufferedReader(new InputStreamReader(file));
			 string = "";
			String line;
			while((line = reader.readLine()) !=null) {
				string += line;
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		split= string.split(" ");
		int paises = Integer.parseInt(split[0].replace(" ", ""));
		PaisData data = new PaisData();
		String []info = new String[paises];
		
		for(int i= 0;i<paises;i++) {
			
			info [i]= split[i+1];
			data = orden(data,"1",info[i].split(";"),paises);
			
		}
		
		System.out.print("\n Masculino \n");
		data.imprimir();
		
		System.out.print("\n----------\n");
		data.limpiarData();	
		
		for(int i= 0;i<paises;i++) {
			
			data = orden(data,"2",info[i].split(";"),paises);
		}
		
		data.orden();
		
		System.out.print("\n Femenino \n");
		data.imprimir();
		System.out.print("\n----------\n");
		data.limpiarData();	
		for(int i= 0;i<paises;i++) {
			data = orden(data,"3",info[i].split(";"),paises);
		}
		
		data.orden();
		System.out.print("\n Combinado Masculino Y femenino \n ");
		data.imprimir();
	}
	
	
	public static PaisData orden(PaisData data,String tipo, String[] split, int paises) {
		
		data.agregarPais(new Pais(split[0],new Medalla(Integer.parseInt(split[1])),new Medalla(Integer.parseInt(split[2])),
					new Medalla(Integer.parseInt(split[3])),new Medalla(Integer.parseInt(split[4])),new Medalla(Integer.parseInt(split[5])),
					new Medalla(Integer.parseInt(split[6])),tipo));
		data.orden();
		return data;
		
	}

}

