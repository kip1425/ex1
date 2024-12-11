/**
 * This class encapsulates an event in the coffee shop
 * simulation.  Your task is to replace this
 * class with new classes, following proper OOP principles.
 *
 * @author dcsaysp
 * @version CS2030S AY24/25 Semester 1
 */

abstract class CoffeeEvent extends Event {

  private Customer customer;
  private Counter[] counters;
  private Counter counter;

  // For Departure
  public CoffeeEvent(Customer customer, double time) {
    super(time);
    this.customer = customer;
  }

  // For Arrival
  public CoffeeEvent(Customer customer, Counter[] counters, double time) {
    this(customer, time);
    this.counters = counters;
  }

  // For ServiceBegin and ServiceEnd
  public CoffeeEvent(Customer customer, Counter counter, double time) {
    this(customer, time);
    this.counter = counter;
  }

  // To get current customer
  public Customer getCustomer() {
    return this.customer;
  }

  // To get array of all counters
  public Counter[] getCounters() {
    return this.counters;
  }

  // To get the current counter
  public Counter getCounter() {
    return this.counter;
  }

  /**
   * Returns the string representation of the event,
   * depending on the type of event.
   *
   * @return A string representing the event.
   */
  @Override
  abstract public String toString();

  /**
   * The logic that the simulation should follow when simulating
   * this event.
   *
   * @return An array of new events to be simulated.
   */
  @Override
  abstract public Event[] simulate();
}
