class Customer {
    private final int customerId;
    private final double arrivalTime;
    private final double serviceTime;

    public Customer(int customerId, double arrivalTime, double serviceTime) {
        this.customerId = customerId;
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
    }

    public int getId() {
        return this.customerId;
    }

    public double getServiceTime() {
        return this.serviceTime;
    }

}