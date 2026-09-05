/**
 * Base class for the inheritance hierarchy. All instance variables use
 * Wrapper classes (Integer, Double, String, Character) instead of primitives.
 */
public class Automobile {

    private Integer year;
    private Double price;
    private String slogan;
    private Character type;

    public Automobile() {
    }

    public Automobile(Integer year, Double price, String slogan, Character type) {
        this.year = year;
        this.price = price;
        this.slogan = slogan;
        this.type = type;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public void sound() {
        System.out.println("Automobile sound: Vroom!");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [year=" + year + ", price=" + price
                + ", slogan=\"" + slogan + "\", type=" + type + "]";
    }
}
