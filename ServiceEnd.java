public class ServiceEnd extends CoffeeEvent{

    public ServiceEnd(Customer customer, Counter counter, double endTime) {
        super(customer, counter, endTime);
    }

    @Override
    public String toString() {
        String str = "";
        str = ": Customer " + getCustomer().getId() + " service done (by Counter " + getCounter().getId() + ")";
        return getTime() + str;
    }

    @Override
    public Event[] simulate() {
        getCounter().setAvailability(true);
        return new Event[] { 
            new Departure(getCustomer(), getTime())
        };
    }
}
