package paqueteK;
/**
 * 
 * @author Kevin
 *
 */
public class InsertionSort {
	
	/**
	 * Recibe un arreglo y lo ordena utilizando el insertion sort
	 * @param array
	 * @return retorna el arreglo ordenado
	 */
	public Object[] insertionSort(Object[] array){
		for(int i=1; i<array.length;i++){
			int key = Integer.parseInt(array[i].toString());
			int j=i-1;
			while(j>=0 && Integer.parseInt(array[j].toString())>key){
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
		}
		return array;
	}
	/**
	 * Recibe un arreglo y lo imprime en consola
	 * @param array
	 */
	public void printArray(Object[] array){
		String arreglo="[";
		 for(int i=0; i<array.length;i++){
			 arreglo+=array[i] + ", ";
		 }
		 arreglo+= array[array.length-1] + "]";
		 System.out.println(arreglo);
	}
	
	
		
}
