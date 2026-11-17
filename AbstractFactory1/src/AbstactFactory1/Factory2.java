package AbstactFactory1;

public class Factory2  extends Abstractfactory {
    public ProduitA createProduitA() {
        return new ProduitA2();
    }

    public ProduitB createProduitB() {
        return new ProduitB2();
    }

}
