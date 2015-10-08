package paqueteG;

import java.util.Arrays;


/**
 * Clase que realiza el ordenamiento por selección, para los tipos de array:
 * boolean, int, double, float y long.
 * 
 * @author Gustavo Alonso Fallas Carrera.
 *
 */
public class SelectionSort {
		
	public Object[] array;

	/**
	 * Constructor de la clase.
	 * @param size , tamaño del array a ordenar
	 */
	public SelectionSort(int size){
		array = new Object[size];
	}
	
	/**
	 * Metodo que toma el ultimo elemento del array, con el primer <<for>>
	 * en el segundo <<for>> pregunta que tipo de datos tiene el array y segun
	 * a eso toma el menor elemento , y llama el metodo swap
	 */
	public void selectionSort(){
		int minIndex;
		
		for(int i = 0; i < array.length - 1; i++){
			minIndex = i;
			
			for(int index = i + 1; index < array.length; index ++){
				if(array[i].getClass().equals(java.lang.Boolean.class)){
					if((boolean)array[index] != true){
						minIndex = index;
					}
				}//final if Boolean
				
				if(array[i].getClass().equals(java.lang.Integer.class)){
					if(Integer.parseInt(array[index].toString()) < Integer.parseInt(array[minIndex].toString())){
						minIndex = index;
					}
				}//final if Integer(int)
				
				if(array[i].getClass().equals(java.lang.Double.class)){
					if((double)array[index] < (double)array[minIndex]){
						minIndex = index;
					}
				}//final if double
				
				if(array[i].getClass().equals(java.lang.Float.class)){
					if((float)array[index] < (float)array[minIndex]){
						minIndex = index;
					}
				}//final if float
				
				if(array[i].getClass().equals(java.lang.Long.class)){
					if((long)array[index] < (long)array[minIndex]){
						minIndex = index;
					}
				}//final if long
				
			}//final second for*
			
			swap(i , minIndex);
			
		}//final for
	}//final selectionSort
	
	/**
	 * Metodo que realiza el cambio en el array.
	 * 
	 * @param first 
	 * @param second
	 */
	public void swap(int first, int second){
		Object temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}//final swap
	
	
	/**
	 * Metodo que convierte el array en string para mostrarlo en consola
	 */
	public String toString(){
		return Arrays.toString(array);
	}//final toString
	
	
	
}//final class
