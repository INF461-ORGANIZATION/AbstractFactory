package AbstractFactory4;

public class FactoryGazoil  extends AbstractFactory {
    public Automobile createAutomobile() {
        return new AutomobileGazoil();
    }
    public Scooter createScooter() {
        return new ScooterGazoil();
    }

}
