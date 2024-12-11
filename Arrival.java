public class Arrival extends CoffeeEvent{

    public Arrival(Customer customer, Counter[] counters, double time) {
        super(customer, counters, time);
    }
    
    @Override
    public String toString() {
        String str = "";
        str = ": Customer " + getCustomer().getId() + " arrives";
        return getTime() + str;
    }

    @Override
    public Event[] simulate() {
      int counter = -1;
      for (int i = 0; i < getCounters().length; i += 1) {
        if (getCounters()[i].checkAvailability()) {
          counter = i;
          break;
        }
      }
      if (counter == -1) {
        // If no such counter can be found, the customer
        // should depart.
        return new Event[] { 
          new Departure(getCustomer(), getTime())
        };
      } else {
        // Else, the customer should go the the first 
        // available counter and get served.
        return new Event[] { 
          new ServiceBegin(getCustomer(), getCounters()[counter], getTime())
        };
      }
    }
}
