package tp3.ejercicio1.copy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GeneralTree<T> {

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>();

	public GeneralTree() {

	}

	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}

	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}

	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}

	public boolean hasChildren() {
		return !this.children.isEmpty();
	}

	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}

	public int altura() { // consultar si se puede hacer sin el metodo auxiliar
		int max = this.alturaRecu(0);
		;
		return max;
	}

	// PREGUNTAR: el parametro cont llega en cero a la hoja, y el metodo devuelte la
	// altura + 1
	private int alturaRecu(int cont) {
		System.out.println("Estoy en el nodo: " + this.data);
		if (this.isLeaf()) {
			System.out.println(cont + "/" + this.data);
			return cont++;
		} else {
			int aux;
			int max = -1;
			List<GeneralTree<T>> children = this.getChildren();
			Iterator<GeneralTree<T>> it = children.iterator();
			while (it.hasNext()) {
				System.out.println("Estoy en el nodo: " + this.data);
				GeneralTree<T> child = it.next();
				aux = child.alturaRecu(cont++);
				System.out.println("Estoy en el nodo: " + this.data);
				System.out.println(cont + "/" + max + "/" + this.data);
				if (aux > max) {
					max = aux;
				}
			}
			return max;
		}
	}

	public boolean esAncestro(T padre, T hijo) {
		boolean ok = false;
		GeneralTree<T> raiz = buscar(padre); // retorna un arbol vacio!!
		//System.out.println(raiz.getData() + "/" + raiz.isEmpty() + "/" + padre);
		if (!raiz.isEmpty()) {
			GeneralTree<T> nodo = raiz.buscar(hijo);
			//System.out.println("dato hijo: " + nodo.getData());
			if (!nodo.isEmpty()) {
				ok = true;
			}
		}
		return ok;
	}

	public GeneralTree<T> buscar(T dato) {
		GeneralTree<T> aux = new GeneralTree<T>();
		if (this.data.equals(dato)) {
			return this;
		}
		// System.out.println("Aux vacio: " + aux.isEmpty());
		List<GeneralTree<T>> children = this.getChildren();
		Iterator<GeneralTree<T>> it = children.iterator();
		while (it.hasNext() && aux.isEmpty()) {
			GeneralTree<T> child = it.next();
			aux = child.buscar(dato);
		}
		// System.out.println(aux.getData());
		return aux;
	}

	public int nivel(T dato) {
		return 0;
	}

	public int ancho() {

		return 0;
	}
}