package tp3.ejercicio1.copy;

public class GeneradorArbol {

    /**
     * Crea y retorna un árbol general de enteros de grado 4 con 16 nodos.
     * 
     * @return GeneralTree<Integer> Instancia del árbol generado.
     */
    public static GeneralTree<Integer> crearArbol() {
        // --- Nivel 3 (Hojas del árbol) ---
        GeneralTree<Integer> n11 = new GeneralTree<>(11);
        GeneralTree<Integer> n12 = new GeneralTree<>(12);
        GeneralTree<Integer> n13 = new GeneralTree<>(13);
        GeneralTree<Integer> n14 = new GeneralTree<>(14);

        GeneralTree<Integer> n15 = new GeneralTree<>(15);
        GeneralTree<Integer> n16 = new GeneralTree<>(16);

        GeneralTree<Integer> n17 = new GeneralTree<>(17);
        GeneralTree<Integer> n18 = new GeneralTree<>(18);
        GeneralTree<Integer> n19 = new GeneralTree<>(19);

        // --- Nivel 2 (Subárboles intermedios) ---
        // n2 tiene 4 hijos (Grado 4)
        GeneralTree<Integer> n2 = new GeneralTree<>(2);
        n2.addChild(n11);
        n2.addChild(n12);
        n2.addChild(n13);
        n2.addChild(n14);

        // n3 tiene 2 hijos
        GeneralTree<Integer> n3 = new GeneralTree<>(3);
        n3.addChild(n15);
        n3.addChild(n16);

        // n4 tiene 3 hijos
        GeneralTree<Integer> n4 = new GeneralTree<>(4);
        n4.addChild(n17);
        n4.addChild(n18);
        n4.addChild(n19);

        // n5 no tiene hijos (es hoja)
        GeneralTree<Integer> n5 = new GeneralTree<>(5);

        // --- Nivel 1 (Raíz del árbol) ---
        // Raíz (1) tiene 4 hijos: n2, n3, n4, n5 (Grado 4)
        GeneralTree<Integer> arbol = new GeneralTree<>(1);
        arbol.addChild(n2);
        arbol.addChild(n3);
        arbol.addChild(n4);
        arbol.addChild(n5);

        return arbol;
    }

}
