import AbstactFactory1.Factory1;
import AbstactFactory1.Factory2;
import AbstactFactory1.ProduitA;
import AbstactFactory1.ProduitB;
import AbstactFactory1.Abstractfactory;

public class client {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Abstractfactory factory1 = new Factory1();
        Abstractfactory factory2 = new Factory2();

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
    }
}
