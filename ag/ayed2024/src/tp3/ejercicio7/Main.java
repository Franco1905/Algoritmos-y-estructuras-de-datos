package tp3.ejercicio7;

import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio1.GeneralTree;

public class Main {

	// Pegá estos métodos dentro de tu clase.

	public static GeneralTree<Integer> crearArbol1() {
		GeneralTree<Integer> arbol1Raiz = new GeneralTree<>(12);
		GeneralTree<Integer> arbol1RaizNodo1 = new GeneralTree<>(17);
		arbol1Raiz.addChild(arbol1RaizNodo1);
		GeneralTree<Integer> arbol1RaizNodo2 = new GeneralTree<>(10);
		arbol1RaizNodo1.addChild(arbol1RaizNodo2);
		GeneralTree<Integer> arbol1RaizNodo3 = new GeneralTree<>(6);
		arbol1RaizNodo1.addChild(arbol1RaizNodo3);
		GeneralTree<Integer> arbol1RaizNodo4 = new GeneralTree<>(1);
		arbol1RaizNodo3.addChild(arbol1RaizNodo4);
		GeneralTree<Integer> arbol1RaizNodo5 = new GeneralTree<>(9);
		arbol1Raiz.addChild(arbol1RaizNodo5);
		GeneralTree<Integer> arbol1RaizNodo6 = new GeneralTree<>(8);
		arbol1RaizNodo5.addChild(arbol1RaizNodo6);
		GeneralTree<Integer> arbol1RaizNodo7 = new GeneralTree<>(15);
		arbol1Raiz.addChild(arbol1RaizNodo7);
		GeneralTree<Integer> arbol1RaizNodo8 = new GeneralTree<>(14);
		arbol1RaizNodo7.addChild(arbol1RaizNodo8);
		GeneralTree<Integer> arbol1RaizNodo9 = new GeneralTree<>(16);
		arbol1RaizNodo8.addChild(arbol1RaizNodo9);
		GeneralTree<Integer> arbol1RaizNodo10 = new GeneralTree<>(7);
		arbol1RaizNodo8.addChild(arbol1RaizNodo10);
		GeneralTree<Integer> arbol1RaizNodo11 = new GeneralTree<>(18);
		arbol1RaizNodo7.addChild(arbol1RaizNodo11);
		return arbol1Raiz;
	}

	public static void main(String[] args) {
		List<Integer> resultado = new LinkedList<Integer>();
		Caminos camino = new Caminos(crearArbol1());
		resultado = camino.caminoAHojasMasLejana();
		System.out.println(resultado);
	}

}
