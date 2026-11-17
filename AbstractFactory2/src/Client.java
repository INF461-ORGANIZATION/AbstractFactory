import AbstractFactory3.AbstractFactory;
import AbstractFactory3.Automobile;
import AbstractFactory3.FactoryElectrique;
import AbstractFactory3.FactoryEssence;
import AbstractFactory3.Scooter;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        AbstractFactory factory1 = new FactoryEssence();
        AbstractFactory factory2 = new FactoryElectrique(); 

        Automobile automobile= null;
        Scooter scooter= null;

        System.out.println("utilisation de la première fabrique");
        automobile = factory1.createAutomobile();
        scooter = factory1.createScooter();
        System.out.println("Automobile: " + automobile);
        System.out.println("Scooter: " + scooter);

        System.out.println("utilisation de la deuxième fabrique");
        automobile = factory2.createAutomobile();
        scooter = factory2.createScooter();
        System.out.println("Automobile: " + automobile);
        System.out.println("Scooter: " + scooter);
    }
}
