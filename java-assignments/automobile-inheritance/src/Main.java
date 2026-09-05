import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates object creation, static and dynamic binding, wrapper
 * class usage, and the Highlander nested class.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" WRAPPER CLASS DEMONSTRATION");
        System.out.println("======================================");
        Integer boxedYear = 1937;              // autoboxing int -> Integer
        Double boxedPrice = 21700.0;           // autoboxing double -> Double
        Character boxedType = 'c';             // autoboxing char -> Character
        int unboxedYear = boxedYear;           // unboxing Integer -> int
        System.out.println("Integer wrapper value:   " + boxedYear);
        System.out.println("Double wrapper value:    " + boxedPrice);
        System.out.println("Character wrapper value: " + boxedType);
        System.out.println("Unboxed back to int:     " + unboxedYear);
        System.out.println("Integer.compare(2023, 1937) = " + Integer.compare(2023, 1937));
        System.out.println();

        System.out.println("======================================");
        System.out.println(" OBJECT CREATION");
        System.out.println("======================================");
        Automobile automobile = new Automobile(1900, 500.0, "Generic Motors Co.", 'g');
        Toyota toyota = new Toyota();
        Corolla corolla = new Corolla();
        Tundra tundra = new Tundra();
        Highlander highlander = new Highlander();

        System.out.println(automobile);
        System.out.println(toyota);
        System.out.println(corolla);
        System.out.println(tundra);
        System.out.println(highlander);
        System.out.println();

        System.out.println("======================================");
        System.out.println(" DYNAMIC BINDING (runtime polymorphism)");
        System.out.println("======================================");
        System.out.println("Each object is stored as an Automobile reference; sound() still");
        System.out.println("resolves to the actual runtime type's override:");
        List<Automobile> fleet = new ArrayList<>();
        fleet.add(automobile);
        fleet.add(toyota);
        fleet.add(corolla);
        fleet.add(tundra);
        fleet.add(highlander);

        for (Automobile a : fleet) {
            a.sound(); // dynamic (late) binding - decided at runtime by the JVM
        }
        System.out.println();

        System.out.println("======================================");
        System.out.println(" STATIC BINDING (compile-time resolution)");
        System.out.println("======================================");
        Automobile refAsAutomobile = corolla;
        // getYear()/getSlogan() are inherited, not overridden anywhere in the
        // hierarchy, so the compiler statically binds the call to
        // Automobile's implementation regardless of the object's real type.
        System.out.println("Static (declared) type: Automobile");
        System.out.println("Runtime (actual) type:  " + corolla.getClass().getSimpleName());
        System.out.println("refAsAutomobile.getYear()   -> " + refAsAutomobile.getYear());
        System.out.println("refAsAutomobile.getSlogan() -> " + refAsAutomobile.getSlogan());
        System.out.println();

        System.out.println("======================================");
        System.out.println(" METHOD UNIQUE TO COROLLA");
        System.out.println("======================================");
        corolla.printFuelEconomy();
        System.out.println();

        System.out.println("======================================");
        System.out.println(" NESTED CLASS: Highlander.ThirdRowSeating");
        System.out.println("======================================");
        Highlander.ThirdRowSeating eightSeatConfig = new Highlander.ThirdRowSeating(8);
        Highlander.ThirdRowSeating sevenSeatConfig = new Highlander.ThirdRowSeating(7);
        System.out.println(eightSeatConfig);
        System.out.println(sevenSeatConfig);

        eightSeatConfig.setSeatCount(7);
        System.out.println("After reconfiguring: " + eightSeatConfig);
    }
}
