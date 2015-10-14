package paqueteListas;

public class DoubleLinkedList {
	public Nodo head;
	public Nodo tail;
	
	/**
	 * Constructor de la clase Lista
	 */
	public DoubleLinkedList(){
		head=tail=null;
	}
	
	public boolean estaVacia(){
		return head==null;
	}
	/**
	 * Agrega un nuevo objeto al final de la lista
	 * @param ele Es el objeto que se va a agregar en la lista
	 */
	public void nuevoObj(int ele){
		Nodo nuevo= new Nodo(ele);
		if (!estaVacia()){
			this.tail.sig=nuevo;
			nuevo.ant=tail;
			tail=nuevo;
		}
		else{
			this.head = this.tail = nuevo;
		}
	}
	/**
	 * Retorna el tipo de clase que se ingresa en "ele" y retorna ese tipo cuando el elemento es encontrado
	 * @param ele Un elemento de cualquier tipo.
	 * @return retorna ese tipo de elemento cuando el elemento es encontrado
	 */
	public int buscar(int ele){
		Nodo temp;
		temp=this.head;
		while (temp!=null){
			if (temp.ele!=ele){
				temp=temp.sig;
			}
			else{
				break;
			}
		}
		if (temp==null){
			System.out.println("No se encontro el elemento");
			return 0;
		}
		System.out.println(temp.ele);
		return temp.ele;
	}
	
	/**
	 * Busca un elemento de la lista y lo elimina de la misma
	 * @param ele Es el elemento que se va a borrar de la lista
	 */
	public void EliminarObj(int ele){
		Nodo temp;
		temp=head;
		if (head!=null){
			if(ele==head.ele){
				this.head=head.sig;
			}
			else if(ele==tail.ele){
				this.tail=tail.ant;
			}
			else{
				boolean borrado=false;
				while (temp!=null){
					if (temp.ele!=ele){
						if ( borrado){
							temp=temp.sig;
						}
						else{
							temp=temp.sig;
						}
					}
					else{
						temp.ant.sig=temp.sig;
						temp.sig.ant=temp.ant;
						borrado=true;
						temp=temp.sig;
					}
				}
			}
		}
	}
	
}