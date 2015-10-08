package paqueteG;


import java.util.Random;

/**
 * Clase para pruebas
 * @author Gustavo Fallas Carrera
 *
 */
public class pruebas {
	public static final Random generadorRamdon = new Random();
	
	public static void main(String[] arg){
		
		SelectionSort sortTest = new SelectionSort(10);//parametro: cantidad de elementos
		
		
//**************************_ generar el array_ ******************************
		for(int i = 0; i < sortTest.array.length; i++){
			sortTest.array[i] = generadorRamdon.nextGaussian();//next.... El tipo de elementos
		}
//****************************************************************************
	
		
		
//********************_ mostrar en consola_ **************************
		
		System.out.println("sin ordenar:");
		System.out.println(sortTest + "\n");
		
		long time1 = System.nanoTime();
		sortTest.selectionSort();//metodo para ordenar
		long time2 = System.nanoTime();
		
		System.out.println("ordenado:");
		System.out.println(sortTest + "\n");
		
		System.out.println("Duration: ");
		long timeT = time2 - time1;
		System.out.println("Nanoseconds: " + timeT);
		
		System.out.println("Seconds: " + timeT / 1E9);
//******************************************************************
		
		
		
//		BinarySearchTree b = new BinarySearchTree();
//		
//		b.insert(3);
//		b.insert(8);
//		b.insert(1);
//		b.insert(4);
//		b.insert(2);
//		
//		b.display(b.root);
//		
//		System.out.println("");
//		System.out.println("Check whether Node with value 4 exists : " + b.find(4));
//		System.out.println("Delete Node with no children (2) : " + b.delete(2));		
//		b.display(b.root);
//		System.out.println("\n Delete Node with one child (4) : " + b.delete(4));		
//		b.display(b.root);
//		System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));		
//		b.display(b.root);
	}


}
