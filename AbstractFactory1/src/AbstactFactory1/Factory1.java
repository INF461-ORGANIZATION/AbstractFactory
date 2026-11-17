package AbstactFactory1;

public class Factory1 extends Abstractfactory {
    public ProduitA createProduitA() {
        return new ProduitA1();
    }

    public ProduitB createProduitB() {
        return new ProduitB1();
    }

}
