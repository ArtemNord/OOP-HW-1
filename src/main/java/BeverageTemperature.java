public class BeverageTemperature extends Bottle{
    private Integer temperature;

    public BeverageTemperature(String name, Double cost, Double volume, Integer temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "BeverageTemperature{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() + '\'' +
                ", volume=" + super.getVolume() + '\'' +
                ", temperature=" + this.temperature +
                '}';
    }
}
