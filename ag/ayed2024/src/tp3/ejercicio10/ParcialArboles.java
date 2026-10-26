package tp3.ejercicio10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio1.GeneralTree;

public class ParcialArboles {

	public static List<Integer> resolver(GeneralTree<Integer> arbol) {
		LinkedList<Integer> resultado = new LinkedList<Integer>();
		if (arbol != null && !arbol.isEmpty()) {
			ArrayList<Integer> vMax = new ArrayList<Integer>();
			vMax.add(0);
			vMax.add(Integer.MIN_VALUE);
			LinkedList<Integer> actual = new LinkedList<Integer>();
			resolverRecu (arbol,vMax,actual,resultado,0);
			
		}

		return resultado;
	}
	
	private static void resolverRecu (GeneralTree<Integer> arbol, ArrayList<Integer> vMax, LinkedList<Integer> lAct, LinkedList<Integer> lRes, Integer niv) {
		boolean ok = false;
		if (arbol.getData() == 1) {
			lAct.add(arbol.getData());
			vMax.set(0, vMax.get(0) + niv);
			ok = true;
		}
		List<GeneralTree<Integer>> children = arbol.getChildren();
		Iterator<GeneralTree<Integer>> it = children.iterator();
		while (it.hasNext()) {
			GeneralTree<Integer> child = it.next();
			resolverRecu (child,vMax,lAct,lRes,niv++);
		}
		if (arbol.isLeaf()) {
			if (vMax.get(0) > vMax.get(1)) {
				lRes.clear();
				lRes.addAll(lAct);
			}
		}
		if (ok) {
			lAct.remove(lAct.size() - 1);
		}
	}

}
