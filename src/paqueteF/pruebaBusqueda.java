package paqueteF;

import java.util.Arrays;

public class pruebaBusqueda {

public static void main(String[] args){
		
		long tiempo1=System.nanoTime();
		int [] lista = new int[10000];
		for (int i=0;i<lista.length;i++){
        	  lista[i] = (int)(Math.random()*100)+0;
        }
        linearSearch l = new linearSearch();
        l.busquedaSecuencial(lista,34);
        System.out.println(Arrays.toString(lista));
        long tiempo2=System.nanoTime();
      	long tiempoT=tiempo2-tiempo1;
      	System.out.println(tiempoT/1E9);
}}
	
