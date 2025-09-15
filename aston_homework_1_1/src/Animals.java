import interfaces.HasASpine;
import interfaces.HasAWool;
import interfaces.LivesInWater;

abstract class Animals {
    abstract void lives();
}

abstract class Fish extends Animals implements LivesInWater {

    @Override
    void lives() {
        System.out.println("The fish lives.");
    }

    @Override
    public void describeWhatKindOfWaterHeLivesIn() {
        System.out.println("The fish lives in water...");
    }
}

abstract class Mammals extends Animals implements HasASpine {
    public abstract void feedWithMilk();

    @Override
    void  lives() {
        System.out.println("The mammals lives.");
    }
}

class Bear extends Mammals implements HasASpine, HasAWool {

    @Override
    public void lives () {
        System.out.println("The bear lives.");
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Bear feed with milk.");
    }

    @Override
    public void describeTheSpine() {
        System.out.println("The bear has a spine...");
    }

    @Override
    public void describeWool() {
        System.out.println("The bear has a wool...");
    }
}

class Cat extends Mammals implements HasASpine, HasAWool {

    @Override
    void lives () {
        System.out.println("The cat lives.");
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Cat feed with milk.");
    }

    @Override
    public void describeTheSpine() {
        System.out.println("The cat has a spine...");
    }

    @Override
    public void describeWool() {
        System.out.println("The cat has a wool...");
    }
}

class Whale extends Mammals implements HasASpine, LivesInWater {

    @Override
    void lives() {
        System.out.println("The whale lives.");
    }

    @Override
    public void feedWithMilk() {
        System.out.println("The whale feed with milk.");
    }

    @Override
    public void describeTheSpine() {
        System.out.println("The whale has a spine...");
    }

    @Override
    public void describeWhatKindOfWaterHeLivesIn() {
        System.out.println("The whale lives in...");
    }

}

