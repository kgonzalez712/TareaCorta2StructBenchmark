package paqueteBusqueda;

/**
 * 
 * @author Fernanda
 *
 */

public class linearSearch {
	
	/**
	 * Funciona que busca en una arreglo el numero que le indicamos
	 * @param vector:array con la lista de numeros aleatorio
	 * @param Elem: int numeros que queremos que encuentre
	 */
	
	public void busquedaSecuencial(int vector[], int Elem){ 
        for (int i = 0; i < vector.length; i++){
            if (vector[i] == Elem){
            	System.out.println(i);
            }
            else{
            System.out.println(-1);
            } 
        	}
        }
	}