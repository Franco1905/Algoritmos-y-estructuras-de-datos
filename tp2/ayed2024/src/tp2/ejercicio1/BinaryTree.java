package tp2.ejercicio1;
//import 


public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public  int contarHojas() {
		int cont = 0;
		if (this.isLeaf()) {
			cont += 1;
		} else 
		{
			if (this.hasLeftChild()) {
				cont +=  this.getLeftChild().contarHojas();
			}
			if (this.hasRightChild()) {
				cont += this.getRightChild().contarHojas();
			}
		}
		return cont;
	}
		
	public void imprimir() {
	    imprimirAux(0);
	}

	private void imprimirAux(int profundidad) {
	    if (this.hasRightChild()) {
	        this.getRightChild().imprimirAux(profundidad + 1);
	    }
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < profundidad; i++) {
	        sb.append("    ");
	    }
	    sb.append(this.getData());  // append() acepta Object, no hay ambigüedad
	    System.out.println(sb.toString());
	    if (this.hasLeftChild()) {
	        this.getLeftChild().imprimirAux(profundidad + 1);
	    }
	}   
		
    
    public BinaryTree<T> espejo(){
    	// cada hijo le retorna su espejo a su padre
    	// el espejo se hace asignandole al HI del nuevo nodo el HD del nodo actual
    	// y al HD del nodo nuevo le asignamos el HI del nodo actual
    	BinaryTree<T> nue = new BinaryTree<T>();
    	nue.setData(data);
    	if (this.hasLeftChild()) {
    		nue.addRightChild(this.getLeftChild().espejo());
    	}
    	if (this.hasRightChild()) {
    		nue.addLeftChild(this.getRightChild().espejo());
    	}
 	   return nue;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		
   }
		
}

