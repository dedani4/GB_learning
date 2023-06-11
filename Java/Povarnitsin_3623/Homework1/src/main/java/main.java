public class main {

    public static void main(String[] args) {
        DrinkMachine kiosk = new DrinkMachine();
        HotDrink Coffee = new HotDrink("coffee", 20.0, 200, 65);
        HotDrink Tea = new HotDrink("tea", 15.0, 300, 80);

        kiosk.addProduct(Coffee);
        kiosk.addProduct(Tea);

        System.out.println(kiosk.getProduct("tea"));
        System.out.println(kiosk.getProduct("coffee",200,65));

    }


}


//1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
// и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
// выдающий продукт соответствующий имени, объёму и температуре
//3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
// и воспроизвести логику, заложенную в программе
//4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
