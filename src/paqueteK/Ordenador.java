package paqueteK;

public class Ordenador {
	
//INSERTIONSORT.	
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
	
	public void printArray(Object[] array){
		 for(int i=0; i<array.length;i++){
			 System.out.println(array[i]);
		 }
	}
	
	
		
}
