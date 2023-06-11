public class Drink extends Product{
    private int volume;
    public Drink(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }



    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


}
