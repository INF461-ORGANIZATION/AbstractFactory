import AbstractFactory4.Automobile;
import AbstractFactory4.FactoryElectrique;
import AbstractFactory4.FactoryEssence;
import AbstractFactory4.FactoryGazoil;
import AbstractFactory4.Scooter;
import AbstractFactory4.AbstractFactory;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        
        AbstractFactory factory1 = new FactoryEssence();
        AbstractFactory factory2 = new FactoryElectrique();
        AbstractFactory factory3 = new FactoryGazoil();

        Automobile automobile= null;
        Scooter scooter= null;

        System.out.println("utilisation de la première fabrique");
        automobile = factory1.createAutomobile();
        scooter = factory1.createScooter();
        System.out.println("Automobile créée: " + automobile);
        System.out.println("Scooter créé: " + scooter);


        System.out.println("utilisation de la deuxième fabrique");
        automobile = factory2.createAutomobile();
        scooter = factory2.createScooter();
        System.out.println("Automobile créée: " + automobile);
        System.out.println("Scooter créé: " + scooter);

        System.out.println("utilisation de la troisième fabrique");
        automobile = factory3.createAutomobile();
        scooter = factory3.createScooter();
        System.out.println("Automobile créée: " + automobile);
        System.out.println("Scooter créé: " + scooter);
    }
}
