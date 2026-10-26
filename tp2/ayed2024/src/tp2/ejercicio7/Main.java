package tp2.ejercicio7;
import tp2.ejercicio1.BinaryTree;;

public class Main {

	public static void main(String[] args) {
		
		BinaryTree<Integer> dos = new BinaryTree<Integer>(2); 
		BinaryTree<Integer> siete = new BinaryTree<Integer>(7); 
		BinaryTree<Integer> menos5 = new BinaryTree<Integer>(-5); 
		BinaryTree<Integer> veintitres = new BinaryTree<Integer>(23); 
		BinaryTree<Integer> seis = new BinaryTree<Integer>(6); 
		BinaryTree<Integer> diecinueve = new BinaryTree<Integer>(19); 
		BinaryTree<Integer> menostres = new BinaryTree<Integer>(-3); 
		BinaryTree<Integer> cincuentaycinco = new BinaryTree<Integer>(55); 
		BinaryTree<Integer> once = new BinaryTree<Integer>(11); 
		BinaryTree<Integer> cuatro = new BinaryTree<Integer>(4); 
		BinaryTree<Integer> deciocho = new BinaryTree<Integer>(18); 
		
		dos.addLeftChild(siete);
		dos.addRightChild(menos5);
		
		menos5.addLeftChild(diecinueve);
		
		diecinueve.addRightChild(cuatro);
		
		cuatro.addLeftChild(deciocho);
		
		siete.addLeftChild(veintitres);
		siete.addRightChild(seis);
		
		seis.addLeftChild(cincuentaycinco);
		seis.addRightChild(once);
		
		veintitres.addLeftChild(menostres);
		
		ParcialArboles par = new ParcialArboles(dos);
		//par.getArbol().imprimir();
		System.out.println(par.isLeftTree(2));
	}

}
