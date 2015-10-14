package paqueteK;


public class BinarySearch {
		/**
		 * Realiza una busqueda binaria sobre el arreglo con el elemento ingresado
		 * @param key
		 * @param data
		 * @param size
		 * @return true si el elemento se encuentra y false si no
		 */
	    public boolean binarySearch(int key,Object[] data,int size) 
	    {
	         int low = 0;
	         int high = size - 1;
	          
	         while(high >= low) {
	             int middle = (low + high) / 2;
	             if(Integer.parseInt(data[middle].toString()) == key) {
	                 return true;
	             }
	             if(Integer.parseInt(data[middle].toString()) < key) {
	                 low = middle + 1;
	             }
	             if(Integer.parseInt(data[middle].toString()) > key) {
	                 high = middle - 1;
	             }
	        }
	        return false;
	  }
}