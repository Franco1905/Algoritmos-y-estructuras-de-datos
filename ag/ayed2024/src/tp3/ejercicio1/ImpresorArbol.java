package tp3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ImpresorArbol {

    /**
     * Imprime en consola cualquier GeneralTree formateado con sus conexiones y etiquetas de nivel.
     * 
     * @param arbol Instancia de GeneralTree a imprimir.
     */
    public static <T> void imprimirEstructurado(GeneralTree<T> arbol) {
        if (arbol == null || arbol.isEmpty()) {
            System.out.println("El árbol está vacío.");
            return;
        }

        NodoImpresion raiz = construirEstructura(arbol);
        int altoMatriz = (raiz.alturaMax * 2) + 1;
        int anchoMatriz = Math.max(raiz.ancho, 50);

        char[][] matriz = new char[altoMatriz][anchoMatriz];
        for (int i = 0; i < altoMatriz; i++) {
            for (int j = 0; j < anchoMatriz; j++) {
                matriz[i][j] = ' ';
            }
        }

        dibujarNodo(raiz, 0, 0, matriz);

        for (int i = 0; i < altoMatriz; i++) {
            String linea = new String(matriz[i]);
            if (i % 2 == 0) {
                int nivel = i / 2;
                String etiqueta = (nivel == 0) ? "<-- Nivel 0 (Raíz)" : "<-- Nivel " + nivel;
                System.out.printf("%s %s%n", linea, etiqueta);
            } else {
                System.out.println(linea);
            }
        }
    }

    private static class NodoImpresion {
        String texto;
        List<NodoImpresion> hijos = new ArrayList<>();
        int ancho;
        int xRelativoRaiz;
        int alturaMax;

        NodoImpresion(String texto) {
            this.texto = texto;
        }
    }

    private static <T> NodoImpresion construirEstructura(GeneralTree<T> nodo) {
        String textoNodo = "[" + nodo.getData().toString() + "]";
        NodoImpresion nodoImp = new NodoImpresion(textoNodo);

        if (nodo.isLeaf()) {
            nodoImp.ancho = textoNodo.length() + 2;
            nodoImp.xRelativoRaiz = textoNodo.length() / 2;
            nodoImp.alturaMax = 0;
            return nodoImp;
        }

        int anchoAcumulado = 0;
        int maxAltHijos = 0;

        for (GeneralTree<T> hijo : nodo.getChildren()) {
            NodoImpresion hijoImp = construirEstructura(hijo);
            nodoImp.hijos.add(hijoImp);
            anchoAcumulado += hijoImp.ancho;
            if (hijoImp.alturaMax > maxAltHijos) {
                maxAltHijos = hijoImp.alturaMax;
            }
        }

        nodoImp.alturaMax = maxAltHijos + 1;

        NodoImpresion primerHijo = nodoImp.hijos.get(0);
        NodoImpresion ultimoHijo = nodoImp.hijos.get(nodoImp.hijos.size() - 1);

        int centroPrimerHijo = primerHijo.xRelativoRaiz;
        int centroUltimoHijo = (anchoAcumulado - ultimoHijo.ancho) + ultimoHijo.xRelativoRaiz;
        int centroCalculado = (centroPrimerHijo + centroUltimoHijo) / 2;

        nodoImp.ancho = Math.max(anchoAcumulado, textoNodo.length() + 2);
        nodoImp.xRelativoRaiz = centroCalculado;

        return nodoImp;
    }

    private static void dibujarNodo(NodoImpresion nodo, int xOffset, int yNivel, char[][] matriz) {
        int xCentro = xOffset + nodo.xRelativoRaiz;
        int inicioTexto = xCentro - (nodo.texto.length() / 2);

        for (int i = 0; i < nodo.texto.length(); i++) {
            int col = inicioTexto + i;
            if (col >= 0 && col < matriz[yNivel].length) {
                matriz[yNivel][col] = nodo.texto.charAt(i);
            }
        }

        if (!nodo.hijos.isEmpty()) {
            int yRamas = yNivel + 1;
            int yHijos = yNivel + 2;
            int xCursorHijo = xOffset;

            for (NodoImpresion hijo : nodo.hijos) {
                int xCentroHijo = xCursorHijo + hijo.xRelativoRaiz;

                char simboloRama;
                if (xCentroHijo < xCentro) {
                    simboloRama = '/';
                } else if (xCentroHijo > xCentro) {
                    simboloRama = '\\';
                } else {
                    simboloRama = '|';
                }

                int xRama = (xCentro + xCentroHijo) / 2;
                if (xRama >= 0 && xRama < matriz[yRamas].length) {
                    matriz[yRamas][xRama] = simboloRama;
                }

                dibujarNodo(hijo, xCursorHijo, yHijos, matriz);
                xCursorHijo += hijo.ancho;
            }
        }
    }
}