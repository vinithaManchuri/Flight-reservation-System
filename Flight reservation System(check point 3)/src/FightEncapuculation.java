public class Flight {

    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsleft;
    private double originalPrice;

    public Flight(int fn, String o, String ds, String dp, int c, double op) {
        if (ds.equals(o) == true) {
            throw new IllegalArgumentException("destination and origin are the same");
        }
        flightNumber = fn;
        origin = o;
        destination = ds;
        departureTime = dp;
        capacity = c;
        numberOfSeatsleft = c;
        originalPrice = op;
    }

    public boolean bookASeat() {
        if (numberOfSeatsleft > 0) {
            numberOfSeatsleft = numberOfSeatsleft - 1;
            return true;

        }
        return false;
    }

    public double getPrice() {
        return originalPrice;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getNumberOfSeatsleft() {
        return numberOfSeatsleft;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setPrice(double p) {
        originalPrice = p;
    }

    public void setOrigin(String o) {
        origin = o;
    }

    public void setDestination(String d) {
        destination = d;
    }

    public void setDepartureTime(String d) {
        departureTime = d;
    }

    public void setFlightNumber(int fn) {
        flightNumber = fn;
    }

    public void setNumberOfSeatsleft(int s) {
        numberOfSeatsleft = s;
    }

    public void setCapacity(int c) {
        capacity = c;
    }

    @Override
    public String toString() {
        String one = "Flight " + flightNumber;
        String two = "," + origin + " to " + destination;
        String three = "," + departureTime;
        String four = ", original price: " + originalPrice + "$";
        return one + two + three + four;
    }

}
