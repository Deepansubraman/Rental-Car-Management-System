 abstract class vehicle{
    private String id;
    private boolean available;
    public vehicle(String id)
    {
        this.id=id;
        this.available=true;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public abstract double rentalcost(int days);
    public abstract double milege();
}

