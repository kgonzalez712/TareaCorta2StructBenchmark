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
	
	public int buscar(int ele){
		if (this.head==null){
			System.out.println("Error: la lista esta vacia");
			return 0;
		}
		else {
			int resul = 0;
			Nodo temp=this.head;
			while(!temp.sig.equals(this.head)){
				if (temp.ele==ele){
					resul=temp.ele;
					break;
				}
				else{
					temp=temp.sig;
				}
			}
			return resul;
		}
	}
}
