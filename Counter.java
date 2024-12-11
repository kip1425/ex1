public class Counter {
    private final int counterId;
    private boolean isAvailable = true;

    public Counter(int counterId, boolean isAvailable) {
        this.counterId = counterId;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return this.counterId;
    }

    public boolean checkAvailability() {
        return this.isAvailable;
    }

    public void setAvailability(boolean availability) {
        this.isAvailable = availability;
    }
}
