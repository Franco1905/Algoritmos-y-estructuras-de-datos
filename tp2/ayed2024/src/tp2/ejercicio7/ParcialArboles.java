package tp2.ejercicio7;
import tp2.ejercicio1.BinaryTree;
public class ParcialArboles {
	private BinaryTree<Integer> arbol;  
	
	public ParcialArboles () {}
	public ParcialArboles(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	
	/* como hago que detenga la ejecucion cuando encuentra el dato¿¿¿*/
	/*private boolean buscar (Integer dato, BinaryTree<Integer> arb,BinaryTree<Integer> res){
		//System.out.println("entre a buscar");
		boolean ok = false;
		if (arb.getData() == dato) {
			//System.out.println("encontre el dato");
			res =  arb;
			return true;
		}
		else {
			//System.out.println("NO encontre el dato");
			if (this.arbol.hasLeftChild() && ok == false) {
				//System.out.println("voy al hijo izquierdo");
				ok = buscar(dato,arb.getLeftChild(),res);
			}
			if (this.arbol.hasRightChild() && ok == false) {
				//System.out.println("voy al hijo izquierdo");
				ok = buscar(dato,arb.getRightChild(),res);
			}
			return false;
		}
				
	}*/
	
	private BinaryTree<Integer> buscar (Integer dato,BinaryTree<Integer> arb){
		BinaryTree<Integer> res = new BinaryTree<Integer>();
		if (arb.getData().equals(dato)) {
			return arb;
		}
		if (arb.hasLeftChild()) {
			res = buscar (dato,arb.getLeftChild());
		}
		if (arb.hasRightChild() && res == null) {
			res = buscar (dato,arb.getRightChild());
		}
		return res;
	}
	
	private Integer contar (BinaryTree<Integer> arbol) {
		Integer aux = 0; 
		Integer cont = 0;
		if (arbol.hasLeftChild()) {
			aux ++;
			cont += contar(arbol.getLeftChild());
		}
		if (arbol.hasRightChild()) {
			aux ++;
			cont += contar(arbol.getRightChild());
		}
		//System.out.println(cont);
		//System.out.println("hola");
		if (aux == 1) {
			return cont + 1;
		}
		return cont;
	}
	
	public boolean isLeftTree (Integer num) {
		BinaryTree<Integer> arb = buscar(num,this.arbol);
		int contI = -1; int contD = -1;
		//System.out.println(contI + " / " + contD);
		if (arb == null) {
			return false;
		} 		
		else {
			//System.out.println(arb.getData());
			if (arb.hasLeftChild()) {
				//System.out.println("Entre a contar Hi");
				contI = contar(arb.getLeftChild());
			} 
			if (arb.hasRightChild()) {
				//System.out.println("Entre a contar Hd");
				contD = contar(arb.getRightChild());
			}
		}
		System.out.println(contI + " / " + contD);
		return contI > contD; 
	}
	
	public BinaryTree<Integer> getArbol () {
		return this.arbol;
	}
}
