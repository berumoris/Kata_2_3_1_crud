package model;

public class Car {
    private String model;
    private int series;
    private int cost;

    public Car (String model, int series, int cost) {
        this.model = model;
        this.series = series;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", cost=" + cost +
                '}';
    }
}
