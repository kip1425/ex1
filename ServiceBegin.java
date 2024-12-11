public class ServiceBegin extends CoffeeEvent{
    
    public ServiceBegin(Customer customer, Counter counter, double time) {
        super(customer, counter, time);
    }

    @Override
    public String toString() {
        String str = "";
        str = ": Customer " + getCustomer().getId() + " service begin (by Counter " + getCounter().getId() + ")";
        return getTime() + str;
    }

    @Override
    public Event[] simulate() {
        getCounter().setAvailability(false);
        double endTime = getTime() + getCustomer().getServiceTime();
        return new Event[] { 
            new ServiceEnd(getCustomer(), getCounter(), endTime)
        };
    }
}
