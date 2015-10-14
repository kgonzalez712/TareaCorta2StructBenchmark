package paqueteListas;

public class Nodo {
	/**
	 * Atributos de la clase nodo
	 */
	public int ele;
	public Nodo sig;
	public Nodo ant;
	int indice;
	/**
	 * Constructor de la clase recive un objeto y lo asigna a su elemento
	 * @param i objeto el cual va a ser adicionado como el elemento
	 */
	public Nodo(int i){
		this.ele=i;
	}
	public Nodo(int i,Nodo n){
		this.ele=i;
		this.sig=n;
	}
}