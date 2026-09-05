# Automobile Inheritance Hierarchy

Java OOP assignment demonstrating Wrapper classes, inheritance, method
overriding, static/dynamic binding, and nested classes.

## Class hierarchy

```
Automobile
└── Toyota (year=1937, price=0.0, slogan="Let's Go Places", type='n')
    ├── Corolla (year=2023, price=21700.0, type='c')
    ├── Tundra  (year=2023, price=38965.0, type='t')
    └── Highlander (year=2023, price=36620.0, type='s')
        └── ThirdRowSeating (nested static class: 7 or 8 seat configuration)
```

Corolla, Tundra, and Highlander all leave `slogan` un-overridden, so they
inherit Toyota's `"Let's Go Places"`.

## Files

- `src/Automobile.java` — base class; `Integer`/`Double`/`String`/`Character`
  fields with full getters/setters.
- `src/Toyota.java`, `src/Corolla.java`, `src/Tundra.java`,
  `src/Highlander.java` — the inheritance chain. Each overrides `sound()`.
  `Corolla` adds a unique `printFuelEconomy()` method. `Highlander` declares
  the nested `ThirdRowSeating` class.
- `src/Main.java` — creates an object of every class and demonstrates
  Wrapper class autoboxing/unboxing, dynamic binding (`sound()` resolved at
  runtime), static binding (inherited getters resolved at compile time),
  the Corolla-only method, and the Highlander nested class.
- `Automobile_Inheritance_Assignment.pdf` — submission document containing
  the neatly formatted source and a screenshot of the program's output.

## Build & run

```bash
cd src
javac *.java
java Main
```
