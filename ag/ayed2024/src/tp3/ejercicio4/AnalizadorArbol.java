package tp3.ejercicio4;

import java.util.Iterator;
import java.util.List;

import tp3.ejercicio1.GeneralTree;
import tp3.ejercicio1.Queue;

public class AnalizadorArbol {
	public static double devolverMaximoPromedio(GeneralTree<AreaEmpresa> arbol) {
		if (arbol == null || arbol.isEmpty())
			return -1;
		Queue<GeneralTree<AreaEmpresa>> cola = new Queue<GeneralTree<AreaEmpresa>>();
		cola.enqueue(arbol);
		cola.enqueue(null);
		double cont = 0;// cantidad de hijos
		double sumProm = 0; // suma total de los elementos, se usa tambien para almacenar el promedio
		double max = -1; // promedio maximo
		while (!cola.isEmpty()) {
			GeneralTree<AreaEmpresa> aux = cola.dequeue();
			if (aux != null) {
				cont++;
				sumProm += aux.getData().getTardanaza(); // sumo la tardanza del elemento actual para el promedio
				List<GeneralTree<AreaEmpresa>> children = aux.getChildren();
				Iterator<GeneralTree<AreaEmpresa>> it = children.iterator();
				System.out.println(cont);
				while (it.hasNext()) {
					GeneralTree<AreaEmpresa> child = it.next();
					cola.enqueue(child);
				}
			} else {
				// aca ya se termino el nivel que se estaba procesando
				sumProm = sumProm / cont;
				if (sumProm > max) {
					max = sumProm;
				}
				sumProm = 0;
				cont = 0;
				System.out.println("Termine de nivel");
				if (!cola.isEmpty()) {
					cola.enqueue(null);
				}
			}
		}
		System.out.println("Termine");
		return max;
	}
}
