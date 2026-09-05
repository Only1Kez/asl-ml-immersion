/**
 * Highlander inherits from Toyota. The slogan is intentionally left
 * un-overridden, so it keeps Toyota's "Let's Go Places".
 */
public class Highlander extends Toyota {

    public Highlander() {
        super(2023, 36620.0, "Let's Go Places", 's');
    }

    @Override
    public void sound() {
        System.out.println("Highlander sound: Smooth, confident growl.");
    }

    /**
     * Nested class letting a Highlander buyer pick a 7- or 8-seat
     * third-row configuration.
     */
    public static class ThirdRowSeating {

        private Integer seatCount;

        public ThirdRowSeating(Integer seatCount) {
            setSeatCount(seatCount);
        }

        public Integer getSeatCount() {
            return seatCount;
        }

        public void setSeatCount(Integer seatCount) {
            if (seatCount != 7 && seatCount != 8) {
                throw new IllegalArgumentException("Third row seating must be configured as 7 or 8 seats.");
            }
            this.seatCount = seatCount;
        }

        @Override
        public String toString() {
            return "Highlander configured with " + seatCount + " total seats"
                    + (seatCount == 8 ? " (8-seat third row)." : " (7-seat third row).");
        }
    }
}
