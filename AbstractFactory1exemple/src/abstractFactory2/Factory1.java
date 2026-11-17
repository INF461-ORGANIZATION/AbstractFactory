package abstractFactory2;

public class Factory1 extends AbstractFactory {
    public ProduitA createProduitA() {
        return new ProduitA1();
    }

    public ProduitB createProduitB() {
        return new ProduitB1();
    }

}
