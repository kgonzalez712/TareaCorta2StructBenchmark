package paqueteF;

public class pruebaArbol {

	public static void main(String[] args){
		
		SplayTree a= new SplayTree();
		for (int i=0;i<10;i++){
			a.insert(i);
		}
		
		long tiempo1=System.nanoTime();
		a.insert(8);
		long tiempo2=System.nanoTime();
      	long tiempoT=tiempo2-tiempo1;
      	System.out.println(tiempoT/1E9);
      	long tiempo3=System.nanoTime();
      	a.search(9);
      	long tiempo4=System.nanoTime();
      	long tiempoT1=tiempo4-tiempo3;
      	System.out.println(tiempoT1/1E9);
      	
      	
	}
	
}
