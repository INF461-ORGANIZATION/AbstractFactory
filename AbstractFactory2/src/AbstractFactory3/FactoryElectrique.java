package AbstractFactory3;

public class FactoryElectrique extends AbstractFactory {
    public Automobile createAutomobile() {
        return new AutomobileElectrique();
    }
    public Scooter createScooter() {
        return new ScooterElectrique();
    }

}
