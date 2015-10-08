package paqueteK;

import java.util.Random;



public class pruebaCon10Entradas{
 public static void main(String arg[ ]) {
	 Random rnd = new Random();
	 Object[]data = new Object[10];
	 int c=0;
	 String array="[";
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
	 Ordenador o = new Ordenador();
	 long tiempo1=System.nanoTime();
	 o.insertionSort(data);
	 long tiempo2=System.nanoTime();
	 long tiempoT=tiempo2-tiempo1;
	 o.printArray(data);
	 System.out.println(tiempoT/1E9);
 }
}