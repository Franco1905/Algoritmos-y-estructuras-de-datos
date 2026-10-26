package tp3.ejercicio7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio1.GeneralTree;

public class Caminos {
	GeneralTree<Integer> arbol;

	public Caminos() {
		this.arbol = new GeneralTree<Integer>();
	}

	public Caminos(GeneralTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public List<Integer> caminoAHojasMasLejana() {
		List<Integer> resultado = new LinkedList<Integer>();
		if (this.arbol != null && !this.arbol.isEmpty()) {
			List<Integer> actual = new LinkedList<Integer>();
			caminoRecursivo(this.arbol, actual, resultado);
		}
		return resultado;
	}

	private void caminoRecursivo(GeneralTree<Integer> arbol, List<Integer> actual, List<Integer> resultado) {
		actual.add(arbol.getData());
		if (arbol.isLeaf()) {
			if (actual.size() > resultado.size()) {
				resultado.clear();
				resultado.addAll(actual);
			}
		} else {
			List<GeneralTree<Integer>> children = arbol.getChildren();
			Iterator<GeneralTree<Integer>> it = children.iterator();
			while (it.hasNext()) {
				GeneralTree<Integer> child = it.next();
				caminoRecursivo(child, actual, resultado);
			}
		}
		actual.remove(actual.size() - 1);
	}
}
