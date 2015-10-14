package paquetePruebas;
import paqueteArboles.*;


public class PruebaAVL {
	
	  public static void main(String[] args)
	    {            
	        /* Creating object of AVLTree */
	        AVLTree avlt = new AVLTree();
	        for(int i=0;i<10;i++){
	        	 avlt.insert(i);
	        }
	        long tiempo1=System.nanoTime();
	        avlt.insert(10);
	        long tiempo2=System.nanoTime();
	        long tiempoT1=tiempo2-tiempo1;
	        System.out.println("El tiempo que tarda en insertar el elemento es de" + tiempoT1/1E9 + "s");
	        long tiempo3=System.nanoTime();
	        avlt.search(6);
	        long tiempo4=System.nanoTime();
	        long tiempoT2=tiempo4-tiempo3;
	        System.out.println("El tiempo que tarda en buscar el elemento es de " + tiempoT2/1E9 + "s");
	        
	    }
}