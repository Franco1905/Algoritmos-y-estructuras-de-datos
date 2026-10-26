package tp3.ejercicio1;

public class MainEj3 {

	public static void main(String[] args) {
		GeneralTree<Integer> arbol = GeneradorArbol.crearArbol();
		ImpresorArbol.imprimirEstructurado(arbol);
		System.out.println("La altura del arbol es: " + arbol.altura());
	} // creo que devuelve uno de mas

}
