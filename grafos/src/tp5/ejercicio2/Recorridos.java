package src.tp5.ejercicio2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import src.tp5.ejercicio1.Edge;
import src.tp5.ejercicio1.Graph;
import src.tp5.ejercicio1.Vertex;
import tp3.ejercicio1.Queue;

public class Recorridos<T> {

	public List<T> dfs(Graph<T> grafo) {
		boolean[] marca = new boolean[grafo.getSize()];
		for (int i = 0; i < grafo.getSize(); i++) {
			marca[i] = false;
		}
		List<T> lista = new LinkedList<T>(); // creo la lista a retornar
		for (int i = 0; i < grafo.getSize(); i++) {
			if (!marca[i]) {
				dfs(i, grafo, marca, lista);
			}
		}
		return lista; // si el grafo esta vacio, retorna una lista vacia
	}

	private void dfs(int i, Graph<T> grafo, boolean[] marca, List<T> lista) {
		marca[i] = true; // marco nodo actual como visitado
		Vertex<T> v = grafo.getVertex(i); // obtengo el vertice en la posicion actual y lo guardo en v
		List<Edge<T>> adyacentes = grafo.getEdges(v); // obtengo la lista de aristas de v (adyacentes)
		Iterator<Edge<T>> it = adyacentes.iterator(); // crea un iterador con las aristas
		lista.add(grafo.getVertex(i).getData());
		while (it.hasNext()) {
			int j = it.next().getTarget().getPosition(); // obtiene la siguiente arista,su destino (vertice), y luego la
															// posicion de este en el arreglo de vertices
			if (!marca[j]) {
				dfs(j, grafo, marca, lista);
			}
		}
	}

	public List<T> bfs(Graph<T> grafo) {
		boolean[] marca = new boolean[grafo.getSize()];
		for (int i = 0; i < grafo.getSize(); i++) {
			marca[i] = false;
		}
		List<T> lista = new LinkedList<T>();
		for (int i = 0; i < grafo.getSize(); i++) {
			if (!marca[i]) {
				bfs(i, grafo, marca, lista);
			}
		}
		return lista;
	}

	private void bfs(int i, Graph<T> grafo, boolean[] marca, List<T> lista) {
		marca[i] = true;
		Queue<Vertex<T>> queue = new Queue<Vertex<T>>();
		queue.enqueue(grafo.getVertex(i));
		lista.add(grafo.getVertex(i).getData());
		while (!queue.isEmpty()) {
			Vertex<T> v = queue.dequeue();
			List<Edge<T>> adyacentes = grafo.getEdges(v);
			Iterator<Edge<T>> it = adyacentes.iterator();
			while (it.hasNext()) {
				Edge<T> act = it.next();
				if (!marca[act.getTarget().getPosition()]) {
					lista.add(grafo.getVertex(i).getData());
					queue.enqueue(act.getTarget());
				}
			}
		}

	}
	// yo diria que ambos reorridos son de orden lineal

}
