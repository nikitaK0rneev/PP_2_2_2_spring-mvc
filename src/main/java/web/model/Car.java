package web.model;

import java.util.Objects;

public class Car {
    private final String model;
    private final int series;
    private final String color;

    public Car(String model, int series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getSeries() == car.getSeries() && Objects.equals(getModel(), car.getModel()) && Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getSeries(), getColor());
    }
}
