public class HotDrink extends Drink{

    private int temperature;
    public HotDrink(String name, double price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return getName() + "volume " + getVolume() + " and temperature " + getTemperature() + " for " + getPrice() + "rubles";

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
