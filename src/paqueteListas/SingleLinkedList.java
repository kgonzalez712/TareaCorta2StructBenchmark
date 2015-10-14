package paqueteListas;

public class SingleLinkedList {
	protected Nodo head, tail;
	
	public SingleLinkedList() {
		head = tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addToHead(int el) {
		head = new Nodo(el,head);
		if (tail == null) {
			tail = head;
		}
	}
	
	public void addToTail(int el) {
		if (!isEmpty()) {
			tail.sig = new Nodo(el); tail = tail.sig;
		}
		else head = tail = new Nodo(el);
	}
	
	public void delete(int el) { 
		if (!isEmpty()){
			if (head == tail && el == head.ele){
				head = tail = null; 
			}
			else if (el == head.ele){ 
				head = head.sig; 
			}
			else { 
				Nodo pred, tmp;
				for (pred = head, tmp = head.sig;
						tmp != null && tmp.ele != el; 
						pred = pred.sig, tmp = tmp.sig);
				if (tmp != null) { 
					pred.sig = tmp.sig; 
					if (tmp == tail)  
						tail = pred;
				}
			}
		}
	}
	
}
