package tp2.ejercicio8;

import tp2.ejercicio1.BinaryTree;

public class ParcialArboles {
	public boolean esPrefijo (BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		boolean ok = false;
		if (arbol1.getData().equals(arbol2.getData())) {
			ok = true;
		}
		if (arbol1.hasLeftChild() && arbol2.hasLeftChild()) {
			ok = esPrefijo(arbol1.getLeftChild(),arbol2.getLeftChild());
		}
		if (arbol1.hasRightChild() && arbol2.hasRightChild()) {
			ok = esPrefijo(arbol1.getRightChild(),arbol2.getRightChild());
		}
		return ok;
	}
}
