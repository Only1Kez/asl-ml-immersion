/**
 * Toyota inherits from Automobile and fixes the brand-level defaults.
 */
public class Toyota extends Automobile {

    public Toyota() {
        super(1937, 0.0, "Let's Go Places", 'n');
    }

    protected Toyota(Integer year, Double price, String slogan, Character type) {
        super(year, price, slogan, type);
    }

    @Override
    public void sound() {
        System.out.println("Toyota sound: Reliable engine hum.");
    }
}
