package tp3.ejercicio9;

import java.util.Iterator;
import java.util.List;
import tp3.ejercicio1.GeneralTree;

public class PracticaArboles {
	public static boolean esDeSeleccion(GeneralTree<Integer> arbol) {
		boolean ok = true;
		if (!arbol.isLeaf()) {
			Integer minimo = Integer.MAX_VALUE;
			List<GeneralTree<Integer>> children = arbol.getChildren();
			Iterator<GeneralTree<Integer>> it = children.iterator();
			while (it.hasNext() && ok == true) {
				GeneralTree<Integer> child = it.next();
				if (child.getData() < minimo) {
					minimo = child.getData();
				}
				ok = esDeSeleccion(child);
			}
			if (arbol.getData() != minimo) {
				ok = false;
			}
		}
		return ok;
	}
}
