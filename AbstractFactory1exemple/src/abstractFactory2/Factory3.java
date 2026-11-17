package abstractFactory2;

public class Factory3  extends AbstractFactory {
    public ProduitA createProduitA() {
        return new ProduitA3();
    }

    public ProduitB createProduitB() {
        return new ProduitB3();
    }

}
