public class Main {
    public static void main(String[] args) {

        Bear bear = new Bear();
        bear.lives();
        bear.feedWithMilk();
        bear.describeTheSpine();
        bear.describeWool();

        Cat cat = new Cat();
        cat.lives();
        cat.feedWithMilk();
        cat.describeTheSpine();
        cat.describeWool();

        Whale whale = new Whale();
        whale.lives();
        whale.feedWithMilk();
        whale.describeTheSpine();
        whale.describeWhatKindOfWaterHeLivesIn();
    }
}