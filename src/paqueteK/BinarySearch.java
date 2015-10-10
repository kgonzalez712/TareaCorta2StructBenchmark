package paqueteK;


public class BinarySearch {

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