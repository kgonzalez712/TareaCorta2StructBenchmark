package paquetePruebas;
import paqueteOrdenador.*;
import paqueteArboles.*;

import java.util.Random;

/**
 * Clase para pruebas
 * @author Gustavo Fallas Carrera
 *
 */
public class pruebas {
	public static final Random generadorRamdon = new Random();
	
	public static void main(String[] arg){
		
		//##_______Selection Sort_______## 
		SelectionSort sortTest = new SelectionSort(500);//parametro: cantidad de elementos
		
		//**************************_ generar el array_ ******************************
		for(int i = 0; i < sortTest.array.length; i++){
			sortTest.array[i] = generadorRamdon.nextInt(1000);//next.... El tipo de elementos
		}
		//****************************************************************************
			
		//********************_ mostrar en consola_ **************************
//		System.out.println("sin ordenar:");
//		System.out.println(sortTest + "\n");
//		
//		long time1 = System.nanoTime();
//		sortTest.selectionSort();//metodo para ordenar
//		long time2 = System.nanoTime();
//		
//		System.out.println("ordenado:");
//		System.out.println(sortTest + "\n");
//		
//		System.out.println("Duration: ");
//		long timeT = time2 - time1;
//		System.out.println("Nanoseconds: " + timeT);
//		
//		System.out.println("Seconds: " + timeT / 1E9 + "\n");
		//******************************************************************
		
		//##_______Final Selection Sort_______## 		
		
		
		//##_______Binary Search Tree_______##
		BinarySearchTree b = new BinarySearchTree();
		
//		b.insert(13);
//		b.insert(5);
//		b.insert(15);
//		b.insert(2);
//		b.insert(8);
//		b.insert(14);
//		b.insert(17);
//		b.insert(10);
//		b.display();
//		
//		b.search(16);
//		
//		b.delete(5);
//		b.display();
		//##_______Final Binary Search Tree_______##		
	
	}


}
