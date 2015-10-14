package paquetePruebas;
import paqueteOrdenador.*;

import java.util.Random;
import paqueteBusqueda.*;


public class pruebaCon10000Entradas{
 public static void main(String arg[ ]) {
	 Random rnd = new Random();
	 BinarySearch b = new BinarySearch();
	 Object[]data = new Object[10000];
	 String array="[";
	 int c=0;
	 while(c<data.length){
		data[c] = (int) (rnd.nextDouble()*100+0);
		c++;
	 }
	 
	 System.out.println("Arreglo original");
	 for(int i=0; i<data.length;i++){
		 array+=data[i] + ", ";
	 }
	 array+= data[data.length-1] + "]";
	 System.out.println(array);
	 
     System.out.println("Arreglo ordenado");
     InsertionSort o = new InsertionSort();
	 long tiempo1=System.nanoTime();
	 o.insertionSort(data);
	 long tiempo2=System.nanoTime();
	 long tiempoT1=tiempo2-tiempo1;
	 o.printArray(data);
	 System.out.println("El tiempo que tarda en ordenar el arreglo es de" + tiempoT1/1E9 + "s");
	 long tiempo3=System.nanoTime();
	 Object[]a=o.insertionSort(data);
	 b.binarySearch(5300,a,10000);
	 long tiempo4=System.nanoTime();
	 long tiempoT2=tiempo4-tiempo3;
	 System.out.println("El tiempo que tarda en encontrar el elemento en el arreglo es de" + tiempoT2/1E9 + "s");


 }
}