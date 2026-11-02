package ejercicio3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import src.tp5.ejercicio1.Edge;
import src.tp5.ejercicio1.Vertex;
import src.tp5.ejercicio1.listaAdy.AdjListGraph;

public class Mapa {

	private AdjListGraph<String> ciudades;

	public Mapa(String nombreCiudad) {
		this.ciudades = new AdjListGraph<String>();
		this.ciudades.createVertex(nombreCiudad);
	}

	public Mapa() {
		this.ciudades = new AdjListGraph<String>();
	}

	public List<String> devolverCamino(String ciudad1, String ciudad2) {
		boolean[] marca = new boolean[ciudades.getSize()];
		for (int i = 0; i < ciudades.getSize(); i++) {
			marca[i] = false;
		}
		List<String> resultado = new LinkedList<String>();
		Vertex<String> v = ciudades.search(ciudad1);
		if (v != null) {
			List<String> actual = new LinkedList<String>();
			int i = v.getPosition();
			dfs(i, ciudades, ciudad2, resultado, marca);
		}
		return resultado;

	}

	private void dfs(int i, AdjListGraph<String> ciu, String ciudad2, List<String> res, List<String> act,
			boolean[] marca) {
		marca[i] = true;
		Vertex<String> v = ciu.getVertex(i);
		List<Edge<String>> ady = ciu.getEdges(v);
		Iterator<Edge<String>> it = ady.iterator();
		while (it.hasNext() && res.get(res.size()-1) != ciudad2) {
			int j = it.next().getTarget().getPosition();
			if (!marca[i]) {
				dfs(j, ciu, ciudad2, res, act, marca);
			}
		}
		
		if (act.get(act.size())-1 == ciudad2) {
			
		}
		

	}

}
