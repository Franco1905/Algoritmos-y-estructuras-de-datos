package tp3.ejercicio4;

import tp3.ejercicio1.GeneralTree;

public class Main {

	public static void main(String[] args) {

		// raiz
		GeneralTree<AreaEmpresa> arbol = new GeneralTree<AreaEmpresa>(new AreaEmpresa("m", 14));

		// nodos internos
		GeneralTree<AreaEmpresa> j13 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("j", 13));
		GeneralTree<AreaEmpresa> k25 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("k", 25));
		GeneralTree<AreaEmpresa> l10 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("l", 10));

		// hojas

		GeneralTree<AreaEmpresa> a4 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("a", 4));
		GeneralTree<AreaEmpresa> b7 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("b", 7));
		GeneralTree<AreaEmpresa> c5 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("c", 5));
		GeneralTree<AreaEmpresa> d6 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("d", 6));
		GeneralTree<AreaEmpresa> e10 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("e", 10));
		GeneralTree<AreaEmpresa> f18 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("f", 18));
		GeneralTree<AreaEmpresa> g9 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("g", 9));
		GeneralTree<AreaEmpresa> h12 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("h", 12));
		GeneralTree<AreaEmpresa> i19 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("i", 19));
	
		// raiz
		
		arbol.addChild(j13);
		arbol.addChild(k25);
		arbol.addChild(l10);
		
		// nodos internos
		
		j13.addChild(a4);
		j13.addChild(b7);
		j13.addChild(c5);
		
		k25.addChild(d6);
		k25.addChild(e10);
		k25.addChild(f18);
		
		l10.addChild(g9);
		l10.addChild(h12);
		l10.addChild(i19);
	
		// prueba del metodo
		
		System.out.println("El mayor promedio de tardanza es:" + AnalizadorArbol.devolverMaximoPromedio(arbol)) ;
	}

}
