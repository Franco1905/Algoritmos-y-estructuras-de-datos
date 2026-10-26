package tp2.ejercicio9;
import tp2.ejercicio1.BinaryTree;
public class ParcialArboles {
	
	public BinaryTree<Integer[]> sumAndDif(BinaryTree<Integer> arbol) {
		if (arbol == null) {
			return null;
		} else {
			BinaryTree<Integer[]> res = sumRecu(arbol,0,0);
			return res;
		}
	}
	
	
	private BinaryTree<Integer[]>  sumRecu(BinaryTree<Integer> arb, Integer valorPadre,Integer suma) {
		BinaryTree<Integer[]> nue = new BinaryTree<Integer[]>();
		Integer[] array = new Integer[2];
		array[0] = arb.getData() + suma;
		array[1] = arb.getData() - valorPadre;
		System.out.println("Soy el " + arb.getData());
		System.out.println("mi padre es el " + valorPadre);
		System.out.println( "suma -> " +  array[0] + " / " + "diferencia -> " + array[1]);
		nue.setData(array);
		if (arb.hasLeftChild()) {
			System.out.println("voy al hijo izquierdo");
			nue.addLeftChild(sumRecu(arb.getLeftChild(),arb.getData(),array[0]));
		}
		if (arb.hasRightChild()) {
			System.out.println("voy al hijo derecho");
			nue.addRightChild(sumRecu(arb.getRightChild(),arb.getData(),array[0]));
		}
		return nue;
	}
	
	
}
