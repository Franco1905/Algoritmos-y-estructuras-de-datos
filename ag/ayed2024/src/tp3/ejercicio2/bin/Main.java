package tp3.ejercicio2.bin;
import java.util.List;
import tp3.ejercicio1.GeneradorArbol;
import tp3.ejercicio1.GeneralTree;

public class Main {

	public static void main(String[] args) {
		GeneralTree<Integer> arbol = GeneradorArbol.crearArbol();
		//ImpresorArbol.imprimirEstructurado(arbol);
		List<Integer> resultado = RecorridosAG.numImpPreorder(arbol, 10);
		System.out.println(resultado);
		resultado = RecorridosAG.numImpPosorder(arbol, 10);
		System.out.println(resultado);
		resultado = RecorridosAG.numImpInorden(arbol, 10);
		System.out.println(resultado);
		resultado = RecorridosAG.numImpNiveles(arbol, 10);
		System.out.println(resultado);
	}

}
