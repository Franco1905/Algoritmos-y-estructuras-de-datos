package tp3.ejercicio2.bin;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tp3.ejercicio1.GeneralTree;
import tp3.ejercicio1.Queue;

public class RecorridosAG {

	public static List<Integer> numImpPreorder(GeneralTree<Integer> a, Integer n) {
		List<Integer> resultado = new LinkedList<Integer>();
		if (!(a == null || a.isEmpty())) {
			numImpRecPreorden(a, n, resultado);
		}
		return resultado;
	}

	public static List<Integer> numImpPosorder(GeneralTree<Integer> a, Integer n) {
		List<Integer> resultado = new LinkedList<Integer>();
		if (!(a == null || a.isEmpty())) {
			numImpRecPosorden(a, n, resultado);
		}
		return resultado;
	}

	public static List<Integer> numImpInorden(GeneralTree<Integer> a, Integer n) {
		List<Integer> resultado = new LinkedList<Integer>();
		if (!(a == null || a.isEmpty())) {
			numImpRecInorden(a, n, resultado);
		}
		return resultado;
	}

	public static List<Integer> numImpNiveles(GeneralTree<Integer> a, Integer n) {
		List<Integer> l = new LinkedList<Integer>();
		Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
		if ((a != null) && (!a.isEmpty())) {
			cola.enqueue(a);
			while (!cola.isEmpty()) {
				GeneralTree<Integer> aux = cola.dequeue();
				if ((aux.getData() % 2 != 0) && (aux.getData() > n)) {
					l.add(aux.getData());
				}
				List<GeneralTree<Integer>> children = aux.getChildren();
				Iterator<GeneralTree<Integer>> it = children.iterator();
				while (it.hasNext()) {
					GeneralTree<Integer> child = it.next();
					cola.enqueue(child);
				}
			}
		}
		return l;
	}

	private static void numImpRecPreorden(GeneralTree<Integer> a, Integer n, List<Integer> l) {
		if (a.getData() % 2 == 1 && a.getData() > n) {
			l.add(a.getData());
		}
		if (!a.isLeaf()) {
			List<GeneralTree<Integer>> children = a.getChildren();
			Iterator<GeneralTree<Integer>> it = children.iterator();
			while (it.hasNext()) {
				GeneralTree<Integer> child = it.next();
				numImpRecPreorden(child, n, l);
			}
		}
	}

	private static void numImpRecPosorden(GeneralTree<Integer> a, Integer n, List<Integer> l) {
		if (!a.isLeaf()) {
			List<GeneralTree<Integer>> children = a.getChildren();
			Iterator<GeneralTree<Integer>> it = children.iterator();
			while (it.hasNext()) {
				GeneralTree<Integer> child = it.next();
				numImpRecPosorden(child, n, l);
			}
		}
		if (a.getData() % 2 == 1 && a.getData() > n) {
			l.add(a.getData());
		}
	}

	private static void numImpRecInorden(GeneralTree<Integer> a, Integer n, List<Integer> l) {
		if (!a.isLeaf()) {
			List<GeneralTree<Integer>> children = a.getChildren();
			Iterator<GeneralTree<Integer>> it = children.iterator();
			GeneralTree<Integer> child;
			if (it.hasNext()) {
				child = it.next();
				numImpRecInorden(child, n, l);
			}
		}
		if (a.getData() % 2 == 1 && a.getData() > n) {
			l.add(a.getData());
		}

		if (!a.isLeaf()) {
			List<GeneralTree<Integer>> children = a.getChildren();
			Iterator<GeneralTree<Integer>> it = children.iterator();
			GeneralTree<Integer> child = it.next(); // piso el primer dato que ya procese
			while (it.hasNext()) {
				child = it.next();
				numImpRecInorden(child, n, l);
			}
		}

	}

}