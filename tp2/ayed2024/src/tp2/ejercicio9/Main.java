package tp2.ejercicio9;
import tp2.ejercicio1.BinaryTree; 
import tp2.ejercicio9.ParcialArboles;
public class Main {

	public static void main(String[] args) {
		BinaryTree<Integer> veinte = new BinaryTree<Integer>(20);
		BinaryTree<Integer> cinco = new BinaryTree<Integer>(5);
		BinaryTree<Integer> treinta = new BinaryTree<Integer>(30);
		BinaryTree<Integer> menos5 = new BinaryTree<Integer>(-5);
		BinaryTree<Integer> diez = new BinaryTree<Integer>(10);
		BinaryTree<Integer> cincuenta = new BinaryTree<Integer>(50);
		BinaryTree<Integer> menos9 = new BinaryTree<Integer>(-9);
		BinaryTree<Integer> uno = new BinaryTree<Integer>(1);
		BinaryTree<Integer> cuatro = new BinaryTree<Integer>(4);
		BinaryTree<Integer> seis = new BinaryTree<Integer>(6);
		
		veinte.addLeftChild(cinco);
		veinte.addRightChild(treinta);
		
		cinco.addLeftChild(menos5);
		cinco.addRightChild(diez);
		
		diez.addLeftChild(uno);
		
		treinta.addLeftChild(cincuenta);
		treinta.addRightChild(menos9);
		
		cincuenta.addLeftChild(cuatro);
		
		cuatro.addRightChild(seis);
		
		// veinte.imprimir()
		
		ParcialArboles prueba = new ParcialArboles();
		BinaryTree<Integer[]> res = prueba.sumAndDif(veinte);
		
	}

}
