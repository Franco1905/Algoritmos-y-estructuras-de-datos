package tp3.ejercicio9;

import java.util.LinkedList;
import java.util.List;
import tp3.ejercicio1.GeneralTree;

public class Main {

	// Pegá estos métodos dentro de tu clase.

	public static GeneralTree<Integer> crearArbol1() {
		GeneralTree<Integer> n1 = new GeneralTree<>(12);
		GeneralTree<Integer> n1_1 = new GeneralTree<>(12);
		n1.addChild(n1_1);
		GeneralTree<Integer> n1_2 = new GeneralTree<>(35);
		n1_1.addChild(n1_2);
		GeneralTree<Integer> n1_3 = new GeneralTree<>(35);
		n1_2.addChild(n1_3);
		GeneralTree<Integer> n1_4 = new GeneralTree<>(35);
		n1_3.addChild(n1_4);
		GeneralTree<Integer> n1_5 = new GeneralTree<>(12);
		n1_1.addChild(n1_5);
		GeneralTree<Integer> n1_6 = new GeneralTree<>(14);
		n1_5.addChild(n1_6);
		GeneralTree<Integer> n1_7 = new GeneralTree<>(12);
		n1_5.addChild(n1_7);
		GeneralTree<Integer> n1_8 = new GeneralTree<>(33);
		n1_5.addChild(n1_8);
		GeneralTree<Integer> n1_9 = new GeneralTree<>(35);
		n1_8.addChild(n1_9);
		GeneralTree<Integer> n1_10 = new GeneralTree<>(83);
		n1_8.addChild(n1_10);
		GeneralTree<Integer> n1_11 = new GeneralTree<>(90);
		n1_8.addChild(n1_11);
		GeneralTree<Integer> n1_12 = new GeneralTree<>(33);
		n1_8.addChild(n1_12);
		GeneralTree<Integer> n1_13 = new GeneralTree<>(25);
		n1.addChild(n1_13);
		GeneralTree<Integer> n1_14 = new GeneralTree<>(25);
		n1_13.addChild(n1_14);
		return n1;
	}

	public static GeneralTree<Integer> crearArbol2() {
		GeneralTree<Integer> n2 = new GeneralTree<>(12);
		GeneralTree<Integer> n2_1 = new GeneralTree<>(12);
		n2.addChild(n2_1);
		GeneralTree<Integer> n2_2 = new GeneralTree<>(35);
		n2_1.addChild(n2_2);
		GeneralTree<Integer> n2_3 = new GeneralTree<>(35);
		n2_2.addChild(n2_3);
		GeneralTree<Integer> n2_4 = new GeneralTree<>(35);
		n2_3.addChild(n2_4);
		GeneralTree<Integer> n2_5 = new GeneralTree<>(18);
		n2_1.addChild(n2_5);
		GeneralTree<Integer> n2_6 = new GeneralTree<>(14);
		n2_5.addChild(n2_6);
		GeneralTree<Integer> n2_7 = new GeneralTree<>(18);
		n2_5.addChild(n2_7);
		GeneralTree<Integer> n2_8 = new GeneralTree<>(33);
		n2_5.addChild(n2_8);
		GeneralTree<Integer> n2_9 = new GeneralTree<>(35);
		n2_8.addChild(n2_9);
		GeneralTree<Integer> n2_10 = new GeneralTree<>(83);
		n2_8.addChild(n2_10);
		GeneralTree<Integer> n2_11 = new GeneralTree<>(90);
		n2_8.addChild(n2_11);
		GeneralTree<Integer> n2_12 = new GeneralTree<>(33);
		n2_8.addChild(n2_12);
		GeneralTree<Integer> n2_13 = new GeneralTree<>(25);
		n2.addChild(n2_13);
		GeneralTree<Integer> n2_14 = new GeneralTree<>(25);
		n2_13.addChild(n2_14);
		return n2;
	}

	public static List<GeneralTree<Integer>> crearArboles() {
		List<GeneralTree<Integer>> arboles = new LinkedList<>();
		arboles.add(crearArbol1());
		arboles.add(crearArbol2());
		return arboles;
	}

	public static void main(String[] args) {
		GeneralTree<Integer> arbolTrue = crearArbol1();
		GeneralTree<Integer> arbolFalse = crearArbol2();
		System.out.println(PracticaArboles.esDeSeleccion(arbolTrue));
		System.out.println(PracticaArboles.esDeSeleccion(arbolFalse));
	}
}