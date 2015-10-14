package paqueteListas;

public class CircularLinkedList {
	public Nodo tail;
	public Nodo head;
	
	public void nuevoObj(int ele){
		Nodo nuevo= new Nodo(ele);
		if (head!=null){
			this.tail.sig=nuevo;
			nuevo.sig=head;
			tail=nuevo;
		}
		else{
			this.head = this.tail = nuevo;
			nuevo.sig=nuevo;
			
		}
	}
	
}
