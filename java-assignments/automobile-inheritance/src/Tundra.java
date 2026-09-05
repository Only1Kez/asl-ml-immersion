/**
 * Tundra inherits from Toyota. The slogan is intentionally left
 * un-overridden, so it keeps Toyota's "Let's Go Places".
 */
public class Tundra extends Toyota {

    public Tundra() {
        super(2023, 38965.0, "Let's Go Places", 't');
    }

    @Override
    public void sound() {
        System.out.println("Tundra sound: Deep, roaring V8 rumble.");
    }
}
