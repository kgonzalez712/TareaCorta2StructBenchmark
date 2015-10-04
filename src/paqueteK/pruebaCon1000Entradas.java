package paqueteK;

import java.util.Random;



public class pruebaCon1000Entradas{
 public static void main(String arg[ ]) {
	 Random rnd = new Random();
	 Object[]data = new Object[1000];
	 int c=0;
	 while(c<data.length){
		data[c] = (int) (rnd.nextDouble()*100+0);
		c++;
	 }
	 System.out.println("Arreglo original");
	 for(int i=0; i<data.length;i++){
		 System.out.println(data[i]);
	 }
     System.out.println("==========");
     System.out.println("Arreglo ordenado");
	 Ordenador o = new Ordenador();
	 o.insertionSort(data);
	 o.printArray(data);
 }
}