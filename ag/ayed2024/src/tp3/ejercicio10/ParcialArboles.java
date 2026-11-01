package tp3.ejercicio10;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio1.GeneralTree;

public class ParcialArboles {

	public static List<Integer> resolver(GeneralTree<Integer> arbol) {
		LinkedList<Integer> resultado = new LinkedList<Integer>();
		if (arbol != null && !arbol.isEmpty()) {
			LinkedList<Integer> actual = new LinkedList<Integer>();
			Integer  max = recu(actual,resultado,0,arbol,Integer.MIN_VALUE,0);
		}
		return resultado;
	}

	private static Integer recu(LinkedList<Integer> actual, LinkedList<Integer> resultado, Integer suma,
			GeneralTree<Integer> arbol, Integer max, Integer niv) {
		boolean ok = false;
		int sumAux = niv * arbol.getData();
		if (arbol.getData() == 1) {
			actual.add(arbol.getData());
			ok = true;
		}
		if (arbol.isLeaf()) {
			if (suma > max) {
				max = suma;
				resultado.clear();
				resultado.addAll(actual);

			}
		} else {
			List<GeneralTree<Integer>> children = arbol.getChildren();
			Iterator<GeneralTree<Integer>> it = children.iterator();
			while (it.hasNext()) {
				GeneralTree<Integer> child = it.next();
				max = recu(actual, resultado, suma + sumAux, child, max,niv++);
			}
		}
		if (ok) {
			actual.remove(actual.size() - 1);
		}
		return max;
	}
}