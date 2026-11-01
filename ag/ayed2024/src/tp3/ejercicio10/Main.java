package tp3.ejercicio10;
 
import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio1.GeneralTree;

public class Main {
	// Pegá estos métodos dentro de tu clase.
	// Pegá estos métodos dentro de tu clase.

	public static GeneralTree<Integer> crearArbol1() {
		GeneralTree<Integer> n1 = new GeneralTree<>(1);
		GeneralTree<Integer> n1_1 = new GeneralTree<>(0);
		n1.addChild(n1_1);
		GeneralTree<Integer> n1_2 = new GeneralTree<>(1);
		n1_1.addChild(n1_2);
		GeneralTree<Integer> n1_3 = new GeneralTree<>(0);
		n1_2.addChild(n1_3);
		GeneralTree<Integer> n1_4 = new GeneralTree<>(0);
		n1_2.addChild(n1_4);
		GeneralTree<Integer> n1_5 = new GeneralTree<>(1);
		n1_2.addChild(n1_5);
		GeneralTree<Integer> n1_6 = new GeneralTree<>(1);
		n1_1.addChild(n1_6);
		GeneralTree<Integer> n1_7 = new GeneralTree<>(1);
		n1.addChild(n1_7);
		GeneralTree<Integer> n1_8 = new GeneralTree<>(1);
		n1_7.addChild(n1_8);
		GeneralTree<Integer> n1_9 = new GeneralTree<>(0);
		n1_7.addChild(n1_9);
		GeneralTree<Integer> n1_10 = new GeneralTree<>(0);
		n1_9.addChild(n1_10);
		GeneralTree<Integer> n1_11 = new GeneralTree<>(1);
		n1_10.addChild(n1_11);
		GeneralTree<Integer> n1_12 = new GeneralTree<>(1);
		n1.addChild(n1_12);
		GeneralTree<Integer> n1_13 = new GeneralTree<>(0);
		n1_12.addChild(n1_13);
		GeneralTree<Integer> n1_14 = new GeneralTree<>(0);
		n1_13.addChild(n1_14);
		GeneralTree<Integer> n1_15 = new GeneralTree<>(0);
		n1_14.addChild(n1_15);
		GeneralTree<Integer> n1_16 = new GeneralTree<>(0);
		n1_14.addChild(n1_16);
		return n1;
	}

	public static void main(String[] args) {
		
		List<Integer> resultado = new LinkedList<Integer>();
		GeneralTree<Integer> arbol = crearArbol1();
		resultado = ParcialArboles.resolver(arbol);
		System.out.println(resultado);
		// creo que el metodo devuelve 1 nodo menos
	}

}
