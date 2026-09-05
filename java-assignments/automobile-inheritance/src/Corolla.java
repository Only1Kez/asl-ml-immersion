/**
 * Corolla inherits from Toyota. The slogan is intentionally left
 * un-overridden, so it keeps Toyota's "Let's Go Places".
 */
public class Corolla extends Toyota {

    public Corolla() {
        super(2023, 21700.0, "Let's Go Places", 'c');
    }

    @Override
    public void sound() {
        System.out.println("Corolla sound: Quiet, efficient purr.");
    }

    // Method unique to Corolla - not present on any other class in the hierarchy.
    public void printFuelEconomy() {
        System.out.println("Corolla fuel economy: up to 35 city / 41 highway MPG.");
    }
}
