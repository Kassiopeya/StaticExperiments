public class Car {
    private final Engine engine;
    private final CarType carType;
    private final int Weight;

    public Car(Engine engine, CarType carType, int weight) {
        this.engine = engine;
        this.carType = carType;
        Weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getWeight() {
        return Weight;
    }
}
