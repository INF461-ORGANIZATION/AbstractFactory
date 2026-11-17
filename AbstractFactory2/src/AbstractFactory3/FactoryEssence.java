package AbstractFactory3;

public class FactoryEssence  extends AbstractFactory {
    public Automobile createAutomobile() {
        return new AutomobileEssence();
    }
    public Scooter createScooter() {
        return new ScooterEssence();
    }

}
