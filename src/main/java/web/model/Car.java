package web.model;

public class Car {
    private int id;
    private String engine;
    private String model;

    public Car(int id, String engine, String model) {
        this.id = id;
        this.engine = engine;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", engine='" + engine + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
