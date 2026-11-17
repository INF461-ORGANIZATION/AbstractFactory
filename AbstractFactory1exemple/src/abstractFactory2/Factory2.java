package abstractFactory2;

public class Factory2  extends AbstractFactory {
    public ProduitA createProduitA() {
        return new ProduitA2();
    }

    public ProduitB createProduitB() {
        return new ProduitB2();
    }

}
