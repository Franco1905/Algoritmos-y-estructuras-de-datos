package tp3.ejercicio1;

public class MainEj5 {

	// Pegá estos métodos dentro de tu clase.

	public static GeneralTree<Integer> crearArbol1() {
		GeneralTree<Integer> n1 = new GeneralTree<>(1);
		GeneralTree<Integer> n1_1 = new GeneralTree<>(2);
		n1.addChild(n1_1);
		GeneralTree<Integer> n1_2 = new GeneralTree<>(5);
		n1_1.addChild(n1_2);
		GeneralTree<Integer> n1_3 = new GeneralTree<>(8);
		n1_2.addChild(n1_3);
		GeneralTree<Integer> n1_4 = new GeneralTree<>(9);
		n1_3.addChild(n1_4);
		GeneralTree<Integer> n1_5 = new GeneralTree<>(10);
		n1_4.addChild(n1_5);
		GeneralTree<Integer> n1_6 = new GeneralTree<>(6);
		n1_1.addChild(n1_6);
		GeneralTree<Integer> n1_7 = new GeneralTree<>(7);
		n1_1.addChild(n1_7);
		GeneralTree<Integer> n1_8 = new GeneralTree<>(3);
		n1.addChild(n1_8);
		GeneralTree<Integer> n1_9 = new GeneralTree<>(4);
		n1.addChild(n1_9);
		return n1;
	}

	private static void esAn(int dato1, int dato2, GeneralTree<Integer> arbol) {
		if (arbol.esAncestro(dato1, dato2)) {
			System.out.println("El nodo: " + dato1 + ", es ancestro de: " + dato2);
		} else {
			System.out.println("El nodo: " + dato1 + ", NO es ancestro de: " + dato2);
		}
	}

	public static void main(String[] args) {
		GeneralTree<Integer> arbol = crearArbol1();
		esAn(10, 12, arbol);
		esAn(2, 10, arbol);
		esAn(99, 100, arbol);
	}

}
