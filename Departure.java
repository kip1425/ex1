public class Departure extends CoffeeEvent{

    public Departure(Customer customer, double time) {
        super(customer, time);
    }

    @Override
    public String toString() {
        String str = "";
        str = ": Customer " + getCustomer().getId() + " departed";
        return getTime() + str;
    }

    @Override
    public Event[] simulate() {
        return new Event[] {};
    }
}
