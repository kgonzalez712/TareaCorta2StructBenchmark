package paqueteK;

public class AVLNode {
	Object element;
	AVLNode left;
	AVLNode right;
	int height;
	
	public AVLNode(Object element){
		this(element,null,null);
	}
	public AVLNode(Object element,AVLNode left, AVLNode right){
		this.element=element;
		this.right=right;
		this.left=left;
		this.height=0;
	}
}
