public class Bottle {


    private Integer capacity;
    private Integer liquidAvailable;
    private Boolean open;

    public Bottle(Integer capacity, Integer liquidAvailable, Boolean open) {
        this.capacity = capacity;
        this.liquidAvailable = liquidAvailable;
        this.open = open;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Integer getLiquidAvailable() {
        return liquidAvailable;
    }

    public Boolean getOpen() {
        return open;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "capacity=" + capacity +
                ", liquidAvailable=" + liquidAvailable +
                ", open=" + open +
                '}';
    }

    public Boolean moreLiquid() {
        if (liquidAvailable > 0)
            return true;
        else return false;
    }

    public int emptyCapacity() {
        return capacity - liquidAvailable;
    }

    public void openBootle() {
        open = true;
    }

    public void closeBootle() {
        open = false;
    }

    public void drinkSome(int a) {
        liquidAvailable -= a;
    }

   public void fillBottle(){
        liquidAvailable = capacity;
   }

}
