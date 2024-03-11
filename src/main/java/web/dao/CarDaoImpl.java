package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component("carDaoImpl")
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("model1", 1, "color1"));
        cars.add(new Car("model2", 2, "color2"));
        cars.add(new Car("model3", 3, "color3"));
        cars.add(new Car("model4", 4, "color4"));
        cars.add(new Car("model5", 5, "color5"));
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return cars.stream().limit(count).toList();
    }

}
