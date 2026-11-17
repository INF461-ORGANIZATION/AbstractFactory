import abstractFactory2.ProduitA;
import abstractFactory2.ProduitB;
import abstractFactory2.AbstractFactory;
import abstractFactory2.Factory1;
import abstractFactory2.Factory2;
import abstractFactory2.Factory3;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        AbstractFactory factory1 = new Factory1();
        AbstractFactory factory2 = new Factory2(); 
        AbstractFactory factory3 = new Factory3();

        ProduitA produitA= null;
        ProduitB produitB= null;

        System.out.println("utilisation de la première fabrique");
        produitA = factory1.createProduitA();
        produitB = factory1.createProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("utilisation de la deuxième fabrique");
        produitA = factory2.createProduitA();
        produitB = factory2.createProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("utilisation de la troisième fabrique");
        produitA = factory3.createProduitA();
        produitB = factory3.createProduitB();
        produitA.methodeA();
        produitB.methodeB();
    }
}
